package bootcamp.com.bc_yahoo_finance.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TStockDTO{
  Long id;
  String symbol;
}
