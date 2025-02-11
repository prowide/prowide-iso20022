
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SECU"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CONV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferType3Code")
@XmlEnum
public enum TransferType3Code {


    /**
     * Transfer the security as an asset in specie, that is, 'in its actual form'.
     * 
     */
    SECU,

    /**
     * Transfer as cash.
     * 
     */
    CASH,

    /**
     * ISIN is converted to another ISIN and then transferred.
     * 
     */
    CONV;

    public String value() {
        return name();
    }

    public static TransferType3Code fromValue(String v) {
        return valueOf(v);
    }

}
