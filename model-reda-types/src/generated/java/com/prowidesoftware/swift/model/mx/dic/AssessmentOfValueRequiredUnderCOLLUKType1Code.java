
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentOfValueRequiredUnderCOLLUKType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssessmentOfValueRequiredUnderCOLLUKType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YSCO"/>
 *     <enumeration value="NSCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
