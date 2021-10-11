/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreshtha
 */
public class CarCatalog {
    
    private List<Car> carCatalog;
    
    public CarCatalog(){
        carCatalog = new ArrayList<Car>();
        Car c1 = new Car();
        c1.setAvailabile(true);
        c1.setCity("bos");
        c1.setMaintainceCertificate(false);
        c1.setMake("mercedes");
        c1.setModelNumber("gla250");
        c1.setSeats(5);
        c1.setSerialNumber("54l6ytn");
        c1.setYear(2019);
        carCatalog.add(c1);
        
        Car c2 = new Car();
        c2.setAvailabile(true);
        c2.setCity("DC");
        c2.setMaintainceCertificate(false);
        c2.setMake("Audi");
        c2.setModelNumber("muc300");
        c2.setSeats(8);
        c2.setSerialNumber("457l6un");
        c2.setYear(2017);
        carCatalog.add(c2);
        
        Car c3 = new Car();
        c3.setAvailabile(true);
        c3.setCity("Chicago");
        c3.setMaintainceCertificate(true);
        c3.setMake("Toyota");
        c3.setModelNumber("CXR67");
        c3.setSeats(10);
        c3.setSerialNumber("689tyn");
        c3.setYear(2020);
        carCatalog.add(c3);
        
        Car c4 = new Car();
        c4.setAvailabile(true);
        c4.setCity("LA");
        c4.setMaintainceCertificate(true);
        c4.setMake("Toyota");
        c4.setModelNumber("CXR67");
        c4.setSeats(10);
        c4.setSerialNumber("689tynrf");
        c4.setYear(2020);
        carCatalog.add(c4);
    }
    
    public List<Car> getCarcatalog() {
        return carCatalog;
    }

    public Car addCar() {
        Car p = new Car();
        carCatalog.add(p);
        return p;
    }

    public void removeCar(Car p) {
        carCatalog.remove(p);
    }

    public Car searchCar(String id) {
        for (Car car : carCatalog) {
            if (car.getSerialNumber()== id) {
                return car;
            }
        }
        return null;
    }
    
    public List<Car> searchCarBasedOnModelNumber(String modelNumber){
        List<Car> sameModelCars = null;
        for (Car car: carCatalog) {
            if (car.getModelNumber() == modelNumber){
                sameModelCars.add(car);
            }
        }
        
        return sameModelCars;
    }
    
    public int getNumberOfAvailableCars() {
        int count = 0;
        for (Car car: carCatalog) {
            if (car.isAvailabile()){
                count ++;
            }
        }
        
        return count;
    }
    
    public int getNumberOfUnAvailableCars() {
        int count = 0;
        for (Car car: carCatalog) {
            if (!car.isAvailabile()){
                count ++;
            }
        }
        
        return count;
    }
    
    public List<Car> getCarsBasedOnMake(String make){
        List<Car> sameMakeCars = null;
        for (Car car: carCatalog) {
            if (car.getMake() == make){
                sameMakeCars.add(car);
            }
        }
        
        return sameMakeCars;
    }
    
    public List<Car> getCarsWithSeatConstraint(int min, int max) {
        List<Car> selectedCars = null;
        for (Car car: carCatalog) {
            if (min<= car.getSeats() && car.getSeats() <= max){
                selectedCars.add(car);
            }
        }
        
        return selectedCars;
    }
    
    public List<Car> getCarsMadeInYear(int year) {
        List<Car> selectedCars = null;
        for (Car car: carCatalog) {
            if (car.getYear() == year){
                selectedCars.add(car);
            }
        }
        
        return selectedCars;
    }
    
    public List<String> getAllCarMakes() {
        List<String> allCarMakes = null;
        
         for (Car car: carCatalog) {
            if (!allCarMakes.contains(car.getMake()) ){
                allCarMakes.add(car.getMake());
            }
        }
         
        return allCarMakes;
    }
    
    public List<Car> getCarsBasedOnCity(String city) {
        List<Car> selectedCars = null;
        for (Car car: carCatalog) {
            if (car.getCity() == city){
                selectedCars.add(car);
            }
        }
        
        return selectedCars;
    }
    
    public List<Car> getExpiredMaintanceCars() {
        List<Car> selectedCars = null;
        for (Car car: carCatalog) {
            if (car.isMaintainceCertificate()){
                selectedCars.add(car);
            }
        }
        
        return selectedCars;
    }
}
