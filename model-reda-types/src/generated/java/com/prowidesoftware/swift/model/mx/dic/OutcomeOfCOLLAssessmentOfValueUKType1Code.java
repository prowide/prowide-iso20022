
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutcomeOfCOLLAssessmentOfValueUKType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutcomeOfCOLLAssessmentOfValueUKType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COL1"/&gt;
 *     &lt;enumeration value="COL2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutcomeOfCOLLAssessmentOfValueUKType1Code")
@XmlEnum
public enum OutcomeOfCOLLAssessmentOfValueUKType1Code {


    /**
     * Charges are justified based on assessment and any action identified or, where the first assessment is not yet due, based on initial product design.
     * 
     */
    @XmlEnumValue("COL1")
    COL_1("COL1"),

    /**
     * Charges are not justified, significant action is required.
     * 
     */
    @XmlEnumValue("COL2")
    COL_2("COL2");
    private final String value;

    OutcomeOfCOLLAssessmentOfValueUKType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutcomeOfCOLLAssessmentOfValueUKType1Code fromValue(String v) {
        for (OutcomeOfCOLLAssessmentOfValueUKType1Code c: OutcomeOfCOLLAssessmentOfValueUKType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
