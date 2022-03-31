package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {

        //заполним массив данными:
        for (int i = 0; i < new BooleanArray().SIZE; i++) {
            new BooleanArray().set(i, true);
        }

        //ПРОВЕРКА SET И GET
        new BooleanArray().get(456); //выводим значение произвольного 456 элемента
        new BooleanArray().set(456, true); // устанавливаем принудительно 456 элемент в значение true
        new BooleanArray().get(456); //проверяем значение 456 элемента
        System.out.print('\n');


        //ПРОВЕРКА ИНВЕРСИИ ЭЛЕМЕНТА
        new BooleanArray().inverseElement(456); //переворачиваем значение 456 элемента
        new BooleanArray().get(456); //снова выводим для проверки значение 456 элемента
        System.out.print('\n');

        //ПРОВЕРКА setTRUE serFALSE элемента
        new BooleanArray().setTrue(456); //устанавливаем 456 элемент в значение true
        new BooleanArray().get(456); //проверяем значение 456 элемента
        System.out.print('\n');
        new BooleanArray().setFalse(456); //устанавливаем 456 элемент в значение false
        new BooleanArray().get(456); //проверяем значение 456 элемента
        System.out.print('\n');

        //ПРОВЕРКА СЧЁТА ЭЛЕМЕНТОВ TRUE
        new BooleanArray().countTrues(); //посчитаем сколько значений true в массиве
        System.out.print('\n');

        //ВЫВОД ВСЕХ ЗНАЧЕНИЙ МАССИВА
        new BooleanArray().toString(); //выведем все значения элементов в виде 1\0
        System.out.print('\n');





        //заполним массив данными:
        for (int i = 1; i <= new IntArray().SIZE ; i++) {
            new IntArray().set(i, true);
        }

        //ПРОВЕРКА SET И GET
        new IntArray().get(456); //выводим значение произвольного 456 бита
        new IntArray().set(456, true); //присваиваем значение произвольного 456 бита в true (1)
        new IntArray().get(456); //выводим значение произвольного 456 бита

        new IntArray().get(455); //выводим значение произвольного 456 бита
        new IntArray().set(455, true); //присваиваем значение произвольного 455 бита в true (1)
        new IntArray().get(455); //выводим значение произвольного 455 бита

        //ПРОВЕРКА ИНВЕРСИИ БИТА
        new IntArray().inverseElement(455); //переворачиваем значение 455 бита
        new IntArray().get(455); //снова выводим для проверки значение 455 бита
        System.out.print('\n');

        //ПРОВЕРКА setTRUE serFALSE бита
        new IntArray().get(455); //выводим значение произвольного 455 бита
        new IntArray().setTrue(455); //устанавливаем 455 бит в значение 1
        new IntArray().get(455); //проверяем значение 455 бита
        System.out.print('\n');
        new IntArray().get(455); //выводим значение произвольного 455 бита
        new IntArray().setFalse(455); //устанавливаем 455 бита в значение 0
        new IntArray().get(455); //проверяем значение 455 бита
        System.out.print('\n');


        //ПРОВЕРКА СЧЁТА БИТОВ 1
        new IntArray().countTrues(); //посчитаем сколько значений true в массиве
        System.out.print('\n');

        //ВЫВОД ВСЕХ ЗНАЧЕНИЙ МАССИВА
        new IntArray().toString(); //выведем значение произвольного элемента в виде true\false

    }
}

