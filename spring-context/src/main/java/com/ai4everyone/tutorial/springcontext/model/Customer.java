package com.ai4everyone.tutorial.springcontext.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Customer {
    private String name;
    private String family;
    private Integer age;
}
