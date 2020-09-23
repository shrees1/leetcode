import java.util.List;

public class Branch {
    private List<BankAccount> bankAccounts;
    private List<Customer> customers;
    private String branchId;

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public String getBranchId() {
        return branchId;
    }

    public void createBankAccount(String panNumber, String type, Double amount) {
        Customer customer = null;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getPanNumber().equals(panNumber)) {
                customer = customers.get(i);
            }
        }
        if (customer == null) {
            customer = new Customer();
            customers.add(customer);
        }
        Integer accountNumber = bankAccounts.size() + 1;
        BankAccount bankAccount;
        if (type == "Saving") {
            bankAccount = new SavingsAccount();
            bankAccount.setAccountNumber(accountNumber.toString());
            bankAccount.setCurrentBalance(amount);
        } else {
            bankAccount = new CurrentAccount();
            bankAccount.setAccountNumber(accountNumber.toString());
            bankAccount.setCurrentBalance(amount);
        }
        customer.getAccounts().add(bankAccount);
        bankAccounts.add(bankAccount);
    }

    public Customer getCustomerByPan(String panNumber) throws Exception {
        Customer customer = null;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getPanNumber().equals(panNumber)) {
                customer = customers.get(i);
            } else {
                throw new Exception("No such customer found");

            }
        }
        return customer;
    }

    public BankAccount getAccountByAccountNumber(String accountNumber) throws Exception {
        BankAccount bankAccount = null;
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                bankAccount = bankAccounts.get(i);
            } else {
                throw new Exception("No such bank account exists");
            }
        }
        return bankAccount;
    }
}

