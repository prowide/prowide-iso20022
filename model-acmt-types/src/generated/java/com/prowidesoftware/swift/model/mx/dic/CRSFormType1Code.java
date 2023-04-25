
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRSFormType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CRSFormType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CER4"/>
 *     <enumeration value="CER3"/>
 *     <enumeration value="CER5"/>
 *     <enumeration value="CER6"/>
 *     <enumeration value="CER8"/>
 *     <enumeration value="CER1"/>
 *     <enumeration value="CER2"/>
 *     <enumeration value="CER7"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CRSFormType1Code")
@XmlEnum
public enum CRSFormType1Code {


    /**
     * Certificate of Identification issued by a government.
     * 
     */
    @XmlEnumValue("CER4")
    CER_4("CER4"),

    /**
     * Certificate of residence.
     * 
     */
    @XmlEnumValue("CER3")
    CER_3("CER3"),

    /**
     * Official documentation issued by a government for the entity.
     * 
     */
    @XmlEnumValue("CER5")
    CER_5("CER5"),

    /**
     * Financial statement, third party credit report, bankruptcy filing or a securities regulator report.
     * 
     */
    @XmlEnumValue("CER6")
    CER_6("CER6"),

    /**
     * Publicly available information for the entity.
     * 
     */
    @XmlEnumValue("CER8")
    CER_8("CER8"),

    /**
     * Self certification as a separate document.
     * 
     */
    @XmlEnumValue("CER1")
    CER_1("CER1"),

    /**
     * Self certification as a document included into contract of the account opening.
     * 
     */
    @XmlEnumValue("CER2")
    CER_2("CER2"),

    /**
     * Standardised industry coding system for the entity.
     * 
     */
    @XmlEnumValue("CER7")
    CER_7("CER7");
    private final String value;

    CRSFormType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CRSFormType1Code fromValue(String v) {
        for (CRSFormType1Code c: CRSFormType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
