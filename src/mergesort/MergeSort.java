
package mergesort;

/**
 *
 * @author rogel
 */
public class MergeSort {

    
    public static void ms (int[] arreglo){
        
        if(arreglo.length!=1){ //Ver que no hemos acabado de partir el arreglo
            int mitad=arreglo.length/2; 
            int arregloIzq[]=new int[mitad]; 
            int arregloDer[]=new int[arreglo.length-mitad]; 
            int cont=0; 
            
            //Llenar el arreglo de la izquierda y derecha
            for(int i=0;i<arreglo.length;i++){
                if(i<mitad){
                    arregloIzq[i]=arreglo[i]; 
                }
                else{
                    arregloDer[cont]=arreglo[i]; 
                    cont++; 
                }
                
            }
            
            //Llamamos al método de nuevo
            ms(arregloIzq); 
            ms(arregloDer); 
            
            //Llamamo a la mezcla
            mezcla(arreglo, arregloIzq, arregloDer); 
            
        }
                 
    }
    
    public static void mezcla (int[] arreOri, int[] arreIzq, int[] arreDer){
        int i,j,k; //Declaramos contadores para los índices de los arreglos
        i=0; 
        j=0; 
        k=0; 
        
        while(i<arreIzq.length && j<arreDer.length){
            if(arreIzq[i]<arreDer[j]){
                arreOri[k]=arreIzq[i]; 
                i++; 
            }
            else{
                arreOri[k]=arreDer[j]; 
                j++; 
            }
            k++; 
        }
        
        while(i<arreIzq.length){ // Si el de la derecha se acabó, llenamos con el de la izquierda
            arreOri[k]=arreIzq[i]; 
            i++;
            k++;        
        }
        
        while (j<arreDer.length){ //Si el de la izquierda se acabó, llenamos con el de la derecha
            arreOri[k]=arreDer[j]; 
            j++; 
            k++; 
        }
        
    }
    
    public static String imprimeArreglo(int[] a) {
        String res; 
        StringBuilder cad= new StringBuilder(); 
        for(int i=0; i<a.length; i++){
            cad.append(a[i] + ", "); 
        }
        res=cad.substring(0, cad.length()-2); 
        return res; 
    }
    
    public static void main(String[] args) {
        int[] p={4,2,-1,-1,4,220,111,1000}; 
        System.out.println(imprimeArreglo(p));
        ms(p); 
        System.out.println(imprimeArreglo(p));
    }
    
}
