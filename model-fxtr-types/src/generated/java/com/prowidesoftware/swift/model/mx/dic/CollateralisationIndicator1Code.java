
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralisationIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralisationIndicator1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="ONEW"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="UNCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralisationIndicator1Code")
@XmlEnum
public enum CollateralisationIndicator1Code {


    /**
     * Transaction is fully collateralised.
     * 
     */
    FULL,

    /**
     * Transaction is one-way collateralised.
     * 
     */
    ONEW,

    /**
     * Transaction is partially collateralised.
     * 
     */
    PART,

    /**
     * Transaction is uncollateralised.
     * 
     */
    UNCO;

    public String value() {
        return name();
    }

    public static CollateralisationIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
