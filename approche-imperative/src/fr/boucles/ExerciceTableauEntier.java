package fr.boucles;

public class ExerciceTableauEntier {

    private int[] tab;

    public void init()
    {
        tab = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    }

    public void Affichez_le_premier_élément_du_tableau()
    {
        System.out.println(tab[0]);
    }

    public void Affichez_la_longueur_du_tableau()
    {
        System.out.println(tab.length);
    }

    public void Affichez_le_dernier_élément_du_tableau()
    {
        System.out.println(tab[tab.length - 1]);
    }

    public void Modifier_index_4_par_8()
    {
        tab[4] = 8;
    }
}
