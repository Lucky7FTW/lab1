public class Noten {
    public int[] nichtAusreichendenNoten(int[] noten){

        for (int i=0; i<noten.length;i++){
            if (noten[i]<0 || noten[i]>100){
                System.out.println("Eine oder mehrere Noten sind nich zwichen 0 und 100");
                return null;
            }
        }
        int[] finaleNoten = new int[0];

        for(int i=0;i<noten.length;i++){
            if (round(noten[i])<40){
                finaleNoten = addToArray(finaleNoten,noten[i]);
            }
        }
        return finaleNoten;
    }
    public int[] abgerundeteNoten(int[] noten){
        for (int i=0; i<noten.length;i++){
            if (noten[i]<0 || noten[i]>100){
                System.out.println("Eine oder mehrere Noten sind nich zwichen 0 und 100");
                return null;
            }
        }
        int[] finaleNoten = new int[0];
        for(int i=0;i<noten.length;i++){
            finaleNoten = addToArray(finaleNoten,round(noten[i]));
        }
        return finaleNoten;
    }

    public int maximaleAbgerundeteNote(int[] noten){
        int max=-1;
        int[] gerundet= abgerundeteNoten(noten);
        for(int i =0; i<gerundet.length;i++){
            if(noten[i]>max){
                max=noten[i];
            }
        }
        return max;
    }

    public int round(int note){
        if(note<38){
            return note;
        }
        else{
            if(note%5>2) {
                return note + note % 5;
            }
            else{
                return note;
            }
        }
    }
    public static int[] addToArray(int[] original,int newElement){
        int[] result=new int[original.length+1];
        for (int i=0;i< original.length;i++){
            result[i]=original[i];
        }
        result[original.length]= newElement;
        return result;
    }

    public int durchschnittsNote(int[] noten) {
        int summe = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 0 || noten[i] > 100) {
                System.out.println("Eine oder mehrere Noten sind nich zwichen 0 und 100");
                return -1;
            } else {
                summe = summe + round(noten[i]);
            }
        }
        if (noten.length <= 0)
            return 0;
        else {
            return summe / noten.length;
        }

    }
}


