
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionChannel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionChannel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAIL"/>
 *     <enumeration value="TLPH"/>
 *     <enumeration value="ECOM"/>
 *     <enumeration value="TVPY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionChannel1Code")
@XmlEnum
public enum TransactionChannel1Code {


    /**
     * Mail order.
     * 
     */
    MAIL,

    /**
     * Telephone order.
     * 
     */
    TLPH,

    /**
     * Electronic commerce.
     * 
     */
    ECOM,

    /**
     * Payment on television.
     * 
     */
    TVPY;

    public String value() {
        return name();
    }

    public static TransactionChannel1Code fromValue(String v) {
        return valueOf(v);
    }

}
