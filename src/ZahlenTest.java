public class ZahlenTest {
    public static void ZahlenAlleTeste(){
    Zahlen zahlen = new Zahlen();
    int[] array1 = {4, 8, 3, 10, 17};
    int[] array2 = {};
    int[] array3 = {5};

    // Teste maximaleZahl
        assert zahlen.maximaleZahl(array1) == 17 ;
        assert zahlen.maximaleZahl(array2) == -1 ;
        assert zahlen.maximaleZahl(array3) == 5 ;

    // Teste minimaleZahl
        assert zahlen.minimaleZahl(array1) == 3 ;
        assert zahlen.minimaleZahl(array2) == -1 ;
        assert zahlen.minimaleZahl(array3) == 5 ;

    // Teste summe
        assert zahlen.summe(array1) == 42 ;
        assert zahlen.summe(array2) == -1 ;
        assert zahlen.summe(array3) == 5 ;

    // Teste maximaleSumme
        assert zahlen.maximaleSumme(array1) == 39 ;

    // Teste minimaleSumme
        assert zahlen.minimaleSumme(array1) == 25 ;

        System.out.println("TesteZahlen erfolgreich abgeschlossen.");
    }
}
