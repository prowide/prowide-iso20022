
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyAssigner2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyAssigner2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASSO"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="CPNY"/&gt;
 *     &lt;enumeration value="LEII"/&gt;
 *     &lt;enumeration value="TRAG"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompanyAssigner2Code")
@XmlEnum
public enum CompanyAssigner2Code {


    /**
     * Any relevant association in charge of assigning an identification to a company.
     * 
     */
    ASSO,

    /**
     * Legal authority assigning an identification to a company (for example, a local, regional or national authority).
     * 
     */
    AUTH,

    /**
     * Identification assigned by the company itself.
     * 
     */
    CPNY,

    /**
     * Legal Entity Identifier.
     * 
     */
    LEII,

    /**
     * Identification assigned by a travel agency.
     * 
     */
    TRAG,

    /**
     * Other company assigner entity defined at private level.
     * 
     */
    OTHP,

    /**
     * Other company assigner entity defined at national level.
     * 
     */
    OTHN;

    public String value() {
        return name();
    }

    public static CompanyAssigner2Code fromValue(String v) {
        return valueOf(v);
    }

}
