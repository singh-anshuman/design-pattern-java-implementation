package com.anshuman.dp.decorator;

public class TemperedGlass extends PhoneDecorator {

    public TemperedGlass(Phone phone) {
        super(phone);
    }

    @Override
    public void aboutPhone() {
        super.aboutPhone();
        System.out.println("Adding Tempered Glass");
    }
}
