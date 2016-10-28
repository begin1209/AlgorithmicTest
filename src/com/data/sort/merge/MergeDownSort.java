package com.data.sort.merge;

/**
 * User: zhy
 * Date: 2016-10-19
 */
public class MergeDownSort {

    private static Comparable[] auk;

    /**
     *
     * @param array
     */
    public static void sort(Comparable[] array) {
        auk = new Comparable[array.length];
        sort(array, 0, array.length - 1);
    }

    /**
     * 自顶向下的归并排序
     * @param array
     * @param low
     * @param high
     */
    private static void sort(Comparable[] array, int low, int high){
        if(high <= low){
            return;
        }
        int mid = low + (high - low)/2;
        sort(array, low, mid);  //左半边排序
        sort(array, mid + 1, high);  //右半边排序
        merge(array, low, mid, high); //归并
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
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void merge(Comparable[] array, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++){
            auk[k] = array[k];
        }
        for (int k = low; k <= high; k++){
            if(i > mid){
                array[k] = auk[j++];
            }else if(j > high){
                array[k] = auk[i++];
            }else if(less(auk[j],auk[i])){
                array[k] = auk[j++];
            }else {
                array[k] = auk[i++];
            }
        }
    }


    public static void main(String args[]) {
        String[] array = {"abc", "cca", "acd", "bfg", "aaa"};
        show(array);
        sort(array);
        assert isSorted(array);
        show(array);
    }
}
