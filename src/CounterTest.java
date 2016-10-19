/**
 * User: zhy
 * Date: 2016-07-22
 */
public class CounterTest {

    private int total = 0;

    public CounterTest(){

    }

    public void increment(){
        total += 1;
    }

    public int getTotal() {
        return total;
    }
}
