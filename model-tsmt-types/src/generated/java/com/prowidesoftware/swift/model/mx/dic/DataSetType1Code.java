
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DataSetType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BASE"/>
 *     <enumeration value="TRDS"/>
 *     <enumeration value="CODS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DataSetType1Code")
@XmlEnum
public enum DataSetType1Code {


    /**
     * Data set is a baseline.
     * 
     */
    BASE,

    /**
     * Data set is a transport data set.
     * 
     */
    TRDS,

    /**
     * Data set is a commercial data set.
     * 
     */
    CODS;

    public String value() {
        return name();
    }

    public static DataSetType1Code fromValue(String v) {
        return valueOf(v);
    }

}
