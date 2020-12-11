package OOPS.Abstraction;

abstract class SMSSender {

    abstract public void eastablishConnectionWithYourTower();

    public void sendSMS() {
  /*eastablishConnectionWithYourTower();
  checkForDND();
  checkForTelecomRules();

  sending SMS to numbers...numbers.*/
    }

    abstract public void destroyConnectionWithYourTower();

    public void checkForDND() {
        //check for number present in DND.
    }

    public void checkForTelecomRules() {
        //Check for telecom rules
    }
}


class Vodafone extends SMSSender {

    @Override
    public void eastablishConnectionWithYourTower() {
        //connecting using Vodafone way
    }

    @Override
    public void destroyConnectionWithYourTower() {
        //destroying connection using Vodafone way
    }

}

class Airtel extends SMSSender {

    @Override
    public void eastablishConnectionWithYourTower() {
        //connecting using Airtel way
    }

    @Override
    public void destroyConnectionWithYourTower() {
        //destroying connection using Airtel way
    }

}