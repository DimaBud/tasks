import animals.*;



public class Main {

    public static void main(String[] args) {

        Sova sova = new Sova("Karkusha");
        sova.sleep();
        Sova2 sova2 = new Sova2("Balalaika");
        sova2.sleep();
        Sova3 sova3 = new Sova3("Malytka");
        sova3.hunt();
        Sova4 sova4 = new Sova4("GIGANT228");
        sova4.eat();
    }
}
