
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommissionType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommissionType5Code")
@XmlEnum
public enum CommissionType5Code {


    /**
     * Type of service for which the commission is asked or paid.
     * 
     */
    FEND,

    /**
     * Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time.
     * 
     */
    BEND,

    /**
     * Commission is another type of transaction.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CommissionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
