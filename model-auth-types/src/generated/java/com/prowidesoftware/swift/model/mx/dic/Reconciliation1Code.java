
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reconciliation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Reconciliation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DSMA"/>
 *     <enumeration value="DSNM"/>
 *     <enumeration value="NORE"/>
 *     <enumeration value="SSMA"/>
 *     <enumeration value="SSPA"/>
 *     <enumeration value="SSNE"/>
 *     <enumeration value="SSUN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Reconciliation1Code")
@XmlEnum
public enum Reconciliation1Code {


    /**
     * Trade repository has both sides of the trade reported and all fields match.
     * 
     */
    DSMA,

    /**
     * Trade repository has both sides of the trade reported but not all fields match.
     * 
     */
    DSNM,

    /**
     * Trade was not required to be submitted for reconciliation.
     * 
     */
    NORE,

    /**
     * Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, has already performed the comparison of the reports, and the result has been successful according to the specification of the inter-TR reconciliation process.
     * 
     */
    SSMA,

    /**
     * Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, and either has already performed comparison of the reports, or is in the process of doing so.
     * 
     */
    SSPA,

    /**
     * Trade repository has one side of the trade and knows that the other side does not have a reporting obligation.
     * 
     */
    SSNE,

    /**
     * Trade repository has one side of the trade, knows that the other side is EEA counterparty and does not know which TR holds the other side of the trade.
     * 
     */
    SSUN;

    public String value() {
        return name();
    }

    public static Reconciliation1Code fromValue(String v) {
        return valueOf(v);
    }

}
