package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DataFormat {
    @Getter @Setter private String name;
    private int age;
    private int rollNo;
}
