
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProformaStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProformaStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MODI"/&gt;
 *     &lt;enumeration value="RIGH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProformaStatusReason1Code")
@XmlEnum
public enum ProformaStatusReason1Code {


    /**
     * Modification to the account data is in process.
     * 
     */
    MODI,

    /**
     * Account opening is waiting for rights holder information.
     * 
     */
    RIGH;

    public String value() {
        return name();
    }

    public static ProformaStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
