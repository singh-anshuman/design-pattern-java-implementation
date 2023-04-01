package com.anshuman.dpBuilder;

public class Phone {

    private String camera;
    private String flash;
    private String externalMemory;
    private String typeC;
    private String zoomLens;

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
        private Phone phone = new Phone();
        
        public PhoneBuilder camera(String camera) {
            phone.setCamera(camera);
            return this;
        }

        public PhoneBuilder flash(String flash) {
            phone.setFlash(flash);
            return this;
        }

        public PhoneBuilder externalMemory(String externalMemory) {
            phone.setExternalMemor(externalMemory);
            return this;
        }

        public PhoneBuilder typeC(String typeC) {
            phone.setTypeC(typeC);
            return this;
        }

        public PhoneBuilder zoomLens(String zoomLens) {
            phone.setZoomLens(zoomLens);
            return this;
        }

        public Phone buildPhone() {
            return phone;
        }
    }
}
