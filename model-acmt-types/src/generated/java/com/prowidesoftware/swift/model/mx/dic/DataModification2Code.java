
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataModification2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataModification2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSE"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataModification2Code")
@XmlEnum
public enum DataModification2Code {


    /**
     * Insert a new set of data.
     * 
     */
    INSE,

    /**
     * Delete an existing set of data.
     * 
     */
    DELT;

    public String value() {
        return name();
    }

    public static DataModification2Code fromValue(String v) {
        return valueOf(v);
    }

}
