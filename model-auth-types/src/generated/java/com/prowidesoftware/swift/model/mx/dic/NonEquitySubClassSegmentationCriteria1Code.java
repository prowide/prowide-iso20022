
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquitySubClassSegmentationCriteria1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEquitySubClassSegmentationCriteria1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASCL"/>
 *     <enumeration value="BSPD"/>
 *     <enumeration value="CNC1"/>
 *     <enumeration value="CNC2"/>
 *     <enumeration value="NCCO"/>
 *     <enumeration value="CTYP"/>
 *     <enumeration value="NCCR"/>
 *     <enumeration value="DCSL"/>
 *     <enumeration value="DTYP"/>
 *     <enumeration value="EQUT"/>
 *     <enumeration value="FNC1"/>
 *     <enumeration value="FNC2"/>
 *     <enumeration value="FSPD"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="IRTC"/>
 *     <enumeration value="INC1"/>
 *     <enumeration value="INC2"/>
 *     <enumeration value="ISIN"/>
 *     <enumeration value="TTMO"/>
 *     <enumeration value="PRMT"/>
 *     <enumeration value="SSRF"/>
 *     <enumeration value="ISPT"/>
 *     <enumeration value="SRTC"/>
 *     <enumeration value="SACL"/>
 *     <enumeration value="SBPD"/>
 *     <enumeration value="TTMS"/>
 *     <enumeration value="NCSW"/>
 *     <enumeration value="TTMB"/>
 *     <enumeration value="IOUB"/>
 *     <enumeration value="TOUB"/>
 *     <enumeration value="UISC"/>
 *     <enumeration value="UIDX"/>
 *     <enumeration value="UINS"/>
 *     <enumeration value="UIRT"/>
 *     <enumeration value="REOU"/>
 *     <enumeration value="UTYP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEquitySubClassSegmentationCriteria1Code")
@XmlEnum
public enum NonEquitySubClassSegmentationCriteria1Code {


    /**
     * Asset class.
     * 
     */
    ASCL("ASCL"),

    /**
     * Base product.
     * 
     */
    BSPD("BSPD"),

    /**
     * Contract for difference notional currency 1.
     * 
     */
    @XmlEnumValue("CNC1")
    CNC_1("CNC1"),

    /**
     * Contract for difference notional currency 2.
     * 
     */
    @XmlEnumValue("CNC2")
    CNC_2("CNC2"),

    /**
     * Commodity derivative notional currency.
     * 
     */
    NCCO("NCCO"),

    /**
     * Contract type.
     * 
     */
    CTYP("CTYP"),

    /**
     * Credit derivative notional currency.
     * 
     */
    NCCR("NCCR"),

    /**
     * Delivery cash settlement location.
     * 
     */
    DCSL("DCSL"),

    /**
     * Delivery settlement type.
     * 
     */
    DTYP("DTYP"),

    /**
     * Equity derivative underlying type.
     * 
     */
    EQUT("EQUT"),

    /**
     * Foreign exchange derivative notional currency 1.
     * 
     */
    @XmlEnumValue("FNC1")
    FNC_1("FNC1"),

    /**
     * Foreign exchange derivative notional currency 2.
     * 
     */
    @XmlEnumValue("FNC2")
    FNC_2("FNC2"),

    /**
     * Further sub product.
     * 
     */
    FSPD("FSPD"),

    /**
     * Inflation index code or name.
     * 
     */
    IIND("IIND"),

    /**
     * Interest rate term of contract.
     * 
     */
    IRTC("IRTC"),

    /**
     * Interest rate derivative notional currency 1.
     * 
     */
    @XmlEnumValue("INC1")
    INC_1("INC1"),

    /**
     * Interest rate derivative notional currency 2.
     * 
     */
    @XmlEnumValue("INC2")
    INC_2("INC2"),

    /**
     * Instrument identification.
     * 
     */
    ISIN("ISIN"),

    /**
     * Time to maturity bucket of the option.
     * 
     */
    TTMO("TTMO"),

    /**
     * Parameter.
     * 
     */
    PRMT("PRMT"),

    /**
     * Size specification related to freight subtype.
     * 
     */
    SSRF("SSRF"),

    /**
     * Issuer of sovereign and public type.
     * 
     */
    ISPT("ISPT"),

    /**
     * Specific route time charter average.
     * 
     */
    SRTC("SRTC"),

    /**
     * Sub-asset class.
     * 
     */
    SACL("SACL"),

    /**
     * Sub product.
     * 
     */
    SBPD("SBPD"),

    /**
     * Time to maturity bucket of the swap.
     * 
     */
    TTMS("TTMS"),

    /**
     * Notional currency of the swaption.
     * 
     */
    NCSW("NCSW"),

    /**
     * Time to maturity bucket.
     * 
     */
    TTMB("TTMB"),

    /**
     * Issuer of the underlying bond.
     * 
     */
    IOUB("IOUB"),

    /**
     * Term of the underlying bond.
     * 
     */
    TOUB("TOUB"),

    /**
     * Sub class of the underlying index credit default swap (CDS).
     * 
     */
    UISC("UISC"),

    /**
     * Underlying index identification such as an ISIN or an index name.
     * 
     */
    UIDX("UIDX"),

    /**
     * Underlying instrument identification, such as an ISIN code.
     * 
     */
    UINS("UINS"),

    /**
     * Underlying interest rate.
     * 
     */
    UIRT("UIRT"),

    /**
     * Underlying reference entity.
     * 
     */
    REOU("REOU"),

    /**
     * Underlying type.
     * 
     */
    UTYP("UTYP");
    private final String value;

    NonEquitySubClassSegmentationCriteria1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonEquitySubClassSegmentationCriteria1Code fromValue(String v) {
        for (NonEquitySubClassSegmentationCriteria1Code c: NonEquitySubClassSegmentationCriteria1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
