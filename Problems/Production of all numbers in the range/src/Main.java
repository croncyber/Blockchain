import java.util.function.*;
import java.util.stream.LongStream;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> LongStream.rangeClosed(x, y)
            .reduce(1, (a, b) -> a * b);
}
