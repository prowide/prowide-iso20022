
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMandatoryVoluntary1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionMandatoryVoluntary1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAND"/&gt;
 *     &lt;enumeration value="CHOS"/&gt;
 *     &lt;enumeration value="VOLU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionMandatoryVoluntary1Code")
@XmlEnum
public enum CorporateActionMandatoryVoluntary1Code {


    /**
     * Participation in CA event is mandatory. Further instructions from the account owner are not required.
     * 
     */
    MAND,

    /**
     * Participation in the corporate action is mandatory and further instructions from the account owner are required, unless a default option has been specified.
     * 
     */
    CHOS,

    /**
     * Participation in the corporate action is voluntary. If the owner wishes to take part in the event, instructions from the account owner are required.
     * 
     */
    VOLU;

    public String value() {
        return name();
    }

    public static CorporateActionMandatoryVoluntary1Code fromValue(String v) {
        return valueOf(v);
    }

}
