package com.telran.collection;

import java.util.Arrays;

public class SortedNumbersList {

    private int[] source;

    public SortedNumbersList() {
        source = new int[0];
    }

    public SortedNumbersList(int[] array) {
        source = ArrayUtils.copyArray(array);

        ArrayUtils.selectionSort(source);
    }

    public void display() {
        System.out.println(Arrays.toString(source));
    }

    public void add(int number) {
        source = ArrayUtils.append(source, number);
        ArrayUtils.selectionSort(source);
    }

    public int get(int index) {
        return source[index];
    }

    public int size() {
        return source.length;
    }

  public boolean remove(int number) {
            int[] newArray = new int[0];
            for ( int i = 0; i < source.length; i++) {
                if (source[i] == number) {
                    continue;
                }
                newArray = ArrayUtils.append(newArray, source[i]);
            }
            boolean result = source.length != newArray.length;
            source = newArray;
            return result;
        }

    public void removeById(int index) {

    }

    public void removeRepeated() {
        if (source.length == 0)
            return;

        int newLength = 1;

        for (int i = 1; i < source.length; i++) {
            if (source[i] != source[i - 1])
                newLength++;
        }

        int i = 1;
        int[] newSource = new int[newLength];

        newSource[0] = source[0];
        for (int j = 1; j < source.length; j++) {
            if (source[j] != source[j - 1])
                newSource[i++] = source[j];
        }
        source = newSource;

    }

    /**
     * the method returns a new object of {@link SortedNumbersList} which is an intersection
     * of this and another
     *
     * @param another
     * @return
     */
    public SortedNumbersList intersection(SortedNumbersList another) {
        return null;
    }

    public SortedNumbersList union(SortedNumbersList another) {
        return null;
    }

    public boolean contains(int number) {
        return ArrayUtils.binarySearch(this.source, number) >= 0;
    }

}
