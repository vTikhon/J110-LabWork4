package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {
        ArrayBehaviour array1 = new BooleanArray();

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



        ArrayBehaviour array2 = new IntArray();

        //�������� ������ �������:
        for (int i = 0; i < array2.SIZE; i++) {
            array2.set(i, i);
        }

        array2.get(26); //������� �������� ������������� 26 ��������
//        array2.getBit(26,7); //������� �������� ������������� 26 �������� � ������������� 5 ����
//        array2.setBit(26, 7, 0); // ������������� ������������� 7 ��� 26 �������� � �������� 0
        array2.get(26); //��������� �������� 26 ��������
        System.out.print('\n');

        array2.inverseElement(26); //�������������� �������� 26 ��������
        array2.get(26); //����� ������� ��� �������� �������� 26 ��������
        System.out.print('\n');

        array2.get(26); //������� �������� ������������� 26 ��������
        array2.setTrue(26, 5); //������������� 26 ������� � �������� 1
        array2.get(26); //��������� �������� 26 ��������
        System.out.print('\n');

        array2.get(26); //������� �������� ������������� 26 ��������
        array2.setFalse(26, 4); //������������� 26 ������� � �������� 0
        array2.get(26); //��������� �������� 26 ��������
        System.out.print('\n');

        array2.countTrues(); //��������� ������� �������� true � �������
        System.out.print('\n');

    }
}

