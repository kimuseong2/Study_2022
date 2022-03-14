package method;

public class Ex {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.writeText("Hello");

        myClass.writeText("Hello","World");

        myClass.writeText();

        Long A = myClass.writeText(3L,6L,9L);
        System.out.println(A);
    }



}
