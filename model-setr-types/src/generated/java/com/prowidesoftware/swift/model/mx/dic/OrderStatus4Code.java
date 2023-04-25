
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="STNP"/>
 *     <enumeration value="RECE"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="CPNP"/>
 *     <enumeration value="CNFC"/>
 *     <enumeration value="DONE"/>
 *     <enumeration value="DONF"/>
 *     <enumeration value="OPOD"/>
 *     <enumeration value="IACO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderStatus4Code")
@XmlEnum
public enum OrderStatus4Code {


    /**
     * Order is accepted and is ready for execution (execution is the moment when pricing is applied).
     * 
     */
    PACK,

    /**
     * Order is already executed and confirmation has been sent.
     * 
     */
    COSE,

    /**
     * Order has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Order has been received, ie, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE,

    /**
     * Order is settled. The cash is credited or debited.
     * 
     */
    SETT,

    /**
     * Communication problems with the next party.
     * 
     */
    CPNP,

    /**
     * Order confirmation cancellation has been sent and will be followed by a confirmation amendment, or a confirmation amendment has been sent.
     * 
     */
    CNFC,

    /**
     * Order has been partially filled, and is done for the day, ie, no further executions will take place today.
     * 
     */
    DONE,

    /**
     * Order has been partially filled and will not be filled further.
     * 
     */
    DONF,

    /**
     * Order is open.
     * 
     */
    OPOD,

    /**
     * Order confirmation received from agent is invalid.
     * 
     */
    IACO;

    public String value() {
        return name();
    }

    public static OrderStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
