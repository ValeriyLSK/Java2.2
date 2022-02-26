public class Main {
    public static void main(String[] args) {
        int customersAccount = 100;
        int deposit = 1200;
        boolean b = (deposit > 1000);
        int finalCustomersAccount;
        if (b) {
            int bonus = deposit / 100;
            finalCustomersAccount = customersAccount + deposit + bonus;
            System.out.println("Начислено бонусных рублей: " + bonus + "; На вашем счету: " + finalCustomersAccount + " рублей");
        } else {
            finalCustomersAccount = customersAccount + deposit;
            System.out.println("На вашем счету: " + finalCustomersAccount + " рублей");
        }


    }
}