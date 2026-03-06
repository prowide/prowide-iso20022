
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationProcessingStatus1Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModificationProcessingStatus1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="MODC"/>
 *     <enumeration value="DEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModificationProcessingStatus1Code__1")
@XmlEnum
public enum ModificationProcessingStatus1Code1 {


    /**
     * Modification request has been acknowledged for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Modification has been completed.
     * 
     */
    MODC,

    /**
     * Modification will not be executed.
     * 
     */
    DEND;

    public String value() {
        return name();
    }

    public static ModificationProcessingStatus1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
