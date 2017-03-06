package ppj.assignments;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Petr on 06.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("c");
        names.add("b");
        names.add("ab");
        names.add("a");

        System.out.println(names);
        //Collections.sort(names);
        //System.out.println(names);

        // Java 8

        names.stream()
            .filter((s) ->{
                System.out.println(s);
                return s.startsWith("a");
            })
            .map( s -> s.toUpperCase())
//        .forEach();
//            .collect()

        ;
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);

        //-------------------
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        //-------------------
        // rada pro testy z prvniho ukolu
        List<List<Integer>> nums = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
//        nums.stream().flatMap( t -> t.stream()).forEach(System.out::println);
        Stream<Integer> s = nums.stream().flatMap( t -> t.stream());
        s.forEach(System.out::println);
//        s.map( b -> b*b).forEach(System.out::println);
        System.out.println(s.map( b -> b * b).reduce((c,b) -> c+b).get());




    }


}
