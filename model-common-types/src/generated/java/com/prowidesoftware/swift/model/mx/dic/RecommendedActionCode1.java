
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendedActionCode1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RecommendedActionCode1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPV"/>
 *     <enumeration value="BLCK"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="DCLN"/>
 *     <enumeration value="RQID"/>
 *     <enumeration value="NDCL"/>
 *     <enumeration value="RFRL"/>
 *     <enumeration value="STUA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RecommendedActionCode1")
@XmlEnum
public enum RecommendedActionCode1 {


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
     * Further authentication required (e.g. one-time password)
     * 
     */
    STUA;

    public String value() {
        return name();
    }

    public static RecommendedActionCode1 fromValue(String v) {
        return valueOf(v);
    }

}
