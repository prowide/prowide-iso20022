
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataModification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataModification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSE"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
