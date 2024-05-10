package App.Infrastructure;

import App.Domain.CommunityBoard;
import App.Domain.ICommunityBoardRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CommunityBoardRepository implements ICommunityBoardRepository {

    private JdbcTemplate databaseConnection;

    @Override
    public CommunityBoard create(CommunityBoard communityBoard) {
        String sql = "INSERT INTO JS156724.COMMUNITYBOARD VALUES ('" + communityBoard.getBoardID() + "', '" + communityBoard.getUsername() + "', '" + communityBoard.getTitle() + "', '" + communityBoard.getDescription() +  "', '" + communityBoard.getCreationTimestamp() + "', '" + communityBoard.getComments() + "');";
        this.databaseConnection.execute(sql);
        return communityBoard;
    }

    @Override
    public int update(String id, CommunityBoard communityBoard) {
        String sql = "UPDATE JS156724.COMMUNITYBOARD SET BoardID = '" + communityBoard.getBoardID() + "', Username = '" + communityBoard.getUsername() + "', Title = '" + communityBoard.getTitle() + "', Description = '" +  communityBoard.getDescription() + "', CreationTimestamp = '" + communityBoard.getCreationTimestamp() + "', Comments = '" + communityBoard.getComments() +  "' WHERE BoardID = '" + id + "';";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE FROM JS156724.COMMUNITYBOARD WHERE BoardID = '" + id + "';";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public List<CommunityBoard> get(String id) {
        String sql = "SELECT * FROM JS156724.GAME WHERE BoardID = '" + id + "';";
        List<CommunityBoard> communityBoards = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(CommunityBoard.class));
        return communityBoards;
    }

    @Override
    public List<CommunityBoard> get() {
        String sql = "SELECT * FROM JS156724.COMMUNITYBOARD;";
        List<CommunityBoard> communityBoards = this.databaseConnection.query(sql, BeanPropertyRowMapper.newInstance(CommunityBoard.class));
        return communityBoards;
    }

    @Override
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
}
