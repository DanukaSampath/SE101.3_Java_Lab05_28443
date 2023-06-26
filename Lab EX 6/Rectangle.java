
package com.mycompany.labex4;

    public class Rectangle extends Shape {
    
    protected float width,height,area;
    
    public Rectangle(float width,float height)
    {
        this.height=height;
        this.width=width;
    }
    
    public void calculatearea()
    {
        
        area=(width*height);
    }
    public void display()
    {
                System.out.println("The Area is "+area);

    }
}
