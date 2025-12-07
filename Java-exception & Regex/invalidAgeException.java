package exception;

class InvalidAgeException extends Exception {
    private static final long serialVersionUID = 1L;
}
class InvalidAgeExceptionTest {
    public static void main(String[] args) {

        int age = 16;

        try {
            if(age < 18) {
                throw new InvalidAgeException();
            }
            System.out.println("Candidate is eligible to vote");
        }
        catch(InvalidAgeException e) {
            System.out.println("Candidate is not eligible to vote");
        }
    }
}
