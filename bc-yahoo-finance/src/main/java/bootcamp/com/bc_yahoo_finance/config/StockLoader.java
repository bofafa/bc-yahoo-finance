package bootcamp.com.bc_yahoo_finance.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bootcamp.com.bc_yahoo_finance.entity.TStockEntity;
import bootcamp.com.bc_yahoo_finance.repository.StockRepository;


@Component
public class StockLoader implements CommandLineRunner {

    @Autowired
    private  StockRepository stockRepository;

 

    @Override
    public void run(String... args) throws Exception {
        List<TStockEntity> stockSymbols = List.of(
                new TStockEntity("0388.HK"),
                new TStockEntity("0700.HK"),
                new TStockEntity("0005.HK")
        );
        stockRepository.saveAll(stockSymbols);
        System.out.println("Stock symbols saved to the database.");
    }

}