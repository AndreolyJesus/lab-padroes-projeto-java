package one.digitalinnovation.gof;

/*
Singleton "Lazy Holder"
@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
@author Andre
 */
public class SingletonLazyHolder {

    private class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {

    }
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
