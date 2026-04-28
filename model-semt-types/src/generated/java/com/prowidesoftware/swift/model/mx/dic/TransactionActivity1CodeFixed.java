
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionActivity1Code_fixed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionActivity1Code_fixed">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SETT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionActivity1Code_fixed")
@XmlEnum
public enum TransactionActivity1CodeFixed {


    /**
     * SETT
     * 
     */
    SETT;

    public String value() {
        return name();
    }

    public static TransactionActivity1CodeFixed fromValue(String v) {
        return valueOf(v);
    }

}
