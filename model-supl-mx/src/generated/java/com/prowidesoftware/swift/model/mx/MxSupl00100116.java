
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
 * Class for supl.001.001.16 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanocsdDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.001.001.16")
public class MxSupl00100116
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOCSDDataSD1", required = true)
    protected DTCCCANOCSDDataSD1V16 dtcccanocsdDataSD1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 16;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccrualPeriodType1Code.class, AddressType2Code.class, AgentAcceptReject1Code.class, AgentType1Code.class, AmountAndQuantityRatio5 .class, AmountPricePerFinancialInstrumentQuantity7 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, AssetClass1Code.class, CashOptionSD14 .class, ContactIdentification1 .class, CorporateActionDateSD10 .class, CorporateActionDateSD11 .class, CorporateActionGeneralInformationSD47 .class, CorporateActionNotificationSD9 .class, CorporateActionOptionSD15 .class, CorporateActionPeriodSD3 .class, CorporateActionPriceSD4 .class, CorporateActionPriceSD5 .class, CorporateActionQuantitySD3 .class, CorporateActionRateSD10 .class, CorporateActionRateSD2 .class, CorporateActionRateSD7Choice.class, CorporateActionRateSD9 .class, CorporateActionSD15 .class, CorporateActionSD24 .class, CutOff1Code.class, DTCAssetType3Code.class, DTCAutoOfferProgram1Code.class, DTCBaseDisbursed1Code.class, DTCCCANOCSDDataSD1V16 .class, DTCCPayoutType4Code.class, DTCCPayoutType5Code.class, DTCCSubEventType9Code.class, DTCEntitlementCalculationMethod1Code.class, DateAndDateTime2Choice.class, DateCode22Choice.class, DateFormat47Choice.class, DateFormat49Choice.class, DateType6Code.class, DateType8Code.class, EventGroup1Code.class, ExtendedEventType6Code.class, ExtendedOptionFeature1Code.class, FinancialInstrumentAttributesSD16 .class, FinancialInstrumentAttributesSD18 .class, FinancialInstrumentAttributesSD19 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionType12Code.class, FractionDispositionTypeSD3 .class, GenericIdentification47 .class, IdentificationSource4Choice.class, InstructionLockoutType1Code.class, MxSupl00100116 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoticeType1Code.class, OptionConditions1 .class, OtherIdentification2 .class, OversubscriptionType1Code.class, PartyIdentificationSD3 .class, PartyIdentificationSD4 .class, PartyIdentificationSD5 .class, PartyIdentificationSD6 .class, Period13 .class, PostalAddress1 .class, PriceFormatSD3Choice.class, PriceValueType10Code.class, ProrationReturnQuantityTreatment1Code.class, QuantityToQuantityRatio2 .class, RateValueType7Code.class, RatioFormat23Choice.class, RatioFormat24Choice.class, ReinvestmentIncomeClassification2Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesExitReason1Code.class, SecuritiesOptionSD9 .class, SecurityIdentification20 .class, TaxCategory1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.001.001.16";

    public MxSupl00100116() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00100116(final String xml) {
        this();
        MxSupl00100116 tmp = parse(xml);
        dtcccanocsdDataSD1 = tmp.getDTCCCANOCSDDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00100116(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanocsdDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOCSDDataSD1V16 }
     *     
     */
    public DTCCCANOCSDDataSD1V16 getDTCCCANOCSDDataSD1() {
        return dtcccanocsdDataSD1;
    }

    /**
     * Sets the value of the dtcccanocsdDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOCSDDataSD1V16 }
     *     
     */
    public MxSupl00100116 setDTCCCANOCSDDataSD1(DTCCCANOCSDDataSD1V16 value) {
        this.dtcccanocsdDataSD1 = value;
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
    public static MxSupl00100116 parse(String xml) {
        return ((MxSupl00100116) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100116 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00100116 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00100116) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100116 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00100116 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00100116) parserImpl.read(MxSupl00100116 .class, xml, _classes));
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
     * Creates an MxSupl00100116 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00100116 message
     * @return
     *     a new instance of MxSupl00100116
     */
    public static final MxSupl00100116 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00100116 .class);
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
