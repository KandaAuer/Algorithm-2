package com.example;

import java.util.Arrays;

public class IntegerArrayList implements IntegerList {
    private int[] data;
    private int size;

    public IntegerArrayList() {
        data = new int[10];
        size = 0;
    }

    @Override
    public void add(int value) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = value;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
        }
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort() {
        Arrays.sort(data, 0, size);
    }

    @Override
    public int binarySearch(int value) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (data[mid] == value) {
                return mid;
            }
            if (data[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
