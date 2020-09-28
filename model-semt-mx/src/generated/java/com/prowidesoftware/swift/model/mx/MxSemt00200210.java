
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
 * Class for semt.002.002.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalCtdyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.002.10")
public class MxSemt00200210
    extends AbstractMX
{

    @XmlElement(name = "SctiesBalCtdyRpt", required = true)
    protected SecuritiesBalanceCustodyReport002V10 sctiesBalCtdyRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account30 .class, AccountIdentification4 .class, AdditionalBalanceInformation19 .class, AggregateBalanceInformation39 .class, AggregateBalancePerSafekeepingPlace36 .class, AmountAndDirection14 .class, Balance10 .class, Balance11 .class, Balance12 .class, Balance13 .class, BalanceAmounts4 .class, BalanceQuantity10Choice.class, BalanceQuantity12Choice.class, BasicCollateralValuation1Details.class, ClassificationType33Choice.class, CorporateActionOption5Code.class, DateAndDateTime2Choice.class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency7Code.class, ExposureType17Choice.class, ExposureType4Code.class, FinancialInstrument22 .class, FinancialInstrumentAttributes97 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms35 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, Frequency34Choice.class, GenericIdentification144 .class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, Intermediary45 .class, InvestmentFundRole2Code.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification91 .class, MarketType17Choice.class, MarketType4Code.class, MxSemt00200210 .class, NameAndAddress12 .class, Number23Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification15 .class, PartyIdentification156 .class, PartyIdentification157 .class, Pledgee4 .class, PledgeeFormat6Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier2 .class, PledgeeTypeAndText2 .class, Price3 .class, PriceInformation22 .class, PriceRateOrAmount1Choice.class, PriceRateOrAmountOrUnknown3Choice.class, PriceType5Choice.class, PriceValueType1Code.class, PurposeCode8Choice.class, Quantity10Choice.class, QuantityAndAvailability2 .class, QuantityBreakdown56 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Role7Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount33 .class, SecuritiesAccount34 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceCustodyReport002V10 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecurityIdentification20 .class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement77 .class, StatementBasis1Code.class, StatementBasis9Choice.class, StatementUpdateType1Code.class, SubAccountIdentification58 .class, SubBalanceInformation19 .class, SubBalanceQuantity7Choice.class, SubBalanceType13Choice.class, SubBalanceType14Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement3 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, TypeOfPrice33Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.002.002.10";

    public MxSemt00200210() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00200210(final String xml) {
        this();
        MxSemt00200210 tmp = parse(xml);
        sctiesBalCtdyRpt = tmp.getSctiesBalCtdyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00200210(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalCtdyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceCustodyReport002V10 }
     *     
     */
    public SecuritiesBalanceCustodyReport002V10 getSctiesBalCtdyRpt() {
        return sctiesBalCtdyRpt;
    }

    /**
     * Sets the value of the sctiesBalCtdyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceCustodyReport002V10 }
     *     
     */
    public MxSemt00200210 setSctiesBalCtdyRpt(SecuritiesBalanceCustodyReport002V10 value) {
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
    public static MxSemt00200210 parse(String xml) {
        return ((MxSemt00200210) MxReadImpl.parse(MxSemt00200210 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00200210 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00200210) parserImpl.read(MxSemt00200210 .class, xml, _classes));
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
     * Creates an MxSemt00200210 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00200210 message
     * @return
     *     a new instance of MxSemt00200210
     */
    public final static MxSemt00200210 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt00200210 .class);
    }

}
