
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentOfValueRequiredUnderCOLLUKType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssessmentOfValueRequiredUnderCOLLUKType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YSCO"/&gt;
 *     &lt;enumeration value="NSCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssessmentOfValueRequiredUnderCOLLUKType1Code")
@XmlEnum
public enum AssessmentOfValueRequiredUnderCOLLUKType1Code {


    /**
     * Assessement of value is required.
     * 
     */
    YSCO,

    /**
     * Assessement of value is not required.
     * 
     */
    NSCO;

    public String value() {
        return name();
    }

    public static AssessmentOfValueRequiredUnderCOLLUKType1Code fromValue(String v) {
        return valueOf(v);
    }

}
