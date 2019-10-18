package it.nextre.academy.esercizi.cap15;

public interface Filtratore {
    static boolean isCloser(Alloggio a, double dist){
        return a.getDistanza()<dist;
    };
    static boolean hasFreeWifi(Alloggio a){
        return a.isFreeWifi();
    };
    static boolean hasFreeParking(Alloggio a){
        return a.isParcheggioIncluso();
    };
    static boolean isClassifiedAs(Alloggio a, short c){
        return a.getClassificazione()==c;
    };
    static boolean isStruttura(Alloggio a, TipoStruttura ts){
        return a.getTipoStrutura().equals(ts);
    };
    static boolean isLocated(Alloggio a, Location l){
        return a.getLocation().equals(l);
    };
    static boolean isLowerThan(Alloggio a, double price){
        return a.getPrezzoPerNotte()<price;
    };

}
