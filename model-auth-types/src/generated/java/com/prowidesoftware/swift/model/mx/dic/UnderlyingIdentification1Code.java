
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingIdentification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="BSKT"/&gt;
 *     &lt;enumeration value="INDX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingIdentification1Code")
@XmlEnum
public enum UnderlyingIdentification1Code {


    /**
     * Unknown (not available) underlying identification code.
     * 
     */
    UKWN,

    /**
     * Basket of indexes identification code.
     * 
     */
    BSKT,

    /**
     * Index identification code.
     * 
     */
    INDX;

    public String value() {
        return name();
    }

    public static UnderlyingIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
