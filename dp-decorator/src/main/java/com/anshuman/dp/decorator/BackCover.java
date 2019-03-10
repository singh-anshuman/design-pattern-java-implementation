package com.anshuman.dp.decorator;

public class BackCover extends PhoneDecorator {

    String coverType;

    public BackCover(Phone phone, String coverType) {
        super(phone);
        this.coverType = coverType;
    }

    @Override
    public void aboutPhone() {
        super.aboutPhone();
        System.out.println("Adding Backcover: "+coverType);
    }
}
