public class MotorBikeRunner {
    //constructors

    public static void main(String[] args) {
        MotorBike honda = new MotorBike(100);
        MotorBike ducati = new MotorBike(200);

        honda.start();
        ducati.start();

        // honda.setSpeed(30);
        // ducati.setSpeed(100);

        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed +=100;
        System.out.println(ducatiSpeed);

        int hondaSpeed = honda.getSpeed();
        hondaSpeed +=100;
        System.out.println(hondaSpeed); 
        // System.out.println(ducati.getSpeed());
        // System.out.println(honda.getSpeed());
        
    }
}
