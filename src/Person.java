public class Person {
    private Status status;
    private String fullName;
    private String bankAccount;

    public Person(Status status, String fullName, String bankAccount) {
        this.status = status;
        this.fullName = fullName;
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person " +
                "status " + status +
                "fullName " + fullName +
                "bankAccount " + bankAccount +
                "";
    }
}
