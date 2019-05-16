package com.anshuman.dpadaptorTwo;

public class USBToTypeCAdaptor implements USB {

    TypeC typeC;

    public USBToTypeCAdaptor(TypeC typeC) {
        this.typeC = typeC;
    }

    public void plug() {
        typeC.connect();
    }
}
