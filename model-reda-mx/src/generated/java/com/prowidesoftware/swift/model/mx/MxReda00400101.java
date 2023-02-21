
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndPrcgPsptRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.01")
public class MxReda00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndPrcgPsptRpt", required = true)
    protected FundProcessingPassportReportV01 fndPrcgPsptRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternateSecurityIdentification3 .class, CashAccount14 .class, CashAccount15 .class, ContactDetails1 .class, DistributionPolicy1Code.class, DividendPolicy1Code.class, EUSavingsDirective1Code.class, EventFrequency2Code.class, Extension1 .class, FinancialInstrument16 .class, FormOfSecurity1Code.class, Forms.class, FundProcessingPassportReportV01 .class, InvestmentRestrictions.class, LocalMarketAnnex.class, MessageIdentification1 .class, MxReda00400101 .class, OrderDeskContactDetails.class, PostalAddress1 .class, PriceMethod1Code.class, ProcessingCharacteristics1 .class, SecurityIdentification7 .class, SignatureType1Code.class, SimpleIdentificationInformation.class, TimeFrame3Choice.class, Timeframe2Choice.class, UpdatedDate.class, ValuationDealingProcessingCharacteristics.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.01";

    public MxReda00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00400101(final String xml) {
        this();
        MxReda00400101 tmp = parse(xml);
        fndPrcgPsptRpt = tmp.getFndPrcgPsptRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndPrcgPsptRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundProcessingPassportReportV01 }
     *     
     */
    public FundProcessingPassportReportV01 getFndPrcgPsptRpt() {
        return fndPrcgPsptRpt;
    }

    /**
     * Sets the value of the fndPrcgPsptRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundProcessingPassportReportV01 }
     *     
     */
    public MxReda00400101 setFndPrcgPsptRpt(FundProcessingPassportReportV01 value) {
        this.fndPrcgPsptRpt = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxReda00400101 parse(String xml) {
        return ((MxReda00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00400101 parse(String xml, MxRead parserImpl) {
        return ((MxReda00400101) parserImpl.read(MxReda00400101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxReda00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00400101 message
     * @return
     *     a new instance of MxReda00400101
     */
    public final static MxReda00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00400101 .class);
    }

}
