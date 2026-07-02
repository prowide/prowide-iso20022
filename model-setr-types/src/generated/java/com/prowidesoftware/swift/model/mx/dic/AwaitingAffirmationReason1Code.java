
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwaitingAffirmationReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AwaitingAffirmationReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WAFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AwaitingAffirmationReason1Code")
@XmlEnum
public enum AwaitingAffirmationReason1Code {


    /**
     * Affirmation has not been received yet.
     * 
     */
    WAFF;

    public String value() {
        return name();
    }

    public static AwaitingAffirmationReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
