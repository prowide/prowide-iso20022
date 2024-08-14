
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataModification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataModification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INSE"/>
 *     <enumeration value="UPDT"/>
 *     <enumeration value="DELT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataModification1Code")
@XmlEnum
public enum DataModification1Code {


    /**
     * Insert a new set of data.
     * 
     */
    INSE,

    /**
     * Update the details of an existing set of data.
     * 
     */
    UPDT,

    /**
     * Delete an existing set of data.
     * 
     */
    DELT;

    public String value() {
        return name();
    }

    public static DataModification1Code fromValue(String v) {
        return valueOf(v);
    }

}
