package poo.membrosEstaticos.exercises;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double converterReal(double dollar, double dollars){
        return (dollar * dollars) + (dollar * dollars) * IOF;
    }
}
