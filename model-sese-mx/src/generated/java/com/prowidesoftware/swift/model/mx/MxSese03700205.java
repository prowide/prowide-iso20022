
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.037.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.037.002.05")
public class MxSese03700205
    extends AbstractMX
{

    @XmlElement(name = "PrtflTrfNtfctn", required = true)
    protected PortfolioTransferNotification002V05 prtflTrfNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AllegementStatus2Code.class, AlternatePartyIdentification9 .class, AmountAndDirection57 .class, AmountAndDirection58 .class, ClassificationType33Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes97 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification30 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, MarketIdentification4Choice.class, MxSese03700205 .class, NameAndAddress12 .class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OtherAmounts33 .class, OtherIdentification2 .class, OtherParties30 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification110 .class, PartyIdentification111 .class, PartyIdentification115Choice.class, PartyIdentification119 .class, PartyIdentification128 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount160 .class, PartyTextInformation3 .class, PortfolioTransferNotification002V05 .class, PortfolioTransferStatus1Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType1Code.class, Quantity15 .class, QuantityBreakdown48 .class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration1Code.class, Reporting1Code.class, Reporting8Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SecuritiesAccount30 .class, SecuritiesCertificate5 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesTradeDetails81 .class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails103 .class, SettlementParties64 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition21Choice.class, SettlementTransactionCondition3Code.class, Statement68 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.037.002.05";

    public MxSese03700205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03700205(final String xml) {
        this();
        MxSese03700205 tmp = parse(xml);
        prtflTrfNtfctn = tmp.getPrtflTrfNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03700205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferNotification002V05 }
     *     
     */
    public PortfolioTransferNotification002V05 getPrtflTrfNtfctn() {
        return prtflTrfNtfctn;
    }

    /**
     * Sets the value of the prtflTrfNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferNotification002V05 }
     *     
     */
    public MxSese03700205 setPrtflTrfNtfctn(PortfolioTransferNotification002V05 value) {
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
    public static MxSese03700205 parse(String xml) {
        return ((MxSese03700205) MxReadImpl.parse(MxSese03700205 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03700205 parse(String xml, MxRead parserImpl) {
        return ((MxSese03700205) parserImpl.read(MxSese03700205 .class, xml, _classes));
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
     * Creates an MxSese03700205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03700205 message
     * @return
     *     a new instance of MxSese03700205
     */
    public final static MxSese03700205 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese03700205 .class);
    }

}
