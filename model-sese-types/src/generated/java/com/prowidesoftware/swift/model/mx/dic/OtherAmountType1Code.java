
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherAmountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PINT"/&gt;
 *     &lt;enumeration value="SINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherAmountType1Code")
@XmlEnum
public enum OtherAmountType1Code {


    /**
     * Interest that was pre-paid.
     * 
     */
    PINT,

    /**
     * Interest on the interest.
     * 
     */
    SINT;

    public String value() {
        return name();
    }

    public static OtherAmountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
