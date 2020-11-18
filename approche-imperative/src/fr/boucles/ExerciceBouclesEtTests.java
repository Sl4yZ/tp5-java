package fr.boucles;

public class ExerciceBouclesEtTests {
    private int[] array;

    public void init()
    {
        array = new int[]{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
    }

    public void Afficher_l_ensemble_des_éléments_du_tableau()
    {
        for (int a : array)
            System.out.println(a);
    }

    public void Afficher_l_ensemble_des_éléments_du_tableau_reverse()
    {
       for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);
    }

    public void Afficher_entiers_superieurs_a_3()
    {
        for (int a : array)
            if (a > 3)
                System.out.println(a);
    }

    public void Afficher_entiers_pairs()
    {
        for (int a : array)
            if (a % 2 == 0)
                System.out.println(a);
    }

    public void Afficher_index_entiers_pairs()
    {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                System.out.println(array[i]);
        }
    }

    public void Afficher_entiers_impairs()
    {
        for (int a : array)
            if (a % 2 != 0)
                System.out.println(a);
    }
}
