
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PensionOrderType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EARM"/&gt;
 *     &lt;enumeration value="SHAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PensionOrderType1Code")
@XmlEnum
public enum PensionOrderType1Code {


    /**
     * Pension policy, plan or scheme has been earmarked (set aside.)
     * 
     */
    EARM,

    /**
     * Sharing order for the pension policy, plan or scheme has been issued by a court.
     * 
     */
    SHAR;

    public String value() {
        return name();
    }

    public static PensionOrderType1Code fromValue(String v) {
        return valueOf(v);
    }

}
