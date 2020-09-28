
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferType3Code")
@XmlEnum
public enum TransferType3Code {


    /**
     * Transfer the security as an asset in specie, that is, 'in its actual form'..
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
