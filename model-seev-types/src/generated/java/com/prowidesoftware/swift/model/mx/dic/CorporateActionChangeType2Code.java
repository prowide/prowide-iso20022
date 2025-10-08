
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionChangeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionChangeType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BERE"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="DEPH"/&gt;
 *     &lt;enumeration value="GPPH"/&gt;
 *     &lt;enumeration value="GTGP"/&gt;
 *     &lt;enumeration value="GTPH"/&gt;
 *     &lt;enumeration value="NAME"/&gt;
 *     &lt;enumeration value="PHDE"/&gt;
 *     &lt;enumeration value="REBE"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionChangeType2Code")
@XmlEnum
public enum CorporateActionChangeType2Code {


    /**
     * Change from bearer into registered form.
     * 
     */
    BERE,

    /**
     * Change of all instruments into certificates.
     * 
     */
    CERT,

    /**
     * Change from dematerialised into physical form.
     * 
     */
    DEPH,

    /**
     * Change from global permanent to physical form.
     * 
     */
    GPPH,

    /**
     * Change from global temporary to global permanent form.
     * 
     */
    GTGP,

    /**
     * Change from global temporary to physical form.
     * 
     */
    GTPH,

    /**
     * The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.
     * 
     */
    NAME,

    /**
     * Change from physical into dematerialised form.
     * 
     */
    PHDE,

    /**
     * Change from registered into bearer form.
     * 
     */
    REBE,

    /**
     * Change in the terms of the security.
     * 
     */
    TERM;

    public String value() {
        return name();
    }

    public static CorporateActionChangeType2Code fromValue(String v) {
        return valueOf(v);
    }

}
