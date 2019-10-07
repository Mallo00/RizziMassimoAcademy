package it.nextre.academy.designpattern.observablePattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher_SubjectObserver {
    //deve conoscere i suoi iscritti, ovvero chi ha implementato l'interfaccia di observer
    List<ObserverInterface> iscritti;

    public Publisher_SubjectObserver() {
        iscritti = new ArrayList<>();
    }
    public void update(Integer param){
        for (ObserverInterface item: iscritti) {
            item.doAction(param);
        }
    }
    //more custom operations

    public void addSubscriberObservable(ObserverInterface item) {
        if (iscritti.add(item)){
            System.out.println("Item iscritto on successo");
        }else System.out.println("Registrazione item fallita");
    }

    public void removeSubscriberObservable(ObserverInterface item) {
        if (iscritti.remove(item)) {
            System.out.println("item rimosso");
        } else System.out.println("Item non presente");
    }
}//end class
