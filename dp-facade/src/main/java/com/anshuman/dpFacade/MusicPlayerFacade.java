package com.anshuman.dpFacade;

public class MusicPlayerFacade {

    SubSystemOne subSystemOne = new SubSystemOne();
    SubSystemTwo subSystemTwo = new SubSystemTwo();
    SubSystemThree subSystemThree = new SubSystemThree();
    SubSystemFour subSystemFour = new SubSystemFour();
    SubSystemFive subSystemFive = new SubSystemFive();

    public void play() {
        System.out.println("Playing Music...");
        subSystemOne.doStuff();
        subSystemThree.doStuff();
        subSystemFive.doStuff();
    }

    public void pause() {
        System.out.println("Pausing Music...");
        subSystemTwo.doStuff();
        subSystemFour.doStuff();
    }
}
