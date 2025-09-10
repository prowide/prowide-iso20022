
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
 * Class for semt.003.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.12")
public class MxSemt00300112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReportV12 sctiesBalAcctgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account29 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation22 .class, AddressType2Code.class, AggregateBalanceInformation45 .class, AggregateBalancePerSafekeepingPlace42 .class, AmountAndDirection6 .class, Balance16 .class, Balance17 .class, BalanceAmounts1 .class, BalanceAmounts2 .class, BalanceQuantity13Choice.class, BlockChainAddressWallet1 .class, BlockChainAddressWallet2 .class, ClassificationType32Choice.class, CorporateActionOption5Code.class, DateAndDateTime2Choice.class, DerivativeBasicAttributes1 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, ExposureType15Code.class, ExposureType25Choice.class, FinancialInstrument21 .class, FinancialInstrumentAttributes111 .class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms34 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, Frequency25Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification56 .class, GenericIdentification78 .class, GenericIdentification80 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, Intermediary44 .class, InvestmentFundRole2Code.class, MarketIdentification3Choice.class, MarketIdentification5Choice.class, MarketIdentification98 .class, MarketType19Choice.class, MarketType9Code.class, MxSemt00300112 .class, NameAndAddress5 .class, Number22Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, Pledgee3 .class, PledgeeFormat5Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier2 .class, PledgeeTypeAndText1 .class, PostalAddress1 .class, Price7 .class, PriceInformation29 .class, PriceRateOrAmount3Choice.class, PriceRateOrAmountOrUnknown2Choice.class, PriceType4Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity51Choice.class, QuantityAndAvailability3 .class, QuantityBreakdown58 .class, Role6Choice.class, SafeKeepingPlace5 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat41Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount25 .class, SecuritiesAccount26 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReportV12 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecurityIdentification19 .class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement74 .class, StatementBasis1Code.class, StatementBasis7Choice.class, StatementUpdateType1Code.class, SubAccountIdentification72 .class, SubBalanceInformation22 .class, SubBalanceQuantity8Choice.class, SubBalanceType11Choice.class, SubBalanceType12Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement2 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice28Choice.class, TypeOfPrice29Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.003.001.12";

    public MxSemt00300112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300112(final String xml) {
        this();
        MxSemt00300112 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReportV12 }
     *     
     */
    public SecuritiesBalanceAccountingReportV12 getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReportV12 }
     *     
     */
    public MxSemt00300112 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReportV12 value) {
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
    public static MxSemt00300112 parse(String xml) {
        return ((MxSemt00300112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00300112 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00300112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00300112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300112 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300112) parserImpl.read(MxSemt00300112 .class, xml, _classes));
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
     * Creates an MxSemt00300112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300112 message
     * @return
     *     a new instance of MxSemt00300112
     */
    public static final MxSemt00300112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00300112 .class);
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
