import DTO.Result;
import DTO.Source;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class App {


    public static void main(String[] args) {
        List<Source> list = Arrays.asList(new Source(3.2, 1.2), new Source(1.1, 2.2));
        Map<OperationType, Set<Source>> enumMap = new EnumMap<OperationType, Set<Source>>(OperationType.class);
        enumMap.put(OperationType.ADD, new HashSet<>(list));
        Map<String, Set<Result>> map2 = new LinkedHashMap<>();
        for (OperationType operationType : enumMap.keySet()) {
            Set<Source> sources = enumMap.get(operationType);
            Set<Result> results = new HashSet<>();
            for (Source source : sources) {
                Double calculate = operationType.function.calculate(source.getA(), source.getB());
                results.add(new Result(calculate));
            }
            map2.put(operationType.name(), results);
        }
        System.out.println(map2);
        System.out.println("======================================================================");


        Map<OperationType, Set<Source>> enumMap2 = new EnumMap<>(OperationType.class);
        enumMap2.put(OperationType.ADD, new HashSet<>(list));


                enumMap2
                        .entrySet()
                        .stream()
                        .map(operationTypeSetEntry -> operationTypeSetEntry.getValue()
                                .stream()
                                .map(source -> new Result(operationTypeSetEntry.getKey().function.calculate(source.getA(), source.getB())))
                                .collect(Collectors.toSet()))
                        .collect(Collectors.toMap(OperationType::getSymbol, operationType ->, LinkedHashMap::new));

        
    }
}
//x-> (Set<Result>) new HashSet<Result>()
//OperationType::getSymbol, OperationType::getFunction, LinkedHashMap::new