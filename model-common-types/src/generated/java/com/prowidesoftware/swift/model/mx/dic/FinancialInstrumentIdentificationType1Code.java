
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialInstrumentIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BELC"/>
 *     <enumeration value="BLOM"/>
 *     <enumeration value="CCCD"/>
 *     <enumeration value="CMED"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CTAC"/>
 *     <enumeration value="CUSP"/>
 *     <enumeration value="FIGC"/>
 *     <enumeration value="FIGG"/>
 *     <enumeration value="FIGI"/>
 *     <enumeration value="ISDU"/>
 *     <enumeration value="ISDX"/>
 *     <enumeration value="LCHD"/>
 *     <enumeration value="OCCS"/>
 *     <enumeration value="OPRA"/>
 *     <enumeration value="RCMD"/>
 *     <enumeration value="RICC"/>
 *     <enumeration value="SEDL"/>
 *     <enumeration value="SICC"/>
 *     <enumeration value="TIKR"/>
 *     <enumeration value="VALO"/>
 *     <enumeration value="WKNR"/>
 *     <enumeration value="CCDC"/>
 *     <enumeration value="DTID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialInstrumentIdentificationType1Code")
@XmlEnum
public enum FinancialInstrumentIdentificationType1Code {


    /**
     * National securities identification number for BE issued by the National Numbering Association SIX Telekurs Belgium.
     * 
     */
    BELC,

    /**
     * Ticker-like code assigned by Bloomberg to identify financial instruments.
     * 
     */
    BLOM,

    /**
     * National Securities Identification Number issued by the National Numbering Association for a country for which no specific financial instrument identification type code already yet. The first two letters of the code represents the country code (for example, EGDC for Egyptian NSIN). To be used only until the code is added to the ISO ExternalFinancialInstrumentIdentificationType1Code list.
     * 
     */
    CCCD,

    /**
     * Ticker-like code assigned by the Chicago Mercantile Exchange to identify listed-derivatives instruments.
     * 
     */
    CMED,

    /**
     * National securities identification number for ICSDs issued by the National Numbering Association Clearstream and Euroclear.
     * 
     */
    COMM,

    /**
     * Ticker-like code assigned by the Consolidated Tape Association to identify financial instruments.
     * 
     */
    CTAC,

    /**
     * National securities identification number for US and CA issued by the National Numbering Association Standard & Poor´s - CUSIP Global Services.
     * 
     */
    CUSP,

    /**
     * A Financial Instrument Global Identifier Composite (FIGC) is a unique, persistent twelve character string that serves to identify financial instruments across asset classes at the composite level, is associated with one or more FIGI venue level ID’s and a single Share Class level ID.
     * 
     */
    FIGC,

    /**
     * A Financial Instrument Global Identifier Share Class (FIGG) is a unique, persistent twelve character string that serves to identify financial instruments across asset classes at the global share class level, and is associated with one or more Composite level ID’s.
     * 
     */
    FIGG,

    /**
     * A Financial Instrument Global Identifier (FIGI) is a unique, persistent twelve character string that serves to identify financial instruments across asset classes at the venue level. It is associated with one Composite ID.
     * 
     */
    FIGI,

    /**
     * URL in Description to identify OTC derivatives instruments.
     * 
     */
    ISDU,

    /**
     * XML in Description to identify OTC derivatives instruments.
     * 
     */
    ISDX,

    /**
     * Ticker-like code assigned by LCH to identify listed-derivatives instruments.
     * 
     */
    LCHD,

    /**
     * Ticker-like code assigned by the Options Clearing Corporation to identify financial instruments.
     * 
     */
    OCCS,

    /**
     * Ticker-like code assigned by the Options Price Reporting Authority to identify financial instruments.
     * 
     */
    OPRA,

    /**
     * Ticker-like code assigned by Markit to identify listed-derivatives instruments.
     * 
     */
    RCMD,

    /**
     * Ticker-like code assigned by Thomson Reuters to identify financial instruments.
     * 
     */
    RICC,

    /**
     * National securities identification number for GB issued by the National Numbering Association London Stock Exchange.
     * 
     */
    SEDL,

    /**
     * National securities identification number for JP issued by the National Numbering Association 6 Stock Exchanges and JASDEC (Securities Identification Ticker-like code Committee).
     * 
     */
    SICC,

    /**
     * Ticker Code assigned by an exchange to identify financial instruments.
     * 
     */
    TIKR,

    /**
     * National securities identification number for CH and LI issued by the National Numbering Association SIX Telekurs Ltd.
     * 
     */
    VALO,

    /**
     * National securities identification number for DE issued by the National Numbering Association WM Datenservice.
     * 
     */
    WKNR,

    /**
     * National Bond identification number for China issued by CHINA CENTRAL DEPOSITORY & CLEARING CO., Limited.
     * 
     */
    CCDC,

    /**
     * Digital Token Identifier, as defined in ISO 24165.
     * 
     */
    DTID;

    public String value() {
        return name();
    }

    public static FinancialInstrumentIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
