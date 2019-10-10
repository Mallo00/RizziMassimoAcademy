package it.nextre.academy.lavanderia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
    private String nome, cognome;
    private List<Capo> cesta;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", nCapi=" + cesta.size() +
                '}';
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    Cliente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        cesta = new ArrayList<>();
    }

    public void portaALavare(Capo c) {
        if (c != null && !cesta.contains(c)) {
            cesta.add(c);
        }
    }

    public List<Capo> getCesta() {
        return cesta;
    }

    public List<Capo> getCapiLavatiPerPrezzo() {
        List<Capo> puliti = cesta.stream()
                .filter(Capo::isPulito)//referenza a un metodo d'istanza di un certo tipo
                .collect(Collectors.toList());
        puliti.sort(new Comparator<Capo>() {
            @Override
            public int compare(Capo o1, Capo o2) {
                if (o1.getPrezzo() - o2.getPrezzo() == 0) {
                    return 0;
                } else {
                    if (o1.getPrezzo() - o2.getPrezzo() > 0) {
                        return 1;
                    } else return -1;
                }
            }
        });
        return puliti;
    }

}//end class
