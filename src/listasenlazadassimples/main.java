/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadassimples;

/**
 *
 * @author KelvinCi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listaEnlazada lista=new listaEnlazada();
        /*lista.Agregarprincipio("el primero");
        lista.Agregarprincipio("primero");
        lista.Agregarfinal("penultimo");
        lista.Agregarfinal("ultimo");
       

        lista.mostrarlista();
        System.out.println(lista.getcontador());**/
        for(int i=1; i<11;i++){
            lista.Agregarfinal(i);
            
        }
        lista.mostrarlista();
        lista.eliminarfinal();
        lista.mostrarlista();
    }
    
}
