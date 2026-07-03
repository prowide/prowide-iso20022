
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSetType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASE"/&gt;
 *     &lt;enumeration value="TRDS"/&gt;
 *     &lt;enumeration value="CODS"/&gt;
 *     &lt;enumeration value="INDS"/&gt;
 *     &lt;enumeration value="CEDS"/&gt;
 *     &lt;enumeration value="OCDS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetType2Code")
@XmlEnum
public enum DataSetType2Code {


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
    CODS,

    /**
     * Data set is an insurance data set.
     * 
     */
    INDS,

    /**
     * Data set is a certificate data set.
     * 
     */
    CEDS,

    /**
     * Data set is an other special certificate data set.
     * 
     */
    OCDS;

    public String value() {
        return name();
    }

    public static DataSetType2Code fromValue(String v) {
        return valueOf(v);
    }

}
