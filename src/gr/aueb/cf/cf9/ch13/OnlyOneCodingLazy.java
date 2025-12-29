package gr.aueb.cf.cf9.ch13;

public class OnlyOneCodingLazy {
    private static volatile OnlyOneCodingLazy instance;

    private OnlyOneCodingLazy() {}

    public static OnlyOneCodingLazy getInstance() {
        if (instance == null) {                       // 1η φορά
            synchronized (OnlyOneCodingLazy.class) {
                if (instance == null) {               // 2η φορά
                    instance = new OnlyOneCodingLazy();
                }
            }
        }
        return instance;
    }
}

