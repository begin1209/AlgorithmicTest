/**
 * User: zhy
 * Date: 2016-08-01
 */
public class BinSearchTest {

    public static void main(String[] args){
        int[] array = new int[]{
                1,3,5,7,9,10,19,29,35,67,85,96
        };
        System.out.println(binSearch(19,array));
        System.out.println(binSearch1(19,array,0,array.length));
        System.out.println(decimalToBinary(10));
    }

    public static int binSearch(int key, int[] array){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = low + (high- low)/2;
            if(key > array[mid]){
                low = mid + 1;
            }else if(key < array[mid]){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int binSearch1(int key, int[] array, int low, int high){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(key < array[mid]){
            binSearch1(key,array,low,mid - 1);
        }else if(key > array[mid]){
            binSearch1(key,array,mid + 1, high);
        }else {
            return mid;
        }
        return -1;
    }

    public static String decimalToBinary(int num){
        if(num/2 == 0){
            return ""+num%2;
        }else {
            decimalToBinary(num/2);
            return ""+num%2;
        }
    }

//    public static String toBinary(int num){
//        //书写你的代码
//
//    }
}
