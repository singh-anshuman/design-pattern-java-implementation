package com.anshuman.dp.decorator;

public class DecoratorTester {

    public static void main(String []args) {
        Phone phoneWithBackCoverTemperedGlass = new TemperedGlass(new BackCover(new Phone(), "Silicon"));
        phoneWithBackCoverTemperedGlass.aboutPhone();

        Phone phoneWithBackCoverAccidentalCoverage = new AccidentalCoverage(new BackCover(new Phone(), "Hard Cover"));
        phoneWithBackCoverAccidentalCoverage.aboutPhone();
    }
}
