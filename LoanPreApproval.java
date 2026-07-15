import java.util.Scanner;

public class LoanPreApproval {

    public static String checkLoanApproval(String employmentType, int creditScore, double debtToIncomeRatio) {
        // Guard clauses: invalid input first
        if (creditScore <= 0) {
            return "Invalid input";
        }
        if (debtToIncomeRatio < 0) {
            return "Invalid input";
        }
        if (employmentType == null || employmentType.trim().isEmpty()) {
            return "Invalid input";
        }
        

        String type = employmentType.toLowerCase().trim();

        // Branch on employment type FIRST — decides which thresholds apply
        if (type.equals("salaried")) {
            if (creditScore >= 650 && debtToIncomeRatio <= 40) {
                return "Approved";
            }
            return "Rejected";
        }

        if (type.equals("self-employed")) {
            if (creditScore >= 700 && debtToIncomeRatio <= 30) {
                return "Approved";
            }
            return "Rejected";
        }

        // Fallback: employment type not recognized
        return "Invalid input";
    }

    public static void main(String[] args){

        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter Employment Type: ");
        String employmentType = sc.nextLine();

        System.out.println("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.println("Enter Debt To Income Ratio: ");
        int debtToIncomeRatio = sc.nextInt();

        System.out.println(checkLoanApproval(employmentType,creditScore,debtToIncomeRatio));

        
    }
}
