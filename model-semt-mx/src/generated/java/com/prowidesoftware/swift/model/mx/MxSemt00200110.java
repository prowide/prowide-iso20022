
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
 * Class for semt.002.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalCtdyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.10")
public class MxSemt00200110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalCtdyRpt", required = true)
    protected SecuritiesBalanceCustodyReportV10 sctiesBalCtdyRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account29 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation18 .class, AddressType2Code.class, AggregateBalanceInformation35 .class, AggregateBalancePerSafekeepingPlace32 .class, AmountAndDirection6 .class, Balance6 .class, Balance7 .class, Balance8 .class, Balance9 .class, BalanceAmounts3 .class, BalanceQuantity8Choice.class, BalanceQuantity9Choice.class, BasicCollateralValuation1Details.class, ClassificationType32Choice.class, CorporateActionOption5Code.class, DateAndDateTime2Choice.class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency7Code.class, ExposureType16Choice.class, ExposureType4Code.class, FinancialInstrument21 .class, FinancialInstrumentAttributes91 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms34 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency22Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification56 .class, GenericIdentification78 .class, GenericIdentification80 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, Intermediary44 .class, InvestmentFundRole2Code.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification89 .class, MarketType15Choice.class, MarketType4Code.class, MxSemt00200110 .class, NameAndAddress5 .class, Number22Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification15 .class, Pledgee3 .class, PledgeeFormat5Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier2 .class, PledgeeTypeAndText1 .class, PostalAddress1 .class, Price7 .class, PriceInformation20 .class, PriceRateOrAmount3Choice.class, PriceRateOrAmountOrUnknown2Choice.class, PriceType4Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity6Choice.class, QuantityAndAvailability1 .class, QuantityBreakdown54 .class, Role6Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount25 .class, SecuritiesAccount26 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceCustodyReportV10 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecurityIdentification19 .class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement73 .class, StatementBasis1Code.class, StatementBasis7Choice.class, StatementUpdateType1Code.class, SubAccountIdentification55 .class, SubBalanceInformation18 .class, SubBalanceQuantity6Choice.class, SubBalanceType11Choice.class, SubBalanceType12Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement1 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice28Choice.class, TypeOfPrice29Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.10";

    public MxSemt00200110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00200110(final String xml) {
        this();
        MxSemt00200110 tmp = parse(xml);
        sctiesBalCtdyRpt = tmp.getSctiesBalCtdyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00200110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalCtdyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceCustodyReportV10 }
     *     
     */
    public SecuritiesBalanceCustodyReportV10 getSctiesBalCtdyRpt() {
        return sctiesBalCtdyRpt;
    }

    /**
     * Sets the value of the sctiesBalCtdyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceCustodyReportV10 }
     *     
     */
    public MxSemt00200110 setSctiesBalCtdyRpt(SecuritiesBalanceCustodyReportV10 value) {
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
    public static MxSemt00200110 parse(String xml) {
        return ((MxSemt00200110) MxReadImpl.parse(MxSemt00200110 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00200110 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00200110) parserImpl.read(MxSemt00200110 .class, xml, _classes));
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
     * Creates an MxSemt00200110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00200110 message
     * @return
     *     a new instance of MxSemt00200110
     */
    public final static MxSemt00200110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00200110 .class);
    }

}
