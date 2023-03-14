import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Person person = new Person(Status.Client," Ruslan ","Ruslan@gmal.com");
        Person person1 = new Person(Status.Client," Manas ","Manas@gmal.com");
        Person person2 = new Person(Status.Client," Torogeldi ","Torogeldi@gmal.com");
        Person person3 = new Person(Status.Client," Matmusa ","Matmusa@gmal.com");
        System.out.println();
        Person Admin  = new Person(Status.Chef," Abdymomun "," Abddymomun@gmail.com"+bankAccount.balanceChef);
        System.out.println(person+
                "\n"+person1+
                "\n"+person2+
                "\n"+person3+
        "\n"+Admin);


        System.out.println();
        System.out.println("Welcome we menu \n" + Meal.Shawarma +" "+ Meal.Shawarma.compareTo (3));
        System.out.println(Meal.Burger +" "+Meal.Burger.compareTo(0));
        System.out.println(Meal.Pizza + " "+Meal.Pizza.compareTo(2));
        System.out.println(Meal.Shashlik + " " +Meal.Shashlik.compareTo(4));
        System.out.println(Meal.Rols + " " + Meal.Rols.compareTo(1));
        System.out.println("your balance "+bankAccount.balancePerson1);

        Scanner scanner = new Scanner(System.in);
        

        String a = scanner.nextLine();

        switch (a){

            case "Burger":
                bankAccount.withdrawal(200);
                System.out.println(" your balance"+bankAccount.balancePerson1);
                bankAccount.deposit(200);
                System.out.println("balance Admin "+bankAccount.balanceChef);
                break;
            case "Rols":
                bankAccount.withdrawal(400);
                System.out.println(" your balanca"+bankAccount.balancePerson1);
                bankAccount.deposit(400);
                System.out.println(bankAccount.balanceChef);
                break;
            case "Pizza":
                bankAccount.withdrawal(300);
                System.out.println(" your balance"+bankAccount.balancePerson1);
                bankAccount.deposit(300);
                System.out.println("balance Admin "+bankAccount.balanceChef);
                break;
            case "Shashlik":
                bankAccount.withdrawal(150);
                System.out.println(" your balance"+bankAccount.balancePerson1);
                bankAccount.deposit(150);
                System.out.println("balance Admin "+bankAccount.balanceChef);
                break;
            case "Shawarma":
                bankAccount.withdrawal(120);
                System.out.println(" your balance"+bankAccount.balancePerson1);
                bankAccount.deposit(120);
                System.out.println("balance Admin "+bankAccount.balanceChef);
                break;
            default:
                System.out.println("выберите только из меню");
        }
    }
}