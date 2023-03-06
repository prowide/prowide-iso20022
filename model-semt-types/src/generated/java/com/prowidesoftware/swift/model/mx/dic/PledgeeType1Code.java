
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PledgeeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PledgeeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPTY"/&gt;
 *     &lt;enumeration value="REGB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PledgeeType1Code")
@XmlEnum
public enum PledgeeType1Code {


    /**
     * Financial instruments are pledged to a counterparty.
     * 
     */
    CPTY,

    /**
     * Financial instruments are pledged to a regulatory body.
     * 
     */
    REGB;

    public String value() {
        return name();
    }

    public static PledgeeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
