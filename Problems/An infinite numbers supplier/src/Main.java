import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

class FunctionUtils {
    public static Supplier<Integer> getInfiniteRange() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        return (Supplier) () -> {
            return atomicInteger.getAndIncrement();
        };
    }

}