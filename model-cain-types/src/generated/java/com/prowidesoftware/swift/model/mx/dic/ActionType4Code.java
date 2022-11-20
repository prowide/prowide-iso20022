
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="RQID"/&gt;
 *     &lt;enumeration value="RFRL"/&gt;
 *     &lt;enumeration value="APPV"/&gt;
 *     &lt;enumeration value="BLCK"/&gt;
 *     &lt;enumeration value="NDCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType4Code")
@XmlEnum
public enum ActionType4Code {


    /**
     * Capture the card.
     * 
     */
    CPTR,

    /**
     * Additional identification required (passport, ID card, etc.).
     * 
     */
    RQID,

    /**
     * Referral has to be performed.
     * 
     */
    RFRL,

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
     * No reason for declining the transaction.
     * 
     */
    NDCL;

    public String value() {
        return name();
    }

    public static ActionType4Code fromValue(String v) {
        return valueOf(v);
    }

}
