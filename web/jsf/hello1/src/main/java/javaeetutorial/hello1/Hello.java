/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.hello1;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//si en esta anotación no se indica nada más, quiere decir que el contenedor web
//accederá por el nombre de la clase con la primera letra en minúscula
@Named   

//indica el ámbito en el que la clase va a estar disponible como managed bean
@RequestScoped 
public class Hello {

    private String name;

    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }
}

