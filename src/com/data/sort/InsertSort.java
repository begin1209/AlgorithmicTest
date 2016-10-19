package com.data.sort;

/**
 * User: zhy
 * Date: 2016-10-19
 * 插入排序
 */
public class InsertSort {

    public static void sort(Comparable[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                exchange(array, j, j - 1);
            }
        }

    }

    /**
     * 比较元素
     *
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换元素
     *
     * @param array
     * @param i
     * @param j
     */
    public static void exchange(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    private static void show(Comparable[] array) {
        //在单行中打印数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    /**
     * 测试元素是否有序
     *
     * @param array
     * @return
     */
    private static boolean isSorted(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String[] array = {"abc", "cca", "acd", "bfg", "aaa"};
        show(array);
        sort(array);
        assert isSorted(array);
        show(array);
    }
}
