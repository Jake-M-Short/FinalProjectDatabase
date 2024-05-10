package App.Infrastructure;

import App.Domain.IWalletRepository;
import App.Domain.Wallet;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class WalletRepository implements IWalletRepository {

    private JdbcTemplate databaseConnection;
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {this.databaseConnection = databaseConnection;}



    @Override
    public Wallet create(Wallet wallet) {
        String sql = "INSERT INTO JS156724.WALLET VALUES ('" + wallet.getUsername() + "', '" + wallet.getBalance() + "');";
        this.databaseConnection.execute(sql);
        return wallet;
    }

    @Override
    public int update(String Username, Wallet wallet) {
        String sql = "UPDATE JS156724.WALLET SET Username = '" + wallet.getUsername() + "', Balance = '" + wallet.getBalance() + "' WHERE Username = '" + Username + "';";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE FROM JS156724.WALLET WHERE Username = '" + id + "';";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public List<Wallet> get(String id){
        String sql = "SELECT * FROM JS156724.WALLET WHERE Username = " + id + ";";
        List<Wallet> wallet = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Wallet.class));
        return wallet;
    }

    @Override
    public List<Wallet> get() {
        String sql = "SELECT * FROM JS156724.WALLET;";
        List<Wallet> wallet = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Wallet.class));
        return wallet;
    }





}
