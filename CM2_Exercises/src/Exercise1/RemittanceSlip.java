package Exercise1;
import java.time.LocalDate;

class RemittanceSlip {
    public static void main(String[] args) {
        // Variables
        String bankName = "Global Bank";
        int bankID = 12345;
        LocalDate date = LocalDate.now();
        String accountHolder = "Anna";
        String RIB = "FR1234567812345678";
        char transferType = 'C';  // 'C' for credit
        char currencySymbol = '\u20AC';  // Euro symbol
        double amount = 1000.00;
        boolean priorityTransfer = true;

        // Output remittance slip
        System.out.println("----- Remittance Slip -----");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Bank ID: " + bankID);
        System.out.println("Date: " + date);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + RIB);
        System.out.println("Transfer Type: "
                + "Credit");
        System.out.println("Currency: " + currencySymbol);
        System.out.println("Amount: " + amount + " " + currencySymbol);
        System.out.println("Priority Transfer: "
                + "Yes");
        System.out.println("---------------------------");
    }
}