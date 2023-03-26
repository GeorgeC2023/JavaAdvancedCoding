package ro.sda.advanced._3_composition;

public class PC {
    private Monitor monitor;
    private Case theCase;

    public PC(Monitor monitor, Case theCase) {
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        this.drawLogo();
    }
    public void drawLogo(){
        monitor.drawPixelAt(1200, 1800, "red");
    }
}
