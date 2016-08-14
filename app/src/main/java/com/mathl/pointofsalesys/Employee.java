package com.mathl.pointofsalesys;

/**
 * Created by mathl on 8/13/2016.
 */
public class Employee
{
    private int img;
    private String name;

    public Employee(int img,String name)
    {
        this.img = img;
        this.setName(name);
    }

    public int getImg()
    {
        return img;
    }

    public void setImg(int img)
    {
        this.img = img;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
