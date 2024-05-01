public abstract class Calatori extends Vagon{
    private int numarPasageri;
    public Calatori(int numarColetePostale,int numarPasageri)
    {
        super(numarColetePostale);
        this.numarPasageri=numarPasageri;
    }

    public int getnumarPasageri()
    {
        return this.numarPasageri;
    }

    public void deschideUsile()
    {
        System.out.println("Deschide Usile");
    }
    public void inchideUsile()
    {
        System.out.println("Inchide Usile");
    }
}
