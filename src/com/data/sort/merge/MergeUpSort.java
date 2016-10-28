package com.data.sort.merge;

/**
 * User: zhy
 * Date: 2016-10-28
 */
public class MergeUpSort {

    private static Comparable[] aux = null;

    public static void main(String args[]) {
        String[] array = {"abc", "cca", "acd", "bfg", "aaa"};
        show(array);
        sort(array);
        assert isSorted(array);
        show(array);
    }

    public static void sort(Comparable[] array){
        aux = new Comparable[array.length];
        int n = array.length;
        //11归并，22归并 44归并 88归并
        for(int sz = 1; sz < n; sz = sz + sz){
            for(int low = 0; low < n-sz; low += sz + sz){
                merge(array,low, low + sz - 1, Math.min(low + sz + sz - 1, n-1));
            }
        }

    }


    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    public static void exchange(Comparable[] array, int i, int j){
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isSorted(Comparable[] array){
        for (int i = 1; i <= array.length - 1; i++){
            if(less(array[i],array[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] array){
        for (Comparable temp: array) {
            System.out.print(temp+"  ");
        }
        System.out.println();
    }

    public static void merge(Comparable[] array, int low, int mid, int high){

        for (int k = low; k <= high; k++){
            aux[k] = array[k];
        }

        int i = low;
        int j = mid + 1;

        for (int k = low; k <= high; k++){
            if(i > mid){
                array[k] = aux[j++];
            }else if(j > high){
                array[k] = aux[i++];
            }else if(less(aux[i], aux[j])){
                array[k] = aux[i++];
            }else {
                array[k] = aux[j++];
            }
        }
    }
}
