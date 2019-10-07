package it.nextre.academy.basi.enumerazioni;

import javax.swing.*;

/**
 * casistiche:
 * 1) da off a on
 * 2) da on a off
 * 3) vado avanti da on--ultima canzone
 * 4) vado indietro da on--prima canzone
 * 5) metto in pausa una canzone
 * 6) alzo il volume--maggiore di 0
 * 7) abbasso il volume--minore di 0
 * 8) off-off
 * 9) on-on
 * 10)
 */
public enum Radio {
    ACCESA("2xx", "POWER ON"),//tutto bene
    SPENTA("5xx", "POWER OFF"),//problema lato server
    PLAY("202", "Play..."){//non dovrebbe stampare niente
        @Override
        void stampa() {
            //non faccio niente
        }
    },
    STOP("503", "FERMA"),
    PAUSA,
    AVANTI("302"),
    INDIETRO("301"),
    VOL_UP("889"),
    VOL_DOWN("887");
    private String errorcode;
    private String mexToPrint;
    private Radio(){
        errorcode="-1";
        mexToPrint="";
    }
    private Radio(String errorcode){
        this.errorcode=errorcode;
        mexToPrint="";
    }
    private Radio(String errorcode, String mexToPrint){
        this.errorcode=errorcode;
        this.mexToPrint=mexToPrint;
    }

    String getStato(){
        return ""+this.ordinal()+"-"+this.name();
    }
    String getErrorCode(){
        return errorcode;
    }
    void stampa(){
        System.out.println(mexToPrint);
    }
}//end class
