import TaxTypes.IncomeTaxType;
import TaxTypes.ProgressiveTaxType;
import TaxTypes.TaxType;
import TaxTypes.VATaxType;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();

        TaxType taxVAT = new VATaxType();
        TaxType taxIncome = new IncomeTaxType();
        TaxType taxProgressive = new ProgressiveTaxType();

        Bill[] payments = new Bill[]{
                new Bill(10000, taxVAT, taxService),
                new Bill(10000, taxIncome, taxService),
                new Bill(10000, taxProgressive, taxService),
                new Bill(200000, taxProgressive, taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
