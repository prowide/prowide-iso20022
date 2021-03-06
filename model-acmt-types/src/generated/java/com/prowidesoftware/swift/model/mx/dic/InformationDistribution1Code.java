
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDistribution1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationDistribution1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="PAPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationDistribution1Code")
@XmlEnum
public enum InformationDistribution1Code {


    /**
     * Electronic distribution.
     * 
     */
    ELEC,

    /**
     * Paper distribution.
     * 
     */
    PAPR;

    public String value() {
        return name();
    }

    public static InformationDistribution1Code fromValue(String v) {
        return valueOf(v);
    }

}
