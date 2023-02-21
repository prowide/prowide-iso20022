
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPV"/&gt;
 *     &lt;enumeration value="BLCK"/&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="DCLN"/&gt;
 *     &lt;enumeration value="RQID"/&gt;
 *     &lt;enumeration value="NDCL"/&gt;
 *     &lt;enumeration value="RFRL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="STUA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType8Code")
@XmlEnum
public enum ActionType8Code {


    /**
     * Approve the transaction.
     * 
     */
    APPV,

    /**
     * Block the card.
     * 
     */
    BLCK,

    /**
     * Capture the card.
     * 
     */
    CPTR,

    /**
     * Decline the transaction.
     * 
     */
    DCLN,

    /**
     * Additional identification required (passport, ID card, etc.).
     * 
     */
    RQID,

    /**
     * No reason for declining the transaction.
     * 
     */
    NDCL,

    /**
     * Referral has to be performed.
     * 
     */
    RFRL,

    /**
     * Other action defined at national level.
     * 
     */
    OTHN,

    /**
     * Other action defined at private level
     * 
     */
    OTHP,

    /**
     * Further authentication required (e.g. one-time password)
     * 
     */
    STUA;

    public String value() {
        return name();
    }

    public static ActionType8Code fromValue(String v) {
        return valueOf(v);
    }

}
