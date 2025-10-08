
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDistribution2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationDistribution2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="PAPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationDistribution2Code")
@XmlEnum
public enum InformationDistribution2Code {


    /**
     * Electronic distribution.
     * 
     */
    ELEC,

    /**
     * No distribution.
     * 
     */
    NONE,

    /**
     * Paper distribution.
     * 
     */
    PAPR;

    public String value() {
        return name();
    }

    public static InformationDistribution2Code fromValue(String v) {
        return valueOf(v);
    }

}
