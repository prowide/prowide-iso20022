
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASE"/&gt;
 *     &lt;enumeration value="TRDS"/&gt;
 *     &lt;enumeration value="CODS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
