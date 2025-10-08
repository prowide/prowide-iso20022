
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="ONGO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateType6Code")
@XmlEnum
public enum DateType6Code {


    /**
     * Open-dated, which indicates that the date has not been established.
     * 
     */
    OPEN,

    /**
     * Date is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Ongoing basis, which indicates that the date is determined by "ongoing basis" process, for example "au fil de l'eau".
     * 
     */
    ONGO;

    public String value() {
        return name();
    }

    public static DateType6Code fromValue(String v) {
        return valueOf(v);
    }

}
