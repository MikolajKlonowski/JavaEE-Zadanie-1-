public class Obliczenia {
    private Double kg;
    private Double g;
    private Double mg;
    private Double m;
    private Double cm;
    private Double mm;

    public boolean sprawdzeniePodanychWartosciDlugosci(String metry, String milimetry, String centymetry) {
        if (!metry.equals("")) {
            m = Double.valueOf(metry);
            if (m < 0)
                return false;
        } else if (!centymetry.isEmpty()) {
            cm = Double.valueOf(centymetry);
            if (cm < 0)
                return false;
        } else if (!milimetry.isEmpty()) {
            mm = Double.valueOf(milimetry);
            if (mm < 0)
                return false;
        } else
            return false;


        return true;
    }

    public boolean sprawdzeniePodanychWartosciMasy(String kilogramy, String gramy, String miligramy) {
        if (!kilogramy.isEmpty()) {
            kg = Double.valueOf(kilogramy);
            if (kg < 0)
                return false;
        } else if (!gramy.isEmpty()) {
            g = Double.valueOf(gramy);
            if (g < 0)
                return false;
        } else if (!miligramy.isEmpty()) {
            mg = Double.valueOf(miligramy);
            if (mg < 0)
                return false;
        } else {
            return false;
        }


        return true;
    }

    public String obliczeniaWag(String kilogramy, String gramy, String miligramy) {
        System.out.println("Przeliczono wartość miar");
        if (!kilogramy.isEmpty()) {
            kg = Double.valueOf(kilogramy);
            g = kg * 1000;
            mg = g * 1000;
        } else if (!gramy.isEmpty()) {
            g = Double.valueOf(gramy);
            kg = g / 1000;
            mg = g * 1000;
        } else if (!miligramy.isEmpty()) {
            mg = Double.valueOf(miligramy);
            g = mg / 1000;
            kg = g / 1000;
        } else System.out.println("Podałeś wartość zero !!");
        return "Podana wartosc wag przeliczona na: " + "\n" + "Kilogramy: " + kg + "\n" + "Gramy: " + g + "\n" + "Miligramy: " + mg;
    }

    public String obliczeniaMiar(String metry, String milimetry, String centymetry) {
        System.out.println("Przeliczono wartość miar ");
        if (!metry.isEmpty()) {
            m = Double.valueOf(metry);
            cm = m * 100;
            mm = cm * 10;
        } else if (!centymetry.isEmpty()) {
            cm = Double.valueOf(centymetry);
            m = cm / 100;
            mm = cm * 10;
        } else if (!milimetry.isEmpty()) {
            mm = Double.valueOf(milimetry);
            cm = mm / 10;
            m = cm / 100;
        } else System.out.println("Podałeś wartość zero !!");
        return "Podana wartosc miar przeliczona na: " + "\n" + "Metry: " + m + "\n" + "Centymetry: " + cm + "\n" + "Milimetry: " + mm;
    }
}
