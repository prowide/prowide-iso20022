
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExoticOptionStyle1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExoticOptionStyle1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BINA"/&gt;
 *     &lt;enumeration value="DIGI"/&gt;
 *     &lt;enumeration value="NOTO"/&gt;
 *     &lt;enumeration value="VANI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExoticOptionStyle1Code")
@XmlEnum
public enum ExoticOptionStyle1Code {


    /**
     * Agreement under which a fixed amount is paid out if a specific condition is met at any time during the exercise period. The expiration style is European or American. The binary option has only "payment triggers".
     * 
     */
    BINA,

    /**
     * Agreement under which a fixed amount is paid out if a specific condition is met on expiration date. The digital option has only "payment triggers" which may be single or double trigger level.
     * 
     */
    DIGI,

    /**
     * Agreement under which a fixed amount is paid unless a specific condition is met. The notouch option has only "no payment triggers" which may be single or double trigger levels.
     * 
     */
    NOTO,

    /**
     * Contract that provides the buyer the right but not the obligation to buy or sell the underlying currency at a predetermined rate with expiration determined by the expiration style. The expiration style is European, American, Asian or Bermudan.
     * 
     */
    VANI;

    public String value() {
        return name();
    }

    public static ExoticOptionStyle1Code fromValue(String v) {
        return valueOf(v);
    }

}
