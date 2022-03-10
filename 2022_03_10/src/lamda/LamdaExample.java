package lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class LamdaExample {
    int method() {
        return (int)(Math.random() * 5) + 1;
    }
    {
        int result = method();
        int result2; // = () -> (int)(Math.random() * 5) + 1;
    }
    public static void main(String[] args) {

        System.out.println(new MyLambdaFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        }.max(
                3,5
        ));

        MyLambdaFunction myLambdaFunction = (int a , int b) -> a > b ? a : b;
        System.out.println(myLambdaFunction.max(3,5));

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("b");
        list.add("cC");

        list.forEach((String str) -> {System.out.println(str);});
        list.forEach((String str) -> System.out.println(str));
        list.forEach((str) -> System.out.println(str));
        list.forEach(str -> System.out.println(str));

        MyFunction f = new MyFunction() {

            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int result = f.max(3, 5);
        System.out.println(result);

        MyFunction f2 = (a,b) -> a > b ? a : b;
        result = f2.max(3, 5);
        System.out.println(result);

        // Add타입의 generic을 가지는 Treeset 객체를 생성, 단 Treeset의 이름은 set으로 하고 정렬 규칙은 no의 역순으로 지정
        TreeSet<Addr> set = new TreeSet<Addr>(new Comparator<Addr>() {

            @Override
            public int compare(Addr o1, Addr o2) {
                return o2.no - o1.no;
            }

        });
        f2.test2();
        MyFunction.test();

//		TreeSet<Addr> set = new TreeSet<Addr>((o1,o2) -> o2.no - o1.no);
    }
}

@FunctionalInterface
interface MyLambdaFunction {
    int max(int a, int b);
}
@FunctionalInterface // FunctionalInterface어노테이션을 붙히면 반드시 하나의 메서드만 정의할수 있다
interface MyFunction {
    int max(int a, int b);
    static int test() {
        return 10;
    }

    default String test2() {
        return "abc";
    }
}

class Addr {
    int no;
    String name;
}

