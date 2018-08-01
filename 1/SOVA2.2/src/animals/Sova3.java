package animals;

public class Sova3 extends Animal {
    private static String SOVA3_AGE = "I'm 1 years old";
    private static String SOVA3_KIND = "West American scoop";

    public Sova3(String name) {
        super();
        setName(name);

        setKind(SOVA3_KIND);
        setAge(SOVA3_AGE);
    }
    @Override
    public void kind() {

    }
}
