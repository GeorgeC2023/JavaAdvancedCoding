package ro.sda.advanced._3_composition;

public class Main {
    public static void main(String[] args) {

        Case case1 = new Case("220B", "HP", "230", new Dimensions(10, 20, 30));
        Monitor monitor1 = new Monitor("27 inch", "Dell", "27", new Resolution(1920, 1080));
        PC pc1 = new PC(monitor1, case1);

        pc1.powerUp();
        case1.setManufacturer("gigabyte");
        case1.setModel("something");

        PC pc2 = new PC(
                new Monitor("330X4", "AOK", "32", new Resolution(10,20)), new Case("Model", "HP", "220",
                new Dimensions(30, 40,50)));

        pc2.powerUp();
    }



}
