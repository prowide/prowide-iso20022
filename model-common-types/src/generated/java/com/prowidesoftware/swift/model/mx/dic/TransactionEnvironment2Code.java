
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnvironment2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEnvironment2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIV"/&gt;
 *     &lt;enumeration value="PUBL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
