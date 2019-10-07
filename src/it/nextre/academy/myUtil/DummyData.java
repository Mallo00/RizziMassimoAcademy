package it.nextre.academy.myUtil;

import it.nextre.academy.basi.eccezioni.IllegalParamException;

import java.util.Random;

public class DummyData {
    private static Random r = new Random();
    private static final String numbersAndLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final String specialChars = ",;.:-_!\"£$%&/()=?^+*@[]";
    private static final String[] websites = {"libero.it", "msn.com", "live.it", "lve.net", "outlook.com", "outlook.it", "gmail.com"};
    private static final String[] names = {"Willie", "Georgianna", "Naoma", "Maggie", "Reynaldo", "Madge", "Aide", "Lynelle", "Edwina", "Bree", "Natalia",
            "Johna", "Kesha", "Andres", "Joline", "Rebbecca", "Wai", "Lewis", "Sudie", "Carter", "Loma", "Jed", "Myesha", "Nola", "Cassidy", "Shin", "Farah",
            "Kristie", "Lakia", "Alla", "Christel", "Audra", "Luigi", "Ok", "Inell", "Mariela", "Trena", "Devorah", "Jennell", "Milly", "Danielle",
            "Edelmira", "Isabelle", "Jada", "Jose", "Lucilla", "Lashawn", "Shawnee", "Santina", "Dixie", "Leia", "Ty", "Casimira", "Eliz", "Reuben",
            "Zella", "Sade", "Soraya", "Chana", "Rhona", "Tisa", "Elna", "Sheena", "Alva", "Wilson", "Ilda", "Debbra", "Mavis", "Vanesa", "Nanette",
            "Nola", "Maryln", "Vinnie", "Collen", "Keneth", "Zackary", "Dorthy", "Tyler", "Janet", "Azzie", "Trudie", "Charis", "Leisha", "Miriam",
            "Stepanie", "Piper", "Sharyl", "Annmarie", "Rosalina", "Alexandra", "Rebekah", "Laquita", "Luciano", "Lorita", "Humberto", "Retha",
            "Ashanti", "Nicki", "Malorie", "Carlene"};
    private static final String[] surnames = new String[]{"Rizzi", "Antonuzzi", "Scarnati", "Frontini", "Marmonti", "Scotti", "Campioli", "Gavioli",
            "Ravioli", "Nitu"};
    private static final String[] cities = {"Stonebutter","Mount Prospect","Independent Hill","Cape Town","Moreno Valley","Temecula","Sydney","Amarillo",
            "Lafayette","Beijing","Murfreesboro","Carrollton","Wilmington","Basseterre","Thousand Oaks","Moscow","Dorchester","Biloxi","East Orange",
            "Peterson Afb","Flower Mound","Lawrence","Salt Lake City","Vientiane","Verdi","Santa Rosa","Canton","Belmopan","Mobile","Nashville","Vienna",
            "Elwin","Swan Island","Silver Spring","Evansville","Monterey Park","Black Mtn","Metairie","London","Pocatello","Oakland","Nouakchott",
            "Maclay State Gardens","Farmington","Taylorsville","Langley View","Pomona","East Albany","Pisgah Church","Burnsville","Rapid City","Arden-arcade",
            "Oslo","Guaynabo","Bogot","North Virginia Beach","Aguilares","Tarawa","Phoebus","Newbury","Lynnhaven","Hyde Park","Turner City","Ankara",
            "Victoria","Redwood City","Orange","Jacksonville","South Bend","Lake Forest","Mexico City","Bridgeport","Monrovia","Easton","Gulfport",
            "Boca Raton","Ridgewood","Concord","Oceanway","Douglas Park","Towson","Osgood","Portland","Lynwood","Lancaster","Oshkosh","Wellington","Hayward",
            "Barcroft","Lauderhill","Pine Bluff","Stepanakert","Elyria","Berwyn","Rancho Cucamonga","Waialae","San Mateo","Kingstown","Winterhaven",
            "Missouri City","Santa Barbara","Lincoln","Johnson City","Johnson Bayou","Lake Ashby","Port of Spain","Alexandria","Freetown","Avarua",
            "Johns Island","Howard Beach","Kabul","Oceana","Brazzaville","Delray Beach","Battery Point","Meriden","Clifton","Harlem","Columbia","Montgomery"
            ,"Nicosia","Willoughby Spit","Park Heights","Simpson","Chula Vista","Ventura","Carlsbad","Santa Clarita","Asheville","Chino Hills","La Crosse",
            "Kahala","Todt Hill","Natomas","West Palm Beach","Pasadena","Seekonk","San Jos","Grubbs","Annandale","Lamarville","Stella","Euclid","Crichton",
            "Toledo","Long Beach","Horseshoe","Haverhill","Hilton Village","West Haven","Dakar","Brownsville","Fort Collins","Layton","South Santa Rosa",
            "Tustin","Hammond","San Angelo","Georgetown","Igo","Aurora","San Jose","Glendale","Doney Park","Southfield","Plymouth","Pawtucket"};
    private static final String[] prefissi = new String[]{"02", "33", "34"};

    public static String getNome() {
        return names[r.nextInt(names.length)];
    }

    public static String getCognome() {
        return surnames[r.nextInt(surnames.length)];
    }

    public static String getCitta() {
        return cities[r.nextInt(cities.length)];
    }
    public static String getDominio() {
        return websites[r.nextInt(websites.length)];
    }

    public static String getTelefono() {
        String numero = "";
        for (int i = 0; i < 8; i++) {
            numero += "" + r.nextInt(10);
        }
        return prefissi[r.nextInt(prefissi.length)] + numero;
    }

    public static String getPassword() {
        return getPassword(8);
    }

    public static String getPassword(int lunghezza) {
        if (lunghezza <= 0) throw new IllegalParamException("Lunghezza minima 1 carattere");
        int i = 0;
        String psw = "";
        String chars = numbersAndLetters + specialChars;
        while (psw.length() < lunghezza) {
            psw += (char) (r.nextInt(123 - 48) + 48);
        }
        return psw;
    }

    public static final String getEmail() {
        String tmp = "";
        String join = "._-";
        tmp+=getNome()+join.charAt(r.nextInt(join.length()))+getCognome()+"@"+getDominio();
        return tmp.toLowerCase();
    }
    public static final String getEmail(String nome, String cognome) {
        String tmp = "";
        String join = "._-";
        tmp+=nome+join.charAt(r.nextInt(join.length()))+cognome+"@"+getDominio();
        return tmp.toLowerCase();
    }
    public static int getAge(int min, int max){
        return getRandomInt(min,max);
    }

    public static double getAltezza(int min, int max){
        return Double.parseDouble(MyOutput.formattaDouble(getRandomInt( min,  max)));
    }

    public static double getPeso(int min, int max){
        return Double.parseDouble(MyOutput.formattaDouble(getRandomInt( min,  max)));
    }

    public static int getRandomInt(int min, int max){
        return r.nextInt(max-min)+min;
    }

    public static double getRandomDouble(double min, double max){
        return r.nextDouble()*(max-min)+min;
    }

}//end class
