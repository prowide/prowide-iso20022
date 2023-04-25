
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffirmationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AffirmationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFFI"/>
 *     <enumeration value="NAFI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AffirmationStatus1Code")
@XmlEnum
public enum AffirmationStatus1Code {


    /**
     * Status of the transaction is affirmed.
     * 
     */
    AFFI,

    /**
     * Status of the transaction is unaffirmed.
     * 
     */
    NAFI;

    public String value() {
        return name();
    }

    public static AffirmationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
