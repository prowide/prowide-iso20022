
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialCapture1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialCapture1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTH"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="BTCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialCapture1Code")
@XmlEnum
public enum FinancialCapture1Code {


    /**
     * Financial capture of the transaction is performed by the acquirer during the authorisation exchange.
     * 
     */
    AUTH,

    /**
     * Financial capture of the transaction is performed by the acquirer during the completion exchange.
     * 
     */
    COMP,

    /**
     * Financial capture of the transaction is performed by the acquirer at the reception of a batch transfer.
     * 
     */
    BTCH;

    public String value() {
        return name();
    }

    public static FinancialCapture1Code fromValue(String v) {
        return valueOf(v);
    }

}
