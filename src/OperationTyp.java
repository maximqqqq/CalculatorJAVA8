import DTO.Source;

import java.util.Collection;
import java.util.function.BinaryOperator;

public enum OperationTyp {


    ADD("+", (x, y) -> x + y),
    SUB("-", (x, y) -> x - y),
    MUL("*", (x, y) -> x * y),
    DIV("/", (x, y)-> x / y);


    public final String symbol;
    public final Calculator<Double,Double> function;

      OperationTyp(String symbol, Calculator<Double, Double> function) {
        this.symbol = symbol;
        this.function = function;
    }

public Double calculate(Double x, Double y) {
    return function.calculate(x, y);
}


    public String getSymbol() {
        return symbol;
    }


}
