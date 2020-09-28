
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnaffirmedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnaffirmedReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NAFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnaffirmedReason1Code")
@XmlEnum
public enum UnaffirmedReason1Code {


    /**
     * Specifies the reason the counterparty has not affirmed.
     * 
     */
    NAFF;

    public String value() {
        return name();
    }

    public static UnaffirmedReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
