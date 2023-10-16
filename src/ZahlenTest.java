public class ZahlenTest {
    public static void ZahlenmaximaleTeste() {
        Zahlen zahlen = new Zahlen();
        int[] array1 = {4, 8, 3, 10, 17};
        int[] array2 = {};
        int[] array3 = {5};

        // Teste maximaleZahl
        assert zahlen.maximaleZahl(array1) == 17;
        assert zahlen.maximaleZahl(array2) == -1;
        assert zahlen.maximaleZahl(array3) == 5;
    }
    public static void ZahlenminimaleTeste(){
        Zahlen zahlen = new Zahlen();
        int[] array1 = {4, 8, 3, 10, 17};
        int[] array2 = {};
        int[] array3 = {5};
    // Teste minimaleZahl
        assert zahlen.minimaleZahl(array1) == 3 ;
        assert zahlen.minimaleZahl(array2) == -1 ;
        assert zahlen.minimaleZahl(array3) == 5 ;
    }
    public static void ZahlenSummeTeste() {
        Zahlen zahlen = new Zahlen();
        int[] array1 = {4, 8, 3, 10, 17};
        int[] array2 = {};
        int[] array3 = {5};
        // Teste summe
        assert zahlen.summe(array1) == 42;
        assert zahlen.summe(array2) == -1;
        assert zahlen.summe(array3) == 5;
    }

    public static void ZahlenMaximaleSummeTeste() {
        Zahlen zahlen = new Zahlen();
        int[] array1 = {4, 8, 3, 10, 17};
        int[] array2 = {};
        int[] array3 = {5};
        assert zahlen.maximaleSumme(array1) == 39;
    }
    public static void ZahlenminimaleSummeTeste() {
        Zahlen zahlen = new Zahlen();
        int[] array1 = {4, 8, 3, 10, 17};
        int[] array2 = {};
        int[] array3 = {5};
        assert zahlen.minimaleSumme(array1) == 25 ;

    }
}
