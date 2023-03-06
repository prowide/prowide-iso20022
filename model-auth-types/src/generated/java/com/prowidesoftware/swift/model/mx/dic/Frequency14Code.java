
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency14Code")
@XmlEnum
public enum Frequency14Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place on request or as necessary.
     * 
     */
    ADHO;

    public String value() {
        return name();
    }

    public static Frequency14Code fromValue(String v) {
        return valueOf(v);
    }

}
