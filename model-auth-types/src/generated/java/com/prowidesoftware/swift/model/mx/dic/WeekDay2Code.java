
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekDay2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekDay2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEDD"/&gt;
 *     &lt;enumeration value="TUED"/&gt;
 *     &lt;enumeration value="THUD"/&gt;
 *     &lt;enumeration value="SUND"/&gt;
 *     &lt;enumeration value="SATD"/&gt;
 *     &lt;enumeration value="MOND"/&gt;
 *     &lt;enumeration value="FRID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeekDay2Code")
@XmlEnum
public enum WeekDay2Code {


    /**
     * Wednesday.
     * 
     */
    WEDD,

    /**
     * Tuesday.
     * 
     */
    TUED,

    /**
     * Thursday.
     * 
     */
    THUD,

    /**
     * Sunday.
     * 
     */
    SUND,

    /**
     * Saturday.
     * 
     */
    SATD,

    /**
     * Monday.
     * 
     */
    MOND,

    /**
     * Friday.
     * 
     */
    FRID;

    public String value() {
        return name();
    }

    public static WeekDay2Code fromValue(String v) {
        return valueOf(v);
    }

}
