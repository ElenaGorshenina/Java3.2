public class main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int refill = 1540;
        int bonus = 0;
                if (refill>1000){
                    bonus = refill / 100;
                }
        int balance = currentBalance + refill + bonus;
        System.out.println("Balance = " + balance);
    }
}
