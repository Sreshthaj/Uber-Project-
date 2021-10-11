/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sreshtha
 */
public class Car {
    private boolean availabile;
    private String make;
    private int year;
    private int seats;
    private String serialNumber;
    private String modelNumber;
    private String city;
    private boolean maintainceCertificate;

    public boolean isAvailabile() {
        return availabile;
    }

    public void setAvailabile(boolean availability) {
        this.availabile = availability;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMaintainceCertificate() {
        return maintainceCertificate;
    }

    public void setMaintainceCertificate(boolean maintainceCertificate) {
        this.maintainceCertificate = maintainceCertificate;
    }
    
    @Override
    public String toString() {
        return make; 
    }
    
    
}
