public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        if (bonus < limit)
            if (amount == 0) {
                System.out.println("Совершите покупку, чтобы получить бонусы!");
            }
        boolean b = amount < 99;
        if (!registered && b) {
            System.out.println("Суммы покупки недостаточно для начисления бонусов");
        }
        return bonus;
    }
}