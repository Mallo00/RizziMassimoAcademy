package it.nextre.academy.verifiche.verifica15_10.es16;

import it.nextre.academy.myUtil.DummyData;


/*
Realizzare un programma che gestisca all'interno di ogni persona, un'agenda privata, nella quale è possibile memorizzare promemoria con una scadenza e appuntamenti con una durata, un inizio e una fine. Per ogni attività memorizzata aggiungere anche un campo note e un campo completato.
La persona dovrà essere in grado di interrogare l'agenda per avere gli appuntamenti del giorno e del mese scelto, ordinati per data crescente.
Infine creare un metodo stampaAgendaAnnuale che restituisca l'intera agenda dell'anno scelto ordinata per giorno e mese.
 */
public class MainAgenda {
    public static void main(String[] args) {
        Persona p = new Persona(DummyData.getNome());
        p.menu();
    }
}//end class
