
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
 * Class for semt.003.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.09")
public class MxSemt00300109
    extends AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReportV09 sctiesBalAcctgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account18 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation14 .class, AddressType2Code.class, AggregateBalanceInformation31 .class, AggregateBalancePerSafekeepingPlace29 .class, AmountAndDirection6 .class, Balance6 .class, Balance7 .class, BalanceAmounts1 .class, BalanceAmounts2 .class, BalanceQuantity9Choice.class, ClassificationType32Choice.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DerivativeBasicAttributes1 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, ExposureType16Choice.class, ExposureType4Code.class, FinancialInstrument21 .class, FinancialInstrumentAttributes64 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms22 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, Frequency25Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification56 .class, GenericIdentification78 .class, GenericIdentification80 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, Intermediary32 .class, InvestmentFundRole2Code.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification89 .class, MarketType15Choice.class, MarketType4Code.class, MxSemt00300109 .class, NameAndAddress5 .class, Number22Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification100 .class, PartyIdentification71Choice.class, PartyIdentification92Choice.class, PartyIdentification98 .class, Pledgee1 .class, PledgeeFormat3Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier1 .class, PledgeeTypeAndText1 .class, PostalAddress1 .class, Price2 .class, PriceInformation12 .class, PriceRateOrAmountChoice.class, PriceRateOrAmountOrUnknownChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity6Choice.class, QuantityAndAvailability1 .class, QuantityBreakdown28 .class, Role6Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount25 .class, SecuritiesAccount26 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReportV09 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecurityIdentification19 .class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement40 .class, StatementBasis1Code.class, StatementBasis7Choice.class, StatementUpdateType1Code.class, SubAccountIdentification43 .class, SubBalanceInformation14 .class, SubBalanceQuantity6Choice.class, SubBalanceType11Choice.class, SubBalanceType12Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement2 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice28Choice.class, TypeOfPrice29Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.09";

    public MxSemt00300109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300109(final String xml) {
        this();
        MxSemt00300109 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReportV09 }
     *     
     */
    public SecuritiesBalanceAccountingReportV09 getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReportV09 }
     *     
     */
    public MxSemt00300109 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReportV09 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSemt00300109 parse(String xml) {
        return ((MxSemt00300109) MxReadImpl.parse(MxSemt00300109 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300109 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300109) parserImpl.read(MxSemt00300109 .class, xml, _classes));
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
     * Creates an MxSemt00300109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300109 message
     * @return
     *     a new instance of MxSemt00300109
     */
    public final static MxSemt00300109 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt00300109 .class);
    }

}
