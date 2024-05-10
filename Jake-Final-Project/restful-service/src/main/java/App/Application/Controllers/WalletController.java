package App.Application.Controllers;

import App.Domain.CommunityBoard;
import App.Domain.Wallet;
import App.Infrastructure.CommunityBoardRepository;
import App.Infrastructure.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Wallet")
public class WalletController {
    @Autowired
    private JdbcTemplate databaseConnection;

    private WalletRepository walletRepository;

    public WalletController() {this.walletRepository = new WalletRepository();}

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Wallet> get(){
        this.walletRepository.setDatabaseConnection(this.databaseConnection);
        return this.walletRepository.get();
    }

    @GetMapping("/{Username}")
    @ResponseStatus(HttpStatus.OK)
    public List<Wallet> get(@PathVariable("Username") String Username){
        this.walletRepository.setDatabaseConnection(this.databaseConnection);
        return this.walletRepository.get(Username);
    }

    @PutMapping("/{Username}")
    @ResponseStatus(HttpStatus.OK)
    public void put(@PathVariable("Username") String Username, @RequestBody() Wallet wallet){
        this.walletRepository.setDatabaseConnection(this.databaseConnection);
        this.walletRepository.update(Username, wallet);
    }




    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody() Wallet wallet){
        this.walletRepository.setDatabaseConnection(this.databaseConnection);
        this.walletRepository.create(wallet);
    }

    @DeleteMapping("/{Username}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("Username") String Username){
        this.walletRepository.setDatabaseConnection(this.databaseConnection);
        this.walletRepository.delete(Username);
    }




}
