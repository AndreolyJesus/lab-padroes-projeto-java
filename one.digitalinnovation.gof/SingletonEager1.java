package one.digitalinnovation.gof;

/*
Singleton "apressado"
@author Andre
 */
public class SingletonEager1 {
    private static SingletonEager1 instancia = new SingletonEager1();
    private SingletonEager1() {
        Super();
    }
    public static SingletonEager1 getInstancia() {
        return instancia;
    }
}
