package App.Infrastructure;


import App.Domain.ITransactionRepository;
import App.Domain.Transaction;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TransactionRepository implements ITransactionRepository {

    private JdbcTemplate databaseConnection;

    @Override
    public Transaction create(Transaction transaction) {
        String sql = "INSERT INTO JS156724.TRANSACTIONS " + // Added space here
                "VALUES ('"
                + transaction.getTransactionID() + "', '"
                + transaction.getPrice() + "', '"
                + transaction.getTransactionDate() + "', '"
                + transaction.getShippingInfo() + "', '"
                + transaction.getUsername() + "', '"
                + transaction.getGame() + " ');";

        this.databaseConnection.execute(sql);
        return transaction;
    }

    @Override
    public int update(String id, Transaction transaction) {
        String sql = "UPDATE JS156724.TRANSACTIONS SET TransactionID = " + transaction.getTransactionID() + ", " +
                "Price = '" + transaction.getPrice() + "', " +
                "TransactionDate = '" + transaction.getTransactionDate() + "', " +
                "ShippingInfo = '" + transaction.getShippingInfo() + "', " +
                "Username = '" + transaction.getUsername() + "', " +
                "Game = '" + transaction.getGame() + "' " +
                "WHERE TransactionID = '" + id + "'";
        return this.databaseConnection.update(sql);
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE FROM JS156724.TRANSACTIONS WHERE TransactionID = '" + id + "'";
        int rowsAffected = this.databaseConnection.update(sql);
        return rowsAffected > 0;
    }

    @Override
    public List<Transaction> get(String id) {
        String sql = "SELECT * FROM JS156724.TRANSACTIONS WHERE TransactionID = '" + id + "';";
        List<Transaction> transactions = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Transaction.class));
        return transactions;
    }

    @Override
    public List<Transaction> get() {
        String sql = "SELECT * FROM JS156724.TRANSACTIONS;";
        List<Transaction> transactions = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Transaction.class));
        return transactions;
    }

    @Override
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
}
