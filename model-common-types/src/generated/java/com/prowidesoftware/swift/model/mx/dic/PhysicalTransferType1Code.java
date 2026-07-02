
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalTransferType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalTransferType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEMT"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalTransferType1Code")
@XmlEnum
public enum PhysicalTransferType1Code {


    /**
     * Dematerialised transfer.
     * 
     */
    DEMT,

    /**
     * Physical transfer.
     * 
     */
    PHYS;

    public String value() {
        return name();
    }

    public static PhysicalTransferType1Code fromValue(String v) {
        return valueOf(v);
    }

}
