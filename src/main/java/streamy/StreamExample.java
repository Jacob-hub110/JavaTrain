package streamy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Michal", "Maciek", "Mariola", "Cezary", "Basia");

        for (String name : names) {
            System.out.println(name + "!");
        }

        System.out.println("-----------");

        //map - operacja posrednia, edytujaca obiekty w strumieniu
        //filter - operacja posrednia, odfiltrowuje wybrane elementy

        //foreach - operacja konczaca, wykonujaca operacje dla kazdego elementu w strumieniu

        names.stream()
                .map(name -> name + "!")
                .map(String::toUpperCase)
                .filter(name -> name.length() < 7)
                .forEach(System.out::println);

        List<String> list = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(list);
    }

}
