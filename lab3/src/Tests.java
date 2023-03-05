import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class MyFirstJUnitJupiterTests {

    @Test
    void minTest() {
        int len = 1000;
        double[] arr = new double[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int ans = ExpSearch.Search(arr, 500);
        assertEquals(500, ans);
    }
}