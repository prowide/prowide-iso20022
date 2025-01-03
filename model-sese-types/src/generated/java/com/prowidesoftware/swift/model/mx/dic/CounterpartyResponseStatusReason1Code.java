
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyResponseStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CounterpartyResponseStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPTR"/>
 *     <enumeration value="CPCX"/>
 *     <enumeration value="CPMD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
