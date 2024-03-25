public class MotorBike {
    //state
    private int speed; //member variable - variables specific to an class

    //behaviours
    //letting other classes access the value of the speed through the 
    // methods or actions
    void setSpeed(int speed){
        //in this case variable speed is a local variable
        this.speed = speed;
        
    }

    void  start () {
        System.out.println("Bike Started!!!!");
    }
}
