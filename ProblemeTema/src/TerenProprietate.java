public class TerenProprietate extends Proprietate{
    private int suprafataTerenului;
    private RangLocalitate rang;
    private static int pretPerMetruPatrat=350;
    public TerenProprietate(String stradaAdresa, int numarAdresa,int suprafataTerenului,RangLocalitate rang)
    {
        super(stradaAdresa, numarAdresa);
        this.suprafataTerenului=suprafataTerenului;
        this.rang=rang;
    }
    public int getSuprafataTerenului()
    {
        return this.suprafataTerenului;
    }
    public int getPret()
    {
        return pretPerMetruPatrat*suprafataTerenului/rang.getRanglocalitate(); 
    }
    public String toString()
    {
        return "Cladire: Strada"+getStradaAdresa()+" nr. "+getNumarAdresa()+"\n"+" Suprafata: "+suprafataTerenului+" Rang: "+rang+" Pret: "+getPret();
    }
}
