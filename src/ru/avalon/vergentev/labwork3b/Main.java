package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {
        ArrayBehaviour array1 = new ArrayParameters();

        //�������� ������ �������:
        for (int i = 0; i < array1.SIZE; i++) {
            array1.set(i, true);
        }


        array1.get(456); //������� �������� ������������� 456 ��������
        array1.set(456, true); // ������������� ������������� 456 ������� � �������� true
        array1.get(456); //��������� �������� 456 ��������
        System.out.print('\n');

        array1.inverseElement(456); //�������������� �������� 456 ��������
        array1.get(456); //����� ������� ��� �������� �������� 456 ��������
        System.out.print('\n');

        array1.setTrue(456); //������������� 456 ������� � �������� true
        array1.get(456); //��������� �������� 456 ��������
        System.out.print('\n');

        array1.setFalse(456); //������������� 456 ������� � �������� false
        array1.get(456); //��������� �������� 456 ��������
        System.out.print('\n');

        array1.countTrues(); //��������� ������� �������� true � �������
        System.out.print('\n');

        array1.get(456); //������� �������� ������������� �������� � ���� true\false
        array1.toString(456); //������� �������� ������������� �������� � ���� 1\0


    }
}
