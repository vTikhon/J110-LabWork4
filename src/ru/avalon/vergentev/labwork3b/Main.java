package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {
        ArrayBehaviour array1 = new BooleanArray();

        //заполним массив данными:
        for (int i = 0; i < array1.SIZE; i++) {
            array1.set(i, true);
        }

        array1.get(456); //выводим значение произвольного 456 элемента
        array1.set(456, true); // устанавливаем принудительно 456 элемент в значение true
        array1.get(456); //проверяем значение 456 элемента
        System.out.print('\n');

        array1.inverseElement(456); //переворачиваем значение 456 элемента
        array1.get(456); //снова выводим для проверки значение 456 элемента
        System.out.print('\n');

        array1.setTrue(456); //устанавливаем 456 элемент в значение true
        array1.get(456); //проверяем значение 456 элемента
        System.out.print('\n');

        array1.setFalse(456); //устанавливаем 456 элемент в значение false
        array1.get(456); //проверяем значение 456 элемента
        System.out.print('\n');

        array1.countTrues(); //посчитаем сколько значений true в массиве
        System.out.print('\n');

        array1.get(456); //выведем значение произвольного элемента в виде true\false
        array1.toString(456); //выведем значение произвольного элемента в виде 1\0



        ArrayBehaviour array2 = new IntArray();

        //заполним массив данными:
        for (int i = 0; i < array2.SIZE; i++) {
            array2.set(i, i);
        }

        array2.get(26); //выводим значение произвольного 26 элемента
//        array2.getBit(26,7); //выводим значение произвольного 26 элемента и произвольного 5 бита
//        array2.setBit(26, 7, 0); // устанавливаем принудительно 7 бит 26 элемента в значение 0
        array2.get(26); //проверяем значение 26 элемента
        System.out.print('\n');

        array2.inverseElement(26); //переворачиваем значение 26 элемента
        array2.get(26); //снова выводим для проверки значение 26 элемента
        System.out.print('\n');

        array2.get(26); //выводим значение произвольного 26 элемента
        array2.setTrue(26, 5); //устанавливаем 26 элемент в значение 1
        array2.get(26); //проверяем значение 26 элемента
        System.out.print('\n');

        array2.get(26); //выводим значение произвольного 26 элемента
        array2.setFalse(26, 4); //устанавливаем 26 элемент в значение 0
        array2.get(26); //проверяем значение 26 элемента
        System.out.print('\n');

        array2.countTrues(); //посчитаем сколько значений true в массиве
        System.out.print('\n');

    }
}

