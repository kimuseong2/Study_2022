package Exercises;

public class Exercise4 {
    public static void main(String[] args) {
        // 배열 3인 객체를 만든다 .
        DataObject[] dataObjects = new DataObject[3];

        // 인스턴스 생성
        DataObject dataObject = new DataObject();
        // count 변수에 값 삽입
        dataObject.count = 5;
        // 배열[0] 객체에 담기
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 7;
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 9;
        dataObjects[2] = dataObject;

        int sum = 0;

        for(int i=0; i < dataObjects.length; i++){
            sum = sum + dataObjects[i].count;
        }

        System.out.println("Sum: " + sum);

    }
}
