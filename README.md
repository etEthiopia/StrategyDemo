What is Strategy Pattern?

    Strategy pattern defines a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

Components

    1. Loop

    2. ForLoop

    3. WhilelLoop

    4. StrategyPatternDemo

1. Loop

   Structure Interface including 'loopIt' method

2. ForLoop

   Overrides loopIt and uses for loop

3. WhileLoop

   Overrides loopIt and uses while loop

4. StrategyPatternDemo

   Defines a Strategy
   Defines method Loop which is based on the strategy
   Defines a method which changes 'changeStrategy'
   'main' method instaties and starts the program
