/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namudarbai1;

/**
 *
 * @author tomas
 */
public class NamuDarbai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nuo = 1;
        int iki = 100;
        int iter = 0;
        int sum = 0;
        int vidur = 0;
        
        while ( nuo <= iki ) {
            if ( nuo % 3 == 0 ) {
                System.out.println(nuo);
                iter++;
                sum = sum + nuo;
            }
            nuo = nuo + 1;
            
        }
        
        vidur = sum / iter;
                
        System.out.println(sum);
        System.out.println(vidur);
        
    }
    
}
