
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXDA"/&gt;
 *     &lt;enumeration value="TRDA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
