    public class Transaction {
        private String transactionId;
        private Double amount;
        private String type;

        public Transaction(String transactionId, Double amount, String type) {
            this.transactionId = transactionId;
            this.amount = amount;
            this.type = type;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public Double getAmount() {
            return amount;
        }

        public String getType() {
            return type;
        }
    }
