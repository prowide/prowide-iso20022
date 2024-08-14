
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
 * Class for seev.010.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCANtfctnCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.010.001.01")
public class MxSeev01000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCANtfctnCxlReq", required = true)
    protected AgentCANotificationCancellationRequestV01 agtCANtfctnCxlReq;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification2Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCANotificationCancellationRequestV01 .class, AgentRole1FormatChoice.class, AgentRole2Code.class, AlternateSecurityIdentification3 .class, AmountAndQuantityRatio1 .class, AmountAndRateFormat2Choice.class, AmountAndRateFormat3Choice.class, AmountPrice1 .class, AmountPricePerAmount1 .class, AmountPricePerFinancialInstrumentQuantity1 .class, AmountPriceType1Code.class, AmountPriceType1FormatChoice.class, AmountToAmountRatio1 .class, BeneficiaryCertificationType1Code.class, BeneficiaryCertificationType1FormatChoice.class, CashOption1 .class, ConversionType1Code.class, ConversionType1FormatChoice.class, CorporateAction2 .class, CorporateActionAgent1 .class, CorporateActionAmounts1 .class, CorporateActionCalculationMethod1Code.class, CorporateActionCalculationMethod1FormatChoice.class, CorporateActionChangeType1Code.class, CorporateActionChangeType1FormatChoice.class, CorporateActionDate2 .class, CorporateActionDate3 .class, CorporateActionDate4 .class, CorporateActionDate5 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventStage1Code.class, CorporateActionEventStage1FormatChoice.class, CorporateActionEventStatus2Code.class, CorporateActionEventStatus2FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionFrequencyType1Code.class, CorporateActionFrequencyType1FormatChoice.class, CorporateActionInformation2 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionNarrative1 .class, CorporateActionNotificationAdvice1 .class, CorporateActionNotificationType2Code.class, CorporateActionOption1 .class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, CorporateActionPeriod1 .class, CorporateActionPeriod2 .class, CorporateActionPrice1 .class, CorporateActionPrice2 .class, CorporateActionPrice4 .class, CorporateActionRate1 .class, CorporateActionRate2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateFormat4Choice.class, DateType6Code.class, DistributionType1Code.class, DistributionType1FormatChoice.class, DocumentIdentification8 .class, EUCapitalGain2Code.class, ElectionMovementType1Code.class, ElectionMovementType1FormatChoice.class, FinancialInstrumentDescription3 .class, ForeignExchangeTerms8 .class, FractionDispositionType1Code.class, FractionDispositionType1FormatChoice.class, GenericIdentification1 .class, GenericIdentification13 .class, GrossDividendRate1Choice.class, GrossDividendRate2 .class, GrossDividendRateType1Code.class, GrossDividendRateType1FormatChoice.class, IntermediateSecurityDistributionType1Code.class, IntermediateSecurityDistributionType1FormatChoice.class, LotteryType1Code.class, LotteryType1FormatChoice.class, MxSeev01000101 .class, NameAndAddress5 .class, NetDividendRate1Choice.class, NetDividendRate2 .class, NetDividendRateType1Code.class, NetDividendRateType1FormatChoice.class, NotificationCancellation1 .class, OfferType1Code.class, OfferType1FormatChoice.class, OptionFeatures1Code.class, OptionFeatures1FormatChoice.class, PartyIdentification2Choice.class, Period1 .class, PostalAddress1 .class, PriceFormat1Choice.class, PriceFormat2Choice.class, PriceFormat3Choice.class, PriceFormat4Choice.class, PriceRate1 .class, PriceRateType3Code.class, PriceRateType3FormatChoice.class, PriceValueType5Code.class, PriceValueType5FormatChoice.class, PriceValueType6Code.class, PriceValueType6FormatChoice.class, Quantity1Code.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat1Choice.class, RateFormat1Choice.class, RateType12Code.class, RateType12FormatChoice.class, RateValueType2Code.class, RateValueType2FormatChoice.class, RateValueType6Code.class, RateValueType6FormatChoice.class, RatioFormat1Choice.class, RatioFormat2Choice.class, RelatedTaxType1 .class, RenounceableStatus1Code.class, RenounceableStatus1FormatChoice.class, SecurityIdentification7 .class, SecurityOption1 .class, ShareRanking1Code.class, ShareRanking1FormatChoice.class, TaxType3Code.class, TaxType3FormatChoice.class, TaxableIncomePerShareCalculated2Code.class, UnitOrFaceAmount1Choice.class, UnitOrFaceAmountOrCode1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.010.001.01";

    public MxSeev01000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01000101(final String xml) {
        this();
        MxSeev01000101 tmp = parse(xml);
        agtCANtfctnCxlReq = tmp.getAgtCANtfctnCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCANtfctnCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCANotificationCancellationRequestV01 }
     *     
     */
    public AgentCANotificationCancellationRequestV01 getAgtCANtfctnCxlReq() {
        return agtCANtfctnCxlReq;
    }

    /**
     * Sets the value of the agtCANtfctnCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCANotificationCancellationRequestV01 }
     *     
     */
    public MxSeev01000101 setAgtCANtfctnCxlReq(AgentCANotificationCancellationRequestV01 value) {
        this.agtCANtfctnCxlReq = value;
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
    public static MxSeev01000101 parse(String xml) {
        return ((MxSeev01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev01000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01000101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01000101) parserImpl.read(MxSeev01000101 .class, xml, _classes));
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
     * Creates an MxSeev01000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01000101 message
     * @return
     *     a new instance of MxSeev01000101
     */
    public static final MxSeev01000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01000101 .class);
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
