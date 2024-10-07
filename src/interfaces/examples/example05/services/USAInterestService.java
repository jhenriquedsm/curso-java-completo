package interfaces.examples.example05.services;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService{
    private Double interestRate;

    public USAInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}