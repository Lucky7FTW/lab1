public class Zahlen {
    public int maximaleZahl(int[] zahlen){
        //speichert einen max bis es eine grosere Zahl findet
        if (zahlen.length<1){
            System.out.println("Es gibt keine Zahlen in den Array");
        }
        int max =-1;
        for (int i=0;i<zahlen.length;i++){
            if(max<zahlen[i]){
                max=zahlen[i];
            }
        }
        return max;
    }
    public int minimaleZahl(int[] zahlen){
        //speichert eine min bis es eine kleinere zahl findt(es nimmt aber zahl[0] als die erste min)
        if (zahlen.length<1){
            System.out.println("Es gibt keine Zahlen in den Array");
        }
        int min=zahlen[0];
        for(int i=1;i<zahlen.length;i++){
            if(min<zahlen[i]){
                min=zahlen[i];
            }
        }
        return min;
    }
    public int summe(int[] zahlen){
        //nimmt jede zahl und addiert sie in eine summe
        if (zahlen.length<1){
            System.out.println("Es gibt keine Zahlen in den Array");
        }
        int summe=0;
        for(int i=0;i<zahlen.length;i++){
            summe=summe+zahlen[i];
        }
        return summe;
    }
    public int maximaleSumme(int[] zahlen){
        //subtrahiert von der summe die kleinste zahl
        int summe=summe(zahlen)-minimaleZahl(zahlen);
        return summe;
    }
    public int minimaleSumme(int[] zahlen){
        //subtrahiert von der summe die grosste zahl
        int summe=summe(zahlen)-maximaleZahl(zahlen);
        return summe;
    }
}