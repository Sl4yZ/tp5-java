package approcheimperative.idea;

import approcheimperative.compiler.DeclarationApp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//	    DeclarationApp.main( args );
        System.out.println("Bienvenue dans mon application!");
        String name;
        System.out.print("Entrer vote nom : ");
        Scanner sc = new Scanner( System.in );
        name = sc.nextLine();
        sc.close();
        System.out.println("Bienvenue '"+name+"'");
    }
}
