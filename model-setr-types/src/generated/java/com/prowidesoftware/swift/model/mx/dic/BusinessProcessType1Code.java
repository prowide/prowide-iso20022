
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessProcessType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessProcessType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ISUP"/>
 *     <enumeration value="NISP"/>
 *     <enumeration value="PRAC"/>
 *     <enumeration value="RSAL"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="THRU"/>
 *     <enumeration value="IDEL"/>
 *     <enumeration value="DPLX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BusinessProcessType1Code")
@XmlEnum
public enum BusinessProcessType1Code {


    /**
     * Specifies the processing of a transaction in a central matching utility model.
     * 
     */
    ISUP,

    /**
     * Specifies the processing of a transaction in a local matching model.
     * 
     */
    NISP,

    /**
     * Transaction notice results from an agreement made out of a trading platform between two members (broker and intermediary) of an authorised entity.
     * 
     */
    PRAC,

    /**
     * Transaction notice reverses a previously sent and agreed transaction notice. If the reversal transaction notice is stated to serve as invoice:
     * o Fees and taxes contained in the transaction notice are considered as being in debit of the broker’s account and in credit of the intermediary’s account: it is a ‘credit invoice’;
     * o The broker will have to specify the original transaction notice reference;
     * o The reversal transaction notice will have the same direction (buy, sell) as the original transaction notice.
     * 
     */
    RSAL,

    /**
     * Specifies the processing of a transaction in a own account trade type model.
     * 
     */
    PROP,

    /**
     * Specifies the processing of a transaction in a through type model.
     * 
     */
    THRU,

    /**
     * Specifies the processing of a transaction in a billateral central matching model.
     * 
     */
    IDEL,

    /**
     * Specifies the processing of a transaction in a duplex type model.
     * 
     */
    DPLX;

    public String value() {
        return name();
    }

    public static BusinessProcessType1Code fromValue(String v) {
        return valueOf(v);
    }

}
