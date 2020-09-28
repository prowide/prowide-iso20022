
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentResultType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssessmentResultType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FVRB"/&gt;
 *     &lt;enumeration value="NTAV"/&gt;
 *     &lt;enumeration value="UFVB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
