
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquitySubClassSegmentationCriteria1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonEquitySubClassSegmentationCriteria1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASCL"/&gt;
 *     &lt;enumeration value="BSPD"/&gt;
 *     &lt;enumeration value="CNC1"/&gt;
 *     &lt;enumeration value="CNC2"/&gt;
 *     &lt;enumeration value="NCCO"/&gt;
 *     &lt;enumeration value="CTYP"/&gt;
 *     &lt;enumeration value="NCCR"/&gt;
 *     &lt;enumeration value="DCSL"/&gt;
 *     &lt;enumeration value="DTYP"/&gt;
 *     &lt;enumeration value="EQUT"/&gt;
 *     &lt;enumeration value="FNC1"/&gt;
 *     &lt;enumeration value="FNC2"/&gt;
 *     &lt;enumeration value="FSPD"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="IRTC"/&gt;
 *     &lt;enumeration value="INC1"/&gt;
 *     &lt;enumeration value="INC2"/&gt;
 *     &lt;enumeration value="ISIN"/&gt;
 *     &lt;enumeration value="TTMO"/&gt;
 *     &lt;enumeration value="PRMT"/&gt;
 *     &lt;enumeration value="SSRF"/&gt;
 *     &lt;enumeration value="ISPT"/&gt;
 *     &lt;enumeration value="SRTC"/&gt;
 *     &lt;enumeration value="SACL"/&gt;
 *     &lt;enumeration value="SBPD"/&gt;
 *     &lt;enumeration value="TTMS"/&gt;
 *     &lt;enumeration value="NCSW"/&gt;
 *     &lt;enumeration value="TTMB"/&gt;
 *     &lt;enumeration value="IOUB"/&gt;
 *     &lt;enumeration value="TOUB"/&gt;
 *     &lt;enumeration value="UISC"/&gt;
 *     &lt;enumeration value="UIDX"/&gt;
 *     &lt;enumeration value="UINS"/&gt;
 *     &lt;enumeration value="UIRT"/&gt;
 *     &lt;enumeration value="REOU"/&gt;
 *     &lt;enumeration value="UTYP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
