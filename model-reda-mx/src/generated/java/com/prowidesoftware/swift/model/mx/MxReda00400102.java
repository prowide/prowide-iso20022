
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.004.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndPrcgPsptRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.02")
public class MxReda00400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndPrcgPsptRpt", required = true)
    protected FundProcessingPassportReportV02 fndPrcgPsptRpt;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification5Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternateSecurityIdentification3 .class, BusinessDayConvention1Code.class, CashAccount21 .class, CashAccount22 .class, ContactAttributes1 .class, DistributionPolicy1Code.class, DividendPolicy1Code.class, EUSavingsDirective1Code.class, EventFrequency5Code.class, Extension1 .class, FinancialInstrument20 .class, Forms.class, FundProcessingPassport1 .class, FundProcessingPassportReportV02 .class, HoldingTransferable1Code.class, InvestmentRestrictions2 .class, LocalMarketAnnex2 .class, MainFundOrderDeskLocation1 .class, MessageIdentification1 .class, MxReda00400102 .class, PostalAddress1 .class, PriceMethod1Code.class, ProcessingCharacteristics2 .class, ProcessingCharacteristics3 .class, ReferToFundOrderDesk1Code.class, SecurityIdentification1 .class, SecurityIdentification7 .class, SignatureType1Code.class, TimeFrame3 .class, TimeFrame4Choice.class, TimeFrame5Choice.class, UTCOffset1 .class, UpdatedDate.class, ValuationDealingProcessingCharacteristics2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.004.001.02";

    public MxReda00400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00400102(final String xml) {
        this();
        MxReda00400102 tmp = parse(xml);
        fndPrcgPsptRpt = tmp.getFndPrcgPsptRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndPrcgPsptRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundProcessingPassportReportV02 }
     *     
     */
    public FundProcessingPassportReportV02 getFndPrcgPsptRpt() {
        return fndPrcgPsptRpt;
    }

    /**
     * Sets the value of the fndPrcgPsptRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundProcessingPassportReportV02 }
     *     
     */
    public MxReda00400102 setFndPrcgPsptRpt(FundProcessingPassportReportV02 value) {
        this.fndPrcgPsptRpt = value;
        return this;
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
    public static MxReda00400102 parse(String xml) {
        return ((MxReda00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00400102 parse(String xml, MxRead parserImpl) {
        return ((MxReda00400102) parserImpl.read(MxReda00400102 .class, xml, _classes));
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
     * Creates an MxReda00400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00400102 message
     * @return
     *     a new instance of MxReda00400102
     */
    public static final MxReda00400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00400102 .class);
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

}
