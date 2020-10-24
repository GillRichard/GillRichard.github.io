package com.chauncey.blog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{

    public NotFoundException(){

    }
    public NotFoundException(String meassage){
        super(meassage);
    }

    public NotFoundException(String meassage, Throwable cause){
        super(meassage,cause);
    }
}
