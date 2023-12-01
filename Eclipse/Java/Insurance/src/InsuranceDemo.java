import java.util.Scanner;

public class InsuranceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance[] policies = new Insurance[100]; // Maximum number of policies

        int policyCount = 0;

        while (true) {
            System.out.println("Sample Menu:");
            System.out.println("1. Add Policy");
            System.out.println("2. Pay Premium");
            System.out.println("3. Display All Policies");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Policy Number: ");
                        int policyNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        // Check for duplicate policy number
                        for (int i = 0; i < policyCount; i++) 
                        {
                            if (policies[i] != null && policies[i].getPolicyNumber() == policyNumber) {
                                throw new DuplicatePolicyNumberException("Policy number duplicate exception.");
                            }
                        }

                        System.out.print("Enter Policy Name: ");
                        String policyName = scanner.nextLine();

                        System.out.print("Enter Policy Holder Name: ");
                        String policyHolderName = scanner.nextLine();

                        System.out.print("Enter Premium: ");
                        double premium = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character

                        System.out.print("Enter Policy Type (VehicleInsurance or PersonalInsurance): ");
                        String policyType = scanner.nextLine();

                        Insurance newPolicy = new Insurance(policyNumber, policyName, policyHolderName, premium, policyType);
                        policies[policyCount] = newPolicy;
                        policyCount++;
                        System.out.println("Policy added successfully.");
                    } catch (DuplicatePolicyNumberException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter Policy Number for Premium Payment: ");
                    int paymentPolicyNumber = scanner.nextInt();
                    System.out.print("Enter Premium Amount to Add: ");
                    double premiumToAdd = scanner.nextDouble();

                    for (int i = 0; i < policyCount; i++) {
                        if (policies[i] != null && policies[i].getPolicyNumber() == paymentPolicyNumber) 
                        {
                            policies[i].setPremium(policies[i].getPremium() + premiumToAdd);
                            System.out.println("Premium payment processed successfully.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("All Policies:");
                    for (int i = 0; i < policyCount; i++) {
                        if (policies[i] != null) {
                            System.out.println(policies[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the insurance portal.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
