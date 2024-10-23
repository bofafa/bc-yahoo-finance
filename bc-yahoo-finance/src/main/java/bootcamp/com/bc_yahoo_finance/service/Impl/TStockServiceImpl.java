package bootcamp.com.bc_yahoo_finance.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.com.bc_yahoo_finance.infra.yahoo.CookieManager;
import bootcamp.com.bc_yahoo_finance.model.TStockDTO;
import bootcamp.com.bc_yahoo_finance.service.TStockService;

@Service
public class TStockServiceImpl implements TStockService {

  @Autowired
  private final CookieManager cookieManager;

  // Constructor injection for CookieManager
  public TStockServiceImpl(CookieManager cookieManager) {
      this.cookieManager = cookieManager;
  }

  @Override
  public List<TStockDTO> getTStockDTO() {
      throw new UnsupportedOperationException("Unimplemented method 'getTStockDTO'");
  }

//   @Override
//   public String getYahooCookies() {
//       return cookieManager.getCookieString();
  }


