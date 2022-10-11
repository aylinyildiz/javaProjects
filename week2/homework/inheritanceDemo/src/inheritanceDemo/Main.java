package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	
		LoanUI loanUI = new LoanUI();
		loanUI.LoanCalculate(new TeacherLoanManager());

	}

}
