
package ___cet13polimorfismo;

public class ___Cet13Polimorfismo {

    public static void main(String[] args) {
        
        //Animal animal;
        
        Animal animal[]= new Animal[3];
        
        animal[0]=new Animal();
        animal[1]=new Cao();
        animal[2]=new Galinha(); 
        
        for(int i=0;i<animal.length;i++){
            animal[i].comer();        
        }
        
       /*animal = new Animal();
        animal.comer();
        
        animal = new Cao();        
        animal.comer();
        
        animal = new Galinha();
        animal.comer();
*/
    }
    
}
