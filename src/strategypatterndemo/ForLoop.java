/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterndemo;

/**
 *
 * @author Dagi
 */
public class ForLoop implements Loop {
    
    @Override
    public int[] loopIt(int max) {
        int[] returnLoop = new int[max]; 
        for(int i = 0; i < max; i++){
            returnLoop[i] = i;
            System.out.println("For Loop: "+i);
        }
        return returnLoop;
    }
    
}
