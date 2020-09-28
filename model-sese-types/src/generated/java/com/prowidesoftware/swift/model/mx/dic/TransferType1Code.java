
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferType1Code")
@XmlEnum
public enum TransferType1Code {


    /**
     * Transfer as asset.
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
