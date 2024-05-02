package org.example;

public class MyArray {

    private String[] array = new String[5];

    public int length()
    {
        int length = 0;

        for (String s : array) {
            if (s != null) {
                length++;
            }
        }
        return length;
    }

    public void put(String str) {
       if (length() == array.length) {
           String[] secondArray = new String[array.length * 2];
           for (int i = 0; i < array.length; i++) {
               secondArray[i] = array[i];
           }
           secondArray[length()] = str;
           array = secondArray;
       } else {
           array[length()] = str;
       }
    }

    public String get() {
      if (length() == 0 || array[0] == null) {
          return "No more elements";
      }
      String firstElement = array[0];
      for (int i = 0; i < array.length - 1; i++) {
          array[i] = array[i + 1];
      }
      array[array.length - 1] = null;
      return firstElement;
    }






}

