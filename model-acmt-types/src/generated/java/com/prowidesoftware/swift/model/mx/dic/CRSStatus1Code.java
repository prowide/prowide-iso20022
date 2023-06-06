
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRSStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CRSStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="C101"/>
 *     <enumeration value="C102"/>
 *     <enumeration value="C103"/>
 *     <enumeration value="C104"/>
 *     <enumeration value="C105"/>
 *     <enumeration value="C106"/>
 *     <enumeration value="C107"/>
 *     <enumeration value="C108"/>
 *     <enumeration value="C109"/>
 *     <enumeration value="C110"/>
 *     <enumeration value="C111"/>
 *     <enumeration value="C112"/>
 *     <enumeration value="C113"/>
 *     <enumeration value="C114"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CRSStatus1Code")
@XmlEnum
public enum CRSStatus1Code {


    /**
     * Account holder type is a passive non-financial entity with one or more controlling persons that are foreign persons.
     * 
     */
    @XmlEnumValue("C101")
    C_101("C101"),

    /**
     * Account holder type is a foreign person.
     * 
     */
    @XmlEnumValue("C102")
    C_102("C102"),

    /**
     * Account holder type is a passive foreign non-financial entity without controlling persons that are foreign persons.
     * 
     */
    @XmlEnumValue("C103")
    C_103("C103"),

    /**
     * Account holder type is a financial institution such as a depositary, a custodial institution or a specified insurance company.
     * 
     */
    @XmlEnumValue("C104")
    C_104("C104"),

    /**
     * Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution without one or more controlling persons that are foreign persons.
     * 
     */
    @XmlEnumValue("C105")
    C_105("C105"),

    /**
     * Account holder type is a financial institution such as an investment entity of a non-participating jurisdiction and managed by another financial institution with one or more controlling persons that are foreign persons.
     * 
     */
    @XmlEnumValue("C106")
    C_106("C106"),

    /**
     * Account holder type is a financial institution such as another investment entity.
     * 
     */
    @XmlEnumValue("C107")
    C_107("C107"),

    /**
     * Account holder type is an active non-financial entity such as a corporation for which the stock is regularly traded on an established securities market.
     * 
     */
    @XmlEnumValue("C108")
    C_108("C108"),

    /**
     * Account holder type is an active non-financial entity such as a corporation which is a related entity of a corporation for which the stock is regularly traded on an established securities market.
     * 
     */
    @XmlEnumValue("C109")
    C_109("C109"),

    /**
     * Account holder type is an active non-financial entity such as a government entity.
     * 
     */
    @XmlEnumValue("C110")
    C_110("C110"),

    /**
     * Account holder type is an active non-financial entity such as a central bank.
     * 
     */
    @XmlEnumValue("C111")
    C_111("C111"),

    /**
     * Account holder type is an active non-financial entity such as an international organisation.
     * 
     */
    @XmlEnumValue("C112")
    C_112("C112"),

    /**
     * Account holder type is not a foreign person.
     * 
     */
    @XmlEnumValue("C113")
    C_113("C113"),

    /**
     * Account holder type is a financial institution such as an investment entity of a participating jurisdiction and managed by another financial institution.
     * 
     */
    @XmlEnumValue("C114")
    C_114("C114");
    private final String value;

    CRSStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CRSStatus1Code fromValue(String v) {
        for (CRSStatus1Code c: CRSStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
