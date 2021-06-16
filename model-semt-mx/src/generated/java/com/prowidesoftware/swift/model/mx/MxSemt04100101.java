
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.041.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalTrnsprncyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.041.001.01")
public class MxSemt04100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalTrnsprncyRpt", required = true)
    protected SecuritiesBalanceTransparencyReportV01 sctiesBalTrnsprncyRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountSubLevel1 .class, AccountSubLevel2 .class, AccountSubLevel3 .class, AccountSubLevel4 .class, AccountSubLevel5 .class, AccountSubLevel6 .class, AccountSubLevel7 .class, AccountSubLevel8 .class, AccountSubLevel9 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AggregateHoldingBalance1 .class, AggregateHoldingBalance2 .class, AlternateIdentification4 .class, BeneficialOwner2 .class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType9Choice.class, DateAndDateTimeChoice.class, DatePeriod1Choice.class, EventFrequency7Code.class, FinancialInstrumentAggregateBalance1 .class, FinancialInstrumentAggregateBalance1Choice.class, FinancialInstrumentAggregateBalance2 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, Frequency22Choice.class, FrequencyGranularityType1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification56 .class, IdentificationSource3Choice.class, Intermediary28 .class, Intermediary29 .class, InvestmentFundRole2Code.class, MessageIdentification1 .class, MxSemt04100101 .class, NameAndAddress5 .class, Number3Choice.class, OrderOriginatorEligibility1Code.class, OtherIdentification1 .class, OtherIdentification4Choice.class, Pagination.class, PartyIdentification100 .class, PartyIdentification71Choice.class, Period2 .class, PersonIdentificationType6Code.class, PhysicalTransferType1Code.class, PostalAddress1 .class, Price6 .class, PriceRateOrAmountChoice.class, PriceSource2Code.class, Role5Choice.class, SafekeepingAccount5 .class, SecuritiesAccount19 .class, SecuritiesBalanceTransparencyReportV01 .class, SecuritiesBalanceType14Code.class, SecurityIdentification19 .class, Statement37 .class, StatementUpdateType1Code.class, SubBalanceBreakdown1 .class, SubBalanceQuantity5Choice.class, SubBalanceType9Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfPrice13Code.class, UpdateType4Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.041.001.01";

    public MxSemt04100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt04100101(final String xml) {
        this();
        MxSemt04100101 tmp = parse(xml);
        sctiesBalTrnsprncyRpt = tmp.getSctiesBalTrnsprncyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt04100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalTrnsprncyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceTransparencyReportV01 }
     *     
     */
    public SecuritiesBalanceTransparencyReportV01 getSctiesBalTrnsprncyRpt() {
        return sctiesBalTrnsprncyRpt;
    }

    /**
     * Sets the value of the sctiesBalTrnsprncyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceTransparencyReportV01 }
     *     
     */
    public MxSemt04100101 setSctiesBalTrnsprncyRpt(SecuritiesBalanceTransparencyReportV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSemt04100101 parse(String xml) {
        return ((MxSemt04100101) MxReadImpl.parse(MxSemt04100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt04100101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt04100101) parserImpl.read(MxSemt04100101 .class, xml, _classes));
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
     * Creates an MxSemt04100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt04100101 message
     * @return
     *     a new instance of MxSemt04100101
     */
    public final static MxSemt04100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt04100101 .class);
    }

}
