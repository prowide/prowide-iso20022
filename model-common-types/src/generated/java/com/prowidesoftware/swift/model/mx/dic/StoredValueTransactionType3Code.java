
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueTransactionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StoredValueTransactionType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="RESV"/>
 *     <enumeration value="REVS"/>
 *     <enumeration value="ULOA"/>
 *     <enumeration value="CLOS"/>
 *     <enumeration value="DCTV"/>
 *     <enumeration value="OPEN"/>
 *     <enumeration value="BALC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StoredValueTransactionType3Code")
@XmlEnum
public enum StoredValueTransactionType3Code {


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
    OPEN,

    /**
     * Balance enquiry.
     * 
     */
    BALC;

    public String value() {
        return name();
    }

    public static StoredValueTransactionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
