
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
 * Class for seev.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCANtfctnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.009.001.01")
public class MxSeev00900101
    extends AbstractMX
{

    @XmlElement(name = "AgtCANtfctnAdvc", required = true)
    protected AgentCANotificationAdviceV01 agtCANtfctnAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCANotificationAdviceV01 .class, AgentRole1FormatChoice.class, AgentRole2Code.class, AlternateSecurityIdentification3 .class, AmountAndQuantityRatio1 .class, AmountAndRateFormat2Choice.class, AmountAndRateFormat3Choice.class, AmountPrice1 .class, AmountPricePerAmount1 .class, AmountPricePerFinancialInstrumentQuantity1 .class, AmountPriceType1Code.class, AmountPriceType1FormatChoice.class, AmountToAmountRatio1 .class, BeneficiaryCertificationType1Code.class, BeneficiaryCertificationType1FormatChoice.class, CashOption1 .class, ContactIdentification4 .class, ContactPerson1 .class, ConversionType1Code.class, ConversionType1FormatChoice.class, CorporateAction2 .class, CorporateActionAgent1 .class, CorporateActionAmounts1 .class, CorporateActionCalculationMethod1Code.class, CorporateActionCalculationMethod1FormatChoice.class, CorporateActionChangeType1Code.class, CorporateActionChangeType1FormatChoice.class, CorporateActionDate2 .class, CorporateActionDate3 .class, CorporateActionDate4 .class, CorporateActionDate5 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventStage1Code.class, CorporateActionEventStage1FormatChoice.class, CorporateActionEventStatus2Code.class, CorporateActionEventStatus2FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionFrequencyType1Code.class, CorporateActionFrequencyType1FormatChoice.class, CorporateActionInformation2 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionNarrative1 .class, CorporateActionNarrative2 .class, CorporateActionNotification1 .class, CorporateActionNotificationType1Code.class, CorporateActionOption1 .class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, CorporateActionPeriod1 .class, CorporateActionPeriod2 .class, CorporateActionPrice1 .class, CorporateActionPrice2 .class, CorporateActionPrice4 .class, CorporateActionRate1 .class, CorporateActionRate2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateFormat4Choice.class, DateType6Code.class, DistributionType1Code.class, DistributionType1FormatChoice.class, DocumentIdentification8 .class, EUCapitalGain2Code.class, ElectionMovementType1Code.class, ElectionMovementType1FormatChoice.class, FinancialInstrumentDescription3 .class, ForeignExchangeTerms8 .class, FractionDispositionType1Code.class, FractionDispositionType1FormatChoice.class, GenericIdentification1 .class, GenericIdentification13 .class, GrossDividendRate1Choice.class, GrossDividendRate2 .class, GrossDividendRateType1Code.class, GrossDividendRateType1FormatChoice.class, IntermediateSecurityDistributionType1Code.class, IntermediateSecurityDistributionType1FormatChoice.class, LinkedCorporateAction1 .class, LotteryType1Code.class, LotteryType1FormatChoice.class, MxSeev00900101 .class, NameAndAddress5 .class, NamePrefix1Code.class, NetDividendRate1Choice.class, NetDividendRate2 .class, NetDividendRateType1Code.class, NetDividendRateType1FormatChoice.class, OfferType1Code.class, OfferType1FormatChoice.class, OptionFeatures1Code.class, OptionFeatures1FormatChoice.class, PartyIdentification2Choice.class, Period1 .class, PostalAddress1 .class, PriceFormat1Choice.class, PriceFormat2Choice.class, PriceFormat3Choice.class, PriceFormat4Choice.class, PriceRate1 .class, PriceRateType3Code.class, PriceRateType3FormatChoice.class, PriceValueType5Code.class, PriceValueType5FormatChoice.class, PriceValueType6Code.class, PriceValueType6FormatChoice.class, ProcessingPosition2Code.class, ProcessingPosition2FormatChoice.class, ProcessingStatus1Code.class, ProcessingStatus1FormatChoice.class, Quantity1Code.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat1Choice.class, RateFormat1Choice.class, RateType12Code.class, RateType12FormatChoice.class, RateValueType2Code.class, RateValueType2FormatChoice.class, RateValueType6Code.class, RateValueType6FormatChoice.class, RatioFormat1Choice.class, RatioFormat2Choice.class, RelatedTaxType1 .class, RenounceableStatus1Code.class, RenounceableStatus1FormatChoice.class, SecurityIdentification7 .class, SecurityOption1 .class, ShareRanking1Code.class, ShareRanking1FormatChoice.class, TaxType3Code.class, TaxType3FormatChoice.class, TaxableIncomePerShareCalculated2Code.class, UnitOrFaceAmount1Choice.class, UnitOrFaceAmountOrCode1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.009.001.01";

    public MxSeev00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00900101(final String xml) {
        this();
        MxSeev00900101 tmp = parse(xml);
        agtCANtfctnAdvc = tmp.getAgtCANtfctnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCANtfctnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCANotificationAdviceV01 }
     *     
     */
    public AgentCANotificationAdviceV01 getAgtCANtfctnAdvc() {
        return agtCANtfctnAdvc;
    }

    /**
     * Sets the value of the agtCANtfctnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCANotificationAdviceV01 }
     *     
     */
    public MxSeev00900101 setAgtCANtfctnAdvc(AgentCANotificationAdviceV01 value) {
        this.agtCANtfctnAdvc = value;
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
    public static MxSeev00900101 parse(String xml) {
        return ((MxSeev00900101) MxReadImpl.parse(MxSeev00900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00900101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00900101) parserImpl.read(MxSeev00900101 .class, xml, _classes));
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
     * Creates an MxSeev00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00900101 message
     * @return
     *     a new instance of MxSeev00900101
     */
    public final static MxSeev00900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00900101 .class);
    }

}
