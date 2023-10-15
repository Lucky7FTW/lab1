public class SummeArray {
    public static int[] addiereZweiZahlen(int[] zahl1, int[] zahl2) {
        if (zahl1.length == 0 || zahl2.length == 0) {
            System.out.println("Die Arrays dürfen nicht leer sein.");
            return null;
        }

        if (zahl1.length != zahl2.length) {
            System.out.println("Die Längen der Arrays müssen gleich sein.");
            return null;
        }
        int n = zahl1.length;
        int[] ergebnis = new int[n + 1];
        int pas = 0;

        for (int i = n - 1; i >= 0; i--) { //wir gehen von ende damit wir den uberlauf berechen konnen
            int summe = zahl1[i] + zahl2[i] + pas;
            pas = summe / 10;
            ergebnis[i + 1] = summe % 10;
        }
        ergebnis[0] = pas;
        return ergebnis;
    }
    public static int[] subtrahiereZweiZahlen(int[] zahl1, int[] zahl2) { //immer zahl1-zahl2
        if (zahl1.length == 0 || zahl2.length == 0) {
            System.out.println("Die Arrays dürfen nicht leer sein.");
            return null;
        }

        if (zahl1.length != zahl2.length) {
            System.out.println("Die Längen der Arrays müssen gleich sein.");
            return null;
        }
        int n = zahl1.length;
        int[] differenz = new int[n];
        int pas = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = zahl1[i] - zahl2[i] - pas;

            if (diff < 0) {
                diff += 10;
                pas = 1;
            } else {
                pas = 0;
            }

            differenz[i] = diff;
        }

        if (pas > 0) {
            System.out.println("Erste Zahl ist kleiner als die zweite.");
            return null;
        }

        return differenz;
    }
    public static int[] multipliziereMitEinerZiffer(int[] zahl, int ziffer) {
        if (zahl.length == 0) {
            System.out.println("Die Zahl darf nicht leer sein.");
            return null;
        }

        if (ziffer < 0) {
            System.out.println("Die Ziffer darf nicht negativ sein.");
            return null;
        }
        int n = zahl.length;
        int[] produkt = new int[n + 1];
        int pas = 0;

        for (int i = n - 1; i >= 0; i--) {
            int temp = zahl[i] * ziffer + pas;
            pas = temp / 10;
            produkt[i + 1] = temp % 10;
        }

        produkt[0] = pas;

        if (produkt[0] == 0) {
            // este=0 =>wie kopieren den array wieder damit keine 0 vornekommt ex:{0,2,3,1,0} zu {2,3,1,0}
            int[] ergebnis = new int[n];
            for (int i = 0; i < n; i++) {
                ergebnis[i] = produkt[i + 1];
            }
            return ergebnis;
        } else {
            return produkt;
        }
    }
    public static int[] dividiereMitEinerZiffer(int[] zahl, int ziffer) {
        if (zahl.length == 1) {
            System.out.println("Die Zahl darf nicht leer sein.");
            return null;
        }

        if (ziffer < 1) {
            System.out.println("Die Ziffer darf nicht negativ sein oder null.");
            return null;
        }
        int n = zahl.length;
        int[] quotient = new int[n];
        int rest = 0;

        for (int i = 0; i < n; i++) {
            int temp = zahl[i] + rest * 10;
            quotient[i] = temp / ziffer;
            rest = temp % ziffer;
        }

        return quotient;
    }
}
