import exception.MyArrayDataException;
import exception.MyArrayRuntimeException;
import exception.MyArraySizeException;
import main.Hometask2;

public class TestHometask {
    public static void main(String[] args) {
        Hometask2 hometask2 = new Hometask2();
        String[][] testArray1 = hometask2.provideArray(4,4);
        String[][] testArray2 = hometask2.provideArray(4,6);
        String[][] testArray3 = hometask2.provideArray(4,4);
        testArray3[2][3] = "hello";
        try {
            System.out.println(hometask2.sumOfElements(testArray1));
//            System.out.println(hometask2.sumOfElements(testArray2));
            System.out.println(hometask2.sumOfElements(testArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            throw new MyArrayRuntimeException("Something went wrong",e);

        }
    }
}
