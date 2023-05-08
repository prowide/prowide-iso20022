
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXDA"/>
 *     <enumeration value="TRDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataType1Code")
@XmlEnum
public enum DataType1Code {


    /**
     * Specified type of data is exercise data.
     * 
     */
    EXDA,

    /**
     * Specified type of data is trading data.
     * 
     */
    TRDA;

    public String value() {
        return name();
    }

    public static DataType1Code fromValue(String v) {
        return valueOf(v);
    }

}
