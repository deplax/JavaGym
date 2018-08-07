package javastatic;

/* thread safe 하지 않음 */
public class Singleton {
    private static Singleton one;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }
}
