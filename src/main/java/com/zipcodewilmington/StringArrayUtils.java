package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if (array != null && array.length > 0) {
            return array[0];
        } else {
            return null;
        }

    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array != null && array.length > 1) {
            return array[1];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array != null && array.length > 0) {
            return array[array.length - 1];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array != null && array.length > 1) {
            return array[array.length - 2];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (array == null || value == null ) {
            return false;
        }
        for (String element : array) {
            if (value.equals(element)) {
                return true;
            }
        }
        return  false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int length = array.length;
        String[] reverseArray = new String[length];

        for (int i = 0; i < length; i++) {
            reverseArray[i] = array[length - i - 1];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(array[array.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        if (array == null) {
            return false;
        }
        boolean[] alphabet = new boolean[26];

        for(String str : array) {
            for (char c : str.toLowerCase().toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    int index = c - 'a';
                    alphabet[index] = true;
                }
            }
        }
        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return  false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        if (array == null || value == null) {
            return  0;
        }
        int count = 0;

        for (String element : array) {
            if (value.equals(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
