import DTO.Result;
import DTO.Source;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {




    public static  void main(String[] args) {

        Source source = new Source();


        Map<OperationTyp, Set<Source>> enumMap = new EnumMap<OperationTyp, Set<Source>>(OperationTyp.class);

        enumMap.put(OperationTyp.ADD,);



//        EnumMap<OperationTyp,List<? extends Source>> enumMap = new EnumMap<>(OperationTyp.class);

//        enumMap.put(OperationTyp.ADD, Arrays.asList(new Source(1,2)));
//        Stream.of(enumMap).forEach(System.out::println);
//
//        Stream.of(enumMap.values()).forEach(System.out::println);





//===================================================================================
//        Map<OperationTyp, List<? extends Source>> map = new HashMap<>();
//
//        map.put(OperationTyp.ADD, Arrays.asList(new Source(1,1)));
//        map.put(OperationTyp.SUB, Arrays.asList(new Source(2,2)));
//        map.put(OperationTyp.MUL, Arrays.asList(new Source(3,3)));
//
//        System.out.println("map: " + map);
//        System.out.println("map.keySet(): " + map.keySet());
//
//        for(OperationTyp operationTyp : map.keySet()){
//            System.out.println( operationTyp+ " имеет");
//            for (Source source : map.get(operationTyp)){
//                System.out.println("  " + source);
//            }
//
//        }
//        System.out.println("-------------------------------------------------------");
//
//Stream.of(map).flatMap(x->Stream.of(map.values())).forEach(System.out::println);
//================================================================================
//==================================================================================

//        Map<Integer,List<? extends Result>> map1 = Stream.of(new Source(1,2)).map((y x)->OperationTyp.ADD.calculate(1.0,2.0));


////        Calculator<Double,Double> c = (x,y) -> OperationTyp.ADD.calculate(1.0,2.0);
////        System.out.println(c);
//        Calculator<Double,Double> c = (x,y) -> x+y;
//        System.out.println(c.calculate(1.0,5.0));

//        Map<OperationTyp., List<? extends Pet>> personMap = new HashMap<>();
//        EnumMap<OperationTyp,Set<? extends Source>> map = new EnumMap<OperationTyp, Set<? extends Source>>(OperationTyp.class);
//
//        map.put(OperationTyp.ADD, (Set<? extends Source>) new Source(1,2));
//        System.out.println(map);
//============================================================================

//        EnumMap<OperationTyp,Source> hashMapmap = new EnumMap<OperationTyp, Source>(OperationTyp.class);
//
//        hashMapmap.put(OperationTyp.ADD,  new Source(1,2));
//        hashMapmap.put(OperationTyp.DIV,  new Source(2,3));
////        Stream.of(hashMapmap).forEach(System.out::println);   //Вернет void
//        System.out.println(hashMapmap);//Смотрел все
//        System.out.println(hashMapmap.get(OperationTyp.DIV));//Смотрел по ключу
//        System.out.println(hashMapmap.values()); //Все values()
//        System.out.println(hashMapmap.keySet());// Key






    }
}
