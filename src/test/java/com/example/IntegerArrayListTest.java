package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerArrayListTest {

    @Test
    public void testAddAndSize() {
        IntegerArrayList list = new IntegerArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size(), "Размер должен быть равен 3 после добавления 3 элементов.");
    }

    @Test
    public void testGet() {
        IntegerArrayList list = new IntegerArrayList();
        list.add(10);
        list.add(20);

        assertEquals(10, list.get(0), "Элемент с индексом 0 должен иметь значение 10.");
        assertEquals(20, list.get(1), "Элемент с индексом 1 должен иметь значение 20.");
    }

    @Test
    public void testSort() {
        IntegerArrayList list = new IntegerArrayList();
        list.add(30);
        list.add(10);
        list.add(20);
        list.sort();

        assertEquals(10, list.get(0), "Первый элемент должен быть 10 после сортировки");
        assertEquals(20, list.get(1), "Второй элемент должен иметь значение 20 после сортировки");
        assertEquals(30, list.get(2), "Третий элемент должен иметь значение 30 после сортировки");
    }

    @Test
    public void testBinarySearch() {
        IntegerArrayList list = new IntegerArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.sort();

        assertEquals(0, list.binarySearch(10), "Индекс 10 должен быть 0");
        assertEquals(1, list.binarySearch(20), "Индекс 20 должен быть 1");
        assertEquals(2, list.binarySearch(30), "Индекс 30 должен быть 2");
        assertEquals(-1, list.binarySearch(40), "Индекс 40 должен быть -1 (не найден)");
    }

    @Test
    public void testGetOutOfBounds() {
        IntegerArrayList list = new IntegerArrayList();
        list.add(10);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1), "Должно выдаваться исключение для недействительного индекса");
    }
}
