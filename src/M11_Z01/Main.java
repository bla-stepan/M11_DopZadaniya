package M11_Z01;

import java.util.ArrayList;
import java.util.List;

/*
Задача 1
Даны 2 динамических массива случайных вещественных чисел в диапазоне от 0 до 100.
Произвести деление каждого значения из первого массива на соответствующее по индексу значение второго массива.
При результате деления меньше 1 выбросить Exception.
 */
public class Main {
    public static void main(String[] args) {
        int length = 10;
        //создаем рандомные массивы через коллекцию arrayList
        List<Double> list1 = new ArrayList<>();
        //размер массива делаем 10
        for (int i = 0; i < length; i++) {
            //заполняем случайными значениями
            list1.add(Math.random() * 100);
        }
        //создаем 2-й массив
        List<Double> list2 = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list2.add(Math.random() * 100);
        }

        List<Double> Result = new ArrayList<>();
        //создаем цикл для выполнения деления
        for (int i = 0; i < list1.size(); i++) {
            //трай/катч
            try {
                //если делитель = 0 выбрасываем исключение
                if (list2.get(i) == 1) throw new ArithmeticException();
                //если результат деления меньше 1 выбрасываем свое исключение, написанное в отдельном крлассе MyException
                if (list1.get(i) / list2.get(i) < 1) throw new MyException(list1.get(i), list2.get(i));
                //если больше 1 то выводим сообщение
                System.out.println(String.format("Результат деления %.2f на %.2f равен %.2f", list1.get(i), list2.get(i), list1.get(i) / list2.get(i)));
                //ловим обрабатываем исключения
            } catch (ArithmeticException arithmeticException) {
                System.out.println("На ноль делить нельзя");
            } catch (MyException myException) {
                System.out.println(myException);
            }
        }
    }
}



