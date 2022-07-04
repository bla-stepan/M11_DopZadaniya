package M11_Z02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача 2
Написать программу, которая будет считывать целые числа с клавиатуры до тех пор, пока не будет введена строка.
Когда будет введена строка, программа должна поймать исключение и вывести все введенные до
этого числа на экран в том же порядке.
 */
public class Test {
    public static void main(String[] args) {
        //создаем читателя                              передаем поток      с клавы
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем лист для заполнения объектами строками
        List<Integer> list = new ArrayList<>();

        //создаем сканер для чтения
        //Scanner scanner = new Scanner(System.in);
        try {
            //создаем бесконечный цикл
            while (true){
                //кладем в лист объекты
                list.add(Integer.parseInt(reader.readLine()));
            }
            //выбрасываем исключение
        } catch (Exception e){
            //в обработке
            //проходимся по всей коллекции
            for (Integer i: list){
                //печатаем значения
                System.out.print(i);
            }
        }
    }
}
