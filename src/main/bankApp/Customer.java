import java.util.List;

public class Customer{
private List<BankAccount> accounts;
private String panNumber;

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getPanNumber() {
        return panNumber;
    }
}