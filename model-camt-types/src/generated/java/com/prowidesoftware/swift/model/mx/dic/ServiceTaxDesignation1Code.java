
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceTaxDesignation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceTaxDesignation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XMPT"/&gt;
 *     &lt;enumeration value="ZERO"/&gt;
 *     &lt;enumeration value="TAXE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceTaxDesignation1Code")
@XmlEnum
public enum ServiceTaxDesignation1Code {


    /**
     * No taxes are due.
     * 
     */
    XMPT,

    /**
     * Tax is due but at zero percent and a zero charge.
     * 
     */
    ZERO,

    /**
     * One or more taxes are due on this service.
     * 
     */
    TAXE;

    public String value() {
        return name();
    }

    public static ServiceTaxDesignation1Code fromValue(String v) {
        return valueOf(v);
    }

}
