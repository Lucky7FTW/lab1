public class ElektronikShop {
    public int billigsteTastatur(int[] tastaturen){
        if (tastaturen.length<1){
            System.out.println("Es gibt keine Tastaturen :( ");
        }
        int min=-1;
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
        }
        if (usb.length<1){
            System.out.println("Es gibt keine UBS :( ");
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
            if (max<sachen[i]);
            max = sachen[i];
        }
        return max;
    }
    public int teuerstesLeisten(int[] usb, int budget){
        if (usb.length < 1){
            System.out.println("Es gibt keine USBs :( ");
            return -1; // Return a default value to indicate an error
        }
        int max = -1; // Initialize max with a value that indicates an error
        for (int i = 0; i < usb.length; i++){
            if (usb[i] <= budget && usb[i] > max){
                max = usb[i];
            }
        }
        return max;
    }
    public int geldBetrag(int b, int[] tastaturen, int[] usb){
        int billigsteTastatur = billigsteTastatur(tastaturen);
        int teuerstesUsb = teuerstesLeisten(usb, b);

        if (billigsteTastatur == -1 || teuerstesUsb == -1 || billigsteTastatur + teuerstesUsb > b) {
            return -1;
        }

        return billigsteTastatur + teuerstesUsb;
    }
}
