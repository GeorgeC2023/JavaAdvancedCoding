package ro.sda.advanced._3_composition;

/**
 * The following exercise is for understanding composition, we will create a few classes which represents different
 * components of a PC.
 * <p>
 * Create a class named Dimensions with the following instance variables: width, height, depth
 * The class should contain getters for all the fields.
 * <p>
 * Create a class Case containing the following instance variables: model, manufacturer and powerSupply (all strings)
 * and dimensions which is of type Dimension
 * <p>
 * The class should have:
 * - a constructor with parameters
 * - getters for all the fields
 * - a method pressPowerButton() - which will only print "Power button pressed"
 * <p>
 * <p>
 * Create a class resolution which will have only 2 fields: width and height (both are int)
 * <p>
 * The class should have:
 * - a constructor
 * - getters for both fields
 * <p>
 * Create a class Monitor which will have the following fields: model, manufacturer, size (all are String)
 * and a field nativeResolution which is of type Resolution
 * <p>
 * The class should have:
 * - a constructor
 * - getters for all the fields
 * - a method named drawPixelAt(int x, int y, String color) which will only print "Drawing pixel at ... in color ..."
 * <p>
 * Create a class Motherboard with the following fields: model, manufacturer, bios (all are String),
 * ramSlots and cardSlots (both are int)
 * <p>
 * The class should have:
 * - a constructor
 * - getters for all the fields
 * - a method loadProgram(programName) which will print a message when a program is loaded
 * <p>
 * Create a class PC which will have a case of type Case, a monitor of type Monitor and a motherboard of type Motherboard
 * <p>
 * The class should have:
 * - a constructor
 * - a method powerUp() - which will call the method for powering up from the Case class
 * - a method drawLogo() - which will call the method drawPixel from Monitor class
 */

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
