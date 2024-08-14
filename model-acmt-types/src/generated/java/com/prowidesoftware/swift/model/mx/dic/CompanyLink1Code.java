
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyLink1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CompanyLink1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGEN"/>
 *     <enumeration value="BROK"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="MEMB"/>
 *     <enumeration value="PCOM"/>
 *     <enumeration value="RELA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
