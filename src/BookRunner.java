public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(1000);
        Book effectiveJava = new Book(2000);
        Book cleanCode = new Book(3000);

        // artOfComputerProgramming.setNoOfCopies(10);
        // effectiveJava.setNoOfCopies(20);
        // cleanCode.setNoOfCopies(30);

        artOfComputerProgramming.increaseSetOfCopies(10);
        int noOfCopies = artOfComputerProgramming.getNoOfCopies();
        System.out.println(noOfCopies);

    }
}
