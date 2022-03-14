package method;

public class MyClass {

    public void writeText(String text) {
        System.out.print(text);   //prints the text parameter to System.out.
    }

    public void writeText(String text1, String text2) {
        System.out.println(text1);
        System.out.println(text2);

        text1 = "new value 1";      // change value of text1
        text2 = "new value 2";      // change value of text2

    }

    public void writeText() {
        int a = 10;
        int b = 20;
        int c = 2;

        System.out.println(a * b / c);

    }

    public Long writeText(Long a, Long b, Long c) {
        return a * b / c;
    }


}
