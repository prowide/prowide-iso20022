
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingProcess1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchingProcess1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNMT"/&gt;
 *     &lt;enumeration value="MTRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatchingProcess1Code")
@XmlEnum
public enum MatchingProcess1Code {


    /**
     * The referrenced transaction is requested to be unmatched.
     * 
     */
    UNMT,

    /**
     * Matching process is to be resumed for the referrenced transaction.
     * 
     */
    MTRE;

    public String value() {
        return name();
    }

    public static MatchingProcess1Code fromValue(String v) {
        return valueOf(v);
    }

}
