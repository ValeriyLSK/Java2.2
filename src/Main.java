public class Main {
    public static void main(String[] args) {
        int customersAccount = 321;
        int deposit = 986;
        int priceForBonus = 100;
        int bonus = deposit / priceForBonus;
        if (deposit <= 1000) {
            System.out.println("Сумма средств на счете: " + (customersAccount + deposit));
        } else {
            System.out.println("Начислено бонусных рублей: " + bonus + "; Сумма средств на счете: " + (customersAccount + deposit + bonus));

        }

    }
}