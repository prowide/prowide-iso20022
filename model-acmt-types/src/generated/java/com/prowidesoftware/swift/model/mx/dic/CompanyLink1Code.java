
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyLink1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyLink1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="BROK"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="MEMB"/&gt;
 *     &lt;enumeration value="PCOM"/&gt;
 *     &lt;enumeration value="RELA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompanyLink1Code")
@XmlEnum
public enum CompanyLink1Code {


    /**
     * Autonomous agent accredited by the broker.
     * 
     */
    AGEN,

    /**
     * Employee, operator or agent of the broker.
     * 
     */
    BROK,

    /**
     * Brokerage partner or shareholder, individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position.
     * 
     */
    PART,

    /**
     * Member broker of a financial conglomerate (person is a board member, director, officer and employee of a member company of the conglomerate).
     * 
     */
    MEMB,

    /**
     * Parent company of the broker.
     * 
     */
    PCOM,

    /**
     * Spouse or partner and child of an employee, operator or agent of the broker; agent of the broker; brokerage partners or shareholders; individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position.
     * 
     */
    RELA;

    public String value() {
        return name();
    }

    public static CompanyLink1Code fromValue(String v) {
        return valueOf(v);
    }

}
