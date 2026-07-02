
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialResponseRisk1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonFinancialResponseRisk1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DECL"/&gt;
 *     &lt;enumeration value="NCHG"/&gt;
 *     &lt;enumeration value="ONLN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonFinancialResponseRisk1Code")
@XmlEnum
public enum NonFinancialResponseRisk1Code {


    /**
     * A decline of the transaction is expected by the POI to manage risk.
     * 
     */
    DECL,

    /**
     * The POI is able to assess the risk by himself.
     * 
     */
    NCHG,

    /**
     * An authorisation is expected from the POI to manage risk.
     * 
     */
    ONLN;

    public String value() {
        return name();
    }

    public static NonFinancialResponseRisk1Code fromValue(String v) {
        return valueOf(v);
    }

}
