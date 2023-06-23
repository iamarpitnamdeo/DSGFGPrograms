package DesignPatterns.Builders.practicalFactory;

public class TaxCalculationAlgorithmFactory {
    public static TaxCalculationAlgorithm getTaxCalcuationAlgorithmForRegime(TaxRegime regime){
        if(regime==TaxRegime.NEW)
            return new NewRegimeTaxCalcuationAlgorithm();
        else
            return new OldRegimeTaxCalculationAlgorithm();
    }
}
