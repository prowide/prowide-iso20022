
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
 * Class for semt.002.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalCtdyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.09")
public class MxSemt00200109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalCtdyRpt", required = true)
    protected SecuritiesBalanceCustodyReportV09 sctiesBalCtdyRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account18 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation15 .class, AddressType2Code.class, AggregateBalanceInformation30 .class, AggregateBalancePerSafekeepingPlace28 .class, AmountAndDirection6 .class, Balance6 .class, Balance7 .class, Balance8 .class, Balance9 .class, BalanceAmounts3 .class, BalanceQuantity8Choice.class, BalanceQuantity9Choice.class, BasicCollateralValuation1Details.class, ClassificationType32Choice.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency7Code.class, ExposureType16Choice.class, ExposureType4Code.class, FinancialInstrument21 .class, FinancialInstrumentAttributes64 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms22 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency22Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification56 .class, GenericIdentification78 .class, GenericIdentification80 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, Intermediary32 .class, InvestmentFundRole2Code.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification89 .class, MarketType15Choice.class, MarketType4Code.class, MxSemt00200109 .class, NameAndAddress5 .class, Number22Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification100 .class, PartyIdentification15 .class, PartyIdentification71Choice.class, PartyIdentification92Choice.class, PartyIdentification98 .class, Pledgee1 .class, PledgeeFormat3Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier1 .class, PledgeeTypeAndText1 .class, PostalAddress1 .class, Price2 .class, PriceInformation12 .class, PriceRateOrAmountChoice.class, PriceRateOrAmountOrUnknownChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity6Choice.class, QuantityAndAvailability1 .class, QuantityBreakdown27 .class, Role6Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount25 .class, SecuritiesAccount26 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceCustodyReportV09 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecurityIdentification19 .class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement45 .class, StatementBasis1Code.class, StatementBasis7Choice.class, StatementUpdateType1Code.class, SubAccountIdentification42 .class, SubBalanceInformation15 .class, SubBalanceQuantity6Choice.class, SubBalanceType11Choice.class, SubBalanceType12Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement1 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice28Choice.class, TypeOfPrice29Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.09";

    public MxSemt00200109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00200109(final String xml) {
        this();
        MxSemt00200109 tmp = parse(xml);
        sctiesBalCtdyRpt = tmp.getSctiesBalCtdyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00200109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalCtdyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceCustodyReportV09 }
     *     
     */
    public SecuritiesBalanceCustodyReportV09 getSctiesBalCtdyRpt() {
        return sctiesBalCtdyRpt;
    }

    /**
     * Sets the value of the sctiesBalCtdyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceCustodyReportV09 }
     *     
     */
    public MxSemt00200109 setSctiesBalCtdyRpt(SecuritiesBalanceCustodyReportV09 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSemt00200109 parse(String xml) {
        return ((MxSemt00200109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00200109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00200109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00200109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00200109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00200109 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00200109) parserImpl.read(MxSemt00200109 .class, xml, _classes));
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
     * Creates an MxSemt00200109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00200109 message
     * @return
     *     a new instance of MxSemt00200109
     */
    public final static MxSemt00200109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00200109 .class);
    }

}
