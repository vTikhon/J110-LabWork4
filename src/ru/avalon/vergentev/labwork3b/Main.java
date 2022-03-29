package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {
        ArrayBehaviour array1 = new ArrayParameters();

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


    }
}
