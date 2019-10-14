package it.nextre.academy.basi.stream;

import it.nextre.academy.esercizi.randomData.DummyData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainStream {
    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add(DummyData.getNome());
        nomi.add(DummyData.getNome());
        nomi.add(DummyData.getNome());
        nomi.add(DummyData.getNome());
        nomi.add(DummyData.getNome());

        //java 7
        nomi.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());//per ogni dato, fai questo. torna void. posso svolgere operazioni per ogni elemento
            }
        });//equivalenti | operazione terminale


        //java 8, con labda
        nomi.forEach(s -> System.out.println(s.toLowerCase()));//equivalenti | operazione terminale

        //java 8, con sasso
        nomi.forEach(System.out::println);//equivalenti | operazione terminale

        //java 8, con labda con + ops
        nomi.forEach(s -> {
                    s = "Nome " + s;
                    System.out.println(s.toLowerCase());
                }
        );

        /*
        nomi.stream().forEach()//equivalenti | è possibile eseguire operazioni
                                .filter()

         */
        System.out.println("####################################################################################".repeat(100));
        System.out.println("####################################################################################".repeat(100));
//è utile collezionare i risultati dei filtraggi
        //il solo foreach è un consume, non consente di trattenere i risultati.
        nomi.stream()
                .peek(item -> System.out.println("Peek: " + item))//accetta un consumer, effettua un'azione
                .filter(item -> item.startsWith("C"))//accetta predicate, ritorna un boolean. se è true allora si procede
                .forEach(System.out::println);

        long conteggio = nomi.stream()
                .peek(item -> System.out.println("Peek prima del filtro: " + item))
                .filter(s -> s.length() > 5)
                .peek(item -> System.out.println("Peek dopo del filtro: " + item))
                //.forEach(System.out::println);
                .count();//ritorna un long, posso catturarlo invece di concludere con il forech

        int k = 0;
        //voglio salvare i risultati del filtraggio in una nuov lista
        List<String> nomiFiltrati1 = nomi.stream()
                .filter(s -> s.length() > 5)
                //.peek(s -> {k++;}) non posso per pgm funzionale
                .collect(/*supplier oppue collector*/Collectors.toList());  //ritorna un collector, un oggetto che può prednere
        // un oggetto e lo mette in una variabile

        System.out.println("########## nomi filtrati: " + nomiFiltrati1.size());
        nomiFiltrati1.forEach(System.out::println);


        Random r = new Random();
        /*troppo lungo
        IntStream ints=IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                return r.nextInt();
            }
        });


         */
        //intermedio
         /*
        IntStream ints=IntStream.generate(()->r.nextInt());

          */
        //più veloce
        IntStream ints = IntStream.generate(r::nextInt);//flusso infinito, supplier

        ints
                .filter(n -> (n > 0 && n < 15))
                .limit(1)
                .forEach(System.out::println);

        List<Integer> temperature= getRandomList(2, 40, 10);
        temperature.forEach(System.out::println);
        double avg=temperature.stream()
                .mapToInt(t->t)//prendi quello che entra e ritorna un'intero. è una funzione lambda
                .average()
                .getAsDouble();
        System.out.println(avg);

    }//fine main
    /*
    public int getRandom(int from, int to){
        return IntStream.generate(() -> {
            Random r=new Random();
            return r.nextInt(to-from)+from;
        }).limit(1).findFirst().getAsInt();
        /*
        return IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                Random r=new Random();
                return r.nextInt(to-from)+from;
            }
        }).limit(1).findFirst().getAsInt();


    }
    */

    public static IntStream getRandomIntStream(int from, int to) {
        //posso fare con lambda
        return IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                Random r = new Random();
                return r.nextInt(to - from) + from;
            }
        });
    }

    public static Integer getRandom(int from, int to) {
        return getRandomIntStream(from, to).findFirst().getAsInt();
    }


    public static List getRandomList(int form, int to, int qta){
        return getRandomIntStream(form,to).
                limit(qta).
                boxed().//funzione flat, prende l'elemento fa il boxing, converte da oggetto stream a stream di oggetti
                collect(Collectors.toList());
    }


}//end class
