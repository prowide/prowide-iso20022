
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionFeatures11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASVO"/&gt;
 *     &lt;enumeration value="BOIS"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="MAXC"/&gt;
 *     &lt;enumeration value="MAXS"/&gt;
 *     &lt;enumeration value="NOSE"/&gt;
 *     &lt;enumeration value="OPLF"/&gt;
 *     &lt;enumeration value="CAOS"/&gt;
 *     &lt;enumeration value="PINS"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *     &lt;enumeration value="VVPR"/&gt;
 *     &lt;enumeration value="QCAS"/&gt;
 *     &lt;enumeration value="SHAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionFeatures11Code")
@XmlEnum
public enum OptionFeatures11Code {


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
     * Indicates the previously sent instructions becomes invalid. This is only applicable after a market deadline extension.
     * 
     */
    PINS,

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
     * Feature whereby the holder should only instruct a cash amount.
     * 
     */
    QCAS,

    /**
     * Indicates usage of a reference number to identify an investor or a shareholder with the issuer or the registration provider (for instance allocation code).
     * 
     */
    SHAR;

    public String value() {
        return name();
    }

    public static OptionFeatures11Code fromValue(String v) {
        return valueOf(v);
    }

}
