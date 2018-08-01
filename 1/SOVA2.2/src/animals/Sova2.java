package animals;

public class Sova2 extends Animal {
    private static String SOVA2_AGE = "I'm 5 years old";
    private static String SOVA2_KIND = "Rabbit owl";

    public Sova2(String name) {
        super();
        setName(name);

        setKind(SOVA2_KIND);
        setAge(SOVA2_AGE);
    }
    @Override
    public void kind() {

    }
}
