package it.nextre.academy.basi.stream.dado;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainDado {
    public static void main(String[] args) {
        Dado d1 = new Dado(true);
        //supplier di lanci di dadi
        IntStream tiri = d1.getTiriStream();
        /*
        uguale allo stream ma crea dadi nuovi e prendo la faccia*/
        Supplier<Integer> dadoSupplier=d1.getTiriSupplier();

        List<Integer> lanci = tiri
                .boxed()//estratto da uno stream di interi
                .distinct()
                .limit(6)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("##############################################################");

        List<Integer> lanci1= Stream
                .generate(dadoSupplier)
                .distinct()
                .peek(System.out::println)
                .limit(6)
                .collect(Collectors.toList());

    }
}//end class
