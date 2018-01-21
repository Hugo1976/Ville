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
public class ClasseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ville v = new Ville();
        System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.nbreInstances);
        System.out.println("Le nombre d'instances Bis de la classe Ville est : "+Ville.getNombreInstancesBis());
        Ville v1 = new Ville("Marseille",858120,"France",2010);
        System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.nbreInstances);
        System.out.println("Le nombre d'instances Bis de la classe Ville est : "+Ville.getNombreInstancesBis());
        Ville v2 = new Ville("Berlin",3520031,"Allemagne",2015);
        System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.nbreInstances);
        System.out.println("Le nombre d'instances Bis de la classe Ville est : "+Ville.getNombreInstancesBis());
        
        System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()
        + " habitants se situant en "+v.getNomPays()+" dernier recencement "+v.getDateRessencement());
        
        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()
        + " habitants se situant en "+v1.getNomPays()+" dernier recencement "+v1.getDateRessencement());
        
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()
        + " habitants se situant en "+v2.getNomPays()+" dernier recencement "+v2.getDateRessencement()+"\n\n");
    
    /* 
        Intervertion des villes v1 et v2 au travers d'un autre objet ville
    */
    
    Ville temp = new Ville();
    temp = v1;
    v1 = v2;
    v2 = temp;
    
    System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()
        + " habitants se situant en "+v1.getNomPays()+" dernier recencement "+v1.getDateRessencement());
        
    System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()
        + " habitants se situant en "+v2.getNomPays()+" dernier recencement "+v2.getDateRessencement()+"\n\n");
    
    /*
    Intervertion des noms par le biais des mutateurs
    */
    
    v1.setNom("Taïwan");
    v2.setNom("Washingtown");

    System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()
        + " habitants se situant en "+v1.getNomPays()+" dernier recencement "+v1.getDateRessencement());
        
    System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()
        + " habitants se situant en "+v2.getNomPays()+" dernier recencement "+v2.getDateRessencement()+"\n\n");
   
    /*
    Description des villes
    */
    System.out.println("\n\n"+v1.decrisToi());
    System.out.println(v.decrisToi());
    System.out.println(v2.decrisToi());
    
    /*
    Comparaison v1 et v2
    */
    
    System.out.println(v1.comparer(v2));
    Capitale cap = new Capitale();
    System.out.println(cap.decrisToi());
    }
    
}
