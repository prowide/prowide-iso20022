
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialPhysicalForm1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitialPhysicalForm1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GTGT"/&gt;
 *     &lt;enumeration value="GPGP"/&gt;
 *     &lt;enumeration value="DERN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitialPhysicalForm1Code")
@XmlEnum
public enum InitialPhysicalForm1Code {


    /**
     * Initial Physical Form is GT.
     * 
     */
    GTGT,

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

    public static InitialPhysicalForm1Code fromValue(String v) {
        return valueOf(v);
    }

}
