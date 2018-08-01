package animals;

public class Sova4 extends Animal {
    private static String SOVA4_AGE = "I'm 2 years old";
    private static String SOVA4_KIND = "Virgin Eurasian eagle owl (great horned owl)";

    public Sova4(String name) {
        super();
        setName(name);

        setKind(SOVA4_KIND);
        setAge(SOVA4_AGE);
    }
    @Override
    public void kind() {

    }
}
