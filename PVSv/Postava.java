package PVSv;

public class Postava {
    String name;
    int HP;
    int DMG;

    public Postava(String Jmeno, int poskozeni, int zdravi) {
        name = Jmeno;
        HP = zdravi;
        DMG = poskozeni;
    }

    //    public (int)(Math.random()*35)+1;
    static void WAR(Postava figure1, Postava figure2) {

        boolean switcher = true;
        while (figure1.HP >= 0 && figure2.HP >= 0) {
            if (switcher) {
                System.out.println(figure1.name + " udelil " + figure1.DMG + " poskozeni.");
                figure2.HP -= figure1.DMG;
                System.out.println(figure2.name + " ma jeste " + figure2.HP + " zivotu.");
                switcher = false;
                if (figure2.HP <= 0) {
                    figure2.HP = 0;
                    break;
                }
                System.out.println();


            } else {
                System.out.println(figure2.name + " udelil " + figure2.DMG + " poskozeni.");
                figure1.HP -= figure2.DMG;
                System.out.println(figure1.name + " ma jeste " + figure1.HP + " zivotu.");
                switcher = true;
                if (figure1.HP <= 0) {
                    figure1.HP = 0;
                    break;
                }
                System.out.println();
            }
        }
        if (figure1.HP <= 0) {
            System.out.println(figure2.name + " vyhral");
        } else {
            System.out.println(figure1.name + "vyhral");
        }

    }

    public static void main(String[] args) {
        Postava figure1 = new Postava("Pepa", 15, 100);
        Postava figure2 = new Postava("Jan", 20, 100);
        WAR(figure1, figure2);
    }
}
