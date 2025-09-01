
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalTransferType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalTransferType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="OPTL"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalTransferType4Code")
@XmlEnum
public enum PhysicalTransferType4Code {


    /**
     * Physical transfer.
     * 
     */
    PHYS,

    /**
     * Determined by a third party or optional for counterparty.
     * 
     */
    OPTL,

    /**
     * Cash transfer.
     * 
     */
    CASH;

    public String value() {
        return name();
    }

    public static PhysicalTransferType4Code fromValue(String v) {
        return valueOf(v);
    }

}
