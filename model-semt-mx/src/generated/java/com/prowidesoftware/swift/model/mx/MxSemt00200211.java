
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
 * Class for semt.002.002.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalCtdyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.002.11")
public class MxSemt00200211
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalCtdyRpt", required = true)
    protected SecuritiesBalanceCustodyReport002V11 sctiesBalCtdyRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account30 .class, AccountIdentification4 .class, AdditionalBalanceInformation24 .class, AggregateBalanceInformation44 .class, AggregateBalancePerSafekeepingPlace41 .class, AmountAndDirection14 .class, Balance22 .class, Balance23 .class, Balance25 .class, Balance27 .class, BalanceAmounts4 .class, BalanceQuantity15Choice.class, BalanceQuantity17Choice.class, BasicCollateralValuation1Details.class, BlockChainAddressWallet10 .class, BlockChainAddressWallet6 .class, ClassificationType33Choice.class, CorporateActionOption5Code.class, DateAndDateTime2Choice.class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency7Code.class, ExposureType12Code.class, ExposureType24Choice.class, FinancialInstrument22 .class, FinancialInstrumentAttributes122 .class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms35 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, Frequency34Choice.class, GenericIdentification144 .class, GenericIdentification18 .class, GenericIdentification30 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, Intermediary45 .class, InvestmentFundRole2Code.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification91 .class, MarketType17Choice.class, MarketType4Code.class, MxSemt00200211 .class, NameAndAddress12 .class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification15 .class, PartyIdentification156 .class, PartyIdentification157 .class, Pledgee4 .class, PledgeeFormat6Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier2 .class, PledgeeTypeAndText2 .class, Price3 .class, PriceInformation22 .class, PriceRateOrAmount1Choice.class, PriceRateOrAmountOrUnknown3Choice.class, PriceType5Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, PurposeCode8Choice.class, Quantity54Choice.class, QuantityAndAvailability4 .class, QuantityBreakdown71 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Role7Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount34 .class, SecuritiesAccount42 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceCustodyReport002V11 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecurityIdentification20 .class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement77 .class, StatementBasis1Code.class, StatementBasis9Choice.class, StatementUpdateType1Code.class, SubAccountIdentification69 .class, SubBalanceInformation24 .class, SubBalanceQuantity9Choice.class, SubBalanceType13Choice.class, SubBalanceType14Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement3 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, TypeOfPrice33Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.002.002.11";

    public MxSemt00200211() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00200211(final String xml) {
        this();
        MxSemt00200211 tmp = parse(xml);
        sctiesBalCtdyRpt = tmp.getSctiesBalCtdyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00200211(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalCtdyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceCustodyReport002V11 }
     *     
     */
    public SecuritiesBalanceCustodyReport002V11 getSctiesBalCtdyRpt() {
        return sctiesBalCtdyRpt;
    }

    /**
     * Sets the value of the sctiesBalCtdyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceCustodyReport002V11 }
     *     
     */
    public MxSemt00200211 setSctiesBalCtdyRpt(SecuritiesBalanceCustodyReport002V11 value) {
        this.sctiesBalCtdyRpt = value;
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
    public static MxSemt00200211 parse(String xml) {
        return ((MxSemt00200211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00200211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00200211 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00200211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00200211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00200211 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00200211) parserImpl.read(MxSemt00200211 .class, xml, _classes));
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
     * Creates an MxSemt00200211 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00200211 message
     * @return
     *     a new instance of MxSemt00200211
     */
    public static final MxSemt00200211 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00200211 .class);
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
