package animals;

public class Sova extends Animal {
    private static String SOVA_AGE = "I'm 3 years old";
    private static String SOVA_KIND = "Sipuha";

    public  Sova ( String name) {
        super();
        setName(name);

        setKind(SOVA_KIND);
        setAge(SOVA_AGE);
    }

    @Override
    public void kind() {

    }
}

