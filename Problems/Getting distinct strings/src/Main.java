import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


class Operator {

    public static UnaryOperator<List<String>> unaryOperator = x -> new ArrayList<>(new HashSet<>(x));
}