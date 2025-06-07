
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MRKT"/&gt;
 *     &lt;enumeration value="INDC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice16Code")
@XmlEnum
public enum TypeOfPrice16Code {


    /**
     * Price is the current market price.
     * 
     */
    MRKT,

    /**
     * Price is the estimated indicative price.
     * 
     */
    INDC;

    public String value() {
        return name();
    }

    public static TypeOfPrice16Code fromValue(String v) {
        return valueOf(v);
    }

}
