package com.example.homeworks;

public class HomeWork8 {

    public static void main(String[] args) {
        //Task_1 output
        Cars alfaRomeo = new Cars("Alfa Romeo Giulia", 280,45000);
        Cars cadillac = new Cars("Cadillac XT4", 240, 35000);

        try {
            cadillac.startCar();
        } catch (CarStartException e) {
            System.out.println(cadillac.getModel() + e.getMessage());
        }

        try {
            alfaRomeo.startCar();
        } catch (CarStartException e) {
            System.out.println(alfaRomeo.getModel() + e.getMessage());
        }

        //Task_2 from classwork
        try {
            crossTheStreet("red");
        } catch (CrossTheStreetIsNotPermitedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String trafficLightColor;

    public static void crossTheStreet(String trafficLightColor) throws CrossTheStreetIsNotPermitedException{

        if(trafficLightColor.equals("red")){
            throw new CrossTheStreetIsNotPermitedException("Please, wait for the green traffic light!");
        }else{
            System.out.println("You can go");
        }
    }
}

//Task_1
class Cars{
    private String model;
    private int maxSpeed;
    private int price;

    public  void startCar() throws CarStartException{
        int r = (int) (Math.random()*21);
        if(r % 2 == 0){
            throw new CarStartException(" didn't start");
        }
        else
            System.out.println(getModel() + " successfully started");
    }

    public Cars(){
    }

    public Cars(String model, int maxSpeed, int price ){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class CarStartException extends Exception {
    private final String message;

    CarStartException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

//Task_2 exception class
class CrossTheStreetIsNotPermitedException extends Exception {
    private final String message;

    CrossTheStreetIsNotPermitedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}