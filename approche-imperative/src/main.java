import fr.boucles.ExerciceBouclesEtTests;
import fr.boucles.ExerciceTableauEntier;

class App {
    public static void main(String[] args) {
        System.out.println("# ExerciceBoucleBase");
        System.out.println("## Affichez_tous_les_nombres_de_1_a_10: ");
        fr.boucles.ExerciceBoucleBase.Affichez_tous_les_nombres_de_1_a_10();
        System.out.println("## Affichez_20_fois_votre_nom_et_votre_prénom: ");
        fr.boucles.ExerciceBoucleBase.Affichez_20_fois_votre_nom_et_votre_prénom();
        System.out.println("## Affichez_les_éléments_pairs_de_2_à_100: ");
        fr.boucles.ExerciceBoucleBase.Affichez_les_éléments_pairs_de_2_à_100();
        System.out.println("## Affichez_les_éléments_impairs_de_1_à_99: ");
        fr.boucles.ExerciceBoucleBase.Affichez_les_éléments_impairs_de_1_à_99();
        System.out.println("# Fin ExerciceBoucleBase");

        System.out.println("# ExerciceTableauEntier");
        System.out.println("## Initialisation du tableau (invisible) ");
        fr.boucles.ExerciceTableauEntier tab = new ExerciceTableauEntier();
        tab.init();
        System.out.println("## Affichez_le_premier_élément_du_tableau: ");
        tab.Affichez_le_premier_élément_du_tableau();
        System.out.println("## Affichez_la_longueur_du_tableau: ");
        tab.Affichez_la_longueur_du_tableau();
        System.out.println("## Affichez_le_dernier_élément_du_tableau: ");
        tab.Affichez_le_dernier_élément_du_tableau();
        System.out.println("# Fin ExerciceTableauEntier");

        System.out.println("# ExerciceBouclesEtTests");
        fr.boucles.ExerciceBouclesEtTests tab2 = new ExerciceBouclesEtTests();
        tab2.init();
        System.out.println("## Afficher_l_ensemble_des_éléments_du_tableau: ");
        tab2.Afficher_l_ensemble_des_éléments_du_tableau();
        System.out.println("## Afficher_l_ensemble_des_éléments_du_tableau_reverse: ");
        tab2.Afficher_l_ensemble_des_éléments_du_tableau_reverse();
        System.out.println("## Afficher_entiers_superieurs_a_3: ");
        tab2.Afficher_entiers_superieurs_a_3();
        System.out.println("## Afficher_entiers_pairs: ");
        tab2.Afficher_entiers_pairs();
        System.out.println("## Afficher_index_entiers_pairs: ");
        tab2.Afficher_index_entiers_pairs();
        System.out.println("## Afficher_entiers_impairs: ");
        tab2.Afficher_entiers_impairs();
        System.out.println("# Fin ExerciceBouclesEtTests");
    }
}