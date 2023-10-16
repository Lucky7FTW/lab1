import java.util.Arrays;

public class ElektronikShop {
    public int billigsteTastatur(int[] tastaturen){
        if (tastaturen.length<1){
            System.out.println("Es gibt keine Tastaturen :( ");
            return -1;
        }
        int min=tastaturen[0];
        for (int i=0;i<tastaturen.length;i++){
            if (min>tastaturen[i]){
                min=tastaturen[i];
            }
        }
        return min;
    }
    public int teuersteGegenstand(int[] tastaturen,int[] usb){
        if (tastaturen.length<1){
            System.out.println("Es gibt keine Tastaturen :( ");
            return -1;
        }
        if (usb.length<1){
            System.out.println("Es gibt keine UBS :( ");
            return -1;
        }
        int max_tastaturen=teuerstes(tastaturen);
        int max_usb=teuerstes(usb);
        if (max_tastaturen>max_usb){
            return max_tastaturen;
        }
        else{
            return max_usb;
        }
    }
    public int teuerstes(int[] sachen){
        int max=0;
        for (int i=0;i<sachen.length;i++){
            if (max<sachen[i]) {
                max = sachen[i];
            }
        }
        return max;
    }
    public int teuerstesLeisten(int[] usb, int budget){
        if (usb.length < 1){
            System.out.println("Es gibt keine Elemente in der liste :( ");
            return -1;
        }
        int max = -1;
        for (int i = 0; i < usb.length; i++){
            if (usb[i] <= budget && usb[i] > max){
                max = usb[i];
            }
        }
        return max;
    }
    public int geldBetrag(int b, int[] tastaturen, int[] usb) {
        if (usb.length < 1){
            System.out.println("Es gibt keine Elemente in der liste :( ");
            return -1;
        }
        if (tastaturen.length < 1){
            System.out.println("Es gibt keine Elemente in der liste :( ");
            return -1;
        }
        Arrays.sort(tastaturen);
        Arrays.sort(usb);

        int costen=-1;
        for(int i=0;i<tastaturen.length;i++){
            int tastaturPreis = tastaturen[i];
            for (int j=0;j<usb.length;j++){
                int usbPreis=usb[j];
                int costen_prov=tastaturPreis+usbPreis;
                if(costen_prov <= b && costen_prov > costen){
                    costen=costen_prov;
                }
            }
        }
        return costen;
    }
}
