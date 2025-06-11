
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventProcessingType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventProcessingType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISN"/&gt;
 *     &lt;enumeration value="GENL"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="REOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventProcessingType2Code")
@XmlEnum
public enum CorporateActionEventProcessingType2Code {


    /**
     * Holder of the relevant security on a certain date, for example, the record date, will receive a benefit without giving up the underlying security.
     * 
     */
    DISN,

    /**
     * No debit or credit of resources.
     * 
     */
    GENL,

    /**
     * Indicates that the announcement is for a redemption of securities for events including full and partial calls, maturities partial prerefunding and partial defeasance events.
     * 
     * 
     */
    REDM,

    /**
     * Underlying security will be debited and may be replaced by another resource (or resources).
     * 
     */
    REOR;

    public String value() {
        return name();
    }

    public static CorporateActionEventProcessingType2Code fromValue(String v) {
        return valueOf(v);
    }

}
