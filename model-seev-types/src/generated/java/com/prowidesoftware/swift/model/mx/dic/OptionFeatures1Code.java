
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionFeatures1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COND"/>
 *     <enumeration value="MAXC"/>
 *     <enumeration value="MAXS"/>
 *     <enumeration value="OPLF"/>
 *     <enumeration value="PROR"/>
 *     <enumeration value="QOVE"/>
 *     <enumeration value="QREC"/>
 *     <enumeration value="VVPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionFeatures1Code")
@XmlEnum
public enum OptionFeatures1Code {


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
     * Tender or exchange with the odd lot preference.
     * 
     */
    OPLF,

    /**
     * Feature whereby the option can be subject to pro ration in case, for example, of over-subscription.
     * 
     */
    PROR,

    /**
     * Feature whereby the holder can elect a quantity to receive over and above normal ensured entitlement.
     * 
     */
    QOVE,

    /**
     * Feature whereby the holder can elect a quantity to receive.
     * 
     */
    QREC,

    /**
     * Reduced withholding tax rate applies to the option.
     * 
     */
    VVPR;

    public String value() {
        return name();
    }

    public static OptionFeatures1Code fromValue(String v) {
        return valueOf(v);
    }

}
