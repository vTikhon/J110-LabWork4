package ru.avalon.vergentev.labwork3b;

public interface ArrayBehaviour2 {
    int SIZE = 1024;

    void get (int i);
    void set (int i, int value);

    void getBit (int i, int numberOfBit);
    void setBit (int i, int numberOfBit, int value);

    void setTrue (int i, int numberOfBit);
    void setFalse (int i, int numberOfBit);

    void inverseElement (int i);

    void countTrues ();

}
