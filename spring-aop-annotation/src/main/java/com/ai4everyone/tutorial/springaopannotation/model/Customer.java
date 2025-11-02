package com.ai4everyone.tutorial.springaopannotation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private String name;
    private Integer age;
}
