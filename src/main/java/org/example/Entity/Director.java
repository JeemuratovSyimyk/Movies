package org.example.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Director {
    private String name;
    private String LastName;

    public Director(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }
}
