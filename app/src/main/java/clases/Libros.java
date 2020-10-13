package clases;

public class Libros {

    //Declaracion de datos.

    private int Farenheith;
    private int Revival;
    private int El_Alquimista;
    private int El_Poder;
    private int Despertar;
//
    //Constructores
    public Libros()
    {
        Farenheith=7000;
        Revival=22000;
        El_Alquimista=45000;
        El_Poder=88000;
        Despertar=156000;
    }
    //Accesadores

    public int getFarenheith()
    {
        return Farenheith;
    }
    public int getEl_Alquimista()
    {
        return El_Alquimista;
    }
    public int getRevival()
    {
        return Revival;
    }
    public int getDespertar()
    {
        return Despertar;
    }
    public int getEl_Poder()
    {
        return El_Poder;
    }
}
