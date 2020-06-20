interface Movable {
    int getX();

    int getY();

    void setX(int newX);

    void setY(int newY);
}

interface Storable {
    int getInventoryLength();

    String getInventoryItem(int index);

    void setInventoryItem(int index, String item);
}

interface Command {
    void execute();

    void undo();
}

class CommandMove implements Command {
    private Movable entity;
    int xMovement;
    int yMovement;

    public CommandMove() {
    }

    public CommandMove(int xMovement, int yMovement) {
        this.xMovement = xMovement;
        this.yMovement = yMovement;

        entity = new Movable() {
            int x = 0;
            int y = 0;

            @Override
            public int getX() {
                return x;
            }

            @Override
            public int getY() {
                return y;
            }

            @Override
            public void setX(int newX) {
                x = newX;
            }

            @Override
            public void setY(int newY) {
                y = newY;
            }
        };
    }


    @Override
    public void execute() {
        entity.setX(entity.getX()+xMovement);
        entity.setY(entity.getY()+yMovement);
      //  System.out.println(String.format("x: %d; y: %d", entity.getX(), entity.getY()));

    }

    @Override
    public void undo() {
        entity.setX(entity.getX()-xMovement);
        entity.setY(entity.getY()-yMovement);
       // System.out.println(String.format("x: %d; y: %d", entity.getX(), entity.getY()));
    }

    class CommandPutItem implements Command {
        Storable entity;
        String item;


        @Override
        public void execute() {

        }

        @Override
        public void undo() {

        }
    }

}
    class Test {
        public static void main(String[] args) {
            CommandMove moveCommand = new CommandMove();

            System.out.println("Command move");
            moveCommand.execute();
            System.out.println("Command undo");
            moveCommand.undo();



        }
    }

