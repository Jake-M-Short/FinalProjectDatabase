package App.Application.Controllers;
import App.Domain.Transaction;
import App.Infrastructure.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Transactions")
public class TransactionController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private TransactionRepository transactionRepository;

    public TransactionController() {this.transactionRepository = new TransactionRepository();}

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Transaction> get(){
        this.transactionRepository.setDatabaseConnection(this.databaseConnection);
        return this.transactionRepository.get();
    }

    @GetMapping("/{TransactionID}")
    @ResponseStatus(HttpStatus.OK)
    public List<Transaction> get(@PathVariable("TransactionID") String TransactionID){
        this.transactionRepository.setDatabaseConnection(this.databaseConnection);
        return this.transactionRepository.get(TransactionID);
    }

    @PutMapping("/{TransactionID}")
    @ResponseStatus(HttpStatus.OK)
    public void put(@PathVariable("TransactionID") String TransactionID, @RequestBody() Transaction transaction){
        this.transactionRepository.setDatabaseConnection(this.databaseConnection);
        this.transactionRepository.update(TransactionID, transaction);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody() Transaction transaction){
        this.transactionRepository.setDatabaseConnection(this.databaseConnection);
        this.transactionRepository.create(transaction);
    }

    @DeleteMapping("/{TransactionID}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("TransactionID") String TransactionID){
        this.transactionRepository.setDatabaseConnection(this.databaseConnection);
        this.transactionRepository.delete(TransactionID);
    }




}
