import array_of_words.ArrayOfWords;
import phonebook.Tel;
import phonebook.User;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //task 1
        String[] StrArr = new String[]{
                "apple", "chair",
                "apple", "home",
                "door", "door",
                "bed", "door",
                "carrot", "telephone",
                "toy", "car",
                "rabbit", "train",
                "table", "bear",
                "window", "light"};
        ArrayOfWords arrayOfWords = new ArrayOfWords();
        System.out.println("The list of unique words of provided array:");
        System.out.println(Arrays.toString(arrayOfWords.getUniqueItems(StrArr)));
        arrayOfWords.quantityOfWords(StrArr);
        //task 2
        User u1 = new User("M","11111111111111111");
        User u2 = new User("M","22222222222222222");
        User u3 = new User("M3","3333333333333333");
        User u4 = new User("M3","4444444444444444");
        User u5 = new User("M4","5555555555555-55-5");
        User u6 = new User("M","66-66666666666-66-6");
        Tel tel = new Tel();
        tel.addTelepnoe(u1.getLastName(),u1.getTelNumber());
        tel.addTelepnoe(u2.getLastName(),u2.getTelNumber());
        tel.addTelepnoe(u3.getLastName(),u3.getTelNumber());
        tel.addTelepnoe(u4.getLastName(),u4.getTelNumber());
        tel.addTelepnoe(u5.getLastName(),u5.getTelNumber());
        tel.addTelepnoe(u6.getLastName(),u6.getTelNumber());
        System.out.println(tel.getTelephone(u1.getLastName()));
        System.out.println(tel.getTelephone(u3.getLastName()));
        System.out.println(tel.getTelephone(u5.getLastName()));
    }
}
