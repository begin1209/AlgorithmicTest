import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * User: zhy
 * Date: 2016-07-21
 */
public class Average {
    public static void main(String[] args){
        double sum = 0.0;
        int count = 0;
        while (!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            count++;
        }
        double average = sum/count;
        StdOut.printf("Average is %.5f\n"+average);
    }
}
