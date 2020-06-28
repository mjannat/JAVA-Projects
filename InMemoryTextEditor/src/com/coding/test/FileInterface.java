package com.coding.test;

public interface FileInterface {

    // Add a line at the end of the file
    public void appendLast(String str);

    //Add a line at the specific file
    public void appendLine(String str, int line);

    //Show all the text of the file
    public void print();

    //Remove a line
    public void remove(int line);

    // Undo the last operation
    public void undo();
}

