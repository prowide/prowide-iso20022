
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialPhysicalForm2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitialPhysicalForm2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GPGP"/&gt;
 *     &lt;enumeration value="DERN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitialPhysicalForm2Code")
@XmlEnum
public enum InitialPhysicalForm2Code {


    /**
     * Initial Physical Form is GP.
     * 
     */
    GPGP,

    /**
     * Initial Physical Form is definitive.
     * 
     */
    DERN;

    public String value() {
        return name();
    }

    public static InitialPhysicalForm2Code fromValue(String v) {
        return valueOf(v);
    }

}
