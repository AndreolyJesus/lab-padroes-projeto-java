package one.digitalinnovation.gof;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton:
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        SingletonEager1 eager1 = SingletonEager1.getInstancia();
        System.out.println(eager1);
        eager1 = SingletonEager1.getInstancia();
        System.out.println(eager1);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
