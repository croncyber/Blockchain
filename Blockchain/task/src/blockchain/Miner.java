package blockchain;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Miner implements Callable<Block> {
    private final int minerId;
    private final Blockchain blockchain;
    public AtomicInteger id = new AtomicInteger(1);

    public Miner(Blockchain blockchain, int minerId) {
        this.blockchain = blockchain;
        this.minerId = minerId;
    }

    public synchronized Block mining() {
        return new Block(id.getAndIncrement(), blockchain, minerId);
    }

    @Override
    public Block call() {
        Block block = mining();
        blockchain.addBlock(block);
        return block;
    }

}
