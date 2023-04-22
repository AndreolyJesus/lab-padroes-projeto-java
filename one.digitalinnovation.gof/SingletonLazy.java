package one.digitalinnovation.gof;

/*
Singleton "preguiçoso"
@author Andre
 */
public class SingletonLazy{
    private static SingletonLazy instacia;//<--controla sua propia instancia
    private SingletonLazy{
        super();
    }
    public static SingletonLazy getInstacia () {
        if(instacia == null) {
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
