import java.util.Arrays;

public class NotenTest {
    public static void nichtAusreichendenNotenTest() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90}; // 30 nichtausreichend
        int[] result_wahr = test.nichtAusreichendenNoten(test_wahr);
        assert Arrays.equals(result_wahr, new int[]{30});

        int[] test_falsh= {-10, 50, 70, 110}; // enthalt -10
        int[] result_flash = test.nichtAusreichendenNoten(test_falsh);
        assert result_flash == null;
    }

}

