
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.003.002.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.002.11")
public class MxSemt00300211
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReport002V11 sctiesBalAcctgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account30 .class, AccountIdentification4 .class, AdditionalBalanceInformation23 .class, AggregateBalanceInformation43 .class, AggregateBalancePerSafekeepingPlace40 .class, AmountAndDirection14 .class, Balance22 .class, Balance23 .class, BalanceAmounts5 .class, BalanceAmounts6 .class, BalanceQuantity15Choice.class, BlockChainAddressWallet10 .class, BlockChainAddressWallet9 .class, ClassificationType33Choice.class, CorporateActionOption5Code.class, DateAndDateTime2Choice.class, DerivativeBasicAttributes2 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, ExposureType12Code.class, ExposureType24Choice.class, FinancialInstrument22 .class, FinancialInstrumentAttributes122 .class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms35 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency26Choice.class, Frequency27Choice.class, GenericIdentification144 .class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, Intermediary45 .class, InvestmentFundRole2Code.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification91 .class, MarketType17Choice.class, MarketType4Code.class, MxSemt00300211 .class, NameAndAddress12 .class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, Pledgee4 .class, PledgeeFormat6Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier2 .class, PledgeeTypeAndText2 .class, Price3 .class, PriceInformation22 .class, PriceRateOrAmount1Choice.class, PriceRateOrAmountOrUnknown3Choice.class, PriceType5Choice.class, PriceValueType1Code.class, PurposeCode8Choice.class, Quantity54Choice.class, QuantityAndAvailability4 .class, QuantityBreakdown70 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Role7Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount34 .class, SecuritiesAccount42 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReport002V11 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecurityIdentification20 .class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement76 .class, StatementBasis1Code.class, StatementBasis9Choice.class, StatementUpdateType1Code.class, SubAccountIdentification68 .class, SubBalanceInformation23 .class, SubBalanceQuantity9Choice.class, SubBalanceType13Choice.class, SubBalanceType14Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement4 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, TypeOfPrice33Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.003.002.11";

    public MxSemt00300211() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300211(final String xml) {
        this();
        MxSemt00300211 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300211(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReport002V11 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V11 getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReport002V11 }
     *     
     */
    public MxSemt00300211 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReport002V11 value) {
        this.sctiesBalAcctgRpt = value;
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
    public static MxSemt00300211 parse(String xml) {
        return ((MxSemt00300211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00300211 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00300211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300211 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300211) parserImpl.read(MxSemt00300211 .class, xml, _classes));
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
     * Creates an MxSemt00300211 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300211 message
     * @return
     *     a new instance of MxSemt00300211
     */
    public final static MxSemt00300211 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00300211 .class);
    }

}
