
package com.kotlin.feign;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Repositories {    
    
    private String name;
    private String full_name;

    @Override
    public String toString() {
        return "Repositories{" +
                "name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                '}';
    }
}
