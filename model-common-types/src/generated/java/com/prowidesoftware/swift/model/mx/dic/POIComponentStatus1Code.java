
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="POIComponentStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WAIT"/&gt;
 *     &lt;enumeration value="OUTD"/&gt;
 *     &lt;enumeration value="OPER"/&gt;
 *     &lt;enumeration value="DACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
