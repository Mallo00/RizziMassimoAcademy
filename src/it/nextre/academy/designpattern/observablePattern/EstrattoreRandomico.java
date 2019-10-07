package it.nextre.academy.designpattern.observablePattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EstrattoreRandomico extends Publisher_SubjectObserver {
    List<Integer> tabellone;
    Random r;

    public EstrattoreRandomico() {
        r = new Random();
        tabellone=new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            tabellone.add(i);
        }
    }

    public Integer estrai() {
        if(!tabellone.isEmpty()){
            Integer estratto=tabellone.get(r.nextInt(tabellone.size()));
            return estratto;
        }
        else{
            update(null);
            return null;
        }
    }
}//end class
