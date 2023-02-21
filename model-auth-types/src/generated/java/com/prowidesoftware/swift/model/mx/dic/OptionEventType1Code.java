
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionEventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionEventType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLST"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="KNIN"/&gt;
 *     &lt;enumeration value="KNOC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="TRIG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionEventType1Code")
@XmlEnum
public enum OptionEventType1Code {


    /**
     * Notice of a close out of the position.
     * 
     */
    CLST,

    /**
     * First confirmation.
     * 
     */
    CONF,

    /**
     * Notice of a knock-in. The option has a specified spot level, which, if touched during the knock-in period, triggers the option into existence. Prior to that level being touched, no option exists.
     * 
     */
    KNIN,

    /**
     * Notice of a knock-out. The option has a specified spot level, which, if touched during the knock-out period, terminates the option.
     * 
     */
    KNOC,

    /**
     * Another type of event.
     * 
     */
    OTHR,

    /**
     * Notice of a trigger hit.
     * 
     */
    TRIG;

    public String value() {
        return name();
    }

    public static OptionEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
