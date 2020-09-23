import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private String accountNumber;
    private Double minimumBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    private Double currentBalance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMinimumBalance(Double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    private Double interestRate;
    private List<Transaction> transactions;

    public Double withdraw(Double amount) throws Exception {
        if (currentBalance < minimumBalance) {
            throw new Exception("Insufficient Balance");
        }
        currentBalance = currentBalance - amount;
        Transaction transaction = new Transaction("1", currentBalance, "withdraw");

        transactions.add(transaction);
        return currentBalance;
    }


    public Double deposit(Double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount to be deposited can't be less than zero");
        } else {
            currentBalance = currentBalance + amount;
            Transaction transaction = new Transaction("2", currentBalance, "deposit");

            transactions.add(transaction);
            return currentBalance;
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactions;
    }

    public List<Transaction> getMiniStatement() {
        List<Transaction> lastTenTransaction = new ArrayList<>();
        for (int i = transactions.size(); i > transactions.size() - 10; i--) {
            lastTenTransaction.add(transactions.get(i));
        }
        return lastTenTransaction;
    }

    public abstract Double getMinimumBalance();

    public abstract Double getCurrentBalance();

    public abstract Double getInterestRate();

    public abstract String getType();
}