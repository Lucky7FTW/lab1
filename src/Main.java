import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ub1
        NotenTest.nichtAusreichendenNotenTest();
        NotenTest.durchschnittsNoteTest();
        NotenTest.abgerundeteNoten();
        NotenTest.maximaleAbgerundeteNoteTest();
        NotenTest.roudTest();

        System.out.println("NotenTest ist gut!");
        //ub2
        ZahlenTest.ZahlenAlleTeste();
        //ub3
        int[] zahl = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;

        int[] produkt = SummeArray.multipliziereMitEinerZiffer(zahl, ziffer);
        System.out.println(Arrays.toString(produkt));

        
    }
}
