package com.entertainment;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass()!= o.getClass()) return false;

        Television tv = (Television) o;

        return volume == tv.volume &&
                brand.equalsIgnoreCase(tv.brand);
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

    // toString method

    public String toString() {
        return getClass().getSimpleName() +
                "[brand= " + getBrand() +
                ", volume= " + getVolume() +
                ", current channel= " + getCurrentChannel() + "]";
    }


}
