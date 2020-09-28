
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
 * Class for seev.035.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.01")
public class MxSeev03500101
    extends AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceV01 corpActnMvmntPrlimryAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance1 .class, AccountIdentification10 .class, AccountIdentification7Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess2Code.class, AdditionalBusinessProcessFormat2Choice.class, AddressType2Code.class, AlternateIdentification1 .class, AmountAndQuantityRatio2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, BeneficiaryCertificationType1Choice.class, BeneficiaryCertificationType2Code.class, CashAccountIdentification5Choice.class, CashOption3 .class, ClassificationType2Choice.class, CopyDuplicate1Code.class, CorporateActionAmounts3 .class, CorporateActionBalanceDetails1 .class, CorporateActionDate8 .class, CorporateActionDate9 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingTypeChoice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation3 .class, CorporateActionMandatoryVoluntary1Choice.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMovementPreliminaryAdviceV01 .class, CorporateActionNarrative5 .class, CorporateActionNarrative6 .class, CorporateActionOption10 .class, CorporateActionOption2Choice.class, CorporateActionOption2Code.class, CorporateActionPeriod5 .class, CorporateActionPreliminaryAdviceType1 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPrice10 .class, CorporateActionPrice6 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionRate5 .class, CorporateActionRate7 .class, CorporateActionReversalReason1 .class, CorporateActionReversalReason1Choice.class, CorporateActionReversalReason1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode2Choice.class, DateCode3Choice.class, DateCode4Choice.class, DateCodeAndTimeFormat1 .class, DateFormat11Choice.class, DateFormat12Choice.class, DateFormat6Choice.class, DateFormat7Choice.class, DateType1Code.class, DateType6Code.class, DateType7Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DocumentIdentification11 .class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes5 .class, FinancialInstrumentAttributes7 .class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentQuantity2Choice.class, ForeignExchangeTerms11 .class, FractionDispositionType1Choice.class, FractionDispositionType4Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat1Choice.class, GrossDividendRateType1Code.class, IdentificationSource1Choice.class, IndicativeOrMarketPrice1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InterestRateUsedForPaymentFormat1Choice.class, IntermediateSecuritiesDistributionTypeFormat2Choice.class, IntermediateSecurityDistributionType2Code.class, MarketIdentification1Choice.class, MarketIdentification2 .class, MarketType3Code.class, MarketTypeFormat1Choice.class, MxSeev03500101 .class, NameAndAddress5 .class, NetDividendRateFormat1Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Choice.class, NonEligibleProceedsIndicator1Code.class, OfferType1Code.class, OfferTypeFormat1Choice.class, OptionAvailabilityStatus1Choice.class, OptionAvailabilityStatus1Code.class, OptionFeatures2Code.class, OptionFeaturesFormat2Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, Payment1Code.class, PercentagePrice1 .class, Period1Choice.class, Period3 .class, PostalAddress1 .class, PriceFormat10Choice.class, PriceFormat11Choice.class, PriceFormat8Choice.class, PriceFormat9Choice.class, PriceRateType3Code.class, PriceValueType4Code.class, PriceValueType5Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity2Code.class, Quantity3Choice.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat3Choice.class, RateAndAmountFormat4Choice.class, RateFormat2Choice.class, RateFormat3Choice.class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType12Code.class, RateType13Choice.class, RateType3Code.class, RateType5Code.class, RateType6Choice.class, RateType7Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus1 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus4 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RateValueType6Code.class, RatioFormat5Choice.class, RatioFormat6Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption1 .class, SecuritiesOption4 .class, SecurityDate2 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SolicitationFeeRateFormat1Choice.class, TaxCreditRateFormat1Choice.class, TaxType4Code.class, TemporaryFinancialInstrumentIndicator1Choice.class, UpdatedAdditionalInformation1 .class, UpdatedAdditionalInformation3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.01";

    public MxSeev03500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500101(final String xml) {
        this();
        MxSeev03500101 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceV01 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV01 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceV01 }
     *     
     */
    public MxSeev03500101 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdviceV01 value) {
        this.corpActnMvmntPrlimryAdvc = value;
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
    public static MxSeev03500101 parse(String xml) {
        return ((MxSeev03500101) MxReadImpl.parse(MxSeev03500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500101) parserImpl.read(MxSeev03500101 .class, xml, _classes));
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
     * Creates an MxSeev03500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500101 message
     * @return
     *     a new instance of MxSeev03500101
     */
    public final static MxSeev03500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev03500101 .class);
    }

}
