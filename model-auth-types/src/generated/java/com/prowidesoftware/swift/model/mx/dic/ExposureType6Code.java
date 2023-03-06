
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SBSC"/&gt;
 *     &lt;enumeration value="MGLD"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="SLEB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureType6Code")
@XmlEnum
public enum ExposureType6Code {


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
     * Relates to repurchase agreement trading.
     * 
     */
    REPO,

    /**
     * Exposure is linked to a securities lending or borrowing activity.
     * 
     */
    SLEB;

    public String value() {
        return name();
    }

    public static ExposureType6Code fromValue(String v) {
        return valueOf(v);
    }

}
