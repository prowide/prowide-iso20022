
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="EXCL"/>
 *     <enumeration value="SECU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferType4Code")
@XmlEnum
public enum TransferType4Code {


    /**
     * Transfer as cash.
     * 
     */
    CASH,

    /**
     * ISIN is converted to another ISIN and then transferred.
     * 
     */
    CONV,

    /**
     * Asset excluded from transfer.
     * 
     */
    EXCL,

    /**
     * Transfer the security as an asset in specie, that is, 'in its actual form'.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static TransferType4Code fromValue(String v) {
        return valueOf(v);
    }

}
