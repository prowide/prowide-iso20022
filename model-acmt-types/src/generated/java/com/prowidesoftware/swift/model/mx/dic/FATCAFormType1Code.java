
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAFormType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FATCAFormType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CER5"/&gt;
 *     &lt;enumeration value="CER7"/&gt;
 *     &lt;enumeration value="CER1"/&gt;
 *     &lt;enumeration value="CER2"/&gt;
 *     &lt;enumeration value="CER3"/&gt;
 *     &lt;enumeration value="CER4"/&gt;
 *     &lt;enumeration value="CER6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FATCAFormType1Code")
@XmlEnum
public enum FATCAFormType1Code {


    /**
     * Certificate of foreign intermediary (also known as IRS form W-8IMY).
     * 
     */
    @XmlEnumValue("CER5")
    CER_5("CER5"),

    /**
     * Certificate of foreign person's claim that income is effectively connected with the conduct of a trade or business in the United States (also known as IRS form W-8BEN-E).
     * 
     */
    @XmlEnumValue("CER7")
    CER_7("CER7"),

    /**
     * Certificate of foreign status of beneficial owner (also known as IRS form W-8BEN).
     * 
     */
    @XmlEnumValue("CER1")
    CER_1("CER1"),

    /**
     * Certificate of loss of nationality.
     * 
     */
    @XmlEnumValue("CER2")
    CER_2("CER2"),

    /**
     * Self certification.
     * 
     */
    @XmlEnumValue("CER3")
    CER_3("CER3"),

    /**
     * Self certificate of loss of nationality (also known as IRS form I-407).
     * 
     */
    @XmlEnumValue("CER4")
    CER_4("CER4"),

    /**
     * Form is a request for taxpayer identification number and certification (also known as IRS form W9).
     * 
     */
    @XmlEnumValue("CER6")
    CER_6("CER6");
    private final String value;

    FATCAFormType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FATCAFormType1Code fromValue(String v) {
        for (FATCAFormType1Code c: FATCAFormType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
