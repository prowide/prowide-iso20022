
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionFeatures5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASVO"/>
 *     <enumeration value="BOIS"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="MAXC"/>
 *     <enumeration value="MAXS"/>
 *     <enumeration value="NOSE"/>
 *     <enumeration value="OPLF"/>
 *     <enumeration value="CAOS"/>
 *     <enumeration value="QOVE"/>
 *     <enumeration value="PINS"/>
 *     <enumeration value="QREC"/>
 *     <enumeration value="PROR"/>
 *     <enumeration value="VVPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionFeatures5Code")
@XmlEnum
public enum OptionFeatures5Code {


    /**
     * Option is offered by the account servicer only.
     * 
     */
    ASVO,

    /**
     * Indicates that the holder needs to instruct at beneficiary owner level only.
     * 
     */
    BOIS,

    /**
     * Feature whereby the holder can elect to place a condition on the acceptance of the option.
     * 
     */
    COND,

    /**
     * Maximum cash option, may be subject to scaling, as such you may receive a combination of cash and securities outturn.
     * 
     */
    MAXC,

    /**
     * Maximum stock option, may be subject to scaling, as such you may receive a combination of securities and cash outturn.
     * 
     */
    MAXS,

    /**
     * Feature whereby the holder must elect directly to the issuer's agent (issuer only supported option).
     * 
     */
    NOSE,

    /**
     * Tender or exchange with the odd lot preference.
     * 
     */
    OPLF,

    /**
     * Option applicability is not subject to the account owner decision but depends on the terms defined by the issuer, for example in the case of equity linked notes or warrants.
     * 
     */
    CAOS,

    /**
     * Feature whereby the holder can elect a quantity to receive over and above normal ensured entitlement.
     * 
     */
    QOVE,

    /**
     * Indicates the previously sent instructions becomes invalid. This is only applicable after a market deadline extension.
     * 
     */
    PINS,

    /**
     * Feature whereby the holder can elect a quantity to receive.
     * 
     */
    QREC,

    /**
     * Feature whereby the option can be subject to pro ration in case, for example, of over-subscription.
     * 
     */
    PROR,

    /**
     * Reduced withholding tax rate applies to the option.
     * 
     */
    VVPR;

    public String value() {
        return name();
    }

    public static OptionFeatures5Code fromValue(String v) {
        return valueOf(v);
    }

}
