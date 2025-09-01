
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferInFunction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferInFunction2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="ADVI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferInFunction2Code")
@XmlEnum
public enum TransferInFunction2Code {


    /**
     * The transfer-in is a confirmation (rather than an advice).
     * 
     */
    CONF,

    /**
     * The transfer-in provides advice about account information for a transfer.
     * 
     */
    ADVI;

    public String value() {
        return name();
    }

    public static TransferInFunction2Code fromValue(String v) {
        return valueOf(v);
    }

}
