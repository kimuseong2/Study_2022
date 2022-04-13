package streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,7,4,35,265,2,24,34,563,23);
        List<String> stringList = Arrays.asList("Eric", "Elena", "Java");

        //List<String> resultString = stringList.stream().filter(name -> name.contains("a")).collect(Collectors.toList());
        List<String> resultString = stringList.stream().map(String::toLowerCase).collect(Collectors.toList());

        List<Integer> result = list.stream()
                .filter(number -> number < 50)
                .distinct()
                .sorted(Integer::compare)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println(resultString);

        Stream<String> builderStream = Stream.<String>builder().add("useong").add("yunjung").add("LOVE").build();
        System.out.println(builderStream.collect(Collectors.toList()));
    }
}
