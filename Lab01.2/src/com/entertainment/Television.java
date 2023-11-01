package com.entertainment;

import java.util.Objects;

public class Television {
    private String brand;
    private int volume;
    private final Tuner tuner = new Tuner();

    // Methods

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    // constructors

    public Television() {
        this.brand = "";
        this.volume = 0;
    }

    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    // Accessor methods

    public String getBrand() {
        return brand;
    }

    public int getVolume() {
        return volume;
    }

    // Mutator methods

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    // Override methods
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//
//        if (obj == null || getClass() != obj.getClass()) return false;  // not same class; early return
//        Television that = (Television) obj;
//
//        return getVolume() == that.getVolume() &&
//                Objects.equals(this.getBrand(), that.getBrand());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

//    @Override
//    public boolean equals(Object obj) {
//        boolean result = false;
//
//        // proceed only if "obj" is really reference to Television object
//        if (this.getClass() == obj.getClass()) {
//            //safely downcast "obj" to a Television object
//            Television other = (Television) obj;
//
//            // do the checks: business equality is defined by brand, volume being the same
//            result = Objects.equals(this.getBrand(), other.getBrand()) &&
//                    this.getVolume() == other.getVolume();
//        }
//        return result;
//    }
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(this == obj) {
            return true;
        }
        if (obj != null && this.getClass() == obj.getClass()) {
            //proceed
        }
        else if (obj != null && this.getClass() == obj.getClass()) {
            Television other = (Television) obj;
            result = Objects.equals(this.getBrand(), other.getBrand()) &&
                    this.getVolume() == other.getVolume();
        }
        return result;
        }

    // toString method

    public String toString() {
        return getClass().getSimpleName() +
                "[brand= " + getBrand() +
                ", volume= " + getVolume() +
                ", current channel= " + getCurrentChannel() + "]";
    }


}
