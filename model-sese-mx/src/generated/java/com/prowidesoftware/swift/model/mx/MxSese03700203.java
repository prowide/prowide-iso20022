
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
 * Class for sese.037.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.037.002.03")
public class MxSese03700203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfNtfctn", required = true)
    protected PortfolioTransferNotification002V03 prtflTrfNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AlternatePartyIdentification3 .class, AmountAndDirection15 .class, AmountAndDirection17 .class, ClassificationType3Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes41 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification39 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, MarketIdentification4Choice.class, MxSese03700203 .class, NameAndAddress12 .class, Number3Choice.class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherAmounts22 .class, OtherIdentification2 .class, OtherParties13 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification58Choice.class, PartyIdentification59Choice.class, PartyIdentification60Choice.class, PartyIdentificationAndAccount49 .class, PartyTextInformation3 .class, PortfolioTransferNotification002V03 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, Quantity8 .class, QuantityBreakdown18 .class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, Reporting1Code.class, Reporting4Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SecuritiesAccount17 .class, SecuritiesCertificate2 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesTradeDetails30 .class, SecurityIdentification15 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails18 .class, SettlementParties17 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition3Code.class, SettlementTransactionCondition4Choice.class, Statement25 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.037.002.03";

    public MxSese03700203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03700203(final String xml) {
        this();
        MxSese03700203 tmp = parse(xml);
        prtflTrfNtfctn = tmp.getPrtflTrfNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03700203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferNotification002V03 }
     *     
     */
    public PortfolioTransferNotification002V03 getPrtflTrfNtfctn() {
        return prtflTrfNtfctn;
    }

    /**
     * Sets the value of the prtflTrfNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferNotification002V03 }
     *     
     */
    public MxSese03700203 setPrtflTrfNtfctn(PortfolioTransferNotification002V03 value) {
        this.prtflTrfNtfctn = value;
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
    public static MxSese03700203 parse(String xml) {
        return ((MxSese03700203) MxReadImpl.parse(MxSese03700203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03700203 parse(String xml, MxRead parserImpl) {
        return ((MxSese03700203) parserImpl.read(MxSese03700203 .class, xml, _classes));
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
     * Creates an MxSese03700203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03700203 message
     * @return
     *     a new instance of MxSese03700203
     */
    public final static MxSese03700203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03700203 .class);
    }

}
