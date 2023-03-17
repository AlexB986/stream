package skypro;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestNumber {
    public static void main(String[] args) {

        List<SomeNumber> minMax = Arrays.asList(
                new SomeNumber(1),
                new SomeNumber(12),
                new SomeNumber(5),
                new SomeNumber(9),
                new SomeNumber(20)
        );
        findMinMax(minMax.stream(), new CompareNum(), (someNumber, someNumber2) -> {
            System.out.println("min " + someNumber);
            System.out.println("max " + someNumber2);
        });
        evenNumber(minMax);
    }


    public static void findMinMax(Stream<? extends SomeNumber> stream,
                                  Comparator<? super SomeNumber> order,
                                  BiConsumer<? super SomeNumber, ? super SomeNumber> minMaxConsumer) {
        SomeNumber min = null;
        SomeNumber max = null;
        List<SomeNumber> integersNumbers = stream
                .sorted(order)
                .collect(Collectors.toList());

        if (integersNumbers.size() != 0) {
            min = integersNumbers.get(0);
            max = integersNumbers.get(integersNumbers.size() - 1);
        }
        minMaxConsumer.accept(min, max);


    }

    public static void evenNumber(List<? extends SomeNumber> numbers) {


        Long counts = numbers.stream()
                .filter(n -> n.getNum() % 2 == 0)
                .count();
        System.out.println(counts);


    }


}
