
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
 * Class for semt.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPnltiesRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1semt.044.001.01")
public class MxSemt04400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPnltiesRpt", required = true)
    protected SecuritiesTransactionPenaltiesReportV01 sctiesTxPnltiesRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AggregatedPenaltyAmount1 .class, AggregatedPenaltyAmount2 .class, AmountAndDirection5 .class, CashAccountIdentification5Choice.class, ClassificationType1Choice.class, Contact4 .class, CorporateActionEventType28Code.class, CorporateActionEventType73Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DeliveryReceiptType2Code.class, EventFrequency7Code.class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeRate3 .class, Frequency22Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, IdentificationSource3Choice.class, MarketIdentification1Choice.class, MarketIdentification89 .class, MarketType15Choice.class, MarketType4Code.class, MxSemt04400101 .class, NameAndAddress5 .class, NamePrefix2Code.class, NoReasonCode.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, OtherIdentification1 .class, Pagination1 .class, Party38Choice.class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification135 .class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification193 .class, Penalty1 .class, PenaltyAmountBreakdown1 .class, PenaltyAmountType1Code.class, PenaltyCalculationMethod1Code.class, PenaltyCalculationRecord1 .class, PenaltyFinancialInstrumentIdentification1 .class, PenaltyIdentification1 .class, PenaltyIdentification2 .class, PenaltyListType1Choice.class, PenaltyListType1Code.class, PenaltyPartyType1Choice.class, PenaltyPerCounterparty1 .class, PenaltyRate1 .class, PenaltyRecord1 .class, PenaltyReport1 .class, PenaltyStatus1 .class, PenaltyStatus1Choice.class, PenaltyStatus1Code.class, PenaltyStatusReason1 .class, PenaltyStatusReason1Choice.class, PenaltyStatusReason1Code.class, PenaltyTransaction1 .class, PenaltyTransactionRecord1 .class, PenaltyType1Code.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress24 .class, PreferredContactMethod1Code.class, PriceInformation25 .class, PriceRateOrAmount4Choice.class, ReceiveDelivery1Code.class, SecuritiesAccount19 .class, SecuritiesTransactionPenaltiesReportV01 .class, SecuritiesTransactionType26Code.class, SecuritiesTransactionType44Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementOrCorporateActionEvent27Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemEvent3 .class, SystemEventType4Choice.class, TransactionIdentifications40 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1semt.044.001.01";

    public MxSemt04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt04400101(final String xml) {
        this();
        MxSemt04400101 tmp = parse(xml);
        sctiesTxPnltiesRpt = tmp.getSctiesTxPnltiesRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPnltiesRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPenaltiesReportV01 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 getSctiesTxPnltiesRpt() {
        return sctiesTxPnltiesRpt;
    }

    /**
     * Sets the value of the sctiesTxPnltiesRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPenaltiesReportV01 }
     *     
     */
    public MxSemt04400101 setSctiesTxPnltiesRpt(SecuritiesTransactionPenaltiesReportV01 value) {
        this.sctiesTxPnltiesRpt = value;
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
    public static MxSemt04400101 parse(String xml) {
        return ((MxSemt04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt04400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt04400101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt04400101) parserImpl.read(MxSemt04400101 .class, xml, _classes));
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
     * Creates an MxSemt04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt04400101 message
     * @return
     *     a new instance of MxSemt04400101
     */
    public static final MxSemt04400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt04400101 .class);
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
