package PVSv;

public class Osoba {
    String jmeno, prijmeni, bydliste;
    int datumNarozeni, vek, pocetDeti;
    public Osoba(String jmeno, String prijmeni, String bydliste, int datumNarozeni, int vek, int pocetDeti) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.bydliste = bydliste;
        this.datumNarozeni = datumNarozeni;
        this.vek = vek;
        this.pocetDeti = pocetDeti;
    }

    public static void main(String[] args) {
        Osoba o1 = new Osoba("Pepa", "Vomacka", "U bezdaku", 2005, 17, 0);
        o1.printInfo();
    }

    public void printInfo() {
        System.out.println("Jmenuji se " + jmeno + " " + prijmeni + " a narodil jsem se v roce " + this.datumNarozeni + ".");
        System.out.println(vypisVek());
    }

    public int vypisVek() {
        int datum = 2022;
        datumNarozeni = datum - datumNarozeni;
        return datumNarozeni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }

    public void setDatumNarozeni(int datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setPocetDeti(int pocetDeti) {
        this.pocetDeti = pocetDeti;
    }

}
