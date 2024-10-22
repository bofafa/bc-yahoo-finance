package bootcamp.com.bc_yahoo_finance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import bootcamp.com.bc_yahoo_finance.model.TStockDTO;

@Service
public interface TStockService {
    List <TStockDTO> getTStockDTO();
}
