
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
 * Class for colr.022.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trptyCollAndXpsrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.022.001.01")
public class MxColr02200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrptyCollAndXpsrRpt", required = true)
    protected TripartyCollateralAndExposureReportV01 trptyCollAndXpsrRpt;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 22;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection53 .class, BalanceQuantity13Choice.class, BasketIdentificationAndEligibilitySetProfile1 .class, BenchmarkCurveName13Choice.class, BenchmarkCurveName7Code.class, BlockChainAddressWallet3 .class, CashAccountIdentification5Choice.class, CashBalance15 .class, ClosingDate4Choice.class, CollateralAmount15 .class, CollateralAmount16 .class, CollateralAmount17 .class, CollateralAmount4 .class, CollateralAmount9 .class, CollateralParties11 .class, CollateralParties9 .class, CollateralRole1Code.class, CollateralStatus1Code.class, CollateralStatus2Choice.class, CollateralTransactionAmountBreakdown2 .class, CounterpartyAggregation3 .class, CrystallisationDay1 .class, Date3Choice.class, DateAndDateTime2Choice.class, DateType2Code.class, EventFrequency7Code.class, ExecutionStatus1Code.class, ExposureType14Code.class, ExposureType23Choice.class, ExposureTypeAggregation3 .class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms19 .class, Frequency22Choice.class, GenericIdentification1 .class, GenericIdentification178 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification56 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateIndexTenor2Code.class, MarketIdentification1Choice.class, MarketIdentification89 .class, MarketType15Choice.class, MarketType4Code.class, MxColr02200101 .class, NameAndAddress5 .class, Number3Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OverallCollateralDetails2 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentification232 .class, PartyIdentificationAndAccount202 .class, Period2 .class, Period4Choice.class, PostalAddress1 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, Quantity51Choice.class, RateOrName4Choice.class, RateTypeAndLookback2 .class, Rating2 .class, RepoTerminationOption1Code.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesBalance3 .class, SecuritiesSettlementStatus3Code.class, SecurityIdentification19 .class, Statement78 .class, StatementBasis14Choice.class, StatementBasis3Code.class, StatementStatusType1Code.class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement5 .class, TradingCapacity7Code.class, TradingPartyCapacity5Choice.class, Transaction124 .class, TransactionStatus6 .class, TripartyCollateralAndExposureReportV01 .class, TypeOfIdentification1Code.class, UpdateType15Choice.class, ValuationFactorBreakdown1 .class, ValuationsDetails1 .class, ValuationsDetails2 .class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.022.001.01";

    public MxColr02200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr02200101(final String xml) {
        this();
        MxColr02200101 tmp = parse(xml);
        trptyCollAndXpsrRpt = tmp.getTrptyCollAndXpsrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr02200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trptyCollAndXpsrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralAndExposureReportV01 }
     *     
     */
    public TripartyCollateralAndExposureReportV01 getTrptyCollAndXpsrRpt() {
        return trptyCollAndXpsrRpt;
    }

    /**
     * Sets the value of the trptyCollAndXpsrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralAndExposureReportV01 }
     *     
     */
    public MxColr02200101 setTrptyCollAndXpsrRpt(TripartyCollateralAndExposureReportV01 value) {
        this.trptyCollAndXpsrRpt = value;
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
    public static MxColr02200101 parse(String xml) {
        return ((MxColr02200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr02200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr02200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr02200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr02200101 parse(String xml, MxRead parserImpl) {
        return ((MxColr02200101) parserImpl.read(MxColr02200101 .class, xml, _classes));
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
     * Creates an MxColr02200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr02200101 message
     * @return
     *     a new instance of MxColr02200101
     */
    public static final MxColr02200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr02200101 .class);
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
