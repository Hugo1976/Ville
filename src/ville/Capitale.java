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
class Capitale extends Ville{
    
    private String monument;
    
    //Constructeur par défaut    
    public Capitale(){
        //Mot clé appelant le constructeur de la classe mère
        super();
        monument = "Aucun";
        }
    
    public String decrisTois(){
        String str = super.decrisToi() + "\n \t ==>>"+this.monument+ "en est un monument";
        System.out.println("Invovation de super.décrisToi()");
        
        return str;
    }
}
