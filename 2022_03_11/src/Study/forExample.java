package Study;

public class forExample {
    public static void main(String[] args) {
        for(int i=0; i < 10; i++) {

            System.out.println("i is: " + i);

        }
        for(int i = 0; i < 10; i++) {
            System.out.println("i is 1: " + i);  // executed inside  loop.
            System.out.println("second line");   // executed after   loop.
        }

        String[] strings = {"one", "two", "three" };

        for(String aString : strings) {
            System.out.println(aString);
        }

        String[] string1 = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        for(int i=0; i < strings.length; i++) {
            if(! string1[i].toLowerCase().startsWith("j")) {
                continue;
            }

            wordsStartingWithJ++;
        }
        System.out.println(wordsStartingWithJ);

        String[] strings1 = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ1 = 0;
        for(int i=0; i < strings.length; i++) {
            if(strings1[i].toLowerCase().startsWith("j")) {
                wordsStartingWithJ1++;
            }

            if(wordsStartingWithJ1 >= 3) {
                break;
            }

        }
        System.out.println(wordsStartingWithJ1);
    }
}
