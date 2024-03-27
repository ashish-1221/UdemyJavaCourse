public class MotorBike {
    //state
    private int speed; //member variable - variables specific to an class

    //behaviours
    //letting other classes access the value of the speed through the 
    // methods or actions


    // contstructors-> special kind of method
    // name of constructor = name of the class
    MotorBike(int speed){
        this.speed = speed;
        
    }

    void  start () {
        System.out.println("Bike Started!!!!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        
    }
}
