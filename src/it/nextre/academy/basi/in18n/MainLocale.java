package it.nextre.academy.basi.in18n;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainLocale {
    public static void main(String[] args) {
        Locale it = Locale.ITALY;//definise la regione, con le sue convenzioni, compresa la lingua default
        Locale ita = Locale.ITALIAN;//definisce la lingua

        LocalDateTime ldt = LocalDateTime.now();//non è instanziabile, puoi solo direttamente allocare.
        //occorre formattare la stampa
        System.out.println(ldt);
        //immutabili, metodo predefinito attuale, meglio di localtime
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ldt.format(dtf));

        DateTimeFormatter dtfCanada = DateTimeFormatter.ofPattern("HH:mm MMMM", Locale.CANADA);
        DateTimeFormatter dtfIta = DateTimeFormatter.ofPattern("HH:mm MMMM", Locale.ITALY);
        //è possibile cambiare la formattazione inserendo diversi argomenti, per esempio scegliamo una forma più o meno contratta a seconda del numero di "M"
        //LOCALIZZO IN ITALIA
        System.out.println(ldt.format(dtfIta));
        //localizzo in Canada
        System.out.println(ldt.format(dtfCanada));
        System.out.println("-----------------");
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));//standard, YYYY/MM/DD

        ZonedDateTime zdt = ZonedDateTime.now();//otteniamo la datetime della nostra zona
        ZonedDateTime zdtIT = ZonedDateTime.of(ldt, ZoneId.of("Europe/Berlin"));//otteniamo la datetime della  zona specificata
        ZonedDateTime zdtJAP = ZonedDateTime.of(ldt, ZoneId.of("Asia/Tokyo"));//otteniamo la datetime della  zona specificata


        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println(ZonedDateTime.now(ZoneId.of("+8"/* specifico il fuso orario */)).format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo"/* specifico il fuso orario */)).format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        //per sapere se due ore in due zone diverse si equivalgono occorre apportarle a greenwich
        System.out.println(Instant.EPOCH);//primo gennaio 1970
        //temporalqueriea

        LocalDate natale = LocalDate.of(2019, 12, 25);
        LocalDateTime nataleT = LocalDateTime.of(Year.now().getValue(), Month.DECEMBER, 25, 0, 0);
        //LocalDate natale1=LocalDate.of(Year.now().getValue(),9, 25);

        System.out.println(ldt.toLocalDate().until(natale, ChronoUnit.DAYS));
        //mi permette di trovare il lasso di tempo fra una data e un'altra
        System.out.println(Duration.between(ldt, nataleT).toDays());

        //senza specificare il locale viene richiamato il default
        ResourceBundle rb = ResourceBundle.getBundle("lang/traduzioni");
        //ResourceBundle rb1 = ResourceBundle.getBundle("home.contacts");//gestire l'eccezione sollevata qando non si trova la risorsa
        System.out.println(rb.getString("home.welcome"));


        ResourceBundle rb1 = ResourceBundle.getBundle("lang/traduzioni", Locale.forLanguageTag("es"));
        //ResourceBundle rb1 = ResourceBundle.getBundle("home.contacts");//gestire l'eccezione sollevata qando non si trova la risorsa
        System.out.println(rb1.getString("home.welcome"));

        Locale.setDefault(Locale.GERMANY);
        ResourceBundle rb2 = ResourceBundle.getBundle("lang/traduzioni");
        System.out.println(rb2.getString("home.welcome"));


    }
}//end class
