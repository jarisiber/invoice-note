package com.jarisiber.invoicenote.enumeration;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 25/11/2023 - 2:11 PM
 */
public enum VerificationType {
    ACCOUNT("ACCOUNT"),
    PASSWORD("PASSWORD");
    private final String type;
//    Constructor
    VerificationType(String type) {this.type = type;}
//    Parameter
    public String getType(){
        return this.type.toLowerCase();
    }
}
