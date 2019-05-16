package com.anshuman.dpadaptorTwo;

public class AdaptorTesterTwo {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(new USBImpl());
        Laptop laptop2 = new Laptop(new USBToTypeCAdaptor(new TypeC()));

        laptop1.getUsb().plug();
        laptop2.getUsb().plug();

    }
}
