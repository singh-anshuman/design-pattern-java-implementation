package com.anshuman.dpBuilder;

public class Phone {

    private String camera;
    private String flash;
    private String externalMemory;
    private String typeC;
    private String zoomLens;

    private Phone(PhoneBuilder phoneBuilder) {
        this.camera = phoneBuilder.camera;
        this.flash = phoneBuilder.flash;
        this.externalMemory = phoneBuilder.externalMemory;
        this.typeC = phoneBuilder.typeC;
        this.zoomLens = phoneBuilder.zoomLens;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "camera='" + camera + '\'' +
                ", flash='" + flash + '\'' +
                ", externalMemory='" + externalMemory + '\'' +
                ", typeC='" + typeC + '\'' +
                ", zoomLens='" + zoomLens + '\'' +
                '}';
    }

    public static class PhoneBuilder {
        private String camera;
        private String flash;
        private String externalMemory;
        private String typeC;
        private String zoomLens;

        public PhoneBuilder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public PhoneBuilder flash(String flash) {
            this.flash = flash;
            return this;
        }

        public PhoneBuilder externalMemory(String externalMemory) {
            this.externalMemory = externalMemory;
            return this;
        }

        public PhoneBuilder typeC(String typeC) {
            this.typeC = typeC;
            return this;
        }

        public PhoneBuilder zoomLens(String zoomLens) {
            this.zoomLens = zoomLens;
            return this;
        }

        public Phone buildPhone() {
            return new Phone(this);
        }
    }
}
