public class TASK_2_EVEN_OR_NOT_EVEN {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("random number between 1 and 100: " + randomNumber);

        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " was checked using the modulo operator and it is EVEN.");
        } else {
            System.out.println(randomNumber + " was checked using the modulo operator and it is ODD.");
        }
    }
}