
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralisationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralisationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLCL"/&gt;
 *     &lt;enumeration value="OWCL"/&gt;
 *     &lt;enumeration value="PRCL"/&gt;
 *     &lt;enumeration value="UNCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralisationType1Code")
@XmlEnum
public enum CollateralisationType1Code {


    /**
     * Fully collateralised.
     * 
     */
    FLCL,

    /**
     * One way collateralised.
     * 
     */
    OWCL,

    /**
     * Partially collateralised.
     * 
     */
    PRCL,

    /**
     * Uncollateralised.
     * 
     */
    UNCL;

    public String value() {
        return name();
    }

    public static CollateralisationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
