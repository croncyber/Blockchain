package blockchain;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Blockchain {
    public AtomicInteger zeroCount = new AtomicInteger(0);
    public List<Block> blockchainList = new ArrayList<>();


/*    public synchronized List<Block> getBlockchainList() {
        return blockchainList;
    }*/

    public synchronized void addBlock(Block block) {

        if (block.getDifTime() < 1 && validate(block)) {
            block.setNumberN(String.format("N was increased to %d", zeroCount.incrementAndGet()));
            blockchainList.add(block);
        } else if (block.getDifTime() > 1 && validate(block)) {
            if (zeroCount.get() > 0) {
                zeroCount.decrementAndGet();
                block.setNumberN("N was decreased by 1");
            }
            blockchainList.add(block);
        } else if (1 == block.getDifTime() && validate(block)) {
            block.setNumberN("N stays the same");
            blockchainList.add(block);
        }

    }

    public boolean validate(Block block) {
        if (blockchainList.size() == 0) return true;
        return block.getPreviousHash().equals(blockchainList.get(blockchainList.size() - 1).getCurrentHash());
    }

}
