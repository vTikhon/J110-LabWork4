package ru.avalon.vergentev.labwork3b;

public interface ArrayBehaviour {
    int SIZE = 1024;

    void setArray (int i, boolean value);
    boolean get (int i);
    void setTrue (int i);
    void set (int i, boolean value);
    void setFalse (int i);
    void inverseElement (int i);
    int countTrues ();
    String toString ();
}
