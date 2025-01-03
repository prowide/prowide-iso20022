
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HolderType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TFEE"/>
 *     <enumeration value="TFOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
