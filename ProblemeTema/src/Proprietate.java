public abstract class Proprietate {
    private String stradaAdresa;
    private int numarAdresa;
    public Proprietate(String stradaAdresa, int numarAdresa)
    {
        this.stradaAdresa=stradaAdresa;
        this.numarAdresa=numarAdresa;
    }

    public String getStradaAdresa()
    {
        return this.stradaAdresa;
    }

    public int getNumarAdresa()
    {
        return this.numarAdresa;
    }

    public abstract int getPret();
}