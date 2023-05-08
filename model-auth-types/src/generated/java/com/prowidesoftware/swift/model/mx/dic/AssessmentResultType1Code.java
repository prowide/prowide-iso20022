
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentResultType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssessmentResultType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FVRB"/>
 *     <enumeration value="NTAV"/>
 *     <enumeration value="UFVB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssessmentResultType1Code")
@XmlEnum
public enum AssessmentResultType1Code {


    /**
     * Relates to favourable result.
     * 
     */
    FVRB,

    /**
     * Assesment Resultis not available.
     * 
     */
    NTAV,

    /**
     * Relates to unfavourable result.
     * 
     * 
     */
    UFVB;

    public String value() {
        return name();
    }

    public static AssessmentResultType1Code fromValue(String v) {
        return valueOf(v);
    }

}
