
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MandateClassification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIXE"/&gt;
 *     &lt;enumeration value="USGB"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MandateClassification1Code")
@XmlEnum
public enum MandateClassification1Code {


    /**
     * Direct debit amount is fixed.
     * 
     */
    FIXE,

    /**
     * Direct debit amount is based on usage.
     * 
     */
    USGB,

    /**
     * Direct debit amount is variable.
     * 
     */
    VARI;

    public String value() {
        return name();
    }

    public static MandateClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
