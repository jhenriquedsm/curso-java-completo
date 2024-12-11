package programacaoFuncional.example03.util;

import programacaoFuncional.example03.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}