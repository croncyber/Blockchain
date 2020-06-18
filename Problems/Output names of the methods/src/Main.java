class CreateInstance {
//    public static void main(String[] args) {
//        create().method2();
//        create().method3();
//
//    }

    public static SuperClass create() {

        SuperClass instance = new SuperClass() {





            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        };

        return instance;
    }
}

//abstract class SuperClass {
//
//    public static void method1() {
//    }
//
//    public void method2() {
//        System.out.println("method2");
//    }
//
//    public abstract void method3();
//}