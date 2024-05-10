package App.Domain;

public class Transaction {
    private int TransactionID;
    private int Price;
    private String TransactionDate;
    private String ShippingInfo;
    private String Username;
    private String Game;

    public void setTransactionID(int TransactionID) {this.TransactionID = TransactionID;}

    public void setPrice(int Price) {this.Price = Price;}

    public void setTransactionDate(String TransactionDate) {this.TransactionDate = TransactionDate;}

    public void setShippingInfo(String ShippingInfo) {this.ShippingInfo = ShippingInfo;}

    public void setUsername(String username) {this.Username = username;}

    public void setGame(String game) {this.Game = game;}

    public int getTransactionID() {return this.TransactionID;}

    public int getPrice() {return this.Price;}

    public String getTransactionDate() {return this.TransactionDate;}

    public String getShippingInfo() {return this.ShippingInfo;}

    public String getUsername() {return this.Username;}

    public String getGame() {return this.Game;}

}
