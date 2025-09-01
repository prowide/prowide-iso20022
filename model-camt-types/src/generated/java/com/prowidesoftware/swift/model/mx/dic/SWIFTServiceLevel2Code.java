
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWIFTServiceLevel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SWIFTServiceLevel2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPAY"/&gt;
 *     &lt;enumeration value="SSTD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SWIFTServiceLevel2Code")
@XmlEnum
public enum SWIFTServiceLevel2Code {


    /**
     * Credit transfer is to be processed according to the SWIFTPay Service Level.
     * 
     */
    SPAY,

    /**
     * Credit transfer is to be processed according to the Standard Service Level.
     * 
     */
    SSTD;

    public String value() {
        return name();
    }

    public static SWIFTServiceLevel2Code fromValue(String v) {
        return valueOf(v);
    }

}
