package com.projetosleandro.javaweb.services.exeptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id" + id);
    }
}
