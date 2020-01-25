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
public class StrategyPatternDemo {
    
    private Loop loopStrategy;
    
    public StrategyPatternDemo(Loop method){
        this.loopStrategy = method;
    }

    public int[] Loop(int max){
        return loopStrategy.loopIt(max);
    }
    
    public void changeStrategy(Loop otherLoopMethod){
        loopStrategy = otherLoopMethod;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StrategyPatternDemo demo = new StrategyPatternDemo(new ForLoop());
        demo.Loop(10);
        demo.changeStrategy(new WhileLoop());
        System.out.println("Changing Strategy");
        demo.Loop(10);
    }
    
}
