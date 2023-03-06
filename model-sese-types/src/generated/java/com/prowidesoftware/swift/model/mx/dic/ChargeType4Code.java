
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType4Code")
@XmlEnum
public enum ChargeType4Code {


    /**
     * In investment funds, a fee charged for the transfer of ownership of an investment fund.
     * 
     */
    TRAN;

    public String value() {
        return name();
    }

    public static ChargeType4Code fromValue(String v) {
        return valueOf(v);
    }

}
