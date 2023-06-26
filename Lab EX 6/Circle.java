
package com.mycompany.labex4;

public class Circle extends Shape {
    
    public float r,area;
    
    public Circle(float r)
    {
        this.r=r;
    }
    
    public void calculatearea()
    {
        area=(3.15f*r*r);
    }
    
    public void display()
    {
        System.out.println("The Area is "+area);
    }
    
}
