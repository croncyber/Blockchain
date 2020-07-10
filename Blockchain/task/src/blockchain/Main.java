package blockchain;

import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Blockchain blockchain = new Blockchain();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Set<Callable<Block>> blocks = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            blocks.add(new Miner(blockchain, i));
        }


        for (int i = 0; i < 5; i++) {
            executorService.invokeAny(blocks);
        }

        executorService.shutdown();


        for (Block block:blockchain.blockchainList){
            System.out.println(block.toString());
        }



    }
}
