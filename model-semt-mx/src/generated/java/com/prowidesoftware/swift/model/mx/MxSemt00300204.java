
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
 * Class for semt.003.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.003.002.04")
public class MxSemt00300204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReportV04Subset sctiesBalAcctgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account12 .class, AccountIdentification4 .class, AdditionalBalanceInformation7 .class, AggregateBalanceInformation15 .class, AggregateBalancePerSafekeepingPlace14 .class, AmountAndDirection14 .class, Balance2 .class, BalanceAmounts5 .class, BalanceAmounts6 .class, BalanceQuantity6Choice.class, ClassificationType3Choice.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DerivativeBasicAttributes2 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, FinancialInstrument22 .class, FinancialInstrumentAttributes30 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms16 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, Frequency6Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification27 .class, GenericIdentification28 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, Intermediary22 .class, InvestmentFundRole2Code.class, MarketIdentification10 .class, MarketIdentification2Choice.class, MarketIdentification9 .class, MarketType4Code.class, MarketType5Choice.class, MarketType5Code.class, MarketType7Choice.class, MxSemt00300204 .class, NameAndAddress12 .class, Number3Choice.class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification59Choice.class, PaymentDirection3Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceInformation7 .class, PriceRateOrAmount1Choice.class, PriceRateOrAmountOrUnknown1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PurposeCode3Choice.class, PurposeCode4Choice.class, Quantity10Choice.class, QuantityAndAvailability2 .class, QuantityBreakdown8 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Role3Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount15 .class, SecuritiesAccount16 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReportV04Subset.class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecurityIdentification14 .class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement24 .class, StatementBasis1Code.class, StatementBasis4Choice.class, StatementUpdateType1Code.class, SubAccountIdentification20 .class, SubBalanceInformation7 .class, SubBalanceQuantity4Choice.class, SubBalanceType7Choice.class, SubBalanceType8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement4 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, TypeOfPrice7Choice.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.003.002.04";

    public MxSemt00300204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300204(final String xml) {
        this();
        MxSemt00300204 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReportV04Subset }
     *     
     */
    public SecuritiesBalanceAccountingReportV04Subset getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReportV04Subset }
     *     
     */
    public MxSemt00300204 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReportV04Subset value) {
        this.sctiesBalAcctgRpt = value;
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
    public static MxSemt00300204 parse(String xml) {
        return ((MxSemt00300204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00300204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00300204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300204 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300204) parserImpl.read(MxSemt00300204 .class, xml, _classes));
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
     * Creates an MxSemt00300204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300204 message
     * @return
     *     a new instance of MxSemt00300204
     */
    public static final MxSemt00300204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00300204 .class);
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
