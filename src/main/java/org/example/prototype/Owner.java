package org.example.prototype;

public class Owner implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner(String name){
        this.name = name;
    }

    @Override
    public Owner clone() throws CloneNotSupportedException {
        return (Owner) super.clone();
    }

    @Override
    public String toString(){
        return "Owner name: " + name;
    }
}
