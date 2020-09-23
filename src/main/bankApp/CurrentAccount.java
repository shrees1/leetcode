public class CurrentAccount extends BankAccount {
    @Override
    public Double getMinimumBalance() {
        return 20000.0;
    }

    @Override
    public Double getCurrentBalance() {
        return null;
    }

    @Override
    public Double getInterestRate() {
        return 0.0;
    }

    @Override
    public String getType() {
        return "Current";
    }
}
