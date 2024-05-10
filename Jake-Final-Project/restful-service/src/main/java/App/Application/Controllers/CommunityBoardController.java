package App.Application.Controllers;

import App.Domain.CommunityBoard;
import App.Domain.Game;
import App.Infrastructure.CommunityBoardRepository;
import App.Infrastructure.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CommunityBoard")
public class CommunityBoardController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private CommunityBoardRepository communityBoardRepository;

    public CommunityBoardController() {this.communityBoardRepository = new CommunityBoardRepository();}

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<CommunityBoard> get(){
        this.communityBoardRepository.setDatabaseConnection(this.databaseConnection);
        return this.communityBoardRepository.get();
    }

    @GetMapping("/{BoardID}")
    @ResponseStatus(HttpStatus.OK)
    public List<CommunityBoard> get(@PathVariable("BoardID") String BoardID){
        this.communityBoardRepository.setDatabaseConnection(this.databaseConnection);
        return this.communityBoardRepository.get(BoardID);
    }

    @PutMapping("/{BoardID}")
    @ResponseStatus(HttpStatus.OK)
    public void put(@PathVariable("BoardID") String BoardID, @RequestBody() CommunityBoard communityBoard){
        this.communityBoardRepository.setDatabaseConnection(this.databaseConnection);
        this.communityBoardRepository.update(BoardID, communityBoard);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody() CommunityBoard communityBoard){
        this.communityBoardRepository.setDatabaseConnection(this.databaseConnection);
        this.communityBoardRepository.create(communityBoard);
    }

    @DeleteMapping("/{BoardID}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("BoardID") String BoardID){
        this.communityBoardRepository.setDatabaseConnection(this.databaseConnection);
        this.communityBoardRepository.delete(BoardID);
    }
}
