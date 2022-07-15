public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        boolean registered = true;
        long expected;
        expected = 30;
        long amount;
        amount = 1000;
        long actual = service.calculate(amount, registered);
    }
}
