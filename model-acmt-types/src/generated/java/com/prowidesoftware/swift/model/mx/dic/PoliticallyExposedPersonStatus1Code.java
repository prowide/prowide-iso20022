
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticallyExposedPersonStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoliticallyExposedPersonStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PE03"/&gt;
 *     &lt;enumeration value="PE01"/&gt;
 *     &lt;enumeration value="PE02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PoliticallyExposedPersonStatus1Code")
@XmlEnum
public enum PoliticallyExposedPersonStatus1Code {


    /**
     * Person known to be a close associate of the politically exposed person. A person known to be a close associate includes: 
     * (a) a natural person who is known to have joint beneficial ownership of legal entities or legal arrangements, or any other close business relations, with the  politically exposed person,
     * (b) a natural person who has sole beneficial ownership of a legal entity or legal arrangement which is known to have been set up for the de facto benefit of a politically exposed person.
     * 
     */
    @XmlEnumValue("PE03")
    PE_03("PE03"),

    /**
     * Natural person who is or who has been entrusted with prominent public functions.
     * 
     */
    @XmlEnumValue("PE01")
    PE_01("PE01"),

    /**
     * Family member of the politically exposed person. A family member includes: 
     * (a) the spouse, or a person considered to be equivalent to a spouse, of the politically exposed person,
     * (b) the children and their spouses, or persons considered to be equivalent to a spouse, of the politically exposed person,
     * (c) the parents of the politically exposed person.
     * 
     */
    @XmlEnumValue("PE02")
    PE_02("PE02");
    private final String value;

    PoliticallyExposedPersonStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoliticallyExposedPersonStatus1Code fromValue(String v) {
        for (PoliticallyExposedPersonStatus1Code c: PoliticallyExposedPersonStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
