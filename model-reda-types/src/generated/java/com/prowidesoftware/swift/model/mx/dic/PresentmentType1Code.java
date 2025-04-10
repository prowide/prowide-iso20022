
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentmentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PresentmentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="PAYD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
