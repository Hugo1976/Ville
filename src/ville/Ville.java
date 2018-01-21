/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ville;

/**
 *
 * @author Hugo
 */
public class Ville {    //déclaration des variables
    
    /*
    Variables Publiques
    */
    // Variable publique comptant les instances 
    public static int nbreInstances = 0;
    
    /*
        Variables privées
    */
    // Variable privée qui comptera aussi les instances
    private static int nbreInstancesBis = 0;
    // Autres variables
    private String nomVille;    //Nom de la ville
    private String nomPays;     //Nom du Pays
    private long nbrHabitants;   //Nombre d'habitants
    private int dateRessencement; //Date du recencement pris en compte pour la population
    private char categorie;        //catégorie de la ville en focntin de la population
    
    //Constructeur par défaut (instanciation sans paramètres)
    public Ville(){
        //incrémentation à chaque appel aux constructeurs
        nbreInstances++;
        nbreInstancesBis++;
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbrHabitants = 0;
        dateRessencement = 0;
        this.setCategorie();
    }
    
    //Constructeur avec paramètres
    public Ville(String pNom, long pNbre, String pPays, int pDate){
        //incrémentation à chaque appel aux constructeurs
        nbreInstances++;
        nbreInstancesBis++;
        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbrHabitants = pNbre;
        dateRessencement = pDate;
        this.setCategorie();
    }
    
    //*********************Les ACCESSEURS**********************
    // Retourne le nom de la ville
    public String getNom() {
        return nomVille;
    }
    // Retourne le nom du pays
    public String getNomPays(){
        return nomPays;
    }
    // Retourne La population
    public long getNombreHabitants() {
             return nbrHabitants;
    }
    // Retourne l'année de référence du ressencement
    public int getDateRessencement() {
        return dateRessencement;
    }
    // Retourne la catégorie de la ville
    public char getCategorie(){
        return categorie;
    }
    //Retourne le nombre d'instances
    public static int getNombreInstancesBis(){
        return nbreInstancesBis;
    }
    //*******************Les Mutateurs***************************
    //Définit le nom de la ville
    public void setNom(String pNom){
        nomVille = pNom;
    }
    //Définit le nom du Pays
    public void setNomPays(String pPays){
        nomPays = pPays;
    }
    //Définit la population
    public void setNombreHabitants(long nbre){
        nbrHabitants = nbre;
        this.setCategorie();
    }
    //Définit la date du recencement INSEE
    public void setDateRessencement(int pDate){
        dateRessencement = pDate;
    }
    //Définit la catégorie de la ville
    private void setCategorie(){
        int bornesSupérieures[] = {0,1000,10000,100000,500000,1000000,5000000,10000000};
        char categorie[] = {'?','A','B','C','D','E','F','G','H'};
        
        int i =0;
        while (i < bornesSupérieures.length && this.nbrHabitants > bornesSupérieures[i])
                i++;
        this.categorie = categorie[i];
    }
    
    // Retourne la description de la ville
    public String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+" au dernier recencement de "+this.dateRessencement
        +" elle comportait "+this.nbrHabitants+" habitant(s) => elle est donc de catégorie: "+this.categorie;        
    }
    // retourne une chaine de caracrtère selon le résultat de la comparaison
    public String comparer(Ville v1){
        String str = new String();
        if (v1.getNombreHabitants() > this.nbrHabitants)
            str = v1.getNom()+" est une ville plus peuplée que "+ this.nomVille;
        else
            str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();
        return str;
    }
}
    

    