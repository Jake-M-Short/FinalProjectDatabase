package App.Infrastructure;

import App.Domain.Game;
import App.Domain.IGameRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class GameRepository implements IGameRepository {
    private JdbcTemplate databaseConnection;

    @Override
    public Game create(Game game) {
        String sql = "INSERT INTO JS156724.GAME VALUES ('" + game.getGameName() + "', '" + game.getDescription() + "', '" + game.getPrice() + "', '" + game.getPlatform() +  "', '" + game.getReleaseDate() + "', '" + game.getGenre() +  "', '" + game.getDevID() + "');";
        this.databaseConnection.execute(sql);
        return game;
    }

    @Override
    public int update(String id, Game game) {
        String sql = "UPDATE JS156724.GAME SET GameName = '" + game.getGameName() + "', Description = '" + game.getDescription() + "', Price = '" + game.getPrice() + "', Platform = '" +  game.getPlatform() + "', ReleaseDate = '" + game.getReleaseDate() + "', Genre = '" + game.getGenre() + "', DevID = '"+ game.getDevID() +  "' WHERE GameName = '" + id + "';";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(String GameName) {
        String sql = "DELETE FROM JS156724.GAME WHERE GameName = '" + GameName + "';";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public List<Game> get(String GameName) {
        String sql = "SELECT * FROM JS156724.GAME WHERE GameName = '" + GameName + "';";
        List<Game> games = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Game.class));
        return games;
    }

    @Override
    public List<Game> get() {
        String sql = "SELECT * FROM JS156724.GAME;";
        List<Game> games = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Game.class));
        return games;
    }

    @Override
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public List<Game> getOrderedByName() {
        String sql = "SELECT * FROM JS156724.GAME ORDER BY GameName;";
        List<Game> games = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Game.class));
        return games;
    }

    public List<Game> getGamesByGenreAndPlatform(String Genre, String Platform) {
        String sql = "SELECT * FROM JS156724.GAME WHERE Genre = ? AND Platform = ?";
        List<Game> games = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(Game.class), Genre, Platform);
        return games;
    }

}
