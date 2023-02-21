
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeWorkflowStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivativeWorkflowStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PREL"/&gt;
 *     &lt;enumeration value="ADJU"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="UCON"/&gt;
 *     &lt;enumeration value="DLTD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DerivativeWorkflowStatus1Code")
@XmlEnum
public enum DerivativeWorkflowStatus1Code {


    /**
     * Notice is an advance warning that an adjustment may be applied.
     * 
     */
    PREL,

    /**
     * Notice confirms that an adjustment will be applied.
     * 
     */
    ADJU,

    /**
     * Notice confirms that no adjustment will be applied.
     * 
     */
    NOAC,

    /**
     * GCA VS (Global Corporate Actions Validation Service) is unable to confirm that there is a corporate action corresponding to this notice.
     * 
     */
    UCON,

    /**
     * Details were entered in error. All data should be ignored.
     * 
     */
    DLTD;

    public String value() {
        return name();
    }

    public static DerivativeWorkflowStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
