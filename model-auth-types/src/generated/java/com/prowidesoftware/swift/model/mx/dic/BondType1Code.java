
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BondType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BondType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUSB"/&gt;
 *     &lt;enumeration value="OEPB"/&gt;
 *     &lt;enumeration value="CVTB"/&gt;
 *     &lt;enumeration value="CRPB"/&gt;
 *     &lt;enumeration value="CVDB"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BondType1Code")
@XmlEnum
public enum BondType1Code {


    /**
     * Bond of type sovereign bond.
     * 
     * 
     */
    EUSB,

    /**
     * Bond of type other public bond.
     * 
     */
    OEPB,

    /**
     * Bond of type convertible bond.
     * 
     */
    CVTB,

    /**
     * Bond of type corporate Bond.
     * 
     * 
     */
    CRPB,

    /**
     * Bond of type covered Bond.
     * 
     */
    CVDB,

    /**
     * Other bond type.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static BondType1Code fromValue(String v) {
        return valueOf(v);
    }

}
