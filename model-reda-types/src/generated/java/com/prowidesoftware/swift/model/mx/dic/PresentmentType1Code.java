
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentmentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentmentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="PAYD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PresentmentType1Code")
@XmlEnum
public enum PresentmentType1Code {


    /**
     * Full information of the presented e-invoice should be presented to the debtor.
     * 
     */
    FULL,

    /**
     * Only information necessary to initiate the payment should be presented to the debtor.
     * 
     */
    PAYD;

    public String value() {
        return name();
    }

    public static PresentmentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
