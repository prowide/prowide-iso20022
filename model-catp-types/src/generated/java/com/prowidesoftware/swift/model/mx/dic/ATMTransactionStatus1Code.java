
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransactionStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMTransactionStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOBT"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="SCSS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMTransactionStatus1Code")
@XmlEnum
public enum ATMTransactionStatus1Code {


    /**
     * Undetermined status, for instance possibly forgotten notes.
     * 
     */
    DOBT,

    /**
     * Transaction failed.
     * 
     */
    FAIL,

    /**
     * Transaction was successfully completed.
     * 
     */
    SCSS;

    public String value() {
        return name();
    }

    public static ATMTransactionStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
