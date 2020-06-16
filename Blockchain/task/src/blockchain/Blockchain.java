package blockchain;


import java.io.Serializable;
import java.time.LocalTime;
import java.util.*;

public class Blockchain implements Serializable {

    private static int zeroCount;

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many zeros the hash must starts with:");
        zeroCount = scanner.nextInt();
    }

    private final List<Block> blockchainList = new ArrayList<>();
    private int id = 1;


    public List<Block> getBlockchainList() {
        return blockchainList;
    }

    public boolean validate(Block block) {
        return getBlockchainList().contains(block);
    }

    public Block generateNewBlock() {
        Block block = new Block(id++);
        blockchainList.add(block);
        return block;
    }

    public class Block {

        private final long timeStamp;
        private final int id;
        private final String previousHash;
        private final String currentHash;
        private final LocalTime localTimeStart;
        private final LocalTime localTimeEnd;
        private int magicNumber = 9;

        Block(int id) {
            localTimeStart = LocalTime.now();
            Random random = new Random();

            this.timeStamp = new Date().getTime();
            this.id = id;
            if (id <= 1) {
                this.previousHash = "0";
            } else previousHash = blockchainList.get(blockchainList.size() - 1).currentHash;

            String input = previousHash + timeStamp + id;
            StringBuilder prefix = new StringBuilder();

            if (zeroCount > 0) {
                for (int i = 0; i < zeroCount; i++) {
                    prefix.append("0");
                }

            }



            magicNumber = random.nextInt(100000000);
            String s = StringUtil.applySha256(input + magicNumber);
            while (!s.startsWith(prefix.toString())){
                  magicNumber = random.nextInt(100000000);
                 s = StringUtil.applySha256(input + magicNumber);
                System.out.println(s);
            }
            this.currentHash = s;

            localTimeEnd = LocalTime.now();

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

        @Override
        public int hashCode() {
            int result = (int) (timeStamp ^ (timeStamp >>> 32));
            result = 31 * result + id;
            result = 31 * result + (previousHash != null ? previousHash.hashCode() : 0);
            result = 31 * result + (currentHash != null ? currentHash.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            int difTime = localTimeEnd.toSecondOfDay() - localTimeStart.toSecondOfDay();
            return "Block:\n" +
                    "Id: " + id + "\n" +
                    "Timestamp: " + timeStamp + "\n" +
                    "Magic number: " + magicNumber + "\n" +
                    "Hash of the previous block:\n" + previousHash + "\n" +
                    "Hash of the block:\n" + currentHash + "\n" +
                    "Block was generating for " + difTime + " seconds\n" + "\n";
        }
    }
}
