
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedReason16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="CMIS"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="DELN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
