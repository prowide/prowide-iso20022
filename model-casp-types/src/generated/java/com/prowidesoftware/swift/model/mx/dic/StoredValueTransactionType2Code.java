
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoredValueTransactionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *     &lt;enumeration value="LOAD"/&gt;
 *     &lt;enumeration value="RESV"/&gt;
 *     &lt;enumeration value="REVS"/&gt;
 *     &lt;enumeration value="ULOA"/&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="DCTV"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StoredValueTransactionType2Code")
@XmlEnum
public enum StoredValueTransactionType2Code {


    /**
     * Activate the account or the card.
     * 
     */
    ACTV,

    /**
     * Duplicate the code or number provided by the loading or activation.
     * 
     */
    DUPL,

    /**
     * Load the account or the card with money.
     * 
     */
    LOAD,

    /**
     * Reserve the account (e.g. get an activation code).
     * 
     */
    RESV,

    /**
     * Reverse an activation or loading.
     * 
     */
    REVS,

    /**
     * Unload the account.
     * 
     */
    ULOA,

    /**
     * Close the account.
     * 
     */
    CLOS,

    /**
     * Deactivate the account or the card.
     * 
     */
    DCTV,

    /**
     * Open the account.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static StoredValueTransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
