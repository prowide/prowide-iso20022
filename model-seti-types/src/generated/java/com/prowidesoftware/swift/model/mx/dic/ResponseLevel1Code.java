
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NACK"/&gt;
 *     &lt;enumeration value="ACNE"/&gt;
 *     &lt;enumeration value="ACEA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseLevel1Code")
@XmlEnum
public enum ResponseLevel1Code {


    /**
     * No acknowledgement is requested.
     * 
     */
    NACK,

    /**
     * Acknowledgement of only negative or erroneous messages is requested.
     * 
     */
    ACNE,

    /**
     * Acknowledgement of each message is requested.
     * 
     */
    ACEA;

    public String value() {
        return name();
    }

    public static ResponseLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
