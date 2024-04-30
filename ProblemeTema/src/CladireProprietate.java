public class CladireProprietate extends Proprietate {
    private int suprafataCladirii;
    private static int pretPerMetruPatrat=500;
    public CladireProprietate(String stradaAdresa, int numarAdresa, int suprafataCladirii)
    {
        super(stradaAdresa, numarAdresa);
        this.suprafataCladirii=suprafataCladirii;
    }
    public int getSuprafataCladirii()
    {
        return this.suprafataCladirii;
    }

    public int getPret()
    {
        return pretPerMetruPatrat*suprafataCladirii; 
    }
    public String toString()
    {
        return "Cladire: Strada"+getStradaAdresa()+" nr. "+getNumarAdresa()+"\n"+" Suprafata: "+suprafataCladirii+" Pret: "+getPret();
    }
}
