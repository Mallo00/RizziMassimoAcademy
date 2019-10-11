package it.nextre.academy.esercizi.randomData;

import it.nextre.academy.basi.eccezioni.IllegalParamException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DummyData {
    private static Random r = new Random();
    private static final String[] coseACaso = new String[]{"cioccolata", "frutto", "pesce", "violino", "cane", "fuoco", "padella", "finestra", "plettro", "penna", "giacca", "coccodrillo", "computer", "tovaglia", "tappeto", "serranda", "film", "sedia", "rotella", "cuffia", "bagnino", "libro", "occhiali", "pantaloni", "portapenne", "orsacchiotto", "scatola", "mare", "terra", "nuvola", "pedana", "bicicletta", "veranda", "balcone", "ciabatte", "cappello", "camicia", "scale", "tana", "talpa", "sfera", "palla", "frisbee", "gelato", "chiave", "stella", "macchina", "edificio", "piastrina", "bolla", "frangia", "trottola"};
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

    public static double getRandomDouble(double min, double max) {
        return min + (max - min) * r.nextDouble();
    }

    public static String getCosaACaso() {
        return coseACaso[r.nextInt(coseACaso.length)];
    }

    private static final String[] marche = new String[]{"Gametime", "Club Pilates Franchise", "Halo Top Creamery", "Single Serve Beverage Distribution", "Dyla", "MM.LaFleur", "TrackR", "iBenzer", "BASX Solutions", "Chef's Cut Real Jerky", "E-file.com", "Brazi Bites", "FabFitFun", "Omaze", "Fab Glass and Mirror", "Factor 75", "JC's", "Idea Buyer", "Zeel", "Fuse Chicken", "MOVE Bumpers", "P.F. Candle Co.", "Bombfell", "Paint Nite", "iLoveKickboxing", "LIFEAID Beverage Company", "Boba Guys", "BrightFarms", "United Carports", "Images Luxury Nail Lounge", "LiveTrends Design Group", "Untappd", "Au Bon Broth", "R. Riveter", "Her Hair Company", "HYPERICE", "MOD Pizza", "Downeast Cider House", "Berkley", "MatterHackers", "Skull Shaver", "CanSource", "Fitness Holdings Northeast", "Warrior Media", "Repurpose", "Spindrift", "Tophatter", "VRC Metal Systems", "Waiakea", "Buzz Franchise Brands", "Ledge Lounger", "Mystery Tackle Box", "Course", "Ecochlor", "SoapBox", "Reduce", "iGotOffer", "Humm Kombucha", "Nulo", "TickPick", "Science of Skill", "B'more Organic", "Biena Foods", "Southern Designs", "ZippyPaws", "Touch of Modern", "Maximum Games", "Keyser Ventures", "Southern Proper Hospitality", "Cappello's Grain Free", "Makeup Geek", "Ocean Beach Sportswear", "Remarkable Liquids", "Whim Hospitality", "DiPietro Family Law Group, PLLC", "EDWARD MARC BRANDS", "Private Label Skin", "Votto Vines Importing", "Willie Jewell's Old School Bar-B-Q", "cellhelmet", "LIVE Soda", "Tomasino Foods", "James Martin Furniture", "GMB FItness", "Big Barker", "Fresh Roasted Coffee", "Brew Dr. Kombucha", "Little Passports", "Intermountain Nutrition", "Tiesta Tea Company", "Chicken and Rice Guys", "Cirrus Systems", "DFW Storm Solutions", "Delsur Trading", "Origaudio", "Sound Rink", "Ashby Law", "EVERYTHING BUT THE HOUSE (EBTH)", "Float Pod Technologies", "Silencerco", "Jeunesse Global", "Deal Partners", "Smoking Vapor", "Foodmate US", "Chicken Salad Chick", "American Bath Group", "Jarvis Lighting", "Beef Jerky Outlet", "Ben's Soft Pretzels", "Homeland Manufacturing Services", "Terra Exports", "G&G LED Lighting", "Chosen Foods", "Zerelli Technologies", "Semihandmade", "Beneficial Blends dba Kelapo", "Saxbys", "Daily Sale", "CircusTrix", "Hawkers Asian Street Fare", "Klymit", "Bluemar Promotions", "Hiball Energy", "overdrive brands", "Deco Lighting", "Capital Teas", "Rocky Mountain Barrel Company", "James Enterprise", "NEKTER JUICE BAR", "Robefactory", "Dhaliwal Labs", "CARCHEX", "Mutual Minds", "Hoosier Hill Farm", "South by Sea", "High Road Craft Ice Cream", "WABA GRILL FRANCHISE", "Segero", "Punch Bowl Social", "GO Pull-It", "Camp Gladiator", "Distritech", "Water Liberty", "Noribachi", "MAKO Design + Invent", "Futureshirts", "Crossbar Electronic Cigarettes", "Alcohol by Volume", "Sports Addix", "Brent Industries", "MavTel Global Solutions", "Global Food Solutions", "Light Efficient Design", "spa810", "The Cutting Board Company", "P.L.A.Y. Pet Lifestyle And You", "San Francisco Salt Company", "Appalachian Antique Hardwoods", "SHOP MELEE", "OAG GLOBAL", "Bourbon and Boweties", "RapidVisa", "Perfect Water Technologies", "The Olde Mecklenburg Brewery", "SynergyLabs", "Rhino Camera Gear", "Cali Bamboo", "ARCTIC ZERO", "Turnstyle Brands", "Festivals Unlimited", "Credit Law Center", "ARIIX", "Field Goods", "Bolay Enterprises", "Four Foods Group", "Real Thread", "Andes Global Trading", "Spice Jungle", "Corkcicle", "Sweet Peach Wax & Sugaring Studio", "Mr Beams", "Primal Life Organics", "RuMe", "Sky Zone Trampoline Park", "The Ticket Group", "Garb Athletics", "Performance Plus Carts", "Tender Belly", "Nothing Bundt Cakes", "Xero Shoes", "24hrsdeals", "Western Window Systems", "Now Communications", "Free Flow Wines", "Diamond Hair Company", "Yoder Smokers", "ONEHOPE", "The Spice Lab", "Popular Ink", "Poo~Pourri", "Triple Tap Ventures", "Bulu Box", "CardCash.com", "WeddingWire", "Elite Survival Systems", "Roblox", "Crown Laboratories", "eSalon.com", "Ultimovalue.com", "Envirofit International", "Mommy's Bliss", "Inspect-All Services", "Black Clover Enterprises", "Boardroom Salon for Men", "FATHOM (Oakland, CA)", "All Industrial Tool Supply", "Teriyaki Madness", "The Rox Group", "Just Ryt Foods", "AlerStallings", "Silk Worldwide", "College Hunks Hauling Junk and Moving", "QC Manufacturing", "The Junkluggers", "Automated Pet Care Products", "INTEX Millwork Solutions", "Prosperity Organic Foods", "MaxBotix", "YakAttack", "Happy's Home Centers", "Apeks Supercritical", "DMA Goodpoint", "Peepers by PeeperSpecs", "Michigan Custom Machines", "Greenville Avenue Pizza Company", "Lady M Confections Co.", "Another Broken Egg Cafe", "Prop & Peller Pretzels", "Arcadia Louvered Roofs", "EmazingLights / iHeartRaves / IntoTheAM", "All Things Metal", "Fort Collins Heating and Air Conditoning", "Rifle Paper Co.", "Janus International Group", "SS Industries", "Nexgrill Industries", "Industrial Lighting Products", "Early Upgrade", "Fusion Optix", "Mosquito Squad", "NewSouth Window Solutions", "South Florida Tissue Paper", "Nix Companies", "OOLY", "Wet Brush", "Toilettree Products", "Edge", "Hissho Sushi", "Ideal Industries", "Culture Studio", "Kobeyaki Holdings", "Hydra-Flex", "Monogram Foods", "EO Products", "Freddy's Frozen Custard & Steakburgers", "Full Circle Home", "Purium Health Products", "McIlveen Family Law Firm", "Minute Key", "United Fray", "Pedego Electric Bikes", "Parts Town", "Blue Microphones", "Computer Overhauls", "CleanLife LED", "PRO-VISION", "Maine Coast", "Pete and Gerry's Organics", "Wet Sounds", "Stomping Ground Photography", "Powertrain Products", "Laser Products Industries", "Summerset Professional Grills", "University Tees", "MKind", "Kohana Coffee", "Component Surfaces", "Amrita Aromatherapy", "PC Laptops", "Prestman Auto", "Nuun & Company", "Wine & Design", "DriveTime", "Lee Industrial Contracting", "Freedom Boat Club", "SRS Distribution", "Wicked Good Cupcakes", "Kitchen & Bath Cottage", "The Spa & Sauna Co", "Warehouse-Lighting Com", "WheelsOnsite USA", "Corporate Essentials", "Happy Howie's", "Bench Dogs", "Xtreme Xperience", "Mid America Pet Food", "Monster Transmission", "BULL ENGINEERED PRODUCTS", "4 Rivers Smokehouse", "CTEMS", "Upward Projects", "Reliant Foodservice", "John Pomp Studios", "Logojet USA", "Villa Dolce Gelato", "Slow Dough Bread Co", "Lighting Unlimited", "Big Ass Solutions", "The Catering Company", "M Culinary Concepts", "Puredot", "Southwest Foodservice Excellence", "Granbury Solutions", "Paris Presents", "Meriwether & Tharp", "TDBBS", "Cooper's Hawk Winery & Restaurants", "Arizona Fireplaces", "Spokeo", "Explotrain, L.L.C.", "City Winery", "Cincotta & Co.", "Phoenix Logistics", "RSP", "Grand Transformers", "Packsize International", "Palm Coast Sales", "Mobile Outfitters", "Blount Fine Foods", "Staging Concepts", "Tiger Plumbing, Heating, Air Conditioning and Electrical Services", "MODA LIGHT", "Unimex", "ManhattanHomeDesign.com", "Targeted Pet Treats", "5 Generation Bakers", "Tanner Goods", "Fortress Building Products", "Storebound", "EGP", "The Service Professor", "Studio Movie Grill", "Kurgo Products", "OptiFuse", "Singing Dog Vanilla", "Center Link Media", "National Food Group", "Nila", "1908 Brands", "Western Timber Frame", "The Original Frameless Shower Doors", "Pure Romance", "JLab Audio", "Zoup! Fresh Soup Company", "Grand Trunk", "Gray Matter Systems", "McClarin Plastics", "Modern Store Equipment", "TrippNT", "Pristine Pools", "Schaal Heating & Cooling", "Costa Vida", "professional concessions", "Skin By Lovely", "A. Marshall Family Foods", "BuyBackWorld", "SeaBreeze Electric", "JP Fuji Group", "Kerusso", "Uncorked", "Magnolia Bakery", "Souto Foods", "Better Life", "Sharon Young", "Aluminum Trailer Company", "KW Cages", "Dining Alliance", "IMAGE Skincare International", "Go-Forth Pest Control", "Modern Flames", "SnapCab", "Katom Restaurant Supply", "SomerTile", "NoHo Hospitality Group", "COZZIA USA", "Cold Jet", "Ellison Bakery", "Scorpion Coatings", "The Gents Place", "Midwest Prototyping", "Ammex", "Primitives by Kathy", "Ticket Alternative", "Jonathan's Grille", "Patriot Aluminum Products", "MATRIX 4", "Creative Sign Designs", "Honey-Can-Do International", "The FruitGuys", "Bintelli & citEcar Electric Vehicles", "milk + honey", "Premier Plastics", "Uckele Health & Nutrition", "Scooter's Coffee", "FCP Euro", "Mud Pie", "BuildASign.com", "H&F Bread Cpmpany", "Counselman Automotive Recycling", "Field Fastener", "Clipper", "2 Hounds Design", "Amber Green", "Advanced Powder Products", "GiftBasketsOverseas.com", "Kucumber Skin Lounge", "On Safari Foods", "Pro Mach", "DiamondBack Truck Covers", "Bonitas International", "EBW Electronics", "Productive Edge", "M S International", "AA METALS", "Asker Distributors", "The Garland Company", "MacDonald & Owen Lumber Co.", "Diamond Mowers", "RevP..."};

}//end class
