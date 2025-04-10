
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
 * Class for sese.037.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.037.002.07")
public class MxSese03700207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfNtfctn", required = true)
    protected PortfolioTransferNotification002V07 prtflTrfNtfctn;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus32Choice.class, AcknowledgementReason20 .class, AcknowledgementReason23Choice.class, AcknowledgementReason9Code.class, AlternatePartyIdentification9 .class, AmountAndDirection57 .class, AmountAndDirection58 .class, BlockChainAddressWallet7 .class, ClassificationType33Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes122 .class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification30 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, MarketIdentification4Choice.class, MxSese03700207 .class, NameAndAddress12 .class, NoReasonCode.class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OtherAmounts33 .class, OtherIdentification2 .class, OtherParties42 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification162 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentificationAndAccount206 .class, PartyTextInformation3 .class, PendingFailingReason1Code.class, PendingProcessingReason14 .class, PendingProcessingReason16Choice.class, PendingProcessingStatus17Choice.class, PortfolioTransferNotification002V07 .class, PortfolioTransferStatus2Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType1Code.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity49 .class, QuantityBreakdown69 .class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration1Code.class, RejectionReason37Choice.class, RejectionReason49 .class, RejectionReason55Code.class, RejectionStatus30Choice.class, Reporting1Code.class, Reporting8Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SecuritiesAccount30 .class, SecuritiesCertificate5 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesTradeDetails139 .class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails103 .class, SettlementParties104 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition21Choice.class, SettlementTransactionCondition3Code.class, Statement68 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.037.002.07";

    public MxSese03700207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03700207(final String xml) {
        this();
        MxSese03700207 tmp = parse(xml);
        prtflTrfNtfctn = tmp.getPrtflTrfNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03700207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferNotification002V07 }
     *     
     */
    public PortfolioTransferNotification002V07 getPrtflTrfNtfctn() {
        return prtflTrfNtfctn;
    }

    /**
     * Sets the value of the prtflTrfNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferNotification002V07 }
     *     
     */
    public MxSese03700207 setPrtflTrfNtfctn(PortfolioTransferNotification002V07 value) {
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
    public static MxSese03700207 parse(String xml) {
        return ((MxSese03700207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03700207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03700207 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03700207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03700207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03700207 parse(String xml, MxRead parserImpl) {
        return ((MxSese03700207) parserImpl.read(MxSese03700207 .class, xml, _classes));
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
     * Creates an MxSese03700207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03700207 message
     * @return
     *     a new instance of MxSese03700207
     */
    public static final MxSese03700207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03700207 .class);
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
