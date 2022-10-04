package com.example.homeworks;
//Task_1
public class HomeWork6 {
    public static void main(String[] args) {
    CreditCard alfaBank = new CreditCard(55443322, 20000);
    CreditCard priorBank = new CreditCard(66554433, 30000);
    CreditCard technoBank = new CreditCard(88994422,50000);

    alfaBank.cardBalance();
    priorBank.cardBalance();
    technoBank.cardBalance();

    alfaBank.creditingMoney(2235);
    priorBank.creditingMoney(4500);
    technoBank.debitingMoney(8500);

    alfaBank.cardBalance();
    priorBank.cardBalance();
    technoBank.cardBalance();


    //Task3 output
    Vehicle vehicle = new Vehicle(new Engine());
    vehicle.ride();
    }


}
class CreditCard{
    private final int accountNumber;
    private int accountBalance;

    public void debitingMoney(int debit){
        accountBalance -= debit;
        System.out.println("Debiting money from your card: -" + debit);
    }
    public void creditingMoney(int credit){
        accountBalance += credit;
        System.out.println("Crediting money on your card: +" + credit);
    }
    public void cardBalance(){
        System.out.println("Balance of your card №: " + accountNumber + " is " + accountBalance + "$");
    }
    public CreditCard(int accountNumber, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

}

//Task_2
abstract class Transport{
abstract void beep();
abstract  void drive();
}
interface IStartTheEngine{
void startTheEngine();
}
class Bicycle extends Transport{
    @Override
    void beep() {
    }
    @Override
    void drive() {
    }
}
class Car extends Transport implements IStartTheEngine{
    @Override
    void beep() {
    }
    @Override
    void drive() {
    }
    @Override
    public void startTheEngine() {
    }
}
class Tractor extends Transport implements IStartTheEngine{
    @Override
    void beep() {
    }
    @Override
    void drive() {
    }
    @Override
    public void startTheEngine() {
    }
}

//Task_3
interface ISpinTheWheels{
    void spinTheWheels();
}
class Engine implements ISpinTheWheels{
    @Override
    public void spinTheWheels() {
        System.out.println("Engine start to spin the wheels. The wheels on the car go round and round:)");
    }
}

class Vehicle{
    ISpinTheWheels iSpinTheWheels;

    public Vehicle(ISpinTheWheels spin){
        this.iSpinTheWheels = spin;
    }
    void ride(){
        iSpinTheWheels.spinTheWheels();
    }
}