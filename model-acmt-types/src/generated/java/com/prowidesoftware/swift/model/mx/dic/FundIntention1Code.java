
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundIntention1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundIntention1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YQUA"/&gt;
 *     &lt;enumeration value="NQUA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundIntention1Code")
@XmlEnum
public enum FundIntention1Code {


    /**
     * Qualified.
     * 
     */
    YQUA,

    /**
     * Not qualified.
     * 
     */
    NQUA;

    public String value() {
        return name();
    }

    public static FundIntention1Code fromValue(String v) {
        return valueOf(v);
    }

}
