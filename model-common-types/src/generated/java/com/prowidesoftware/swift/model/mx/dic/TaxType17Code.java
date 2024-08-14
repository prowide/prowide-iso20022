
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxType17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROV"/>
 *     <enumeration value="NATI"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="KAPA"/>
 *     <enumeration value="NKAP"/>
 *     <enumeration value="INPO"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="WTAX"/>
 *     <enumeration value="INHT"/>
 *     <enumeration value="SOSU"/>
 *     <enumeration value="CTAX"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="COAX"/>
 *     <enumeration value="EUTR"/>
 *     <enumeration value="AKT1"/>
 *     <enumeration value="AKT2"/>
 *     <enumeration value="ZWIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxType17Code")
@XmlEnum
public enum TaxType17Code {


    /**
     * Tax is a provincial tax.
     * 
     */
    PROV("PROV"),

    /**
     * Tax is a national tax.
     * 
     */
    NATI("NATI"),

    /**
     * Tax is a state tax.
     * 
     */
    STAT("STAT"),

    /**
     * Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.
     * 
     */
    WITH("WITH"),

    /**
     * Tax is on a capital gain (realised and unrealised), that is, the profit that is gained from the sale of a financial instrument.
     * 
     */
    KAPA("KAPA"),

    /**
     * Tax recovery is due to capital loss.
     * 
     */
    NKAP("NKAP"),

    /**
     * Tax is on the sum of all earnings/revenues accrued since the last dividend distribution.
     * 
     */
    INPO("INPO"),

    /**
     * Tax is on certain documents and transactions.
     * 
     */
    STAM("STAM"),

    /**
     * Tax is a special tax imposed, applicable only when the value of assets or categories of assets owned by an entity are above a given ceiling defined by the tax authority. Wealth tax is not linked to income.
     * 
     */
    WTAX("WTAX"),

    /**
     * Tax that is payable at the time of death on any items (money or otherwise), where ownership changes either upon death or within a legally specified number of years before death.
     * 
     */
    INHT("INHT"),

    /**
     * Tax that is levied by legal authorities for solidarity purposes.
     * 
     */
    SOSU("SOSU"),

    /**
     * Direct reduction of an individual's tax liability.
     * 
     */
    CTAX("CTAX"),

    /**
     * Tax that is levied on assets given to individuals prior to the death of the donor. Gift tax is designed to ensure the integrity of the inheritance tax, preventing the pre-death transfer of wealth.
     * 
     */
    GIFT("GIFT"),

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
    ZWIS("ZWIS");
    private final String value;

    TaxType17Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType17Code fromValue(String v) {
        for (TaxType17Code c: TaxType17Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
