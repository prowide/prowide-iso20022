
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NCRR"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="ICUS"/>
 *     <enumeration value="IEXE"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="DELN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnmatchedReason16Code")
@XmlEnum
public enum UnmatchedReason16Code {


    /**
     * Settlement amount currency does not match.
     * 
     */
    NCRR,

    /**
     * Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs.
     * 
     */
    DSEC,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * A matching instruction from your counterparty could not be found.
     * 
     */
    CMIS,

    /**
     * Depository does not match.
     * 
     */
    DEPT,

    /**
     * Participant of delivering or receiving depository does not match.
     * 
     */
    ICAG,

    /**
     * Client of delivering or receiving party 1 does not match.
     * 
     */
    ICUS,

    /**
     * Client of delivering or receiving party 2 does not match.
     * 
     */
    IEXE,

    /**
     * Settlement amount does not match.
     * 
     */
    DMON,

    /**
     * Settlement date/time does not match.
     * 
     */
    DDAT,

    /**
     * Trade date does not match.
     * 
     */
    DTRD,

    /**
     * Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa.
     * 
     */
    DELN;

    public String value() {
        return name();
    }

    public static UnmatchedReason16Code fromValue(String v) {
        return valueOf(v);
    }

}
