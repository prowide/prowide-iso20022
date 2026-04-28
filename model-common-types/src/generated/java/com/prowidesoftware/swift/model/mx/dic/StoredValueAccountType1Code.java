
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoredValueAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BNKA"/&gt;
 *     &lt;enumeration value="CWVC"/&gt;
 *     &lt;enumeration value="CPYA"/&gt;
 *     &lt;enumeration value="ELMY"/&gt;
 *     &lt;enumeration value="GIFT"/&gt;
 *     &lt;enumeration value="GCER"/&gt;
 *     &lt;enumeration value="MLVC"/&gt;
 *     &lt;enumeration value="OLVC"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="TRVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
