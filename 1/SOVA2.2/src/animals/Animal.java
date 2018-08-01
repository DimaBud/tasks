package animals;

public abstract class Animal {
    private String name;
    private String kind;
    private String age;

    public Animal(){
        this.name = name;
        this.kind = kind;
        this.age = age;
    }


    public void hunt(){
        System.out.println(getKind() + " " + getName() + " hunting"); }

    public void sleep(){
        System.out.println(getKind() + " " + getName() + " sleeping"); }

    public void eat() {
        System.out.println(getKind() + " " + getName() + " devour prey");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public abstract void kind();
}
