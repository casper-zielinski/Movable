# Movable

## Description

### Base Exercise

> The ``Movable.java`` Class is a Abstract class and serves as a Blueprint for the ``MovablePoint.java`` Class
> with the ``MovablePoint.java`` Class you can creata a Point by giving him a ``x``, ``y``, ``xSpeed`` and a ``ySpeed`` Attribute and then move him up, down, right, or left with the Methods: ``moveUp()``, ``moveDown()``, ``moveRight()`` and ``moveLeft()`` who are defined in the ``Movable.java`` Abstract Class and initilized and Overriden in the ``MovablePoint.java`` Class. The toString() Method returns the ``x``, ``y``, ``xSpeed`` and ``ySpeed`` Attribute in a String format. the move() Methods either increase or decrease the x or y value, depending on where you're moving.

### Extended V1

> The ``Vehicle.java`` Class is another Extension for the ``Movable.java`` Class. With the Vehicle Class you are able to create a Vehicle Object and give it a **type:String**, **x:int**, **y:int**, **speed:int=0**, **acceleration:int** and **deceleration:int**. It has the ``toString()`` Method as well, where the String returned has this format: type (x, y) speed=(speed). Also ``move()`` Methods, where depending on where you moving, the speed changes as well as the x and y value.
<br>

> The ``Robot.java`` Class is also a Extension of the ``Movable.java`` Class. With it you can creata a Robot Object and give it the attributes: **x:int**, **y:int** and **stepSize:int**, it also has the attribute ``id:int`` which increases with every Robot Object created. The toString() Method returns a String in this format:<br> Robot #id(x, y). The ``Move()`` Methods change the x and y value depending on where you move and how big the **stepSize** value is.

## Features

- [X] Tests with JUnit

## Link

> The Link of this Exercise: [Movable Exercise](https://git-iit.fh-joanneum.at/iit-prog/java2/exercises/-/tree/main/03_polymorphism/movable?ref_type=heads)

> Author of Exercise and my Lecturer: [Github Page](https://git-iit.fh-joanneum.at/schwabha)
