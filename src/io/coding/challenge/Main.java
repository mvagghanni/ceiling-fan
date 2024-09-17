package io.coding.challenge;

public class Main {

    public static void main(String[] args) {

        CeilingFan fan = new CeilingFan();

        // Test the initial state of the fan
        System.out.println("Initial Speed: " + fan.getSpeed());
        System.out.println("Initial Direction: " + fan.getDirection());

        // Pull the speed cord a few times
        fan.pullSpeedCord();
        System.out.println("Speed after 1st pull: " + fan.getSpeed());

        fan.pullSpeedCord();
        System.out.println("Speed after 2nd pull: " + fan.getSpeed());

        fan.pullSpeedCord();
        System.out.println("Speed after 3rd pull: " + fan.getSpeed());

        fan.pullSpeedCord();
        System.out.println("Speed after 4th pull: " + fan.getSpeed());

        // Pull the direction cord and check
        fan.pullDirectionCord();
        System.out.println("Direction after 1st direction pull: " + fan.getDirection());

        // Change the speed while in reversed mode
        fan.pullSpeedCord();
        System.out.println("Speed after 1st pull in reversed mode: " + fan.getSpeed());
        System.out.println("Direction: " + fan.getDirection());

        // Pull the direction cord again to return to normal mode
        fan.pullDirectionCord();
        System.out.println("Direction after 2nd direction pull: " + fan.getDirection());
    }

}

