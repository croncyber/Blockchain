package blockchain;

public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        for (int i = 0; i < 10; i++) {
            blockchain.generateNewBlock();
        }

        for (int i = 0; i < 5; i++) {
            if (blockchain.validate(blockchain.getBlockchainList().get(i))) {
                System.out.println(blockchain.getBlockchainList().get(i).toString());
            }
        }

    }
}
