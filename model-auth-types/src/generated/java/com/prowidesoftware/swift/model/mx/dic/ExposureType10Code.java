
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SBSC"/&gt;
 *     &lt;enumeration value="MGLD"/&gt;
 *     &lt;enumeration value="SLEB"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureType10Code")
@XmlEnum
public enum ExposureType10Code {


    /**
     * Securities buy sell back.
     * 
     */
    SBSC,

    /**
     * Margin lending transaction. 
     * 
     */
    MGLD,

    /**
     * Exposure is linked to a securities lending or borrowing activity.
     * 
     */
    SLEB,

    /**
     * Relates to repurchase agreement trading.
     * 
     */
    REPO;

    public String value() {
        return name();
    }

    public static ExposureType10Code fromValue(String v) {
        return valueOf(v);
    }

}
