package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
//         * SET
//        1. 요소의 저장 순서를 유지하지 않습니다.
//
//        2. 같은 요소의 중복 저장을 허용하지 않습니다.
        Set set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add("김복남");
        // .contains 해당 집합이 전달된 객체를 포함하고 있는지를 확인함. TYPE boolean
        System.out.println(set.contains(1));

        System.out.println("set = " + set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        Set setA = new HashSet<>();
        Set setB = new HashSet<>();
        Set setC = new HashSet<>();

        Set<Set<Integer>> sets = new HashSet<>();

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(10);
        sets.add(set1);

        System.out.println(sets.size());
        set1.add(111);
        sets.remove(set1);
        System.out.println(sets.size());


        if (set1.isEmpty() == false ) {
            System.out.println("isEmptyTest");
        } else {
            System.out.println("noooo");
        }
        // .clear()  ==해당 집합의 모든 요소를 제거함. (선택적 기능)
        // .isEmpty() == 해당 집합이 비어있는지를 확인함.
        set1.clear();

        if (set1.isEmpty() == false ) {
            System.out.println("isEmpty");
        } else {
            System.out.println("noooo");
        }


    }
}
