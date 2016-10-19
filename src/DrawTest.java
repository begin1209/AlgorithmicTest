import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * User: zhy
 * Date: 2016-08-01
 */
public class DrawTest {

    public static void main(String[] args){
//        StdDraw.line(0,0,1,1);
//        methodResult();
        randomArray();
    }

    public static void methodResult(){
        int N = 100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        for(int i = 0; i <=N; i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i, i*(Math.log(i)));
        }
    }

    private static void randomArray(){
        int N = 50;
        double[] array = new double[N];
        for (int i = 0; i < N; i++){
            array[i] = StdRandom.random();
        }
        for (int i = 0; i < N; i++){
            double x = 1.0*i/N;
            double y = array[i]/2.0;
            double rw = 0.5/N;
            double rh = array[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
