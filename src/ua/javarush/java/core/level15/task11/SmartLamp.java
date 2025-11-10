package ua.javarush.java.core.level15.task11;

public class SmartLamp {
    private boolean isCurrentlyOn;

    public SmartLamp() {
        this.isCurrentlyOn = false;
    }

    public boolean isCurrentlyOn() {
        return isCurrentlyOn;
    }

    public void setCurrentlyOn(boolean newState) {
        isCurrentlyOn = newState;
    }
}
