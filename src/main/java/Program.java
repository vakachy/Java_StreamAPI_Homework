import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

public class Program {
    public static void main(String[] args) {
        Number[] sampleArray = {0, 5.1, -5.0, 100.0, 200.7, -999.3, 20.0, 57, 122};

        List<Number> list = Arrays.asList(sampleArray);

        Double res = list.stream()
                .filter(n -> n.doubleValue() % 2 == 0)
                .collect(Collectors.averagingDouble(n -> n.doubleValue()));
        System.out.printf("Mean value of all the list's even elements: %s", res);
    }
}