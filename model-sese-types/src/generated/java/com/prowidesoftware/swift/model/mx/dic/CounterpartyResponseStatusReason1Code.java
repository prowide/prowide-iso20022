
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyResponseStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CounterpartyResponseStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="CPCX"/&gt;
 *     &lt;enumeration value="CPMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CounterpartyResponseStatusReason1Code")
@XmlEnum
public enum CounterpartyResponseStatusReason1Code {


    /**
     * Specifies that the response is related to an allegement from the counterparty.
     * 
     */
    CPTR,

    /**
     * Specifies that the response is related to the cancellation request of the counterparty.
     * 
     */
    CPCX,

    /**
     * Specifies that the response is related to the modification request of the counterparty.
     * 
     */
    CPMD;

    public String value() {
        return name();
    }

    public static CounterpartyResponseStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
