package types;

import java.io.Serializable;

public class Tovar implements Serializable{
    private String floor;
    private int place;
    private int clock;
    private double price;
    private String bonus;

    public Tovar() {
        this.floor = "";
        this.place = 0;
        this.price = 0;
        this.bonus = "";
        this.clock = 0;
    }

    public Tovar(String floor, int place, int clock, double price, String bonus) {
        this.floor = floor;
        this.place = place;
        this.clock = clock;
        this.price = price;
        this.bonus = bonus;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    public int getSumma() {
        return (int) (this.clock * this.price);
    }
}