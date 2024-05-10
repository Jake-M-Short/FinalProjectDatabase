package App.Application.Controllers;

import App.Domain.Game;
import App.Domain.Transaction;
import App.Infrastructure.GameRepository;
import App.Infrastructure.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/Game")
public class GameController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private GameRepository gameRepository;

    public GameController() {this.gameRepository = new GameRepository();}

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> get(){
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        return this.gameRepository.get();
    }

    @GetMapping("/{GameName}")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> get(@PathVariable("GameName") String GameName){
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        return this.gameRepository.get(GameName);
    }

    @PutMapping("/{GameName}")
    @ResponseStatus(HttpStatus.OK)
    public void put(@PathVariable("GameName") String GameName, @RequestBody() Game game){
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        this.gameRepository.update(GameName, game);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody() Game game){
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        this.gameRepository.create(game);
    }

    @DeleteMapping("/{GameName}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("GameName") String GameName){
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        this.gameRepository.delete(GameName);
    }

    @GetMapping("/OrderedByName")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getGamesOrderedByName() {
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        return this.gameRepository.getOrderedByName();
    }

    @GetMapping("/ByGenreAndPlatform")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getByGenreAndPlatform(@RequestParam String Genre, @RequestParam String Platform) {
        this.gameRepository.setDatabaseConnection(this.databaseConnection);
        return this.gameRepository.getGamesByGenreAndPlatform(Genre, Platform);
    }

}
