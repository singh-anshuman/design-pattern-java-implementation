package com.anshuman.dp.decorator;

public class PhoneDecorator extends Phone {

    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void aboutPhone() {
        this.phone.aboutPhone();
    }
}
