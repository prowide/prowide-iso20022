
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="COAX"/&gt;
 *     &lt;enumeration value="EUTR"/&gt;
 *     &lt;enumeration value="AKT2"/&gt;
 *     &lt;enumeration value="ZWIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxType14Code")
@XmlEnum
public enum TaxType14Code {


    /**
     * Tax is a national tax.
     * 
     */
    NATI("NATI"),

    /**
     * Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.
     * 
     */
    WITH("WITH"),

    /**
     * Tax is on certain documents and transactions.
     * 
     */
    STAM("STAM"),

    /**
     * Tax that is levied on goods and services purchased by customers, and is added to the retail price.
     * 
     */
    COAX("COAX"),

    /**
     * Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.
     * 
     */
    EUTR("EUTR"),

    /**
     * Share-related profit. This is a tax specific to the German market . The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the new Investment Tax Act (Investmentsteuergesetz).
     * 
     */
    @XmlEnumValue("AKT2")
    AKT_2("AKT2"),

    /**
     * Zwischengewinn.
     * 
     */
    ZWIS("ZWIS");
    private final String value;

    TaxType14Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType14Code fromValue(String v) {
        for (TaxType14Code c: TaxType14Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
