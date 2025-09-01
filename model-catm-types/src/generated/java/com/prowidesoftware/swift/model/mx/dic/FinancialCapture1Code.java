
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialCapture1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialCapture1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="BTCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
