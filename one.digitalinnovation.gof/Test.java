package one.digitalinnovation.gof;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        SingletonEager1 eager1 = SingletonEager1.getInstancia();
        System.out.println(eager1);
        eager1 = SingletonEager1.getInstancia();
        System.out.println(eager1);
    }
}
