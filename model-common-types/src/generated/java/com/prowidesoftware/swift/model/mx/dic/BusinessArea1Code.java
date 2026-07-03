
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessArea1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessArea1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIBD"/&gt;
 *     &lt;enumeration value="OPMT"/&gt;
 *     &lt;enumeration value="PPAY"/&gt;
 *     &lt;enumeration value="TKNF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessArea1Code")
@XmlEnum
public enum BusinessArea1Code {


    /**
     * The payment is initiated by an artificial intelligence based decision.
     * 
     */
    AIBD,

    /**
     * The card is used in a Transit business case where the fare amount is not known when the transaction is initiated.
     * 
     */
    OPMT,

    /**
     * The card is used to perform a plain payment.
     * 
     */
    PPAY,

    /**
     * The card is used in a Transit business case where the fare amount is known when the transaction is initiated.
     * 
     */
    TKNF;

    public String value() {
        return name();
    }

    public static BusinessArea1Code fromValue(String v) {
        return valueOf(v);
    }

}
