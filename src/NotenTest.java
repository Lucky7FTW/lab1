import java.util.Arrays;

public class NotenTest {
    public static void nichtAusreichendenNotenTest() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90}; // 30 nichtausreichend
        int[] result_wahr = test.nichtAusreichendenNoten(test_wahr);
        assert Arrays.equals(result_wahr, new int[]{30});

        int[] test_falsch= {-10, 50, 70, 110}; // enthalt -10
        int[] result_falsch = test.nichtAusreichendenNoten(test_falsch);
        assert result_falsch == null;
    }

    public static void durchschnittsNoteTest() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90}; // 60 durchitt
        int result_wahr = test.durchschnittsNote(test_wahr);
        assert result_wahr == 60;

        int[] test_falsch = {-10, 50, 70, 110}; // -10 in array
        int result_falsch = test.durchschnittsNote(test_falsch);
        assert result_falsch == -1;
    }

    public static void abgerundeteNoten() {
        Noten test = new Noten();
        int[] test_wahr = {30, 50, 70, 90}; // alle Noten sind abgerundet
        int[] result_wahr = test.abgerundeteNoten(test_wahr);
        assert Arrays.equals(result_wahr, new int[]{30, 50, 70, 90});

        int[] test_falsch = {-10, 50, 70, 110}; // -10 in array
        int[] result_falsch = test.abgerundeteNoten(test_falsch);
        assert result_falsch == null;
    }
    public static void maximaleAbgerundeteNoteTest(){
        Noten test = new Noten();
    int[] test_wahr = {30, 50, 70, 90}; // grosste Note:90
    int result_wahr = test.maximaleAbgerundeteNote(test_wahr);
        assert result_wahr == 90;

    int[] test_falsch = {-10, 50, 70, 110}; //-10 in Array
    int result_falsch = test.maximaleAbgerundeteNote(test_falsch);
        assert result_falsch == -1;
    }
}

