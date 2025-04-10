
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRequestSequence1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestRequestSequence1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="UPDA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestRequestSequence1Code")
@XmlEnum
public enum InterestRequestSequence1Code {


    /**
     * Indicates this is a new interest payment request.
     * 
     */
    INIT,

    /**
     * Indicates this is an updated interest payement request.
     * 
     */
    UPDA;

    public String value() {
        return name();
    }

    public static InterestRequestSequence1Code fromValue(String v) {
        return valueOf(v);
    }

}
