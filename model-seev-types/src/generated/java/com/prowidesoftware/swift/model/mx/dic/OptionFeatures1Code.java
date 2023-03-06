
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionFeatures1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="MAXC"/&gt;
 *     &lt;enumeration value="MAXS"/&gt;
 *     &lt;enumeration value="OPLF"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *     &lt;enumeration value="QOVE"/&gt;
 *     &lt;enumeration value="QREC"/&gt;
 *     &lt;enumeration value="VVPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
