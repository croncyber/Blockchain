package blockchain;

import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class Block {

    private final long timeStamp;
    private int id;
    private final String previousHash;
    private final String currentHash;
    private String numberN;
    private final LocalTime localTimeStart;
    private final LocalTime localTimeEnd;
    private int magicNumber;
    private int minerId;
    private Blockchain blockchain;




    Block(int id, Blockchain blockchain, int minerId) {
        localTimeStart = LocalTime.now();

        Random random = new Random();

        this.blockchain = blockchain;
        this.minerId = minerId;
        this.timeStamp = new Date().getTime();
        this.id = id;

        if (id <= 1) {
            this.previousHash = "0";
        } else previousHash = blockchain.blockchainList.get(blockchain.blockchainList.size() - 1).currentHash;

        String input = previousHash + timeStamp + id;
        StringBuilder prefix = new StringBuilder();

        if (blockchain.zeroCount.get() > 0) {
            for (int i = 0; i < blockchain.zeroCount.get(); i++) {
                prefix.append("0");
            }

        }

        magicNumber = random.nextInt(100000000);
        String s = StringUtil.applySha256(input + magicNumber);

        while (!s.startsWith(prefix.toString())) {
            magicNumber = random.nextInt(100000000);
            s = StringUtil.applySha256(input + magicNumber);
        }

        this.currentHash = s;

        localTimeEnd = LocalTime.now();

    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public String getNumberN() {
        return numberN;
    }

    public void setNumberN(String numberN) {
        this.numberN = numberN;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Block)) return false;

        Block block = (Block) o;

        if (timeStamp != block.timeStamp) return false;
        if (id != block.id) return false;
        if (previousHash != null ? !previousHash.equals(block.previousHash) : block.previousHash != null)
            return false;
        return currentHash != null ? currentHash.equals(block.currentHash) : block.currentHash == null;
    }

    public synchronized int getDifTime() {
        return localTimeEnd.toSecondOfDay() - localTimeStart.toSecondOfDay();
    }

    @Override
    public int hashCode() {
        int result = (int) (timeStamp ^ (timeStamp >>> 32));
        result = 31 * result + id;
        result = 31 * result + (previousHash != null ? previousHash.hashCode() : 0);
        result = 31 * result + (currentHash != null ? currentHash.hashCode() : 0);
        return result;
    }

    @Override
    public synchronized String toString() {
        return "Block:\n" +
                "Created by miner # " + minerId + "\n" +
                "Id: " + id + "\n" +
                "Timestamp: " + timeStamp + "\n" +
                "Magic number: " + magicNumber + "\n" +
                "Hash of the previous block:\n" + previousHash + "\n" +
                "Hash of the block:\n" + currentHash + "\n" +
                "Block was generating for " + getDifTime() + " seconds\n" +
                getNumberN() + "\n";
    }
}
