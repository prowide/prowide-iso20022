
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
 * Class for semt.041.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalTrnsprncyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.041.001.02")
public class MxSemt04100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalTrnsprncyRpt", required = true)
    protected SecuritiesBalanceTransparencyReportV02 sctiesBalTrnsprncyRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountSubLevel11 .class, AccountSubLevel12 .class, AccountSubLevel13 .class, AccountSubLevel14 .class, AccountSubLevel15 .class, AccountSubLevel16 .class, AccountSubLevel17 .class, AccountSubLevel18 .class, AccountSubLevel19 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AggregateHoldingBalance1 .class, AggregateHoldingBalance2 .class, AggregateHoldingBalance3 .class, AlternateIdentification4 .class, BeneficialOwner2 .class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType9Choice.class, DateAndDateTimeChoice.class, DatePeriod1Choice.class, EventFrequency7Code.class, FinancialInstrumentAggregateBalance1 .class, FinancialInstrumentAggregateBalance1Choice.class, FinancialInstrumentAggregateBalance2 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, Frequency22Choice.class, FrequencyGranularityType1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification56 .class, IdentificationSource3Choice.class, Intermediary29 .class, InvestmentFundRole2Code.class, MessageIdentification1 .class, MxSemt04100102 .class, NameAndAddress5 .class, Number3Choice.class, OrderOriginatorEligibility1Code.class, OtherIdentification1 .class, OtherIdentification4Choice.class, Pagination.class, PartyIdentification100 .class, PartyIdentification71Choice.class, Period2 .class, PersonIdentificationType6Code.class, PhysicalTransferType1Code.class, PostalAddress1 .class, Price6 .class, PriceRateOrAmountChoice.class, PriceSource2Code.class, Role5Choice.class, SafekeepingAccount7 .class, SecuritiesAccount19 .class, SecuritiesBalanceTransparencyReportV02 .class, SecuritiesBalanceType14Code.class, SecurityIdentification19 .class, SenderBusinessRole1Code.class, Statement59 .class, StatementUpdateType1Code.class, SubBalanceBreakdown1 .class, SubBalanceQuantity5Choice.class, SubBalanceType9Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfPrice13Code.class, UpdateType4Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.041.001.02";

    public MxSemt04100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt04100102(final String xml) {
        this();
        MxSemt04100102 tmp = parse(xml);
        sctiesBalTrnsprncyRpt = tmp.getSctiesBalTrnsprncyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt04100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalTrnsprncyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceTransparencyReportV02 }
     *     
     */
    public SecuritiesBalanceTransparencyReportV02 getSctiesBalTrnsprncyRpt() {
        return sctiesBalTrnsprncyRpt;
    }

    /**
     * Sets the value of the sctiesBalTrnsprncyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceTransparencyReportV02 }
     *     
     */
    public MxSemt04100102 setSctiesBalTrnsprncyRpt(SecuritiesBalanceTransparencyReportV02 value) {
        this.sctiesBalTrnsprncyRpt = value;
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
    public static MxSemt04100102 parse(String xml) {
        return ((MxSemt04100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt04100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt04100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt04100102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt04100102) parserImpl.read(MxSemt04100102 .class, xml, _classes));
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
     * Creates an MxSemt04100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt04100102 message
     * @return
     *     a new instance of MxSemt04100102
     */
    public final static MxSemt04100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt04100102 .class);
    }

}
