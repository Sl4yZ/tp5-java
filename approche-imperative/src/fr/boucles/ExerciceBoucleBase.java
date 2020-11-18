package fr.boucles;

public class ExerciceBoucleBase {

    public static void Affichez_tous_les_nombres_de_1_a_10()
    {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }
    public static void Affichez_20_fois_votre_nom_et_votre_prénom()
    {
        String nom_prenom = "CHAREF Zayed";

        for (int i = 0; i < 20; i++)
            System.out.println(nom_prenom);
    }

    public static void Affichez_les_éléments_pairs_de_2_à_100()
    {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void Affichez_les_éléments_impairs_de_1_à_99()
    {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
