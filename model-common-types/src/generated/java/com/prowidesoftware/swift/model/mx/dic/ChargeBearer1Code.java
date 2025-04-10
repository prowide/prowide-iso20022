
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBearer1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeBearer1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OUR"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="SHA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeBearer1Code")
@XmlEnum
public enum ChargeBearer1Code {


    /**
     * All transaction charges are to be borne by the debtor.
     * 
     */
    OUR,

    /**
     * All transaction charges are to be borne by the creditor.
     * 
     */
    BEN,

    /**
     * Under the credit transfer scenario, transaction charges on the sender's side are to be borne by the debtor; transaction charges on the receiver's side are to be borne by the creditor.
     * 
     */
    SHA;

    public String value() {
        return name();
    }

    public static ChargeBearer1Code fromValue(String v) {
        return valueOf(v);
    }

}
