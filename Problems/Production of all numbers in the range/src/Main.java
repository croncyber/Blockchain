import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> LongStream.rangeClosed(x, y)
            .reduce(1, (a, b) -> a * b);
}
