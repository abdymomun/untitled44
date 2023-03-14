public class BankAccount {
    double balancePerson1 = 5000;
    double balanceChef = 0;
    void deposit(int som) {
        balanceChef += som;
    }

    void withdrawal(double som) {
        balancePerson1 -= som;
    }
    }

