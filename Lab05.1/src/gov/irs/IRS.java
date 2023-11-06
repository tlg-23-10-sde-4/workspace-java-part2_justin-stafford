package gov.irs;

public interface IRS {
    public void collectTaxes();
    public void register(TaxPayer payer);

    //static factory method to create an IRS object
    public static IRS getInstance() {
        return IRSEnum.INSTANCE;

    }
}
