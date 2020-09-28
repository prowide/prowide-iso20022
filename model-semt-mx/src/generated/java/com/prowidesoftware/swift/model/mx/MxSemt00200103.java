
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
 * Class for semt.002.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalCtdyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.03")
public class MxSemt00200103
    extends AbstractMX
{

    @XmlElement(name = "SctiesBalCtdyRpt", required = true)
    protected SecuritiesBalanceCustodyReportV03 sctiesBalCtdyRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9 .class, AccountIdentification1 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation5 .class, AddressType2Code.class, AggregateBalanceInformation9 .class, AggregateBalancePerSafekeepingPlace8 .class, AlternateIdentification1 .class, AmountAndDirection6 .class, Balance1 .class, BalanceAmounts3 .class, BalanceQuantity4Choice.class, BalanceQuantity5Choice.class, BasicCollateralValuation1Details.class, ClassificationType2Choice.class, CopyDuplicate1Code.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, DocumentIdentification11 .class, EventFrequency3Code.class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrument21 .class, FinancialInstrumentAttributes8 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms1 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, Frequency4Choice.class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification22 .class, IdentificationSource1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, Intermediary2 .class, InvestmentFundRole2Code.class, MarketIdentification1Choice.class, MarketIdentification5 .class, MarketIdentification6 .class, MarketType2Choice.class, MarketType4Choice.class, MarketType4Code.class, MarketType5Code.class, MxSemt00200103 .class, NameAndAddress5 .class, Number2Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, Pagination.class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PartyIdentification15 .class, PaymentDirection2Choice.class, PostalAddress1 .class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceInformation5 .class, PriceRateOrAmountChoice.class, PriceRateOrAmountOrUnknownChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PurposeCode1Choice.class, PurposeCode2Choice.class, Quantity6Choice.class, QuantityAndAvailability1 .class, QuantityBreakdown3 .class, Role2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount11 .class, SecuritiesAccount14 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceCustodyReportV03 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, ShortLong1Code.class, SimpleIdentificationInformation.class, Statement21 .class, StatementBasis1Code.class, StatementBasis3Choice.class, StatementUpdateType1Code.class, SubAccountIdentification11 .class, SubBalanceInformation5 .class, SubBalanceQuantity3Choice.class, SubBalanceType5Choice.class, SubBalanceType6Choice.class, TotalValueInPageAndStatement1 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, TypeOfPrice4Choice.class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.03";

    public MxSemt00200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00200103(final String xml) {
        this();
        MxSemt00200103 tmp = parse(xml);
        sctiesBalCtdyRpt = tmp.getSctiesBalCtdyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalCtdyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceCustodyReportV03 }
     *     
     */
    public SecuritiesBalanceCustodyReportV03 getSctiesBalCtdyRpt() {
        return sctiesBalCtdyRpt;
    }

    /**
     * Sets the value of the sctiesBalCtdyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceCustodyReportV03 }
     *     
     */
    public MxSemt00200103 setSctiesBalCtdyRpt(SecuritiesBalanceCustodyReportV03 value) {
        this.sctiesBalCtdyRpt = value;
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
    public static MxSemt00200103 parse(String xml) {
        return ((MxSemt00200103) MxReadImpl.parse(MxSemt00200103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00200103 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00200103) parserImpl.read(MxSemt00200103 .class, xml, _classes));
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
     * Creates an MxSemt00200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00200103 message
     * @return
     *     a new instance of MxSemt00200103
     */
    public final static MxSemt00200103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt00200103 .class);
    }

}
