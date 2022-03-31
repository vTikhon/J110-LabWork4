package ru.avalon.vergentev.labwork3b;

public class Main {
    public static void main(String[] args) {

        //�������� ������ �������:
        for (int i = 0; i < new BooleanArray().SIZE; i++) {
            new BooleanArray().set(i, true);
        }

        //�������� SET � GET
        new BooleanArray().get(456); //������� �������� ������������� 456 ��������
        new BooleanArray().set(456, true); // ������������� ������������� 456 ������� � �������� true
        new BooleanArray().get(456); //��������� �������� 456 ��������
        System.out.print('\n');


        //�������� �������� ��������
        new BooleanArray().inverseElement(456); //�������������� �������� 456 ��������
        new BooleanArray().get(456); //����� ������� ��� �������� �������� 456 ��������
        System.out.print('\n');

        //�������� setTRUE serFALSE ��������
        new BooleanArray().setTrue(456); //������������� 456 ������� � �������� true
        new BooleanArray().get(456); //��������� �������� 456 ��������
        System.out.print('\n');
        new BooleanArray().setFalse(456); //������������� 456 ������� � �������� false
        new BooleanArray().get(456); //��������� �������� 456 ��������
        System.out.print('\n');

        //�������� �ר�� ��������� TRUE
        new BooleanArray().countTrues(); //��������� ������� �������� true � �������
        System.out.print('\n');

        //����� ���� �������� �������
        new BooleanArray().toString(); //������� ��� �������� ��������� � ���� 1\0
        System.out.print('\n');





        //�������� ������ �������:
        for (int i = 1; i <= new IntArray().SIZE ; i++) {
            new IntArray().set(i, true);
        }

        //�������� SET � GET
        new IntArray().get(456); //������� �������� ������������� 456 ����
        new IntArray().set(456, true); //����������� �������� ������������� 456 ���� � true (1)
        new IntArray().get(456); //������� �������� ������������� 456 ����

        new IntArray().get(455); //������� �������� ������������� 456 ����
        new IntArray().set(455, true); //����������� �������� ������������� 455 ���� � true (1)
        new IntArray().get(455); //������� �������� ������������� 455 ����

        //�������� �������� ����
        new IntArray().inverseElement(455); //�������������� �������� 455 ����
        new IntArray().get(455); //����� ������� ��� �������� �������� 455 ����
        System.out.print('\n');

        //�������� setTRUE serFALSE ����
        new IntArray().get(455); //������� �������� ������������� 455 ����
        new IntArray().setTrue(455); //������������� 455 ��� � �������� 1
        new IntArray().get(455); //��������� �������� 455 ����
        System.out.print('\n');
        new IntArray().get(455); //������� �������� ������������� 455 ����
        new IntArray().setFalse(455); //������������� 455 ���� � �������� 0
        new IntArray().get(455); //��������� �������� 455 ����
        System.out.print('\n');


        //�������� �ר�� ����� 1
        new IntArray().countTrues(); //��������� ������� �������� true � �������
        System.out.print('\n');

        //����� ���� �������� �������
        new IntArray().toString(); //������� �������� ������������� �������� � ���� true\false

    }
}

