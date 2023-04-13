public class Main {
    public static void main(String[] args) {


        Singer singer = new Singer("Aksana","singing","Kg");
        Dancer dancer = new Dancer("Alina","dancing","Kz");
        Programmer programmer = new Programmer("Aksana","coding","Peaksoft");
        System.out.println();

        System.out.println(singer);
        System.out.println(dancer);
        System.out.println(programmer);

        singer.learn();
        singer.eat();
        singer.walk();

        singer.singing();
        singer.playGitar();

        dancer.dancing();
        programmer.coding();










    }

}