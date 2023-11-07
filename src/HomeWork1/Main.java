package HomeWork1;

import java.util.ArrayList;

/**
 * Author Kirill_Kunavich
 */
public class Main {
    public static void main(String[] args) {
        // Задание 1 Динамический массив
        // 1.Создать динамический массив, содержащий объекты класса HeavyBox.
        // 2.Распечатать его содержимое, используя for each.
        // 3.Изменить вес первого ящика на 1.
        // 4.Удалить последний ящик.
        // 5.Получить массив, содержащий ящики коллекции, тремя способами и вывести на консоль.
        // 6.Удалить все ящики.

        class HeavyBox {
            int  weight;

            HeavyBox(int weight) {
                this.weight = weight;
            }
            @Override
            public String toString() {
                return " " + weight;
            }
        }


        // #1
        HeavyBox box1 = new HeavyBox(1);
        HeavyBox box2 = new HeavyBox(245);
        HeavyBox box3 = new HeavyBox(35);
        HeavyBox box4 = new HeavyBox(15);

        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);

        System.out.println("********");
        // #2
        for (HeavyBox b : boxes ) {
            System.out.println("Box :" + b);
        }
        System.out.println("---------------");
        // #3
        boxes.get(0).weight = +1;
        // #4
        boxes.remove(3);
        System.out.println("#1");
        for (HeavyBox o : boxes) {
            System.out.println("Box: " + o);
        }
        System.out.println("#2");
        System.out.println(boxes.toString());
        System.out.println("#3");
        System.out.println(boxes);
        System.out.println("------");
        boxes.clear();
        System.out.println(boxes);



    }
}
