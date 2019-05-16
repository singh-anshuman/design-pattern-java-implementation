package com.anshuman.dpFacade;

public class FacadeTester {

    public static void main(String[] args) {
        MusicPlayerFacade musicPlayerFacade = new MusicPlayerFacade();

        musicPlayerFacade.play();
        musicPlayerFacade.pause();
    }
}
