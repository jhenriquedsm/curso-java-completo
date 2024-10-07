package interfaces.examples.example05.services;

import java.security.InvalidParameterException;

public class BrazilianInterestService implements InterestService{
    private Double interestRate;

    public BrazilianInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.1 + interestRate / 100.0, months); //potenciação
    }
}