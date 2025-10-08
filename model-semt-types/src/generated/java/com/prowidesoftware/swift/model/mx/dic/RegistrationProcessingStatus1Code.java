
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationProcessingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistrationProcessingStatus1Code")
@XmlEnum
public enum RegistrationProcessingStatus1Code {


    /**
     * Registration has been acknowledged/accepted by the issuer/registrar.
     * 
     */
    PACK,

    /**
     * Registration has been rejected by the issuer/registrar.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static RegistrationProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
