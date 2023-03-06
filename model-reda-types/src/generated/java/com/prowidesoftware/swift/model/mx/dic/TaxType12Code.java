
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPO"/&gt;
 *     &lt;enumeration value="EUTR"/&gt;
 *     &lt;enumeration value="AKT1"/&gt;
 *     &lt;enumeration value="AKT2"/&gt;
 *     &lt;enumeration value="ZWIS"/&gt;
 *     &lt;enumeration value="MIET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxType12Code")
@XmlEnum
public enum TaxType12Code {


    /**
     * Tax is on the sum of all earnings/revenues accrued since the last dividend distribution.
     * 
     */
    INPO("INPO"),

    /**
     * Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.
     * 
     */
    EUTR("EUTR"),

    /**
     * Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the old Investment Tax Act (Investmentsteuergesetz).
     * 
     */
    @XmlEnumValue("AKT1")
    AKT_1("AKT1"),

    /**
     * Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the new Investment Tax Act (Investmentsteuergesetz).
     * 
     */
    @XmlEnumValue("AKT2")
    AKT_2("AKT2"),

    /**
     * Zwischengewinn.
     * 
     */
    ZWIS("ZWIS"),

    /**
     * Earnings from renting.
     * 
     */
    MIET("MIET");
    private final String value;

    TaxType12Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType12Code fromValue(String v) {
        for (TaxType12Code c: TaxType12Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
