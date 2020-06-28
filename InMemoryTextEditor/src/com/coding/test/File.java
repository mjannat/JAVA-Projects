package com.coding.test;

import java.util.*;
import java.util.logging.Logger;

public class File implements FileInterface {

    //TreeMap is used for storing text according to the line number.
    TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    //List is used for storing line number for accessing the test easily.
    List<Integer> list = new ArrayList<Integer>();

    Logger logger = Logger.getLogger(File.class.getName());

    //This variables are used for undo operation
    public static int lastOperation; // Find which operation is execute last time for undo operation
    public static int lastInsertedKey;
    public static int lastRemoveKey;
    public static int lastAddedKey;
    public static String lastRemoveValue;

    File() {
        logger.info("New file is created");
        lastOperation = 0;
        lastInsertedKey = 0;
        lastRemoveKey = 0;
        lastAddedKey = 0;
        lastRemoveValue = "";
        map.clear();
        list.clear();
    }

    @Override
    public void appendLast(String str) {
        if (list.size() == 0) {
            addValueMapList(1, str);
        } else {
            int lastLine = list.get(list.size() - 1) + 1;
            addValueMapList(lastLine, str);
        }
        logger.info("The line is added into the last position.");

        lastOperation = 1;
    }

    @Override
    public void appendLine(String str, int line) {
        if (list.contains(line) == true) {
            int lastLine = list.get(list.size() - 1);
            list.add(lastLine + 1);

            //Traverse the map for adding a text in the specific line
            for (int i = list.size() - 1; i >= 0; i--) {
                int key = list.get(i);
                String value = map.get(key);

                map.put(key + 1, value);
                if (key == line) {
                    map.put(line, str);
                    //When value is added in the map it will stop traversing
                    break;
                }
            }
        } else {
            addValueMapList(line, str);
            // The key will be sorted by line number
            Collections.sort(list);
        }
        logger.info("The string is added in line number " + line + ".");

        lastInsertedKey = line;
        lastOperation = 2;
    }

    public void print() {
        if (map.size() == 0) {
            System.out.println("The file is empty.");
        } else {
            logger.info("The lines are printed in sorted order by line number");
            System.out.println("\n");
            for (Integer key : map.keySet()) {
                if (map.get(key) != null) {
                    System.out.println(map.get(key));
                }
            }
        }
    }

    @Override
    public void remove(int line) {
        lastRemoveKey = line;
        lastRemoveValue = map.get(line);

        try {
            map.remove(line);
            list.remove(line);
            lastOperation = 3;
            logger.info("The line is remove successfully.");
        } catch (Exception e) {
            System.out.println("The line doesn't exist.");
            logger.info("Line doesn't exist");
        }
    }

    public void copy(int line, File file) {
        if (map.get(line) != null) {
            file.appendLine(map.get(line), line);
            lastAddedKey = line;
            lastOperation = 4;
            logger.info("The line is copy in the required file.");
        } else {
            System.out.println("This line is empty.");
            logger.info("This line is empty");
        }

    }

    public void cut(int line, File file) {
        String fileValue = map.get(line);
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) == fileValue) {
                lastRemoveValue = fileValue;
                lastRemoveKey = list.get(i);
                map.remove(lastRemoveKey);
                flag = true;
            }
        }
        if (flag == true) {
            logger.info("A line is removed from one file to another.");
            lastOperation = 5;
        } else {
            System.out.println("The line doesn't exist.");
        }
    }

    @Override
    public void undo() {
        try {
            if (lastOperation == 1) {
                map.remove(list.get(list.size() - 1));
            } else if (lastOperation == 2) {
                map.remove(lastInsertedKey);
            } else if (lastOperation == 3) {
                undoRemoveOperation();
            } else if (lastOperation == 4) {
                map.remove(lastAddedKey);
            } else if (lastOperation == 5) {
                addValueMapList(lastRemoveKey, lastRemoveValue);
            }
            if (lastOperation != 0) {
                logger.info("The last operation is undo");
                lastOperation = 0;
            }
            else
            {
                System.out.println("The file is empty.");
            }
        } catch (Exception e) {
            System.out.println("No operation was happened.");
            logger.info("No Operation was happened");
        }

    }

    public void undoRemoveOperation() {
        addValueMapList(lastRemoveKey, lastRemoveValue);
        Collections.sort(list);
    }

    //Adding the line number and text to the list and map.
    public void addValueMapList(int line, String str) {
        list.add(line);
        map.put(line, str);
    }
}
