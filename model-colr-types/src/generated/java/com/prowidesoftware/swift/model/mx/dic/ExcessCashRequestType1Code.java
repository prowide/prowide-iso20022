
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcessCashRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExcessCashRequestType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STDG"/&gt;
 *     &lt;enumeration value="MRGS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExcessCashRequestType1Code")
@XmlEnum
public enum ExcessCashRequestType1Code {


    /**
     * Request is a an excess cash standing instruction.
     * 
     */
    STDG,

    /**
     * Request is a an immediate margin settlement instruction.
     * 
     */
    MRGS;

    public String value() {
        return name();
    }

    public static ExcessCashRequestType1Code fromValue(String v) {
        return valueOf(v);
    }

}
