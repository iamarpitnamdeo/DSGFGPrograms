package DesignPatterns.Builders.practicalFactory;

public class TaxCalculator {
    int calculateTax(SalaryDetails salaryDetils, TaxRegime taxRegime){
       /* if(taxRegime == TaxRegime.OLD){
            int taxamount=0;

                taxamount += (salaryDetils.hra*30)/100+
                        (salaryDetils.basePay*40)/100;
                return taxamount;
        }else {
            int taxamount = 0;
            taxamount += (salaryDetils.hra+salaryDetils.lta*30)/100+
                    (salaryDetils.basePay*40)/100;
            return taxamount;
        }*/
        /*------------------------------*/

       /*  TaxCalculationAlgorithm taxCalculationAlgorithm;
       if(taxRegime == TaxRegime.OLD){
            taxCalculationAlgorithm = new OldRegimeTaxCalculationAlgorithm();
        }else if(taxRegime == TaxRegime.NEW){
            taxCalculationAlgorithm = new NewRegimeTaxCalcuationAlgorithm();
        }else {
            throw new IllegalArgumentException();
        }

       return taxCalculationAlgorithm.calculateTax(salaryDetils);*/
        /*------------------------------*/
        TaxCalculationAlgorithm taxCalculationAlgorithm =
                TaxCalculationAlgorithmFactory.getTaxCalcuationAlgorithmForRegime(taxRegime);
        return taxCalculationAlgorithm.calculateTax(salaryDetils);
    }

}
