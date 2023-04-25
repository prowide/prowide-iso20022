
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FATCAStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="F101"/>
 *     <enumeration value="F102"/>
 *     <enumeration value="F103"/>
 *     <enumeration value="F104"/>
 *     <enumeration value="F105"/>
 *     <enumeration value="F201"/>
 *     <enumeration value="F202"/>
 *     <enumeration value="F203"/>
 *     <enumeration value="F204"/>
 *     <enumeration value="F205"/>
 *     <enumeration value="F206"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FATCAStatus1Code")
@XmlEnum
public enum FATCAStatus1Code {


    /**
     * Account holder type is an owner-documented financial institution with specified US owner(s).
     * 
     */
    @XmlEnumValue("F101")
    F_101("F101"),

    /**
     * Account holder type is a passive non-financial entity with substantial US owner(s).
     * 
     */
    @XmlEnumValue("F102")
    F_102("F102"),

    /**
     * Account holder type is a non-participating financial institution.
     * 
     */
    @XmlEnumValue("F103")
    F_103("F103"),

    /**
     * Account holder type is a specified US person.
     * 
     */
    @XmlEnumValue("F104")
    F_104("F104"),

    /**
     * Account holder type is a direct reporting non-financial foreign entity (NFFE).
     * 
     */
    @XmlEnumValue("F105")
    F_105("F105"),

    /**
     * Account pool reporting type is a recalcitrant account holder with US indicia.
     * 
     */
    @XmlEnumValue("F201")
    F_201("F201"),

    /**
     * Account pool reporting type is a recalcitrant account holder without US indicia.
     * 
     */
    @XmlEnumValue("F202")
    F_202("F202"),

    /**
     * Account pool reporting type is a dormant account.
     * 
     */
    @XmlEnumValue("F203")
    F_203("F203"),

    /**
     * Account pool reporting type is a non-participating foreign financial institution.
     * 
     */
    @XmlEnumValue("F204")
    F_204("F204"),

    /**
     * Account pool reporting type is a recalcitrant account holder that is a US person.
     * 
     */
    @XmlEnumValue("F205")
    F_205("F205"),

    /**
     * Account pool reporting type is recalcitrant account holder that is a passive non-financial foreign entity (NFFE).
     * 
     */
    @XmlEnumValue("F206")
    F_206("F206");
    private final String value;

    FATCAStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FATCAStatus1Code fromValue(String v) {
        for (FATCAStatus1Code c: FATCAStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
