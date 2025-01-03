
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POIComponentStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WAIT"/>
 *     <enumeration value="OUTD"/>
 *     <enumeration value="OPER"/>
 *     <enumeration value="DACT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POIComponentStatus1Code")
@XmlEnum
public enum POIComponentStatus1Code {


    /**
     * Component not yet activated.
     * 
     */
    WAIT,

    /**
     * Component not working properly.
     * 
     */
    OUTD,

    /**
     * Component activated and in operation.
     * 
     */
    OPER,

    /**
     * Component has been deactivated.
     * 
     */
    DACT;

    public String value() {
        return name();
    }

    public static POIComponentStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
