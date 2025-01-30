public class Main {
    public static void main(String[] args)

    {
        double cardBalance = 5000.00;
        double interestRate = 0.17;
        double monthlyInterestRate = 0.0;
        double cardBalanceOneMonth = 0.0;
        double cardBalanceTwoMonth = 0.0;

        monthlyInterestRate = 30 * (interestRate/365);
        cardBalanceOneMonth = (monthlyInterestRate * cardBalance);
        cardBalanceTwoMonth = monthlyInterestRate * (cardBalance + cardBalanceOneMonth);



        System.out.println("Your interest due after one month will be $" + cardBalanceOneMonth + ". Your interest due after two months will be $" + cardBalanceTwoMonth);

    }
}