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
public class WhileLoop implements Loop {

    @Override
    public int[] loopIt(int max) {
        int[] returnLoop = new int[max]; 
        int i = 0;
        while(i < max){
            returnLoop[i] = i;
            System.out.println("While Loop: "+i);
            i++;
        }

        return returnLoop;
    }
    
}
