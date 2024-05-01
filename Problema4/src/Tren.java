public class Tren {
    private Vagon[] tren = new Vagon[15];
    public Vagon[] getTren()
    {
        return this.tren;
    }
    

    public static int numarTotalColete(Tren t)
    {
        int suma=0;
        for(Vagon v:t.tren)
        {
            suma=suma+v.getNumerColetePostale();
        }
        return suma;
    }
}
