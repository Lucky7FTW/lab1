public class ElektronikShopTest {
    public static void billigsteTastaturTest() {
        ElektronikShop shop = new ElektronikShop();
        int[] tastaturen = {40, 35, 70, 15, 45};
        int billigste = shop.billigsteTastatur(tastaturen);
        assert 15==billigste;

        int[] tastaturen_falsh = {};
        int billigste_flash = shop.billigsteTastatur(tastaturen_falsh);
        assert -1==billigste_flash;
    }

    public static void teuersteGegenstandTest() {
        ElektronikShop shop = new ElektronikShop();
        int[] tastaturen = {15, 20, 10, 35};
        int[] usb = {20, 15, 40, 15};
        int teuersterGegenstand = shop.teuersteGegenstand(tastaturen, usb);
        assert 40==teuersterGegenstand;

        int[] usb_flash = {};
        int teuersterGegenstand_falsch = shop.teuersteGegenstand(tastaturen, usb_flash);
        assert -1==teuersterGegenstand_falsch;
    }

    public static void teuerstesLeistenTest() {
        ElektronikShop shop = new ElektronikShop();
        int[] usb = {15, 45, 20};
        int budget = 30;
        int teuerstesUsb = shop.teuerstesLeisten(usb, budget);
        assert 20==teuerstesUsb;
        int[] usb_falsch = {};
        int teuerstesUsb_falsch = shop.teuerstesLeisten(usb_falsch, budget);
        assert -1==teuerstesUsb_falsch;
    }

    public static void geldBetragTest() {
        ElektronikShop shop = new ElektronikShop();
        int budget = 60;
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        int geldBetrag = shop.geldBetrag(budget, tastaturen, usbLaufwerke);
        assert 58==geldBetrag;
        int[] usbLaufwerke_falsh = {};
        int geldBetrag_flasch = shop.geldBetrag(budget, tastaturen, usbLaufwerke_falsh);
        assert -1==geldBetrag_flasch;
    }
}
