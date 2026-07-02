
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionFeatures14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="MAXC"/&gt;
 *     &lt;enumeration value="MAXS"/&gt;
 *     &lt;enumeration value="OPLF"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *     &lt;enumeration value="VVPR"/&gt;
 *     &lt;enumeration value="RGRS"/&gt;
 *     &lt;enumeration value="RNET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
