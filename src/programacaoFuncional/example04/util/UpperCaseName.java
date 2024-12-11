package programacaoFuncional.example04.util;

import programacaoFuncional.example04.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
