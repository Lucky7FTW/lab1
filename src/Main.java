import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ub1

        NotenTest.nichtAusreichendenNotenTest();
        NotenTest.durchschnittsNoteTest();
        NotenTest.abgerundeteNoten();
        NotenTest.maximaleAbgerundeteNoteTest();
        NotenTest.roudTest();

        System.out.println("NotenTest erfolgreich abgeschlossen.");

        //ub2

        ZahlenTest.ZahlenAlleTeste();

        //ub3

        SummeArrayTest.testAddiereZweiZahlen();
        SummeArrayTest.testSubtrahiereZweiZahlen();
        SummeArrayTest.testMultipliziereMitEinerZiffer();
        SummeArrayTest.testDividiereMitEinerZiffer();

        System.out.println("SummeArrayTest erfolgreich abgeschlossen.");

        //ub4

        ElektronikShopTest.billigsteTastaturTest();
        ElektronikShopTest.teuersteGegenstandTest();
        ElektronikShopTest.teuerstesLeistenTest();
        ElektronikShopTest.geldBetragTest();

        System.out.println("ElektronikShopTest erfolgreich abgeschlossen.");


    }
}
