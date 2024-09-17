package io.coding.challenge;

public class CeilingFan {

    private int speedCord;
    private boolean isReversedCord;

    public CeilingFan() {
        this.speedCord = 0;
        this.isReversedCord = false;
    }


    public void pullSpeedCord() {
        speedCord = (speedCord + 1) % 4;
    }


    public void pullDirectionCord() {
        isReversedCord = !isReversedCord;
    }


    public int getSpeed() {
        return speedCord;
    }


    public String getDirection() {
        return isReversedCord ? "Reversed" : "Normal";
    }
}

