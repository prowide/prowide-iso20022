
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferToFundOrderDesk1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferToFundOrderDesk1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RFOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReferToFundOrderDesk1Code")
@XmlEnum
public enum ReferToFundOrderDesk1Code {


    /**
     * Indicates that the operation is only possible in restricted circumstances.
     * 
     */
    RFOD;

    public String value() {
        return name();
    }

    public static ReferToFundOrderDesk1Code fromValue(String v) {
        return valueOf(v);
    }

}
