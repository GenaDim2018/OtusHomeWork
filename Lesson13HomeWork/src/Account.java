import java.util.Objects;

public class Account {
    private String accountNumber;
    private String accountGoldValue;

    Account(String accountNumber, String accountGoldValue) {
        this.accountNumber =accountNumber;
        this.accountGoldValue = accountGoldValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountGoldValue);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return
                Objects.equals(accountNumber, account.accountNumber) &&
                        Objects.equals(accountGoldValue, account.accountGoldValue);
    }

    @Override
    public String toString() {
        return "Account [" + accountNumber + "]\n";
    }

    public void setAccountGoldValue(String accountGoldValue) {

        this.accountGoldValue = accountGoldValue;
    }

    public String getAccountGoldValue() {

        return accountGoldValue;
    }

    public String getAccountNumber() {

        return accountNumber;
    }
}
