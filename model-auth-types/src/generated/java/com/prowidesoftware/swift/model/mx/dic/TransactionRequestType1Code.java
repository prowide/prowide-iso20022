
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionRequestType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DTTX"/&gt;
 *     &lt;enumeration value="OREC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionRequestType1Code")
@XmlEnum
public enum TransactionRequestType1Code {


    /**
     * Request is the date and time related to the original transaction numlber.
     * 
     */
    DTTX,

    /**
     * Request is the original receipt.
     * 
     */
    OREC;

    public String value() {
        return name();
    }

    public static TransactionRequestType1Code fromValue(String v) {
        return valueOf(v);
    }

}
