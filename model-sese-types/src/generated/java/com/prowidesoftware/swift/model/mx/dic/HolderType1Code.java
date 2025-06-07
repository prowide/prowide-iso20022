
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HolderType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TFEE"/&gt;
 *     &lt;enumeration value="TFOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HolderType1Code")
@XmlEnum
public enum HolderType1Code {


    /**
     * Holder is the transferee party. The transferee party may also be known as the acquiring party.
     * 
     */
    TFEE,

    /**
     * Holder is the transferor party. The transferee party may also be known as the ceding party.
     * 
     */
    TFOR;

    public String value() {
        return name();
    }

    public static HolderType1Code fromValue(String v) {
        return valueOf(v);
    }

}
