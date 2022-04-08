package Lamda;

import Lamda.impl.MyFunction;

public class LamdaEx {

    public LamdaEx() {
        MyFunction f1 = (x, y) -> {return x+y;};
        System.out.println("f1의 결과" + f1.calc(22, 100));
        MyFunction f2 = (x,y) -> {return x-y;};
        System.out.println("f2의 결과" + f2.calc(99, 10));
    }

    public static void main(String[] args) {
        new LamdaEx();
    }
}
