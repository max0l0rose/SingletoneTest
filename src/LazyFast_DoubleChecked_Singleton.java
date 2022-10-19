// if you have java 1.5 or above
public class LazyFast_DoubleChecked_Singleton {
    private volatile static LazyFast_DoubleChecked_Singleton instance;

    private LazyFast_DoubleChecked_Singleton() {
    }

    // Double Checked Sigleton
    public static LazyFast_DoubleChecked_Singleton instance() {
        // first check
        if (instance == null) {
            synchronized (LazyFast_DoubleChecked_Singleton.class) {
                // second check
                if (instance == null) {
                    instance = new LazyFast_DoubleChecked_Singleton();
                }
            }
        }

        return instance;
    }
}
