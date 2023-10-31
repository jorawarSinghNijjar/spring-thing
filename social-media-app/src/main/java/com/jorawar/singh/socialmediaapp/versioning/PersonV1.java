package com.jorawar.singh.socialmediaapp.versioning;

public class PersonV1 {
    private String name;
    public PersonV1(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
