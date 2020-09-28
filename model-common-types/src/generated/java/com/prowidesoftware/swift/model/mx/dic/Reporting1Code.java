
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reporting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reporting1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STEX"/&gt;
 *     &lt;enumeration value="REGU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Reporting1Code")
@XmlEnum
public enum Reporting1Code {


    /**
     * Trade details are to be reported to a stock exchange
     * 
     */
    STEX,

    /**
     * Trade details are to be reported to a regulatory organisation.
     * 
     */
    REGU;

    public String value() {
        return name();
    }

    public static Reporting1Code fromValue(String v) {
        return valueOf(v);
    }

}
