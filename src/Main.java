public class Main {
    public static void main(String[] args) {
        int customersAccount = 100; //начальная сумма на счету
        int deposit = 1200; //сумма пополнения
        int priceForBonus = 100; //шаг бонуса
        int bonus = deposit / priceForBonus; //рассчет бонуса
        boolean b = (deposit < 1100);
        int finalCustomersAccount;
        if (b) {
            finalCustomersAccount = customersAccount + deposit;
            System.out.println("Сумма средств на счете: " + finalCustomersAccount);
        } else {
            finalCustomersAccount = customersAccount + deposit + bonus;
            System.out.println("Начислено бонусных рублей: " + bonus + "; Сумма средств на счете: " + finalCustomersAccount);

        }

    }
}