public class MainV3 {
        public static void main(String[] args) {

            int balance0 = 100;
    long payment = (long) 1500;
    long balance1 = balance0 + payment;
    long bonus =0;

    System.out.println("Starting balance = " + balance0);
    System.out.println("Final balance= " + balance1);

        if (payment >= 1000) {
            bonus = payment/100;
        }
        else {
        }
        System.out.println("Bonus = " + bonus);
    }

}
