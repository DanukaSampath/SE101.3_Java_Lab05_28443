
package com.mycompany.interfacemain;

public class InterfaceImplemented implements MyFirstInterface
{
    public void display()
    {
        System.out.println("The Value of x is "+x);
        //the value inside the interface by default it taken as final. so the value cant be changed
    }
}