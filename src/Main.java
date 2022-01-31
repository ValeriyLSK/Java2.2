public class Main {
    public static void main(String[] args) {
        int customersAccount = 100;
        int deposit = 1100;
        boolean b = (deposit >= 1100);
        int bonus = deposit / 100;
        int finalCustomersAccount;
        if (b) {
            finalCustomersAccount = customersAccount + deposit + bonus;
            System.out.println("Начислено бонусных рублей: " + bonus + "; На вашем счету: " + finalCustomersAccount + " рублей");
        }
        else {
            finalCustomersAccount = customersAccount + deposit;
            System.out.println("На вашем счету: " + finalCustomersAccount + " рублей");
        }


    }
}