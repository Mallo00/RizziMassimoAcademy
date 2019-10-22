package it.nextre.academy.myUtil;

import it.nextre.academy.basi.eccezioni.IllegalParamException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private static final String[] cities = {"Stonebutter", "Mount Prospect", "Independent Hill", "Cape Town", "Moreno Valley", "Temecula", "Sydney", "Amarillo",
            "Lafayette", "Beijing", "Murfreesboro", "Carrollton", "Wilmington", "Basseterre", "Thousand Oaks", "Moscow", "Dorchester", "Biloxi", "East Orange",
            "Peterson Afb", "Flower Mound", "Lawrence", "Salt Lake City", "Vientiane", "Verdi", "Santa Rosa", "Canton", "Belmopan", "Mobile", "Nashville", "Vienna",
            "Elwin", "Swan Island", "Silver Spring", "Evansville", "Monterey Park", "Black Mtn", "Metairie", "London", "Pocatello", "Oakland", "Nouakchott",
            "Maclay State Gardens", "Farmington", "Taylorsville", "Langley View", "Pomona", "East Albany", "Pisgah Church", "Burnsville", "Rapid City", "Arden-arcade",
            "Oslo", "Guaynabo", "Bogot", "North Virginia Beach", "Aguilares", "Tarawa", "Phoebus", "Newbury", "Lynnhaven", "Hyde Park", "Turner City", "Ankara",
            "Victoria", "Redwood City", "Orange", "Jacksonville", "South Bend", "Lake Forest", "Mexico City", "Bridgeport", "Monrovia", "Easton", "Gulfport",
            "Boca Raton", "Ridgewood", "Concord", "Oceanway", "Douglas Park", "Towson", "Osgood", "Portland", "Lynwood", "Lancaster", "Oshkosh", "Wellington", "Hayward",
            "Barcroft", "Lauderhill", "Pine Bluff", "Stepanakert", "Elyria", "Berwyn", "Rancho Cucamonga", "Waialae", "San Mateo", "Kingstown", "Winterhaven",
            "Missouri City", "Santa Barbara", "Lincoln", "Johnson City", "Johnson Bayou", "Lake Ashby", "Port of Spain", "Alexandria", "Freetown", "Avarua",
            "Johns Island", "Howard Beach", "Kabul", "Oceana", "Brazzaville", "Delray Beach", "Battery Point", "Meriden", "Clifton", "Harlem", "Columbia", "Montgomery"
            , "Nicosia", "Willoughby Spit", "Park Heights", "Simpson", "Chula Vista", "Ventura", "Carlsbad", "Santa Clarita", "Asheville", "Chino Hills", "La Crosse",
            "Kahala", "Todt Hill", "Natomas", "West Palm Beach", "Pasadena", "Seekonk", "San Jos", "Grubbs", "Annandale", "Lamarville", "Stella", "Euclid", "Crichton",
            "Toledo", "Long Beach", "Horseshoe", "Haverhill", "Hilton Village", "West Haven", "Dakar", "Brownsville", "Fort Collins", "Layton", "South Santa Rosa",
            "Tustin", "Hammond", "San Angelo", "Georgetown", "Igo", "Aurora", "San Jose", "Glendale", "Doney Park", "Southfield", "Plymouth", "Pawtucket"};
    private static final String[] prefissi = new String[]{"02", "33", "34"};

    private static final String[] nomiHotel = {};


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
        tmp += getNome() + join.charAt(r.nextInt(join.length())) + getCognome() + "@" + getDominio();
        return tmp.toLowerCase();
    }

    public static final String getEmail(String nome, String cognome) {
        String tmp = "";
        String join = "._-";
        tmp += nome + join.charAt(r.nextInt(join.length())) + cognome + "@" + getDominio();
        return tmp.toLowerCase();
    }

    public static int getAge(int min, int max) {
        return getRandomInt(min, max);
    }

    public static double getAltezza(int min, int max) {
        return Double.parseDouble(MyFormatter.formattaDouble(getRandomInt(min, max)));
    }

    public static double getPeso(int min, int max) {
        return Double.parseDouble(MyFormatter.formattaDouble(getRandomInt(min, max)));
    }

    public static int getRandomInt(int min, int max) {
        return r.nextInt(max - min) + min;
    }

    public static double getRandomDouble(double min, double max) {
        return r.nextDouble() * (max - min) + min;
    }

    public static int generaRisultatoRandomico(int PERC_SUCC) {
        Random r = new Random();
        return r.nextInt(100) < PERC_SUCC ? 1 : 0;
    }

    public static double getRandomTemp(double tempBase, double delta) {
        double temp = 0, base = tempBase, maxscarto = delta, scarto;
        Random r = new Random();
        scarto = r.nextDouble() * maxscarto;
        if (r.nextBoolean()) {
            //true, aggiungo
            temp = base + scarto;
        } else {
            //sottraggo
            temp = base - scarto;
        }
        return temp;
    }


    private static final String[] categories = {"Azienda vinicola", "Bowling", "Campo da golf", "Centro di quartiere", "Centro eventi", "Cinema", "Galleria d’arte", "Golf club", "Locale notturno", "Museo", "Museo d’arte", "Musica dal vivo", "Parco", "Parco acquatico", "Parco divertimenti", "Parco divertimenti a tema", "Parco nazionale", "Stadio", "Teatro", "Zoo", "Appartamenti", "Azienda fornitrice di energia elettrica", "Biblioteca", "Biblioteca pubblica", "Cimitero", "Complesso condominiale", "Condominio", "Municipio", "Pubblico Registro Automobilistico", "Ufficio dell’amministrazione comunale", "Ufficio governativo della contea", "Ufficio statale", "Ufficio statale locale", "Zona industriale", "Dipartimento di polizia", "Stazione di polizia", "Vigili del fuoco", "Agenzia di assicurazioni", "Agenzia prestiti", "Banca", "Bancomat", "Cassa di risparmio", "Commercialista", "Consulente finanziario", "Consulente fiscale", "Cooperativa di credito", "Pianificatore finanziario", "assistenza fiscale", "trasferimento di denaro", "Istruzione	Asilo", "Istruzione	Centro di formazione", "Istruzione	Scuola", "Istruzione	Scuola elementare", "Istruzione	Scuola materna", "Istruzione	Scuola media", "Istruzione	Scuola privata", "Istruzione	Scuola pubblica", "Istruzione	Scuola superiore", "Istruzione	 di tutoraggio", "Istruzione	Università", "Istruzione	Università pubblica", "Ashram", "Chiesa", "Chiesa battista", "Chiesa cattolica", "Convento", "Destinazione religiosa", "Gurudwara (Tempio Sikh)", "", " Bahá’í", "Luogo di pellegrinaggio", "Missione", "Monastero", "Moschea", "Pagoda", "Sinagoga", "Tempio Jain", "Tempio buddista", "Tempio hindu", "Tempio shintoista", "Centro medico", "Centro oculistico", "Chiropratico", "Clinica dentale", "Clinica medica", "Clinica veterinaria", "Dentista", "Dermatologo", "Fisioterapista", "Ginecologo", "Internista", "Laboratorio medico", "Medico", "Medico di base", "Medico di famiglia", "Optometrista", "Ospedale", "Pediatra", "Psicologo", " infermieristici", " di assistenza domiciliare", "Veterinario", "Alimentari", "Boutique", "Caffetteria", "Cartoleria", "Casalinghi", "Cash and carry", "Centro commerciale", "Concessionario moto", "Discount", "Donut e ciambelle", "Farmacia", "Ferramenta", "Fiorista", "Gioielleria", "Gioielliere", "Grande magazzino", "Hard discount", "Libreria", "Macelleria", "Mercato", "Minimarket", "Monte dei pegni", "abbigliamento", "abbigliamento donna", "abbigliamento per bambini", "abbigliamento sportivo", "abbigliamento uomo", "abiti da sposa", "accessori di moda", "alimentari", "alimenti naturali", "animali", "articoli da regalo", "articoli per bambini", "articoli per la pittura", "articoli per sport all’aria aperta", "articoli sportivi", "articoli usati", "artigianato tipico", "biciclette", "bricolage", "computer", "cosmetici", "dessert", "elettrodomestici", "elettronica", "forniture elettriche", "forniture per ufficio", "generi vari", "giocattoli", "intimo", "liquori", "materiali da costruzione", "mobili", "prodotti di bellezza", "ricambi per auto", "scarpe", "telefoni cellulari", "tessuti", "videogiochi", "vini", "per animali", "Ottico", "Outlet", "Parafarmacia e drogheria", "Rivenditore di auto", "Rivenditore di auto usate", "Rivenditore di biglietti della lotteria", "Stamperia", "Studio di tatuaggi", "Tabaccheria", "Bar", "Bar e grill", "Bar sportivo", "Barbecue", "Caffè", "Diner", "Fast food", "Fornaio", "Gastronomia", "Gelateria", "Hamburger", "Paninoteca", "Pizzeria", "Pizzeria a domicilio", "Pub", "Ristorante", "Ristorante americano", "Ristorante asiatico", "Ristorante cinese", "Ristorante con buffet", "Ristorante coreano", "Ristorante da asporto", "Ristorante di ali di pollo", "Ristorante di pesce", "Ristorante di sushi", "Ristorante francese", "Ristorante giapponese", "Ristorante indiano", "Ristorante italiano", "Ristorante messicano", "Ristorante per famiglie", "Ristorante ramen", "Ristorante specializzato in colazioni", "Ristorante tailandese", "Sala da tè", "Specialità pollo", "Steakhouse", "Agenti Immobiliari", "Agenzia di marketing", "Agenzia di pubblicità", "Agenzia funebre", "Agenzia immobiliare", "Agenzia per il lavoro", "Agenzia viaggi", "Appaltatore diretto", "Arredatore d’interni", "Asilo nido", "Assistenza computer", "Autolavaggio", "Azienda di autotrasporti", "Azienda per la gestione delle proprietà immobiliari", "Barbiere", "Carrozzeria", "Casa editrice di giornali", "Centro estetico", "Centro informazioni turistiche", "Corriere", "Costruttore di case", "Costruttore di tetti", "Costruttore immobiliare", "Editore", "Elettricista", "Fabbricante di armadi", "Fotografo", "Idraulico", "Imbianchino", "Impresa di costruzioni", "Massaggio-terapista", "Meccanico e assistenza automobili", " pneumatici", "Officina autoriparazioni", "Organizzatore di eventi", "Palestra", "Pay TV", "Piscina pubblica", "Provider diInternet", "Provider diper le telecomunicazioni", "Pulitura a secco", "Salone da parrucchiere", "Salone di manicure", "Sarto", "Scuola di danza", " di pulizia per la casa", " di catering", " di disinfestazione", " di lavanderia", " di pulizia", " di spedizione di merci", "Spa", "Spedizioni e corrispondenza", "Spedizioniere marittimo", "Sportello automatico per noleggio di film", "Stamperia commerciale", "Ufficio postale", "Appaltatore", "Architetto", "Avvocato", "Azienda informatica", "Consulente", "Consulente aziendale", "Consulente informatico", "Consulente ingegneristico", "Ingegnere", "Notaio pubblico", "Paesaggista", "Produzione e istallazione di sistemi di condizionamento", "legali", "di marketing su Internet", "Web designer", "Albergo", "Albergo di lusso", "Area di sosta per camper", "Bed & Breakfast", "Campeggio", "Hotel economico", "Hotel per soggiorno prolungato", "Località ", "Motel", "Ostello", "Pensione", "Stazione balneare", "Agenzia di noleggio auto", "Agenzia per il noleggio di camion", "Area di parcheggio", "Autorimessa", "Autoscuola", "Benzinaio"};


    private static final String[] prefix = {"331", "333", "347", "348"};

    private static final String lettereNumeri = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


    private static final String[] sites = {"libero.it", "msn.com", "live.it", "lve.net", "outlook.com", "outlook.it", "gmail.com", "email.it", "yahoo.com", "yahoo.it", "hotmail.it", "hotmail.com", "nextre.it", "hp.com", "dell.net", "asus.co", "local.dev"};


    private static final String[] marche = {"Gametime", "Club Pilates Franchise", "Halo Top Creamery", "Single Serve Beverage Distribution", "Dyla", "MM.LaFleur", "TrackR", "iBenzer", "BASX Solutions", "Chef's Cut Real Jerky", "E-file.com", "Brazi Bites", "FabFitFun", "Omaze", "Fab Glass and Mirror", "Factor 75", "JC's", "Idea Buyer", "Zeel", "Fuse Chicken", "MOVE Bumpers", "P.F. Candle Co.", "Bombfell", "Paint Nite", "iLoveKickboxing", "LIFEAID Beverage Company", "Boba Guys", "BrightFarms", "United Carports", "Images Luxury Nail Lounge", "LiveTrends Design Group", "Untappd", "Au Bon Broth", "R. Riveter", "Her Hair Company", "HYPERICE", "MOD Pizza", "Downeast Cider House", "Berkley", "MatterHackers", "Skull Shaver", "CanSource", "Fitness Holdings Northeast", "Warrior Media", "Repurpose", "Spindrift", "Tophatter", "VRC Metal Systems", "Waiakea", "Buzz Franchise Brands", "Ledge Lounger", "Mystery Tackle Box", "Course", "Ecochlor", "SoapBox", "Reduce", "iGotOffer", "Humm Kombucha", "Nulo", "TickPick", "Science of Skill", "B'more Organic", "Biena Foods", "Southern Designs", "ZippyPaws", "Touch of Modern", "Maximum Games", "Keyser Ventures", "Southern Proper Hospitality", "Cappello's Grain Free", "Makeup Geek", "Ocean Beach Sportswear", "Remarkable Liquids", "Whim Hospitality", "DiPietro Family Law Group, PLLC", "EDWARD MARC BRANDS", "Private Label Skin", "Votto Vines Importing", "Willie Jewell's Old School Bar-B-Q", "cellhelmet", "LIVE Soda", "Tomasino Foods", "James Martin Furniture", "GMB FItness", "Big Barker", "Fresh Roasted Coffee", "Brew Dr. Kombucha", "Little Passports", "Intermountain Nutrition", "Tiesta Tea Company", "Chicken and Rice Guys", "Cirrus Systems", "DFW Storm Solutions", "Delsur Trading", "Origaudio", "Sound Rink", "Ashby Law", "EVERYTHING BUT THE HOUSE (EBTH)", "Float Pod Technologies", "Silencerco", "Jeunesse Global", "Deal Partners", "Smoking Vapor", "Foodmate US", "Chicken Salad Chick", "American Bath Group", "Jarvis Lighting", "Beef Jerky Outlet", "Ben's Soft Pretzels", "Homeland Manufacturing Services", "Terra Exports", "G&G LED Lighting", "Chosen Foods", "Zerelli Technologies", "Semihandmade", "Beneficial Blends dba Kelapo", "Saxbys", "Daily Sale", "CircusTrix", "Hawkers Asian Street Fare", "Klymit", "Bluemar Promotions", "Hiball Energy", "overdrive brands", "Deco Lighting", "Capital Teas", "Rocky Mountain Barrel Company", "James Enterprise", "NEKTER JUICE BAR", "Robefactory", "Dhaliwal Labs", "CARCHEX", "Mutual Minds", "Hoosier Hill Farm", "South by Sea", "High Road Craft Ice Cream", "WABA GRILL FRANCHISE", "Segero", "Punch Bowl Social", "GO Pull-It", "Camp Gladiator", "Distritech", "Water Liberty", "Noribachi", "MAKO Design + Invent", "Futureshirts", "Crossbar Electronic Cigarettes", "Alcohol by Volume", "Sports Addix", "Brent Industries", "MavTel Global Solutions", "Global Food Solutions", "Light Efficient Design", "spa810", "The Cutting Board Company", "P.L.A.Y. Pet Lifestyle And You", "San Francisco Salt Company", "Appalachian Antique Hardwoods", "SHOP MELEE", "OAG GLOBAL", "Bourbon and Boweties", "RapidVisa", "Perfect Water Technologies", "The Olde Mecklenburg Brewery", "SynergyLabs", "Rhino Camera Gear", "Cali Bamboo", "ARCTIC ZERO", "Turnstyle Brands", "Festivals Unlimited", "Credit Law Center", "ARIIX", "Field Goods", "Bolay Enterprises", "Four Foods Group", "Real Thread", "Andes Global Trading", "Spice Jungle", "Corkcicle", "Sweet Peach Wax & Sugaring Studio", "Mr Beams", "Primal Life Organics", "RuMe", "Sky Zone Trampoline Park", "The Ticket Group", "Garb Athletics", "Performance Plus Carts", "Tender Belly", "Nothing Bundt Cakes", "Xero Shoes", "24hrsdeals", "Western Window Systems", "Now Communications", "Free Flow Wines", "Diamond Hair Company", "Yoder Smokers", "ONEHOPE", "The Spice Lab", "Popular Ink", "Poo~Pourri", "Triple Tap Ventures", "Bulu Box", "CardCash.com", "WeddingWire", "Elite Survival Systems", "Roblox", "Crown Laboratories", "eSalon.com", "Ultimovalue.com", "Envirofit International", "Mommy's Bliss", "Inspect-All Services", "Black Clover Enterprises", "Boardroom Salon for Men", "FATHOM (Oakland, CA)", "All Industrial Tool Supply", "Teriyaki Madness", "The Rox Group", "Just Ryt Foods", "AlerStallings", "Silk Worldwide", "College Hunks Hauling Junk and Moving", "QC Manufacturing", "The Junkluggers", "Automated Pet Care Products", "INTEX Millwork Solutions", "Prosperity Organic Foods", "MaxBotix", "YakAttack", "Happy's Home Centers", "Apeks Supercritical", "DMA Goodpoint", "Peepers by PeeperSpecs", "Michigan Custom Machines", "Greenville Avenue Pizza Company", "Lady M Confections Co.", "Another Broken Egg Cafe", "Prop & Peller Pretzels", "Arcadia Louvered Roofs", "EmazingLights / iHeartRaves / IntoTheAM", "All Things Metal", "Fort Collins Heating and Air Conditoning", "Rifle Paper Co.", "Janus International Group", "SS Industries", "Nexgrill Industries", "Industrial Lighting Products", "Early Upgrade", "Fusion Optix", "Mosquito Squad", "NewSouth Window Solutions", "South Florida Tissue Paper", "Nix Companies", "OOLY", "Wet Brush", "Toilettree Products", "Edge", "Hissho Sushi", "Ideal Industries", "Culture Studio", "Kobeyaki Holdings", "Hydra-Flex", "Monogram Foods", "EO Products", "Freddy's Frozen Custard & Steakburgers", "Full Circle Home", "Purium Health Products", "McIlveen Family Law Firm", "Minute Key", "United Fray", "Pedego Electric Bikes", "Parts Town", "Blue Microphones", "Computer Overhauls", "CleanLife LED", "PRO-VISION", "Maine Coast", "Pete and Gerry's Organics", "Wet Sounds", "Stomping Ground Photography", "Powertrain Products", "Laser Products Industries", "Summerset Professional Grills", "University Tees", "MKind", "Kohana Coffee", "Component Surfaces", "Amrita Aromatherapy", "PC Laptops", "Prestman Auto", "Nuun & Company", "Wine & Design", "DriveTime", "Lee Industrial Contracting", "Freedom Boat Club", "SRS Distribution", "Wicked Good Cupcakes", "Kitchen & Bath Cottage", "The Spa & Sauna Co", "Warehouse-Lighting Com", "WheelsOnsite USA", "Corporate Essentials", "Happy Howie's", "Bench Dogs", "Xtreme Xperience", "Mid America Pet Food", "Monster Transmission", "BULL ENGINEERED PRODUCTS", "4 Rivers Smokehouse", "CTEMS", "Upward Projects", "Reliant Foodservice", "John Pomp Studios", "Logojet USA", "Villa Dolce Gelato", "Slow Dough Bread Co", "Lighting Unlimited", "Big Ass Solutions", "The Catering Company", "M Culinary Concepts", "Puredot", "Southwest Foodservice Excellence", "Granbury Solutions", "Paris Presents", "Meriwether & Tharp", "TDBBS", "Cooper's Hawk Winery & Restaurants", "Arizona Fireplaces", "Spokeo", "Explotrain, L.L.C.", "City Winery", "Cincotta & Co.", "Phoenix Logistics", "RSP", "Grand Transformers", "Packsize International", "Palm Coast Sales", "Mobile Outfitters", "Blount Fine Foods", "Staging Concepts", "Tiger Plumbing, Heating, Air Conditioning and Electrical Services", "MODA LIGHT", "Unimex", "ManhattanHomeDesign.com", "Targeted Pet Treats", "5 Generation Bakers", "Tanner Goods", "Fortress Building Products", "Storebound", "EGP", "The Service Professor", "Studio Movie Grill", "Kurgo Products", "OptiFuse", "Singing Dog Vanilla", "Center Link Media", "National Food Group", "Nila", "1908 Brands", "Western Timber Frame", "The Original Frameless Shower Doors", "Pure Romance", "JLab Audio", "Zoup! Fresh Soup Company", "Grand Trunk", "Gray Matter Systems", "McClarin Plastics", "Modern Store Equipment", "TrippNT", "Pristine Pools", "Schaal Heating & Cooling", "Costa Vida", "professional concessions", "Skin By Lovely", "A. Marshall Family Foods", "BuyBackWorld", "SeaBreeze Electric", "JP Fuji Group", "Kerusso", "Uncorked", "Magnolia Bakery", "Souto Foods", "Better Life", "Sharon Young", "Aluminum Trailer Company", "KW Cages", "Dining Alliance", "IMAGE Skincare International", "Go-Forth Pest Control", "Modern Flames", "SnapCab", "Katom Restaurant Supply", "SomerTile", "NoHo Hospitality Group", "COZZIA USA", "Cold Jet", "Ellison Bakery", "Scorpion Coatings", "The Gents Place", "Midwest Prototyping", "Ammex", "Primitives by Kathy", "Ticket Alternative", "Jonathan's Grille", "Patriot Aluminum Products", "MATRIX 4", "Creative Sign Designs", "Honey-Can-Do International", "The FruitGuys", "Bintelli & citEcar Electric Vehicles", "milk + honey", "Premier Plastics", "Uckele Health & Nutrition", "Scooter's Coffee", "FCP Euro", "Mud Pie", "BuildASign.com", "H&F Bread Cpmpany", "Counselman Automotive Recycling", "Field Fastener", "Clipper", "2 Hounds Design", "Amber Green", "Advanced Powder Products", "GiftBasketsOverseas.com", "Kucumber Skin Lounge", "On Safari Foods", "Pro Mach", "DiamondBack Truck Covers", "Bonitas International", "EBW Electronics", "Productive Edge", "M S International", "AA METALS", "Asker Distributors", "The Garland Company", "MacDonald & Owen Lumber Co.", "Diamond Mowers", "RevPart", "Dashed", "Nicolet Plastics", "Caroline's Cakes", "BEAULIEU-FAWCETT LAW GROUP, PA", "Survival Frog", "Carver Skateboards", "New Glarus Brewing Co.", "Double Good", "Universal Separators", "Time After Time", "Foundation Supportworks", "IN10SE Productions", "Shields Manufacturing", "T&D Metal Products", "Simplicity Laser", "Valudor Products", "Advanced Piping Products", "Optimax Systems", "iTECH", "Biomedical Research Laboratories", "ComplianceSigns.com", "Four Hands", "Century Service Affiliates", "Integro Technologies", "RNR Tire Express", "Ulrich Barns", "G.S. Gelato & Desserts", "TAPCO", "Rosnet", "Wildkin", "M. A. Silva USA", "Nulook Collision", "Stratosphere Quality", "The Lewis Chemical Company", "Surya", "Sharper Impressions Painting", "FabriFast", "Massage Heights Franchising", "AmeriChem Systems", "W.S. Darley & Co.", "Edgewater Automation", "Natalie's Orchid Island Juice Company", "Happy Hound Play & Daycare", "Custom Profile", "Rabbit Air", "Weiss & Associates", "MTD Micro Molding", "Storflex", "Birds Barbershop", "PM SLEEP LAB", "Catrike", "PFSbrands", "Startech.Com", "US Micro Products", "Easiway Systems", "Green Lawn Fertilizing", "StayOnline", "Rotorcorp", "Morris - Sockle, PLLC", "Genysis Brand Solutions", "Stringer Industries", "Tierra Farm", "Quality Aluminum Products", "Ervolina Associates", "Russian Pointe", "Melt Bar and Grilled", "Pitts Enterprises", "Mountain Showcase Group", "Prosource Fitness Equipment", "GOLFTEC", "Cases By Source", "ink! Coffee", "Liberty Pumps", "Royalton Music Center", "Timberlane", "C&H Baseball", "Industrial Revolution", "Infiltrator Water Technologies", "LifeSource Water Systems", "Plustar", "Kona Ice", "Cox Manufacturing Company", "BriskHeat"};


    private static final String[] nomeProcessore = {"Intel Core i9-9980XE ", "Intel Core i9-7980XE ", "AMD Ryzen 9 3900X", "Intel Core i9-7960X ", "AMD Ryzen Threadripper 1950X", "Intel Core i9-9900K ", "Intel Core i9-9900KF ", "Intel Core i9-7920X ", "AMD Ryzen Threadripper 2950X", "AMD Ryzen Threadripper 2920X", "AMD Ryzen 7 3800X", "AMD Ryzen 7 3700X", "Intel Core i9-9900X ", "Intel Core i9-7900X ", "AMD Ryzen Threadripper 1920X", "Intel Core i7-9800X ", "Intel Core i7-6950X ", "Intel Core i7-7820X ", "AMD Ryzen 7 2700X", "AMD Ryzen 5 3600X", "Intel Core i7-8086K ", "AMD Ryzen 5 36", "Intel Core i7-8700K ", "Intel Core i7-9700K ", "Intel Core i7-9700KF ", "Intel Core i9-9980HK ", "AMD Ryzen 7 1800X", "Intel Core i9-9880H ", "AMD Ryzen Threadripper 2990WX", "Intel Core i7-8700 ", "Intel Core i7-7800X ", "AMD Ryzen 7 27", "AMD Ryzen 7 1700X", "Intel Core i7-9700 ", "Intel Core i7-9700F ", "Intel Core i7-6900K ", "AMD Ryzen 5 2600X", "AMD Ryzen 5 26", "AMD Ryzen 7 17", "AMD Ryzen 5 1600X", "Intel Core i7-6850K ", "AMD Ryzen 5 16", "Intel Core i9-8950HK ", "Intel Core i7-6800K ", "Intel Core i7-9750H ", "Intel Core i7-8850H ", "Intel Core i7-8750H ", "AMD Ryzen 3 2200G", "Intel Core i7-7700K ", "Intel Core i5-8600K ", "Intel Core i7-5930K ", "Intel Core i5-9600K ", "Intel Core i5-9600KF ", "Intel Core i7-5960X ", "Intel Core i7-4960X ", "Intel Core i7-4930K ", "Intel Core i7-5820K ", "Intel Xeon  E5-1680 ", "Intel Core i5-8600 ", "Intel Core i5-9400F ", "Intel Core i5-9400 ", "Intel Core i7-3960X Extreme Edition ", "Intel Core i5-8500 ", "Intel Core i7-7700 ", "Intel Core i7-3930K ", "Intel Core i5-8400 ", "Intel Core i7-6700K ", "Intel Xeon  E5-1650 ", "Intel Core i7-8809G ", "Intel Core i7-8705G ", "Intel Core i7-8559U ", "Intel Core i5-9300H ", "AMD Ryzen 5 2400G", "Intel Core i7-4790K ", "Intel Xeon  X56", "AMD Ryzen 5 1500X", "Intel Core i5-8300H ", "AMD Ryzen 7 3750H", "Intel Core i7-7820HK ", "Intel Xeon  X56", "Intel Core i7-7700HQ ", "Intel Core i7-4790 ", "AMD Ryzen 5 14", "Intel Core i7-4770K ", "AMD Ryzen 5 3500U", "AMD Ryzen 5 3550H", "Intel Core i7-6700 ", "Intel Xeon  X56", "Intel Xeon  X56", "Intel Xeon  E3-1231 ", "Intel Xeon  E3-1240 ", "Intel Core i7-4770 ", "Intel Xeon  E3-1230 ", "Intel Core i3-9100F ", "Intel Xeon  X56", "Intel Core i7-3770K ", "Intel Xeon  E3-1240", "Intel Core i7-3770 ", "Intel Xeon  E3-1230", "Intel Core i3-8350K ", "Intel Core i7-980X ", "Intel Core i5-7600K ", "Intel Core i3-8100 ", "Intel Core i5-7600 ", "Intel Core i7-6820HK ", "Intel Core i5-8265U", "Intel Core i5-8250U ", "AMD FX-95", "Intel Core i5-7500 ", "Intel Core i7-4940MX", "Intel Core i7-6700HQ ", "Intel Core i5-7400 ", "AMD Ryzen 3 1300X", "AMD Ryzen 3 12", "Intel Core i5-6600K ", "Intel Core i7-8650U ", "AMD FX-83", "Intel Core i7-8565U ", "Intel Core i7-8550U ", "AMD Ryzen 5 2500U", "AMD FX-83", "AMD FX-43", "Intel Core i5-6600 ", "Intel Core i5-4690 ", "Intel Core i5-7300HQ ", "Intel Core i5-4690K ", "AMD FX-83", "AMD FX-8320E", "Intel Core i3-7100 ", "Intel Core i5-6500 ", "Intel Core i5-4670K ", "Intel Core i5-4670 ", "AMD Phenom II X6 1090T", "AMD FX-83", "Intel Core i7-3820 ", "Intel Core i5-4590 ", "Intel Core i3-6100 ", "AMD FX-81", "Intel Core i7-4720HQ ", "Intel Core i5-4460 ", "Intel Core i5-3570 ", "Intel Core i5-3570K ", "Intel Core i7-4710HQ ", "Intel Core i7-4710MQ ", "Intel Core i5-4440 ", "Intel Core i7-3630QM ", "Intel Core i5-3550 ", "Intel Core i5-4430 ", "Intel Core i7-4700MQ ", "AMD FX-63", "Intel Pentium Gold G54", "AMD Phenom II X6 1055T", "AMD FX-81", "Intel Core i5-3470 ", "Intel Core i3-4170 ", "Intel Core i5-6300HQ ", "Intel Xeon  X54", "AMD Athlon 200GE", "Intel Core i5-6400 ", "Intel Core i5-2500K ", "Intel Core i5-2500 ", "Intel Core i7-960 ", "Intel Pentium G45", "Intel Pentium G46", "Intel Core i3-4160 ", "AMD FX-63", "Intel Core i7-2700K ", "Intel Core i5-3450 ", "Intel Core i5-3330 ", "Intel Core i5-2400 ", "Intel Core i3-4130 ", "Intel Core 2 Quad  Q96", "Intel Core i7-2600K ", "Intel Core i7-2600 ", "AMD Phenom II X4 9", "Intel Core i7-870 ", "Intel Core 2 Quad  Q95", "Intel Core 2 Quad  Q95", "AMD Phenom II X4 9", "Intel Core i5-760 ", "Intel Core i5-4570 ", "Intel Core i5  I5-7", "AMD FX-61", "Intel Core i7-860 ", "Intel Core i5-7200U ", "Intel Core i7-920 ", "AMD A10-7850K", "Intel Pentium G44", "Intel Core 2 Quad  Q66", "AMD Athlon II X4 Quad-Core  6", "Intel Pentium  G34", "AMD FX-41", "AMD Athlon II X4 605e", "Intel Core i3-2120 ", "Intel Celeron G39", "Intel Core i3-2100 ", "Intel Celeron  G18", "Intel Core i3-3220 ", "AMD A4-73", "Intel Celeron G3930"};

    public static String[] GPU = {"TITAN RTX", "RTX 2080 Ti", "RTX 2080 SUPER", "TITAN V", "RTX 2080", "RTX 2070 SUPER", "GTX 1080 Ti", "TITAN Xp", "Radeon VII", "RX 5700 XT", "RTX 2070", "RX 5700", "RTX 2060 SUPER", "GTX 1080", "RTX 2060", "RX Vega 64", "GTX 1070 Ti", "RX Vega 56", "GTX TITAN X", "RTX 2080 Mobile", "GTX 1660 Ti", "R9 295X2", "GTX 1070", "GTX 1080 Mobile", "GTX 1660", "RTX 2080 Max-Q", "RTX 2070 Mobile", "GTX 1660 Ti Mobile", "GTX 1080 Max-Q", "GTX 1070 Mobile", "GTX 980 Ti", "R9 FURY X", "RX 590", "RTX 2060 Mobile", "RTX 2070 Max-Q", "R9 Nano", "GTX 1070 Max-Q", "GTX 980", "RX Vega 56 Mobile", "GTX 1660 Ti Max-Q", "R9 FURY", "RX 580", "GTX 1060 6GB", "GTX TITAN BLACK", "RX 480", "GTX 1060 3GB", "HD 7990", "R9 390X", "GTX 780 Ti", "RX 570", "GTX TITAN", "GTX 970", "R9 290X", "R9 390", "GTX 1650", "GTX 1060 Mobile", "R9 290", "RX 470", "GTX 980M", "GTX 980 Mobile", "GTX 980MX", "GTX 780", "GTX 1060 Max-Q", "RX 580 Mobile", "RX 580X Mobile", "Pro WX 7100 Mobile", "R9 380X", "RX 480 Mobile", "R9 280X", "RX 570 Mobile", "GTX 770", "GTX 970M 6GB", "GTX 970M", "GTX 1650 Max-Q", "GTX 1650 Mobile", "GTX 1050 Ti", "R9 285", "R9 380", "R9 M290X", "R9 280", "RX 470 Mobile", "GTX 960", "GTX 1050 Ti Mobile", "GTX 780M", "GTX 780M", "GTX 760", "GTX 1050", "R9 270", "GTX 950", "GTX 1050 Ti Max-Q", "GTX 770M", "R7 370", "RX 560", "R7 265", "GTX 1050 Mobile", "GTX 650 Ti Boost"};
    private static String[] prodotto = {"Gel Detergente rinfrescante", "Crema Viso rivitalizzante protettiva", "Crema Mani idratante e protettiva", "Crema Corpo nutriente protettiva", "Burrocacao idratante protettivo", "Latte Detergente delicato", "Struccante occhi idratante delicato", "Tonico purificante rinfrescante", "Salviette Struccanti idratanti delicate", "Shampoo fortificante officinalis L' Angelica", "Shampoo Ultradolce alla Camomilla Garnier", "Shampoo Ultradolce al Cacao e all'olio di cocco Garnier", "Balsamo ravvivante Camomilla Schultz", "Maschera ristrutturante Camomilla Schultz", "Balsamo fortificante Puliti e Brillanti Garnier Fructis", "Balsamo Ultradolce alla Mandorla e fiori di Loto Garnier", "Gel d' Aloe vera Equilibra", "Spuma Capelli LaVera", "Spuma fissante capelli Farfalla", "Spuma Capelli ricci Frank Provost", "Latte Detergente Bionova", "Balsamo corpo Bionova", "Crema Mani all' olio di Argan Bionova", "Crema Viso antirughe Bionova", "Bagnodoccia Aloe e olio di Argan Bionova", "Burro corpo", "Gel Doccia Guaranà Coop", "Detergente Aloebio Athena's", "Mousse Doccia Aloebio Athena's", "Crema Viso Garnier bioactive", "Docciaschiuma Latte e Miele Sensure", "Docciaschiuma Muschio bianco Sensure", "Detergente intimo Neutromed", "Shampoo delicato", "Sapone liquido", "Gel doccia", "Deodorante vapo", "Deodorante roll on", "Crema contorno occhi rivitalizzante protettiva", "Burrocacao Labbra idratante e protettivo", "Detergente Viso e Mani con Yogurt Neutromed", "Shampoo Forsan Bio", "Shampoo al Miglio verde e Germe di grano Omnia Botanica", "Bagnodoccia tonificante Menta e Rosa canina Omnia Botanica", "Bagnodoccia rilassante Tiglio e Melissa Omnia Botanica", "Deodorante delicato Bionova", "Detergente Cien", "Shampoo Aloe vera Omia Laboratoires", "Shampoo Olio di Argan Omia Laboratoires", "Maschera Capelli Aloe vera Omia Laboratoires", "Bagnoschiuma Aloe vera Omia Laboratoires", "Gel Detergente intimo e viso Aloe vera Omia Laboratoires", "Crema Corpo olio di Argan Omia Laboratoires", "Crema Corpo Aloe vera Omia Laboratoires", "Shampoo olio di Macadamia Omia Laboratoires", "Shampoo olio di semi di Lino Omia Laboratoires", "Maschera Capelli olio di Argan Omia Laboratoires", "Maschera Capelli olio di Macadamia Omia Laboratoires", "Maschera Capelli olio di semi di Lino Omia Laboratoires", "Crema Corpo Mandorla Phytorelax", "Crema Mani e Unghie con olio di Argan Phytorelax", "Latte Detergente e Tonico Burro di Karitè Phytorelax", "Bagno doccia Mandorla Phytorelax", "Crema Viso Burro di Cacao Phytorelax", "Crema Corpo rilassante Fiori di Bach Phytorelax", "Balsamo Capelli Oliva Phytorelax", "Latte Detergente Biologico Linea Bimbi I Provenzali Bio", "Bagnetto Biologico ultradelicato Linea Bimbi I Provenzali Bio", "Crema protettiva biologica Linea Bimbi I Provenzali Bio", "Impacco Capelli biologico fortificante olio di Sapote I Provenzali Bio", "Balsamo biologico fortificante olio di Sapote I Provenzali Bio", "Olio di Karitè super idratante I Provenzali", "Olio di Mandorle dolci super idratante I Provenzali", "Olio di Jojoba super idratante I Provenzali", "Sapone Corpo olio di Mandorle dolci I Provenzali", "Sapone Viso e Corpo extradolce Ribes rosso I Provenzali", "Saponetta vegetale Vaniglia e Cannella I Provenzali", "Balsamo Labbra vegetale olio di Argan I Provenzali Bio", "Stick Labbra extradolce Arancia I Provenzali", "Shampoo olio essenziale di Lavanda e estratto di Rosa Ultradolce Garnier", "Shampoo 5 piante Ultradolce Garnier", "Shampoo all'estratto di Mango e fiori di Tiarè Ultradolce Garnier", "Olio di Semi di Lino puro Forsan", "Detergente Intimo delicato", "Shampoo Barbie olio di Oliva Admiranda", "Docchia schiuma Camomilla Kamill", "Bagnoschiuma Aloe vera Sensure", "Detergente Intimo Intimate body wash Cien", "Gel Detergente Viso delicato aquarich Cien", "Salviette Struccanti e detergenti Iseree", "Latte Detergente Cien", "Solvente per unghie senza acetone Cien", "Shampoo giorno per giorno estratto di Papaia e Pesca Cien", "Shampoo giorno per giorno estratti di 7 erbe e Aloe vera Cien", "Shampoo giorno per giorno con Luppolo for men Cien", "Docciaschiuma Lime kick Cien", "Docciaschiuma for men Cien", "Docciaschiuma Red sun Cien", "Bagnoschiuma Vaniglia Cien", "Lacca capelli extra strong Cien", "Shampoo sensitive Aloe vera Cien", "Crema Viso idratante Kaloderma", "Crema Mani Argan Kaloderma", "Latte Detergente delicato Kaloderma", "Bagnodoccia rilassante Fiori di Bach Phytorelax", "Crema Corpo rilassante da massaggio Fiori di Bach Phytorelax", "Crema Viso idratante Fiori di Bach Phytorelax", "Detergente Intimo delicato Bionova", "Salviette Struccanti delicate Equilibra", "Salviette Struccanti Bio delicate Fria", "Burrocacao Legami", "Latte Solare PROTEZIONE Alta SPF 30 Argan Phytorelax", "Latte Solare Protezione Media SPF 15 Argan Phytorelax", "Latte Solare Protezione Bassa SPF 6 Argan Phytorelax", "Latte Doposole idratante lenitivo Argan Phytorelax", "Olio Solare illuminante SPF 0 Argan Phytorelax", "Shampoo delicato", "Balsamo Puliti e Brillanti Garnier Fructis", "Olio di Jojoba de I Provenzali", "Gel Detergente rinfrescante", "Crema Viso idratante protettiva", "Crema Mani Bionova", "Bagnoschiuma tonificante alla Menta e Rosa canina Omnia Botanica", "Latte Corpo al Burro di Cacao Phytorelax", "Gel d' Aloe Vera puro Equilibra", "Struccante Occhi delicato Bionova", "Olio di Semi di Lino puro Forsan", "Bagnoschiuma Tweety Admiranda", "Burro Corpo", "Balsamo Labbra idratante protettivo", "Crema Solare Bionova spf 50", "Latte Solare Bionova Spf 30", "Fluido Doposole Idratante Bionova", "Balsamo Ultradolce all' Olio di Avocado e Burro di Karitè Garnier", "Balsamo Fructis Oleo Repair Garnier", "Balsamo Fructis Vitamina Hydra Garnier", "Shampoo Ultradolce 5 piante Garnier", "Shampoo Ultradolce Lavanda Garnier", "Crema corpo Cliclamino delle Alpi Phytorelax", "Crema corpo Vaniglia Intra", "Crema corpo Rosa Intra", "Latte corpo Fiori di BAch Phytorelax", "Crema mani protettiva al Miele Botanika", "Crema viso Lifting con Olio di Mandorle dolci Botanika", "Crema viso Antiage Botanika", "Crema multiuso viso, corpo e mani Botanika", "Dentifricio Antica erboristeria Menta e salvia", "Crema mani protettiva Fior di Magnolia", "Salviette igiene intima Fior di Magnolia", "Salviette struccanti Fior di Magnolia", "Dentifricio Sensitive White & Fresh", "Shampoo biologico fortificante Sapotè I Provenzali", "Impacco capelli biologico fortificante Sapotè I Provenzali", "Balsamo biologico fortificanten Sapotè I Provezali", "Olio per capelli biologico Sapotè I Provenzali", "Crema mani Argan Kaloderma", "Fluido rigenerante corpo Rosa mosqueta Omnia botanica", "Crema nutriente Viso al Burro di Karitè Omnia Botanica", "Crema nutriente Mani e Unghie al Burro di Karitè Omnia Botanica", "Burro di Karitè Omnia Botanica", "Salviette biologiche I provenzali Linea Bimbi", "Dermo bagno biologico Aloe vera Omia Laboratories", "Sapone Liquido Tweety Admiranda", "Latte detergente emolliente Naturissima", "Tonico addolcente Naturissima", "Crema mani Botanika", "Struccante occhi Bioactive Garnier", "Crema gel protettiva pelli normali e miste", "Gel detergente esfoliante"};

    private static String[] motherboard = {"Gigabyte GA-AMM-SP", "Asus AMM-A", "Asus AMI-A", "ECS KAM-I", "ECS KAM-I V", "MSI AMI", "  ", "ASRock AMB-M", "  ", "Biostar AMML", "MSI AMM", "Biostar AMMH", "Biostar AMMHP", "ASRock AMB-MDH", "Asus MN", "Biostar TForce  SLI Deluxe", "  ", "Jetway JMGT-LF", "Gigabyte GA-MA-UD", "Biostar NS", "    ", "Biostar A A", "Foxconn MPMV", "Zotac GF-C-E", "    ", "ASRock KND", "Jetway JNC-LF", "  ", "Zotac GITX-A-E", "Asus MNT-M V", "  ", "Asus MAGTD PROUSB", "Asus MATD EVO", "Biostar ALC", "    ", "MSI FXA-GD", "Asus MATDUSB", "Asus Crosshair IV Formula", "   ", "Asus MALT-M", "Asus MAXTD EVO", "Biostar AG", "    ", "Asus MATD", "Asus Crosshair IV Extreme", "E   ", "Asus MATD-V EVOUSB", "Gigabyte GA-GM-DH", "    ", "ASRock FX Deluxe", "Gigabyte GA-A-USB", "MSI FXA-GD", "Gigabyte GA-GA-UDH", "Asus MATD PROUSB", "Gigabyte GA-FXA-UD", "    ", "Asus MAT-I Deluxe", "  ", "ASRock GM-GS", "  ", "Asus MATD-V EVO", "Asus MAT-M", "Asus MAGTD PRO", "Asus MNT-M", "  ", "Foxconn AGMV", "Multicolor ", "MSI GFM-P", "  ", "ASRock MADE", "Multicolor ", "Asus MAT-E", "Asus MALT-M LE", "  ", "Biostar AE", "Multicolor ", "Gigabyte GA-FXA-UD", "XL    ", "Asus MAT DELUXE", "Gigabyte GA-A-UD", "Gigabyte GA-MALMT-S", "    ", "MSI GM-E", "Biostar TAGXB HD", "   ", "MSI -G", "MSI GM-P", "  ", "Asus MNTD EVO", "ASRock  Extreme", "   ", "ASRock  Extreme", "Gigabyte GA-GPA-UDH", "ASRock GX Extreme", "MSI GM-P", "Asus MATD-MUSB", "Asus MATUSB", "MSI GFM-P", "    ", "ASRock GX Pro", "  ", "Asus MNTD", "Foxconn AGMV", "  ", "Asus MATD-M EVO", "Asus MATD-M", "Gigabyte GA-GMA-UDH", "Asus MATD Pro", "MSI NF-G", "Foxconn ADA-S", "Asus MAT-V EVOUSB", "ECS AGM-AD V", "MSI GM-P", "Zotac GXITX-A-E", "Biostar TAGU", "Asus MAT-M", "MSI NFGM-P", "Biostar A", "MSI GMA-E", "MSI GM-P", "MSI GM-E", "Gigabyte GA-TA-UD", "ECS AGM-M", "Asus MAT-MCSM", "Asus MATD-V EVOUS", "Gigabyte GA-MAGT-UDH", "Gigabyte GA-XTA-UD"};

    private static String[] psu = {"be Quiet! Dark Power Pro ", "Cooler Master MasterWatt ", "Seasonic PRIME Series", "Antec HCP ", "Thermaltake Toughpower iRGB ", "Corsair AXi Series", "Be Quiet! Straight Power", "GIGABYTE AP850GM Aorus", "Enermax imax D.F.", "Bitfenix Formula ", "Mistel MX650 Fanless", "Aerocool Project 7Corsair AXi/AX Series", "Corsair HX/HXi Series", "Corsair RMi/RMx Series", "Corsair SFm450,", "Corsair Vengeance", "Corsair TX-M Series", "Cooler Master V-series", "FSP Aurum PT SeriesRiotoro Enigma Series", "Cooler Master MasterWatt Mak", "Seasonic Focus ", "Seasonic Focus Plus ", "Seasonic Focus Plus Seasonic SnowSilent Series", "Seasonic X-Series", "Seasonic m Series", "XFX XTS Seriesm", "LEPA G16001600 Wat", "Silverstone Nightjar NJ600", "FSP Hydro PTM Series", "Thermaltake Toughpower Grand", "EVGA G2550, 650, 75", "EVGA P2m650, 750", "EVGA T2Titanium850, 100", "EVGA G1 1000 Watts", "Super Flower Leadex, Pl", "XFX Pro Series and Pla", "Tier 2Cooler Master V Semi", "EVGA GS550, 650 Wat", "EVGA G1+650, 750", "EVGA GQ650, 750, 85", "EVGA G3550, 650, 75", "Enermax DigifanlessThermaltake Toughpower DPS G", "Thermaltake Toughpower Grand", "Thermaltake Toughpower Grand", "FSP Hydro G850 Watt", "FSP Dagger SFX600 ", "Seasonic M12II750", "Seasonic S12G450", "Seasonic G-Series", "Kolink Continuumbe Quiet! Pure Power 11Gol", " 300, 350, 400, 500, 600,", "Corsair CX430, 450", "Fractal Design Newton R3", "Fractal Design Edison M", "Fractal Design Tesla R2", "XFX XTR Series550,", "XFX TS Series ", "Gigabyte XP1200MAntec EDGE550, 650", "Antec TruePower Classic", "Rosewill FortressRosewill Capstone", "Rosewill Quarkm", "Tier 3Cougar GX-S", "FSP Aurum CM550,", "FSP Hydro X650 Watt", "Aurum Pro850, 100", "Super Flower m King", "Riotoro Onyx650,", "Zalman EBT650, 750", "Enermax Revolution SFX", "Vivo 24K650 Watt", "Fractal Design Integra M Ser", "Fractal Design Tesla R2", "Rosewill Photon550,", "Rosewill Lightning Series", "Rosewill Silent Night", "Rosewill TachyonEVGA BQ750, 850 Wat", "EVGA B3550, 650, 75", "Lian Li SFX-Lm", "XFX TS Series N/A", "XFX Pro Series550,", "Deepcool DQST550,", "Silverstone SFX650,", "SilverstoneEvolution S", "Silverstone Strider TitaniuSilverstone StriderS S", "PC Power & Cooling Silencer ", "PC Power & Cooling Turbo Coo", "SAMA Armor 550,", "LEPA G Series1000", "Thermaltake Smart Pro RGB Se", "Thermaltake Smart Series", "Thermaltake EVO Blue Series", "Tier 4Enermax Revolution X", "Fractal Design Tesla R2", "Silverstone Strider Plus", "Cougar LX500, 600", "Cooler Master MasterWatt Lit", "Cooler Master GM SeriesBron", "Cooler Master GX – CM Storm ", "Rosewill Capstone G", "EVGA BQ500", "Thermaltake Toughpower", "Thermaltake Paris", "Antec Neo Eco SeriesBron", "Antec EarthWatts Green Serie", "Antec High Current Gamer Ser", "Inwin Classic SeriesBron", "Seasonic M12II520", "Seasonic ECO430 ", "Seasonic S12II350", "Corsair Gaming SeriesBron", "be Quiet! Power ZoneBron", "be Quiet! Straight Power 11", "Tier 5Enermax NaXnWhit", "Silverstone SF", "Antec Basiq Series BPWhit", "Rosewill Glacier", "EVGA B1", "XFX XT", "FSP Raider Series", "OCZ Fatal1ty", "Silverstone Essential Series", "EVGA W1White", "Cooler Master B2 SeriesWhit", "LEPA MX-F1White", "Rosewill Hive", "Rosewill ARC M", "Fractal Design Integra R2", "NZXT HALE 82 V2"};

    private static String[] ram = {"Corsair Vengeance LPX 16 GB", "G.Skill Trident Z RGB 16 GB", "Corsair Vengeance RGB Pro 16 GB", "Corsair Vengeance RGB Pro 32 GB", "Corsair Vengeance LPX 32 GB", "Corsair Vengeance LPX 16 GB", "G.Skill Ripjaws V Series 16 GB", "Corsair Vengeance LPX 8 GB", "G.Skill Trident Z RGB 16 GB", "Corsair Vengeance RGB Pro 16 GB", "Corsair Vengeance LPX 8 GB", "G.Skill Ripjaws V Series 32 GB", "G.Skill Trident Z RGB 32 GB", "G.Skill Trident Z Neo 32 GB", "G.Skill Aegis 16 GB", "G.Skill Ripjaws V Series 16 GB", "Corsair Vengeance LPX 16 GB", "Crucial CT4K16G4VFS4266 64 GB", "G.Skill Ripjaws V 16 GB", "Corsair Vengeance RGB Pro 16 GB", "Corsair Vengeance LPX 16 GB", "Corsair Vengeance LPX 16 GB", "Kingston HyperX Fury 8 GB", "Team T-Force Delta RGB 16 GB", "G.Skill Ripjaws V Series 16 GB", "G.Skill Trident Z RGB 32 GB", "G.Skill Trident Z Neo 16 GB", "Corsair Vengeance RGB Pro 32 GB", "Team T-FORCE VULCAN Z 16 GB", "Crucial Ballistix Sport LT 16 GB", "G.Skill Trident Z Royal 32 GB", "G.Skill Trident Z RGB 32 GB", "G.Skill Aegis 32 GB", "   ", "Crucial CT64G4LFQ424A 64 GB", "Patriot Viper 4 8 GB", "Corsair Vengeance RGB Pro 32 GB", "Kingston HX428C14PB2K416 16 GB", "Patriot Viper Steel 16 GB", "Crucial CT64G4YFQ426S 64 GB", "G.Skill Ripjaws V 32 GB", "   ", "G.Skill Trident Z Neo 64 GB", "G.Skill Aegis 8 GB", "Corsair Vengeance LPX 64 GB", "Corsair Vengeance RGB Pro 16 GB", "Team T-Force Delta RGB 16 GB", "Corsair Vengeance LPX 8 GB", "G.Skill Ripjaws X Series 16 GB", "G.Skill Trident Z RGB 16 GB", "Kingston HyperX Fury 8 GB", "G.Skill Trident Z RGB 32 GB", "Team T-FORCE VULCAN Z 16 GB", "   ", "Corsair Vengeance LPX 16 GB", "Kingston FURY 16 GB", "Corsair Vengeance RGB Pro 32 GB", "Corsair Dominator Platinum RGB 64 GB", "Team T-Force Delta RGB 16 GB", "G.Skill Trident Z Neo 32 GB", "Team T-Force Vulcan 16 GB", "Crucial Ballistix Sport LT 8 GB", "Corsair Vengeance RGB Pro 32 GB", "G.Skill Ripjaws V 16 GB", "   ", "Corsair Vengeance LPX 64 GB", "Corsair Dominator Platinum RGB 32 GB", "G.Skill Ripjaws Series 8 GB", "Corsair DOMINATOR PLATINUM RGB 128 GB", "Team Vulcan 8 GB", "  ", "Kingston HyperX Pator 16 GB", "Corsair Vengeance LPX 16 GB", "G.Skill Ripjaws V Series 8 GB", "Corsair Vengeance LPX 128 GB", "Corsair Vengeance LPX 64 GB", "Corsair Vengeance RGB Pro 64 GB", "Team T-Force Delta RGB 16 GB", "Corsair Vengeance LPX 16 GB", "  ", "Crucial Ballistix Sport LT 16 GB", "   ", "G.Skill Flare X Series 16 GB", "G.Skill Aegis 4 GB", "G.Skill Ripjaws V Series 64 GB", "Crucial Ballistix Sport LT 8 GB", "Corsair Vengeance LPX 16 GB", "OLOy MD4U082616BGDA 16 GB", "Crucial Ballistix Sport LT 16 GB", "   ", "Corsair Vengeance LPX 32 GB", "GeIL EVO SPEAR 16 GB", "G.Skill Trident Z 16 GB", "G.Skill Ripjaws V 16 GB", "G.Skill Trident Z RGB 32 GB", "Corsair Vengeance LPX 16 GB", "Team Vulcan 16 GB", "G.Skill Trident Z Neo 32 GB", "   ", "Patriot Viper Elite 8 GB", "Team Night Hawk RGB 16 GB", "G.Skill Aegis 8 GB", "G.Skill Ripjaws V Series 16 GB", "Kingston KTH-PL426LQ64G 64 GB", "G.Skill Value 8 GB", "Kingston HyperX Pator RGB 16 GB", "G.Skill Ripjaws V Series 16 GB", "Patriot Viper Steel 32 GB"};


    public static String getPsu() {
        return psu[r.nextInt(psu.length)];
    }

    public static String getRam() {
        return ram[r.nextInt(ram.length)];
    }

    public static final String getMarca() {
        return marche[r.nextInt(marche.length)];
    }

    public static final String getCategory() {
        return categories[r.nextInt(categories.length)];
    }

    public static final String getProdotto() {
        return prodotto[r.nextInt(prodotto.length)];
    }

    public static String getPrefissoDiTelefono() {
        //return prefix[r.nextInt(prefix.length)];
        return 300 + r.nextInt(100) + "";
    }

    public static String getNumeroDiTelefono(int lunghezza) {
        String tmp = "";
        tmp += getPrefissoDiTelefono();
        while (tmp.length() < lunghezza) {
            tmp += r.nextInt(10);
        }//end for
        return tmp.length() > lunghezza ? tmp.substring(0, lunghezza) : tmp;
    }

    public static String getPin(int lunghezza) {
        String tmp = "";
        while (tmp.length() < lunghezza) {
            tmp += r.nextInt(10);
        }//end for
        return tmp;
    }

    public static String getNumero() {
        return getPin(3).substring(0, 3) + "-" + getPin(7).substring(0, 7);
    }

    public static String getCreditCard() {
        return getPin(16);
    }


    public static final String getName() {
        return names[r.nextInt(names.length)];
    }

    public static final String getSurname() {
        return surnames[r.nextInt(surnames.length)];
    }


    public static final String getCity() {
        return cities[r.nextInt(cities.length)];
    }


    public static int[][] randomMatrix(int righe, int colonne) {
        int[][] mattmp = new int[righe][colonne];
        Random r = new Random();
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                mattmp[i][j] = r.nextInt(10);
            }//end for
        }
        return mattmp;
    }

    public static String getBirthday() {
        int y, d, m;
        Random r = new Random();
        y = 1970 + r.nextInt(40);
        d = r.nextInt(16) + 11;
        m = r.nextInt(6) + 5;
        LocalDate ld = LocalDate.of(y, m, d);
        return ld.format(DateTimeFormatter.ofPattern("d/MM/Y"));
    }

    public static String getSchedaVideo() {
        return GPU[r.nextInt(GPU.length)];
    }

    public static final String getMobo() {
        return motherboard[r.nextInt(motherboard.length)];
    }

    public static String gete() {
        String e = "";
        e = nomeProcessore[r.nextInt(nomeProcessore.length)];
        return e;
    }

}//end class
