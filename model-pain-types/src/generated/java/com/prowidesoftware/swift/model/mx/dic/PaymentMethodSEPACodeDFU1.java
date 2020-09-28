
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodSEPACode_DFU1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodSEPACode_DFU1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRF"/&gt;
 *     &lt;enumeration value="DD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodSEPACode_DFU1")
@XmlEnum
public enum PaymentMethodSEPACodeDFU1 {


    /**
     * TRF
     * 
     */
    TRF,

    /**
     * DD
     * 
     */
    DD;

    public String value() {
        return name();
    }

    public static PaymentMethodSEPACodeDFU1 fromValue(String v) {
        return valueOf(v);
    }

}
