
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionFeatures7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAOS"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="MAXC"/&gt;
 *     &lt;enumeration value="MAXS"/&gt;
 *     &lt;enumeration value="OPLF"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *     &lt;enumeration value="VVPR"/&gt;
 *     &lt;enumeration value="NOSE"/&gt;
 *     &lt;enumeration value="PINS"/&gt;
 *     &lt;enumeration value="ASVO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionFeatures7Code")
@XmlEnum
public enum OptionFeatures7Code {


    /**
     * Option applicability is not subject to the account owner decision but depends on the terms defined by the issuer, for example in the case of equity linked notes or warrants.
     * 
     */
    CAOS,

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
     * Feature whereby the holder must elect directly to the issuer's agent (issuer only supported option).
     * 
     */
    NOSE,

    /**
     * Indicates the previously sent instructions becomes invalid. This is only applicable after a market deadline extension.
     * 
     */
    PINS,

    /**
     * Option is offered by the account servicer only.
     * 
     */
    ASVO;

    public String value() {
        return name();
    }

    public static OptionFeatures7Code fromValue(String v) {
        return valueOf(v);
    }

}
