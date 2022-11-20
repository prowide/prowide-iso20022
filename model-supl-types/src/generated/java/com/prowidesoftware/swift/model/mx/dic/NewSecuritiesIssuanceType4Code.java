
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewSecuritiesIssuanceType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REFU"/&gt;
 *     &lt;enumeration value="NREF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NewSecuritiesIssuanceType4Code")
@XmlEnum
public enum NewSecuritiesIssuanceType4Code {


    /**
     * New security issued that has been refunded to an earlier maturity date. Applicable only in the frame of a partial defeasance PDEF corporate action event.
     * 
     */
    REFU,

    /**
     * New Security issued that has not been refunded and the maturity date of the original underlying security is unchanged. Applicable only in the frame of a Partial Defeasance PDEF corporate action event.
     * 
     */
    NREF;

    public String value() {
        return name();
    }

    public static NewSecuritiesIssuanceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
