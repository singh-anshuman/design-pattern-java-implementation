package com.anshuman.dp.decorator;

public class AccidentalCoverage extends PhoneDecorator {

    public AccidentalCoverage(Phone phone) {
        super(phone);
    }

    @Override
    public void aboutPhone() {
        super.aboutPhone();
        System.out.println("Adding Accidental Coverage");
    }
}
