// Simple loan monthly payment calculator (does not account for the compounding of interest over the months)

public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
	
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment > carLoan) {
      System.out.println("he car can be paid in full.");
    } else {
      double monthlyPayment = (double)(carLoan - downPayment) * (interestRate / 100.0 + 1) / (loanLength * 12);

      System.out.println((int)monthlyPayment);
    }
	}
}
