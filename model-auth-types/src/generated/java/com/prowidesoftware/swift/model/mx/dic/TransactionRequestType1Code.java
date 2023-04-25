
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionRequestType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DTTX"/>
 *     <enumeration value="OREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
