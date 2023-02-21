
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkageType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkageType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="UNLK"/&gt;
 *     &lt;enumeration value="SOFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinkageType1Code")
@XmlEnum
public enum LinkageType1Code {


    /**
     * Request is to link the referenced transactions.
     * 
     */
    LINK,

    /**
     * Request is to unlink the referenced transactions.
     * 
     */
    UNLK,

    /**
     * Request is to soft link the referenced transactions.
     * 
     */
    SOFT;

    public String value() {
        return name();
    }

    public static LinkageType1Code fromValue(String v) {
        return valueOf(v);
    }

}
