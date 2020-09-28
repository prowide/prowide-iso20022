
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionFrequencyType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionFrequencyType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionFrequencyType4Code")
@XmlEnum
public enum CorporateActionFrequencyType4Code {


    /**
     * Special Dividend with reinvestment component.  
     * 
     */
    SPRE;

    public String value() {
        return name();
    }

    public static CorporateActionFrequencyType4Code fromValue(String v) {
        return valueOf(v);
    }

}
