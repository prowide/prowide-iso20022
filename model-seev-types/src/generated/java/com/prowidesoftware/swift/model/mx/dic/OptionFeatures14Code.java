
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionFeatures14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COND"/>
 *     <enumeration value="MAXC"/>
 *     <enumeration value="MAXS"/>
 *     <enumeration value="OPLF"/>
 *     <enumeration value="PROR"/>
 *     <enumeration value="VVPR"/>
 *     <enumeration value="RGRS"/>
 *     <enumeration value="RNET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionFeatures14Code")
@XmlEnum
public enum OptionFeatures14Code {


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
     * Reduced withholding tax rate applies to the option.
     * 
     */
    VVPR,

    /**
     * Gross dividend is reinvested.
     * 
     */
    RGRS,

    /**
     * Dividend reinvestment is processed net of withholding tax.
     * 
     */
    RNET;

    public String value() {
        return name();
    }

    public static OptionFeatures14Code fromValue(String v) {
        return valueOf(v);
    }

}
