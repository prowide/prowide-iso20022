
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageItemCondition1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageItemCondition1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MNDT"/&gt;
 *     &lt;enumeration value="CFVL"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="ALWV"/&gt;
 *     &lt;enumeration value="IFAV"/&gt;
 *     &lt;enumeration value="COPY"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageItemCondition1Code")
@XmlEnum
public enum MessageItemCondition1Code {


    /**
     * Message item must be present.
     * 
     */
    MNDT,

    /**
     * Message item must be present with the configured value.
     * 
     */
    CFVL,

    /**
     * Message item has the configured value if the item is absent.
     * 
     */
    DFLT,

    /**
     * Message item must have one of the configured values.
     * 
     */
    ALWV,

    /**
     * Message item has to be present if available.
     * 
     */
    IFAV,

    /**
     * Message item is present if it was present in a previous related message with the same value.
     * 
     */
    COPY,

    /**
     * Message item is not supported and has to be absent.
     * 
     */
    UNSP;

    public String value() {
        return name();
    }

    public static MessageItemCondition1Code fromValue(String v) {
        return valueOf(v);
    }

}
