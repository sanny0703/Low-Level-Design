# Decorator Design Pattern

### we should go for decorator pattern, when we need to decorate our class with multiple features dynamically

## Why we Need Decorator?

### answer is simple: to prevent <strong> <i> class explosion </i></strong>

### consider we have a base class car, no we want to add extra features for our car like AC, power steering etc.

### => Now, to make a car AC , we need to extend our base class and add a AC to it

### => to make our car power steering again we need to extend our base car and add power steering to it

### => to make our car both AC and power steering, again we have to extend base class and add AC and power steering

### => just for two features we are creating multiple <i>concrete classes</i>, how about tens of features

### => we have to create <i>concrete classes</i> for each combination, which leads to class explosion