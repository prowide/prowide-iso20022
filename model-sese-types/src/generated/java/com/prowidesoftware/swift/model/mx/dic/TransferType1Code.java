
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SECU"/>
 *     <enumeration value="CASH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferType1Code")
@XmlEnum
public enum TransferType1Code {


    /**
     * Transfer the security as an asset in specie, that is, 'in its actual form'.
     * 
     */
    SECU,

    /**
     * Transfer as cash.
     * 
     */
    CASH;

    public String value() {
        return name();
    }

    public static TransferType1Code fromValue(String v) {
        return valueOf(v);
    }

}
