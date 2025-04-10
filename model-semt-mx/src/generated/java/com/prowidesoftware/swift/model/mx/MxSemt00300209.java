
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
 * Class for semt.003.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.002.09")
public class MxSemt00300209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReport002V09 sctiesBalAcctgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account21 .class, AccountIdentification4 .class, AdditionalBalanceInformation16 .class, AggregateBalanceInformation32 .class, AggregateBalancePerSafekeepingPlace30 .class, AmountAndDirection14 .class, Balance10 .class, Balance11 .class, BalanceAmounts5 .class, BalanceAmounts6 .class, BalanceQuantity10Choice.class, ClassificationType33Choice.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DerivativeBasicAttributes2 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, ExposureType17Choice.class, ExposureType4Code.class, FinancialInstrument22 .class, FinancialInstrumentAttributes78 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms31 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency26Choice.class, Frequency27Choice.class, GenericIdentification144 .class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, Intermediary37 .class, InvestmentFundRole2Code.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification91 .class, MarketType17Choice.class, MarketType4Code.class, MxSemt00300209 .class, NameAndAddress12 .class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification104Choice.class, PartyIdentification109 .class, PartyIdentification111 .class, PartyIdentification114Choice.class, Pledgee2 .class, PledgeeFormat4Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier1 .class, PledgeeTypeAndText2 .class, Price3 .class, PriceInformation14 .class, PriceRateOrAmount1Choice.class, PriceRateOrAmountOrUnknown1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PurposeCode8Choice.class, Quantity10Choice.class, QuantityAndAvailability2 .class, QuantityBreakdown39 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Role7Choice.class, SafeKeepingPlace2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount33 .class, SecuritiesAccount34 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReport002V09 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecurityIdentification20 .class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement51 .class, StatementBasis1Code.class, StatementBasis9Choice.class, StatementUpdateType1Code.class, SubAccountIdentification45 .class, SubBalanceInformation16 .class, SubBalanceQuantity7Choice.class, SubBalanceType13Choice.class, SubBalanceType14Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement4 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, TypeOfPrice33Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.003.002.09";

    public MxSemt00300209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300209(final String xml) {
        this();
        MxSemt00300209 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReport002V09 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V09 getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReport002V09 }
     *     
     */
    public MxSemt00300209 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReport002V09 value) {
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
    public static MxSemt00300209 parse(String xml) {
        return ((MxSemt00300209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00300209 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00300209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300209 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300209) parserImpl.read(MxSemt00300209 .class, xml, _classes));
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
     * Creates an MxSemt00300209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300209 message
     * @return
     *     a new instance of MxSemt00300209
     */
    public static final MxSemt00300209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00300209 .class);
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
