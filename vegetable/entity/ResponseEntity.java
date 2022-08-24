package com.vegetable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ResponseEntity<E> {

    private int code;
    private String message;
    private E data;


    public  ResponseEntity success(){
        this.code = 200;
        this.message = "Success";
        return this;
    }

    public  ResponseEntity<E> success(E data){
        this.code = 200;
        this.message = "Success";
        this.data = data;
        return this;
    }
}
