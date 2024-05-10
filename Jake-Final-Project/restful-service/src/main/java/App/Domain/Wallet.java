package App.Domain;

public class Wallet {
    private String Username;
    private float Balance;

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }
    public String getUsername() {return this.Username;}
    public float getBalance() {return this.Balance;}

}