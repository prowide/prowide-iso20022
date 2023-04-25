
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModificationLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PSTN"/>
 *     <enumeration value="TCTN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModificationLevel1Code")
@XmlEnum
public enum ModificationLevel1Code {


    /**
     * Modification applies to a position.
     * 
     */
    PSTN,

    /**
     * Modification applies to a transaction.
     * 
     */
    TCTN;

    public String value() {
        return name();
    }

    public static ModificationLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
