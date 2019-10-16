package it.nextre.academy.verifiche.verifica15_10.es16;

import it.nextre.academy.myUtil.MyInput;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Impegno {
    private TipoImpegno tipoImpegno;
    private String nome;
    private LocalDateTime dataOraInizio;
    private LocalDateTime dataOraFine;
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public TipoImpegno getTipoImpegno() {
        return tipoImpegno;
    }

    public void setTipoImpegno(TipoImpegno tipoImpegno) {
        this.tipoImpegno = tipoImpegno;
    }

    @Override
    public String toString() {
        return "Impegno{" +
                "tipoImpegno=" + tipoImpegno +
                ", nome='" + nome + '\'' +
                ", dataOraInizio=" + dtf.format(dataOraInizio) +
                ", completato=" + completato +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataOraInizio() {
        return dataOraInizio;
    }

    public void setDataOraInizio(LocalDateTime dataOraInizio) {
        this.dataOraInizio = dataOraInizio;
    }

    public LocalDateTime getDataOraFine() {
        return dataOraFine;
    }

    public void setDataOraFine(LocalDateTime dataOraFine) {
        this.dataOraFine = dataOraFine;
    }

    public boolean isCompletato() {
        return completato;
    }

    public void setCompletato(boolean completato) {
        this.completato = completato;
    }

    private boolean completato;

    public Impegno(TipoImpegno tipoImpegno, String nome, LocalDateTime dataOraInizio, LocalDateTime dataOraFine) {
        this.tipoImpegno = tipoImpegno;
        this.nome = nome;
        this.dataOraInizio = dataOraInizio;
        this.dataOraFine = dataOraFine;
    }

}//end class
