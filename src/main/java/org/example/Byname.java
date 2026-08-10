package org.example;

import lombok.Data;

@Data
public class Byname {
    private String name;
    private int age;

    public Byname(String name, int age, StarName starName) {
        this.name = name;
        this.age = age;
        this.starName = starName;
    }

    private  StarName starName  ;


    public void actoreName(){
        starName.name();
    }
}

