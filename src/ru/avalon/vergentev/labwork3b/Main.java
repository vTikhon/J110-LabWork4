package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {

        ArrayBehaviour array1 = new BooleanArray();
        //заполним массив данными:
        for (int i = 0; i < array1.SIZE; i++) {
            array1.set(i, true);
        }

        //ПРОВЕРКА SET И GET
        array1.get(456); //выводим значение произвольного 456 элемента
        array1.set(456, true); // устанавливаем принудительно 456 элемент в значение true
        array1.get(456); //проверяем значение 456 элемента
        System.out.print('\n');


        //ПРОВЕРКА ИНВЕРСИИ ЭЛЕМЕНТА
        array1.inverseElement(456); //переворачиваем значение 456 элемента
        array1.get(456); //снова выводим для проверки значение 456 элемента
        System.out.print('\n');

        //ПРОВЕРКА setTRUE serFALSE элемента
        array1.setTrue(456); //устанавливаем 456 элемент в значение true
        array1.get(456); //проверяем значение 456 элемента
        System.out.print('\n');
        array1.setFalse(456); //устанавливаем 456 элемент в значение false
        array1.get(456); //проверяем значение 456 элемента
        System.out.print('\n');

        //ПРОВЕРКА СЧЁТА ЭЛЕМЕНТОВ TRUE
        array1.countTrues(); //посчитаем сколько значений true в массиве
        System.out.print('\n');

        //ВЫВОД ВСЕХ ЗНАЧЕНИЙ МАССИВА
//        array1.toString(); //выведем все значения элементов в виде 1\0
        System.out.print('\n');





        ArrayBehaviour array2 = new IntArray();
        //заполним массив данными:
        for (int i = 0; i < array2.SIZE ; i++) {
            array2.set(i, true);
        }

        //ПРОВЕРКА SET И GET
        array2.get(456); //выводим значение произвольного 456 бита
        array2.set(456, true); //присваиваем значение произвольного 456 бита в true (1)
        array2.get(456); //выводим значение произвольного 456 бита

        array2.get(455); //выводим значение произвольного 456 бита
        array2.set(455, true); //присваиваем значение произвольного 455 бита в true (1)
        array2.get(455); //выводим значение произвольного 455 бита

        //ПРОВЕРКА ИНВЕРСИИ БИТА
        array2.inverseElement(455); //переворачиваем значение 455 бита
        array2.get(455); //снова выводим для проверки значение 455 бита
        System.out.print('\n');

        //ПРОВЕРКА setTRUE serFALSE бита
        array2.get(455); //выводим значение произвольного 455 бита
        array2.setTrue(455); //устанавливаем 455 бит в значение 1
        array2.get(455); //проверяем значение 455 бита
        System.out.print('\n');
        array2.get(455); //выводим значение произвольного 455 бита
        array2.setFalse(455); //устанавливаем 455 бита в значение 0
        array2.get(455); //проверяем значение 455 бита
        System.out.print('\n');


        //ПРОВЕРКА СЧЁТА БИТОВ 1
        array2.countTrues(); //посчитаем сколько значений true в массиве
        System.out.print('\n');

        //ВЫВОД ВСЕХ ЗНАЧЕНИЙ МАССИВА
//        array2.toString(); //выведем значение произвольного элемента в виде true\false

    }
}

