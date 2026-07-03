
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingTransferable1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HoldingTransferable1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRAL"/&gt;
 *     &lt;enumeration value="TRNA"/&gt;
 *     &lt;enumeration value="RFOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HoldingTransferable1Code")
@XmlEnum
public enum HoldingTransferable1Code {


    /**
     * Transfer is allowed.
     * 
     */
    TRAL,

    /**
     * Transfer is not allowed.
     * 
     */
    TRNA,

    /**
     * Indicates that the operation is only possible in restricted circumstances.
     * 
     */
    RFOD;

    public String value() {
        return name();
    }

    public static HoldingTransferable1Code fromValue(String v) {
        return valueOf(v);
    }

}
