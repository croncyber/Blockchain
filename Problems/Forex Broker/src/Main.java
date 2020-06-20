import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Command buyCommand;
        Command sellCommand;
        int[] amountList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            amountList[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            Option option = new Option(amountList[i]);
            if (amountList[i] > 0) {
                buyCommand = new BuyCommand(option);
               buyCommand.executed();
            } else {
                sellCommand = new SellCommand(option);
                sellCommand.executed();
            }
        }
    }
}

class Option {
    private int amount;

    Option(int amount) {
        this.amount = amount;
    }

    void buy() {
        System.out.println(amount + " was bought");
    }

    void sell() {
        System.out.println(amount + " was sold");
    }
}

interface Command {
    void executed();
}

class BuyCommand implements Command {
    private Option option;

    BuyCommand(Option option) {
        this.option = option;
    }

    @Override
    public void executed() {
        option.buy();
    }

}

class SellCommand implements Command {
    private Option option;

    SellCommand(Option option) {
        this.option = option;
    }

    @Override
    public void executed() {
        option.sell();
    }

}

class Broker {
    private Command command;
    void setCommand(Command command) {
       this.command = command;
        /* write your code here */
    }
    void executeCommand() {
       this.command.executed();
    }
}