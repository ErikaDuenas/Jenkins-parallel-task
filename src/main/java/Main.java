import java.util.Random;

public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java Main <NAME>");
            return;
        }

        String name = args[0];
        Random random = new Random();

        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello I am " + name + " and I am printing the number " + i);

            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
