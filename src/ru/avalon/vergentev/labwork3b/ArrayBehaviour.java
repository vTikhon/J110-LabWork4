package ru.avalon.vergentev.labwork3b;

public interface ArrayBehaviour {
    int SIZE = 1024;

    void get (int i);
    void setTrue (int i);
    void set (int i, boolean value);
    void setFalse (int i);
    void inverseElement (int i);
    void countTrues ();
    String toString ();
}
