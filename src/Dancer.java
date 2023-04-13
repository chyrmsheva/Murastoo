public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }


    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void dancing() {
        System.out.println("Alina is dancing");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                "groupName='" + groupName + '\'' +
                '}';
    }
}








