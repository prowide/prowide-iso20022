
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnvironment2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionEnvironment2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIV"/>
 *     <enumeration value="PUBL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionEnvironment2Code")
@XmlEnum
public enum TransactionEnvironment2Code {


    /**
     * Private environment.
     * 
     */
    PRIV,

    /**
     * Public environment.
     * 
     */
    PUBL;

    public String value() {
        return name();
    }

    public static TransactionEnvironment2Code fromValue(String v) {
        return valueOf(v);
    }

}
