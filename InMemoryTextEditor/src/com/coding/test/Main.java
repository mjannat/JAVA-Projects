package com.coding.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create new text file
        File file = new File();
        File file1 = new File();

        System.out.println("Some static test cases for testing the code.\n");

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        System.out.println("Choose your operation : \n Press 1 for appendLine \n Press 2 for appendLast \n Press 3 for print the file \n Press 4 for remove a line\n Press 5 for copy a file from one file to another \n Press 6 for cut a line from one file to another. \n Press 7 for undo the last operation.\n Press 8 for exit\n");
        while (loop) {

            int cases = sc.nextInt();
            switch (cases) {
                case 1:
                    //Append some line in the file
                    file.appendLine("Java Virtual Machine", 1);
                    file.appendLine("Java Development Kit", 2);
                    file.appendLine("Java Standard Edition", 3);
                    //Append a line at line number 2, which is already holding a line.
                    // So, others line number will be increase by one.
                    file.appendLine("Java Enterprise Edition ", 2);
                    break;
                case 2:
                    //Adding new lines at the end of the file
                    file.appendLast("Java Object Oriented language");
                    file.appendLast("Java code Write Once, Run Anywhere");
                    file.appendLast("Java is most secure language");
                    break;
                case 3:
                    //Printed all lines from file sorted by line number
                    file.print();
                    break;
                case 4:
                    file.remove(6);
                    break;
                case 5:
                    file.copy(1, file1);
                    file.copy(4, file1);
                    break;
                case 6:
                    file1.cut(1, file);
                    break;
                case 7:
                    file1.undo();
                    break;
                case 8:
                    System.out.println("Thank you");
                    loop = false;
                    break;
            }
        }
    }
}

