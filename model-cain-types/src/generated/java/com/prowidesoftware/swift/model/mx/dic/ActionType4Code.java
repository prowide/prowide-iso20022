
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPTR"/>
 *     <enumeration value="RQID"/>
 *     <enumeration value="RFRL"/>
 *     <enumeration value="APPV"/>
 *     <enumeration value="BLCK"/>
 *     <enumeration value="NDCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
