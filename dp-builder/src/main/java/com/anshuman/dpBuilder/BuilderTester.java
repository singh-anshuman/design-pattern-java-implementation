package com.anshuman.dpBuilder;

public class BuilderTester {

    public static void main(String[] args) {
        Phone phone1 = new Phone.PhoneBuilder()
                .camera("8 mpx")
                .externalMemory("16GB")
                .buildPhone();

        Phone phone2 = new Phone.PhoneBuilder()
                .camera("12 mpx")
                .flash("Two Tone")
                .externalMemory("32GB")
                .zoomLens("3x Optical Zoom")
                .buildPhone();

        System.out.println("Phone 1 Specs");
        System.out.println(phone1.toString());

        System.out.println("Phone 2 Specs");
        System.out.println(phone2.toString());

    }
}
