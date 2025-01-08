
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StoredValueAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BNKA"/>
 *     <enumeration value="CWVC"/>
 *     <enumeration value="CPYA"/>
 *     <enumeration value="ELMY"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="GCER"/>
 *     <enumeration value="MLVC"/>
 *     <enumeration value="OLVC"/>
 *     <enumeration value="MERC"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="CARD"/>
 *     <enumeration value="TRVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StoredValueAccountType1Code")
@XmlEnum
public enum StoredValueAccountType1Code {


    /**
     * Prepaid account managed by a financial institution for low income customers.
     * 
     */
    BNKA,

    /**
     * Car wash specific account.
     * 
     */
    CWVC,

    /**
     * Specific prepaid account for companies or professionals expenses.
     * 
     */
    CPYA,

    /**
     * Account supporting e-money issued by an electronic money issuer.
     * 
     */
    ELMY,

    /**
     * Payment mean issued by retailers or banks as a substitute to a non-monetary gift. Usually, this Stored Value item is used only once.
     * 
     */
    GIFT,

    /**
     * Certificate to be given to a customer. Usually one shot voucher.
     * 
     */
    GCER,

    /**
     * Meal and check voucher for restaurants.
     * 
     */
    MLVC,

    /**
     * Voucher that can be used online once or in several times.
     * 
     */
    OLVC,

    /**
     * Prepaid account open with a merchant or big retailers.
     * 
     */
    MERC,

    /**
     * Other non listed stored value instrument.
     * 
     */
    OTHR,

    /**
     * Stored value instrument used to pay telephone services (e.g. card or identifier).
     * 
     */
    PHON,

    /**
     * Stored value account hold on the chip of a smart card. 
     * 
     */
    CARD,

    /**
     * Travel prepaid account.
     * 
     */
    TRVL;

    public String value() {
        return name();
    }

    public static StoredValueAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
