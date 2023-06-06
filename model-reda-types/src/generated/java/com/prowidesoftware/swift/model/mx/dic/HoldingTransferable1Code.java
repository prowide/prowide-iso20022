
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingTransferable1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HoldingTransferable1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRAL"/>
 *     <enumeration value="TRNA"/>
 *     <enumeration value="RFOD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HoldingTransferable1Code")
@XmlEnum
public enum HoldingTransferable1Code {


    /**
     * Transfer is allowed.
     * 
     */
    TRAL,

    /**
     * Transfer is not allowed.
     * 
     */
    TRNA,

    /**
     * Indicates that the operation is only possible in restricted circumstances.
     * 
     */
    RFOD;

    public String value() {
        return name();
    }

    public static HoldingTransferable1Code fromValue(String v) {
        return valueOf(v);
    }

}
