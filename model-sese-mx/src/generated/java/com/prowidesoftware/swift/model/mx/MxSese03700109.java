
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
 * Class for sese.037.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.037.001.09")
public class MxSese03700109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfNtfctn", required = true)
    protected PortfolioTransferNotificationV09 prtflTrfNtfctn;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus32Choice.class, AcknowledgementReason20 .class, AcknowledgementReason23Choice.class, AcknowledgementReason9Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection44 .class, AmountAndDirection52 .class, BlockChainAddressWallet3 .class, CashSettlementSystemPlace1Choice.class, ClassificationType32Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DigitalPaymentSettlement1 .class, EventFrequency3Code.class, FinancialInstrumentAttributes111 .class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, MarketIdentification3Choice.class, MxSese03700109 .class, NameAndAddress5 .class, NoReasonCode.class, Number22Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OtherAmounts29 .class, OtherIdentification1 .class, OtherParties39 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification149 .class, PartyIdentification257Choice.class, PartyIdentification315 .class, PartyIdentificationAndAccount196 .class, PartyTextInformation1 .class, PendingFailingReason1Code.class, PendingProcessingReason14 .class, PendingProcessingReason16Choice.class, PendingProcessingStatus17Choice.class, PortfolioTransferNotificationV09 .class, PortfolioTransferStatus2Choice.class, PostalAddress1 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceType4Choice.class, PriceValueType1Code.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity48 .class, Quantity83Choice.class, QuantityBreakdown62 .class, ReceiveDelivery1Code.class, Registration1Code.class, Registration9Choice.class, RejectionReason37Choice.class, RejectionReason49 .class, RejectionReason55Code.class, RejectionStatus30Choice.class, Reporting1Code.class, Reporting7Choice.class, Restriction5Choice.class, SecuritiesAccount19 .class, SecuritiesCertificate4 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesRTGS4Choice.class, SecuritiesTradeDetails154 .class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementDetails236 .class, SettlementParties128 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition21Code.class, SettlementTransactionCondition47Choice.class, Statement62 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice29Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.037.001.09";

    public MxSese03700109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03700109(final String xml) {
        this();
        MxSese03700109 tmp = parse(xml);
        prtflTrfNtfctn = tmp.getPrtflTrfNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03700109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferNotificationV09 }
     *     
     */
    public PortfolioTransferNotificationV09 getPrtflTrfNtfctn() {
        return prtflTrfNtfctn;
    }

    /**
     * Sets the value of the prtflTrfNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferNotificationV09 }
     *     
     */
    public MxSese03700109 setPrtflTrfNtfctn(PortfolioTransferNotificationV09 value) {
        this.prtflTrfNtfctn = value;
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
    public static MxSese03700109 parse(String xml) {
        return ((MxSese03700109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03700109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03700109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03700109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03700109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03700109 parse(String xml, MxRead parserImpl) {
        return ((MxSese03700109) parserImpl.read(MxSese03700109 .class, xml, _classes));
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
     * Creates an MxSese03700109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03700109 message
     * @return
     *     a new instance of MxSese03700109
     */
    public static final MxSese03700109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03700109 .class);
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
