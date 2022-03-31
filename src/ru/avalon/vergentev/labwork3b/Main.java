package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {

        ArrayBehaviour array1 = new BooleanArray();
        //�������� ������ �������:
        for (int i = 0; i < array1.SIZE; i++) {
            array1.set(i, true);
        }

        //�������� SET � GET
        array1.get(456); //������� �������� ������������� 456 ��������
        array1.set(456, true); // ������������� ������������� 456 ������� � �������� true
        array1.get(456); //��������� �������� 456 ��������
        System.out.print('\n');


        //�������� �������� ��������
        array1.inverseElement(456); //�������������� �������� 456 ��������
        array1.get(456); //����� ������� ��� �������� �������� 456 ��������
        System.out.print('\n');

        //�������� setTRUE serFALSE ��������
        array1.setTrue(456); //������������� 456 ������� � �������� true
        array1.get(456); //��������� �������� 456 ��������
        System.out.print('\n');
        array1.setFalse(456); //������������� 456 ������� � �������� false
        array1.get(456); //��������� �������� 456 ��������
        System.out.print('\n');

        //�������� �ר�� ��������� TRUE
        array1.countTrues(); //��������� ������� �������� true � �������
        System.out.print('\n');

        //����� ���� �������� �������
//        array1.toString(); //������� ��� �������� ��������� � ���� 1\0
        System.out.print('\n');





        ArrayBehaviour array2 = new IntArray();
        //�������� ������ �������:
        for (int i = 0; i < array2.SIZE ; i++) {
            array2.set(i, true);
        }

        //�������� SET � GET
        array2.get(456); //������� �������� ������������� 456 ����
        array2.set(456, true); //����������� �������� ������������� 456 ���� � true (1)
        array2.get(456); //������� �������� ������������� 456 ����

        array2.get(455); //������� �������� ������������� 456 ����
        array2.set(455, true); //����������� �������� ������������� 455 ���� � true (1)
        array2.get(455); //������� �������� ������������� 455 ����

        //�������� �������� ����
        array2.inverseElement(455); //�������������� �������� 455 ����
        array2.get(455); //����� ������� ��� �������� �������� 455 ����
        System.out.print('\n');

        //�������� setTRUE serFALSE ����
        array2.get(455); //������� �������� ������������� 455 ����
        array2.setTrue(455); //������������� 455 ��� � �������� 1
        array2.get(455); //��������� �������� 455 ����
        System.out.print('\n');
        array2.get(455); //������� �������� ������������� 455 ����
        array2.setFalse(455); //������������� 455 ���� � �������� 0
        array2.get(455); //��������� �������� 455 ����
        System.out.print('\n');


        //�������� �ר�� ����� 1
        array2.countTrues(); //��������� ������� �������� true � �������
        System.out.print('\n');

        //����� ���� �������� �������
//        array2.toString(); //������� �������� ������������� �������� � ���� true\false

    }
}

