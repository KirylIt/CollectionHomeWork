package HomeWork4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Study {
    public static void main(String[] args) {
        //+1. Создать класс Student, содержащий следующие характреристики - имя, группа,
        // курс и оценки по предметам.
        //+2. Создать коллекцию, содержащуюю объекты класса Student
        //+3. Написать метод, который удаляет студентов со средним баллом <3
        //+4. Если средний балл >=3, студент переводится на следующий курс
        //+5. Напишите метод printStudents(List<Student>students, int course)
        // который получает список студентов и номер курса
        //+6. А так же печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

        List<Student> students = new ArrayList<>();
         students.add(new Student("Максим",2,4,3,4,2,4));
         students.add(new Student("Виктория",2,2,5,4,2,2));
         students.add(new Student("Кирилл",1,1,5,5,5,5));
         students.add(new Student("Дима",1,3,3,2,4,5));
         students.add(new Student("Андрей",2,1,2,1,3,5));

         for (Student r : students){
             System.out.println("Student :" + " " + r);
         }
        System.out.println("--------------------------");
        ArrayList<Student> loosers = new ArrayList<>();
         for(Student s :students){
            if (s.getMarkSred() < 3) { // Удаление студента со средним баллом 3
                loosers.add(s);
                System.out.println("Студент исключен!" + " " + s);
            } else if (s.getMarkSred() >= 3) { // Переход на следующий курс со средним баллом >=3
                System.out.println("Студент переведен в другую группу " + " " + s);
                students.get(students.indexOf(s)).course += 1;
            }
        }
         students.removeAll(loosers);

         System.out.println("********");
         for(Student st :students)
                System.out.println("Студент" + " " + st);
         System.out.println("--------");
         for(Student l :loosers){
            System.out.println("Студент отчислен" + " " + l);
        }
        System.out.println("*********");
        System.out.println(" ");
        System.out.println("Студенты Университета :");

        int course = 1;
        printStudents(students, course);
        course =2;
        printStudents(students, course);
        course =3;
        printStudents(students, course);
        course =4;
        printStudents(students, course);
    }
    public static void printStudents (List<Student> students, int course){
        System.out.println("Студент " + course + " курса:");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}


