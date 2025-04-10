
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collateral1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Collateral1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="NCOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Collateral1Code")
@XmlEnum
public enum Collateral1Code {


    /**
     * Item is used as collateral.
     * 
     */
    COLL,

    /**
     * Item is not used as collateral.
     * 
     */
    NCOL;

    public String value() {
        return name();
    }

    public static Collateral1Code fromValue(String v) {
        return valueOf(v);
    }

}
