package com.data.sort;

import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * User: zhy
 * Date: 2016-10-19
 */
public class SortCompare {
    public static double time(String alg, Comparable[] array){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Selection")){
            InsertSort.sort(array);
        }else if(alg.equals("Insertion")){
            InsertSort.sort(array);
        }else if(alg.equals("Shell")){
            Shell.sort(array);
        }

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] array = new Double[N];
        for(int t = 0; t < T; t++){
            for(int i = 0; i < N; i++){
                array[i] = StdRandom.uniform();
            }
            total += time(alg,array);
        }
        return total;
    }

    public static void main(String args[]){
        String args1 = args[0];
        String args2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(args1,N,T);
        double t2 = timeRandomInput(args2,N, T);
        StdOut.printf("For %d random Doubles\n   %s is ",N, args1);
        StdOut.printf("%.1f times faster than %s\n",t2/t1, args2);
    }
}
