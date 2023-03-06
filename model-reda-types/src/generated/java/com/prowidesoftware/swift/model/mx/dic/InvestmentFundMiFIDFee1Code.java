
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundMiFIDFee1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundMiFIDFee1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="GEAR"/&gt;
 *     &lt;enumeration value="FES3"/&gt;
 *     &lt;enumeration value="FES2"/&gt;
 *     &lt;enumeration value="GOCF"/&gt;
 *     &lt;enumeration value="GOCS"/&gt;
 *     &lt;enumeration value="INCF"/&gt;
 *     &lt;enumeration value="INCS"/&gt;
 *     &lt;enumeration value="MANF"/&gt;
 *     &lt;enumeration value="MANS"/&gt;
 *     &lt;enumeration value="NETO"/&gt;
 *     &lt;enumeration value="OOES"/&gt;
 *     &lt;enumeration value="BENS"/&gt;
 *     &lt;enumeration value="ENAC"/&gt;
 *     &lt;enumeration value="ENFX"/&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="EXAC"/&gt;
 *     &lt;enumeration value="ENBX"/&gt;
 *     &lt;enumeration value="PENO"/&gt;
 *     &lt;enumeration value="OTES"/&gt;
 *     &lt;enumeration value="OCAS"/&gt;
 *     &lt;enumeration value="PERF"/&gt;
 *     &lt;enumeration value="PERS"/&gt;
 *     &lt;enumeration value="REFV"/&gt;
 *     &lt;enumeration value="TRSF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundMiFIDFee1Code")
@XmlEnum
public enum InvestmentFundMiFIDFee1Code {


    /**
     * Gross one-off maximum entry cost not acquired to the fund. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07020 and is a percentage of the amount to be invested. This fee is paid by the investor to the fund or fund management company. This is indicative and should be adapted by the distributor according to the agreement with the asset manager. In the European MiFID Template (EMT) v1, this is known as ‘one-off entry cost’ and exchange traded funds are excluded.
     * 
     * 
     */
    FEND("FEND"),

    /**
     * Distribution fee. This fee is included in the total on going costs and is not included in the management fee. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07120 and 08060 and this a percentage of the NAV or the reference value, EMT reference 07150 and 08110, of the financial instrument expressed in annualised terms (rate of cost deduction to be applied).
     * 
     * 
     */
    DIST("DIST"),

    /**
     * Financing costs related to borrowing for the purposes of gearing expressed as a percentage of the NAV. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07135 and 08075.
     * 
     * 
     */
    GEAR("GEAR"),

    /**
     * Gross one-off entry cost for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 08010 and may be specified as an actual amount or a percentage of the reference value, EMT reference 08110, and should only incorporate manufacturer costs (that is, the cost of the financial instrument) and distributor costs upfront when known by the manufacturer. It should, however, not include distribution fees added on top of the product price by distributors that is out of control of the manufacturer.
     * 
     */
    @XmlEnumValue("FES3")
    FES_3("FES3"),

    /**
     * Gross maximum one-off entry cost for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07020 and is the 'ask price' or 'fair value'. It may be specified as an actual amount or a percentage of the reference value, EMT reference 07150, and should only incorporate manufacturer costs (that is, the cost of the financial instrument) and distributor costs upfront when known by the manufacturer. It should, however, not include distribution fees added on top of the product price by distributors that are out of control of the manufacturer. 
     * In EMT v1, this is known as ‘one-off entry cost’ and should only incorporate manufacturer costs, that is the cost of the financial instrument, and not a distribution fee taken upfront .
     * 
     */
    @XmlEnumValue("FES2")
    FES_2("FES2"),

    /**
     * Gross on-going costs. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07100 and 08030 and is a percentage of the NAV or the reference value, EMT reference 07150, of the financial product, expressed in annualised terms (rate of cost deduction to be applied). This includes management fees and distribution fees and is expressed as a percentage of the NAV of the financial instrument per annum.
     * 
     * 
     */
    GOCF("GOCF"),

    /**
     * Gross on-going costs for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07100 and 08030 and is expressed as a percentage of the NAV or currency and amount for an absolute quotation of the financial product in annualised terms related to the reference value, EMT reference 07150.
     * 
     */
    GOCS("GOCS"),

    /**
     * Fee that covers incidental costs. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07140 and 08080 and is expressed as a percentage of the NAV. Includes performance fees and other costs.
     * 
     * 
     */
    INCF("INCF"),

    /**
     * Fee that covers incidental costs for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) v2 reference 07140 and 08080 and is expressed as a percentage of the NAV or a currency and amount for an absolute quotation of the financial product in annualised terms related to the reference value, EMT reference 07150 and 08110. In EMT v1, this is not supported.
     * 
     */
    INCS("INCS"),

    /**
     * Management fee paid to an investment manager for services. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07110 and 08050 and is a percentage of the NAV or reference value (EMT reference 07150 and 08110) of the financial product expressed in annualised terms (rate of cost deduction to be applied). These fees are included in total ongoing costs and are fees used by distributors to calculate retrocession fees.
     * 
     */
    MANF("MANF"),

    /**
     * Management fee for a structured. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07110 and 08050 and is expressed as a percentage of the NAV or a currency and amount for an absolute quotation of the financial product in annualised terms related to the reference value, EMT reference 07150.
     * 
     */
    MANS("MANS"),

    /**
     * Net one-off entry cost for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07025 and 08015 and is minus the upfront distribution fee. The cost reported is a net disclosure and therefore the upfront distributor fee is equal to the difference between the one-off entry cost (EMT reference 07020 and 08010) and the net one-off entry (EMT reference 07025 and 08010). In EMT v1, this is not supported.
     * 
     * 
     */
    NETO("NETO"),

    /**
     * One-off exit cost prior to the recommended holding period (RHP). When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07090 and may be specified as an actual amount or a percentage of the reference value, EMT reference 07150.
     * 
     */
    OOES("OOES"),

    /**
     * One off exit cost for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 08020 and when expressed as a percentage, this is a percentage of the reference value, EMT reference 08110.
     * 
     * 
     */
    BENS("BENS"),

    /**
     * Maximum cost of the one-off entry fee. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07040 and is the subscription fees acquired to the fund. It is not included in the one off entry cost 07020. This maximum one-off entry cost acquired to the fund is specified as a percentage of the amount to be invested.
     * 
     */
    ENAC("ENAC"),

    /**
     * Maximum one-off entry cost fixed amount. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07030 and is a flat fee defined by the fund or fund management company. This is indicative and should be adapted by the distributor according to the relationship been the fund and the distribution. This cost is not taken into account in the gross one-off maximum entry cost (FEND), EMT reference 07020.
     * 
     */
    ENFX("ENFX"),

    /**
     * Maximum cost of the one-off exit fee not acquired to the fund that could happen at a certain time during the life of the product. This is a percentage of the NAV. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07050.
     * 
     */
    BEND("BEND"),

    /**
     * Maximum cost of the one-off exit fee acquired to the fund. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07070. It is not included in the one off maximum exit cost EMT reference 07050. This is paid by the investor to the fund or fund management company. This is a percentage of the NAV. 
     * 
     */
    EXAC("EXAC"),

    /**
     * Maximum one-off exit cost, a maximum fixed amount per redemption. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07060 and is flat fee defined by the fund or fund management company. It is indicative and should be adapted distributor according to the relationship been the fund and the distribution. This cost is not taken in account in the one-off maximum exit cost EMT reference 07050.
     * 
     */
    ENBX("ENBX"),

    /**
     * One-off typical exit current exit cost linked to the recommended holding period (RHP) or time to maturity. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07080 and are the ‘normal’ fees if the client holds the product until maturity or during the RHP.
     * Example: a product with a 5 year maturity has exit costs of:
     * - 4% after 1 and 2 years
     * - 3% after 3 years
     * - 1% after 4 years
     * - 0 at maturity
     * Then maximum exit cost: 4%.
     * Typical cost : 0
     * Typical cost : 0
     * 
     */
    PENO("PENO"),

    /**
     * One-off typical exit cost linked to the recommended holding period (RHP) for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07080 and may be specified as an actual amount or a percentage of the reference value, EMT reference 07150.
     * 
     */
    OTES("OTES"),

    /**
     * Sum of daily recurring product costs accumulated during the year until the ex post reference date. This is typically specified as an actual amount. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 08040.
     * 
     */
    OCAS("OCAS"),

    /**
     * Performance fee. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07145 and 08085 and is a percentage of the NAV or the reference value, EMT reference 07150 and 08110, of the financial instrument expressed in annualised terms (rate of cost deduction to be applied). This fee is included in the total incidental costs.
     * In EMT v1, this is not supported.
     * 
     */
    PERF("PERF"),

    /**
     * Performance fee for a structured product. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07145 and 08085 and is expressed as a percentage of the NAV or a currency and amount for an absolute quotation of the financial product in annualised terms related to the reference value, EMT reference 07150 and 08110. In EMT v1, this is not supported.
     * 
     */
    PERS("PERS"),

    /**
     * Reference value. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07150 and 08110 and is the percentage of the NAV of the financial product expressed in annualised terms (rate of cost deduction to be applied).
     * 
     */
    REFV("REFV"),

    /**
     * Cost associated with the transaction. When used in reference to MiFID, this is in the scope of the European MiFID Template (EMT) reference 07130 and 08070 and this is a percentage of the NAV or the reference value, EMT reference 07150 and 08110, of the financial instrument expressed in annualised terms (rate of cost deduction to be applied).
     * 
     * 
     */
    TRSF("TRSF");
    private final String value;

    InvestmentFundMiFIDFee1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestmentFundMiFIDFee1Code fromValue(String v) {
        for (InvestmentFundMiFIDFee1Code c: InvestmentFundMiFIDFee1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
