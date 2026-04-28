
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionReference1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionReference1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *     &lt;enumeration value="ADDC"/&gt;
 *     &lt;enumeration value="ADDS"/&gt;
 *     &lt;enumeration value="REMC"/&gt;
 *     &lt;enumeration value="REMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestrictionReference1Code")
@XmlEnum
public enum RestrictionReference1Code {


    /**
     * Addition of a cash restriction reference representing a cash sub-balance to be utilised within the settlement instruction for the debiting or crediting of cash.
     * 
     */
    ADDC,

    /**
     * Addition of a securities restriction reference representing a securities sub-position to be utilised within the settlement instruction for the delivery or receipt of securities.
     * 
     */
    ADDS,

    /**
     * Removal of a cash restriction reference, already present within the settlement instruction, representing a cash sub-balance to be utilised within the settlement instruction for the debiting or crediting of cash.
     * 
     */
    REMC,

    /**
     * Removal of a securities restriction reference, already present within the settlement instruction, representing a securities sub-position to be utilised within the settlement instruction for the delivery or receipt of securities. 
     * 
     */
    REMS;

    public String value() {
        return name();
    }

    public static RestrictionReference1Code fromValue(String v) {
        return valueOf(v);
    }

}
