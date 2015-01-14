# Smooth-circle
Anti-aliased circle

![alt tag](https://github.com/Dych/Smooth-circle/blob/master/screen.png)

It's a example to show how to draw a anti-aliased circle in Java using the libgdx.
We can use alpha color to manipulate opacity.

Licence
==============
Libgdx : http://libgdx.badlogicgames.com/ [v 1.5.2]


Class circle
==============

- ***Construct***
```
Circle(float x,float y,float r,Color color);
```
Constructor
- x : horizontal position
- y : vertical position
- r : radius
- color : color of the circle


- ***Draw***
```
void Circle.draw();
```
Draw the circle.



- ***Dispose***
```
void Circle.dispose();
```
Free the memory.



- ***Pos***
```
void Circle.setX(float x);
float Circle.getX();

void Circle.setY(float y);
float Circle.getY();
```
Set vertical and horizontal positions.

- ***Radius***
```
void Circle.setRadius(float r);
float Circle.getRadius();
```
Set the radius


- ***Color***
```
void Circle.setColor(Color color);
Color Circle.getColor();
```

Set the circle's color.

Licence
==============
All free.