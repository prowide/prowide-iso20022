
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaselineStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaselineStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="CLSD"/&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaselineStatus2Code")
@XmlEnum
public enum BaselineStatus2Code {


    /**
     * State of a baseline, after establishment, when all match instructions have been processed, and no such instruction is allowed anymore.
     * 
     */
    COMP,

    /**
     * Final state of a baseline, in which only reporting is allowed.
     * 
     */
    CLSD,

    /**
     * State of a baseline, after establishment, when one or more instructions (eg, amendment request, data set submission) have been processed.
     * 
     */
    ACTV;

    public String value() {
        return name();
    }

    public static BaselineStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
