
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionEventStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTI"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventStatus2Code")
@XmlEnum
public enum CorporateActionEventStatus2Code {


    /**
     * The CA event is active.
     * 
     */
    ACTI,

    /**
     * The CA event is cancelled.
     * 
     */
    CANC,

    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, eg, expired option.
     * 
     */
    INAC;

    public String value() {
        return name();
    }

    public static CorporateActionEventStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
