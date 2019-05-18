public interface Calculator<S extends Number, R extends Number> {
    R calculate(S x,S y);
}
