
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStage4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventStage4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="RESC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventStage4Code")
@XmlEnum
public enum CorporateActionEventStage4Code {


    /**
     * Cancellation and re-run of an original lottery or an original and supplemental lottery. A subsequent lottery will be performed under a new event.
     * 
     */
    FULL,

    /**
     * Cancellation and re-run of a supplemental lottery only. A subsequent new supplemental lottery will be performed under the original event.
     * 
     */
    PART,

    /**
     * A supplemental lottery is being cancelled by the issuer. No subsequent lottery will be performed.
     * 
     */
    RESC;

    public String value() {
        return name();
    }

    public static CorporateActionEventStage4Code fromValue(String v) {
        return valueOf(v);
    }

}
