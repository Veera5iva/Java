
public class Insurance {
    private int policyNumber;
    private String policyName;
    private String policyHolderName;
    private double premium;
    private String policyType;

    public Insurance(int policyNumber, String policyName, String policyHolderName, double premium, String policyType) {
        this.policyNumber = policyNumber;
        this.policyName = policyName;
        this.policyHolderName = policyHolderName;
        this.premium = premium;
        this.policyType = policyType;
    }

    // Getter methods
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyName() {
        return policyName;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public double getPremium() {
        return premium;
    }

    public String getPolicyType() {
        return policyType;
    }

    // Setter methods
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nPolicy Name: " + policyName +
               "\nPolicy Holder Name: " + policyHolderName +
               "\nPremium: " + premium +
               "\nPolicy Type: " + policyType + "\n";
    }
}
