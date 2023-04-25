
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProformaStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProformaStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MODI"/>
 *     <enumeration value="RIGH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProformaStatusReason1Code")
@XmlEnum
public enum ProformaStatusReason1Code {


    /**
     * Modification to the account data is in process.
     * 
     */
    MODI,

    /**
     * Account opening is waiting for rights holder information.
     * 
     */
    RIGH;

    public String value() {
        return name();
    }

    public static ProformaStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
