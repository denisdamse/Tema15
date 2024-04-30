import java.util.ArrayList;

public class Contribuabil {
    private String numeContribuabil;
    public String getNumeContribuabil()
    {
        return this.numeContribuabil;
    }
    public ArrayList<Proprietate> listaProprietati = new ArrayList<Proprietate>();
    public void adaugaProprietate(Proprietate e)
    {
        listaProprietati.add(e);
    }
    public static int sumaTotala(ArrayList<Proprietate> listaProprietati)
    {
        int sum=0;
        for(Proprietate a: listaProprietati)
        {
            sum=sum+a.getPret();
        }
        return sum;
    }

    public static void afisareProprietati(ArrayList<Proprietate> listaProprietati)
    {
        for(Proprietate a: listaProprietati)
        {
            System.out.println(a+"\n");
        }
    }
}
