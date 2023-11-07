package HomeWork2;

import java.util.*;
/**
 * Author Kirill_Kunavich
 */
public class HomeWork {
    public static void main(String[] args) {
        //1.Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
        //2.Избавиться от повторяющихся элементов в строке.
        //3.Вывести результат на экран.

        System.out.println("Enter numbers to string: ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);


    }
}
