import java.util.Arrays;

public class SummeArrayTest {
    public static void testAddiereZweiZahlen() {
        int[] zahl1 = {1, 2, 3};
        int[] zahl2 = {4, 5, 6};
        int[] erwartetesErgebnis1 = {0,5, 7, 9};
        assert Arrays.equals(SummeArray.addiereZweiZahlen(zahl1, zahl2), erwartetesErgebnis1);

        int[] zahl3 = {9, 8, 7};
        int[] zahl4 = {1, 2, 3};
        int[] erwartetesErgebnis2 = {1, 1, 1, 0};
        assert Arrays.equals(SummeArray.addiereZweiZahlen(zahl3, zahl4), erwartetesErgebnis2);

        int[] zahl5 = {9, 8, 7};
        int[] zahl6 = {1, 2, 3, 4};
        int[] erwartetesErgebnis3=null; //adieren von vershiedene grosen
        assert Arrays.equals(SummeArray.addiereZweiZahlen(zahl5, zahl6), erwartetesErgebnis3);
    }
    public static void testSubtrahiereZweiZahlen() {
        int[] zahl5 = {5, 6, 7};
        int[] zahl6 = {2, 3, 4};
        int[] erwartetesErgebnis3 = {3, 3, 3};
        assert Arrays.equals(SummeArray.subtrahiereZweiZahlen(zahl5, zahl6), erwartetesErgebnis3);

        int[] zahl7 = {1, 2, 3};
        int[] zahl8 = {4, 5, 6};
        int[] erwartetesErgebnis4 = null; // Erste Zahl ist kleiner als die zweite.
        assert Arrays.equals(SummeArray.subtrahiereZweiZahlen(zahl7, zahl8), erwartetesErgebnis4);
    }
    public static void testMultipliziereMitEinerZiffer() {
        int[] zahl9 = {2, 3, 4};
        int ziffer1 = 3;
        int[] erwartetesErgebnis5 = {7, 0, 2};
        assert Arrays.equals(SummeArray.multipliziereMitEinerZiffer(zahl9, ziffer1), erwartetesErgebnis5);

        int[] zahl10 = {1, 2, 3};
        int ziffer2 = 0;
        int[] erwartetesErgebnis6 = null; // Die Ziffer darf nicht negativ sein oder null;
        assert Arrays.equals(SummeArray.multipliziereMitEinerZiffer(zahl10, ziffer2), erwartetesErgebnis6);
    }
    public static void testDividiereMitEinerZiffer() {
        int[] zahl11 = {6, 9, 2};
        int ziffer3 = 2;
        int[] erwartetesErgebnis7 = {3, 4, 6};
        assert Arrays.equals(SummeArray.dividiereMitEinerZiffer(zahl11, ziffer3), erwartetesErgebnis7);

        int[] zahl12 = {1};
        int ziffer4 = 0;
        int[] erwartetesErgebnis8 = null; // Die Ziffer darf nicht negativ sein oder null.
        assert Arrays.equals(SummeArray.dividiereMitEinerZiffer(zahl12, ziffer4), erwartetesErgebnis8);
    }
}
