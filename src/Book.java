public class Book {
    //noOfCopies
    private int noOfCopies;

    Book (int noOfCopies){
        this.noOfCopies = noOfCopies;
    }

    
    void name(){
        System.out.println("New Book!!!");
    }


    public int getNoOfCopies() {
        return noOfCopies;
    }


    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void increaseSetOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies+howMuch);
    }

    public void decreaseSetOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies-howMuch);
    }
}
