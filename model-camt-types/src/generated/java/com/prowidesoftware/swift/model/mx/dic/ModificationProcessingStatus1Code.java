
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModificationProcessingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="MODC"/>
 *     <enumeration value="DEND"/>
 *     <enumeration value="MODP"/>
 *     <enumeration value="REPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModificationProcessingStatus1Code")
@XmlEnum
public enum ModificationProcessingStatus1Code {


    /**
     * Modification request has been acknowledged for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Modification has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Modification has been completed.
     * 
     */
    MODC,

    /**
     * Modification will not be executed.
     * 
     */
    DEND,

    /**
     * Modification is pending. It is not known at this time whether modified can be executed.
     * 
     */
    MODP,

    /**
     * Modification request is in repair.
     * 
     */
    REPR;

    public String value() {
        return name();
    }

    public static ModificationProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
