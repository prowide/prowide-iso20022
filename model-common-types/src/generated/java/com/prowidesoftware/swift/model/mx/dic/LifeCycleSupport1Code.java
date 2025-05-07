
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleSupport1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LifeCycleSupport1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="FINC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LifeCycleSupport1Code")
@XmlEnum
public enum LifeCycleSupport1Code {


    /**
     * Assigned at authorisation time.
     * 
     */
    AUTH,

    /**
     * Assigned at financial time.
     * 
     */
    FINC;

    public String value() {
        return name();
    }

    public static LifeCycleSupport1Code fromValue(String v) {
        return valueOf(v);
    }

}
