
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWrapperAmountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxWrapperAmountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxWrapperAmountType1Code")
@XmlEnum
public enum TaxWrapperAmountType1Code {


    /**
     * Type of amount is a bonus, for example, a government bonus.
     * 
     */
    BONU,

    /**
     * Type of amount is a withdrawal, for example, a withdrawal for a first time residential purchase.
     * 
     */
    WTHD;

    public String value() {
        return name();
    }

    public static TaxWrapperAmountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
