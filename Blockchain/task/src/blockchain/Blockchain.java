package blockchain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blockchain {
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

        Block(int id) {
            this.timeStamp = new Date().getTime();
            this.id = id;
            if (id <= 1) {
                this.previousHash = "0";
            } else previousHash = blockchainList.get(blockchainList.size() - 1).currentHash;

            String input = previousHash + timeStamp + id;
            this.currentHash = StringUtil.applySha256(input);
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
            return "Block:\n" +
                    "Id: " + id + "\n" +
                    "Timestamp: " + timeStamp + "\n" +
                    "Hash of the previous block:\n" + previousHash + "\n" +
                    "Hash of the block:\n" + currentHash + "\n";
        }
    }
}
