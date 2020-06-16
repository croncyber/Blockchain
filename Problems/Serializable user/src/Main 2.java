import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = 5L;
    String name;
    public final int i = 9;

    public transient int o =0;

    public static int p =0;

    volatile transient final int l =0;

    private final int j =0;
}