
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.001.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanocsdDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.001.001.12")
public class MxSupl00100112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOCSDDataSD1", required = true)
    protected DTCCCANOCSDDataSD1V12 dtcccanocsdDataSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccrualPeriodType1Code.class, AddressType2Code.class, AgentType1Code.class, AmountAndQuantityRatio5 .class, AmountPricePerFinancialInstrumentQuantity7 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, AssetClass1Code.class, CashOptionSD11 .class, ContactIdentification1 .class, CorporateActionDateSD10 .class, CorporateActionDateSD11 .class, CorporateActionGeneralInformationSD41 .class, CorporateActionNotificationSD9 .class, CorporateActionOptionSD13 .class, CorporateActionPeriodSD3 .class, CorporateActionPriceSD4 .class, CorporateActionPriceSD5 .class, CorporateActionQuantitySD3 .class, CorporateActionRateSD10 .class, CorporateActionRateSD2 .class, CorporateActionRateSD7Choice.class, CorporateActionRateSD9 .class, CorporateActionSD15 .class, CorporateActionSD17 .class, CutOff1Code.class, DTCAssetType3Code.class, DTCAutoOfferProgram1Code.class, DTCBaseDisbursed1Code.class, DTCCCANOCSDDataSD1V12 .class, DTCCPayoutType4Code.class, DTCCPayoutType5Code.class, DTCCSubEventType8Code.class, DTCEntitlementCalculationMethod1Code.class, DateAndDateTime2Choice.class, DateCode22Choice.class, DateFormat47Choice.class, DateFormat49Choice.class, DateType6Code.class, DateType8Code.class, EventGroup1Code.class, ExtendedEventType6Code.class, ExtendedOptionFeature1Code.class, FinancialInstrumentAttributesSD15 .class, FinancialInstrumentAttributesSD16 .class, FinancialInstrumentAttributesSD18 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionType12Code.class, FractionDispositionTypeSD3 .class, GenericIdentification47 .class, IdentificationSource4Choice.class, MxSupl00100112 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoticeType1Code.class, OtherIdentification2 .class, OversubscriptionType1Code.class, PartyIdentificationSD3 .class, PartyIdentificationSD4 .class, PartyIdentificationSD5 .class, PartyIdentificationSD6 .class, Period13 .class, PostalAddress1 .class, PriceFormatSD3Choice.class, PriceValueType10Code.class, QuantityToQuantityRatio2 .class, RateValueType7Code.class, RatioFormat23Choice.class, RatioFormat24Choice.class, ReinvestmentIncomeClassification2Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesExitReason1Code.class, SecuritiesOptionSD9 .class, SecurityIdentification20 .class, TaxCategory1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.001.001.12";

    public MxSupl00100112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00100112(final String xml) {
        this();
        MxSupl00100112 tmp = parse(xml);
        dtcccanocsdDataSD1 = tmp.getDTCCCANOCSDDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00100112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanocsdDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOCSDDataSD1V12 }
     *     
     */
    public DTCCCANOCSDDataSD1V12 getDTCCCANOCSDDataSD1() {
        return dtcccanocsdDataSD1;
    }

    /**
     * Sets the value of the dtcccanocsdDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOCSDDataSD1V12 }
     *     
     */
    public MxSupl00100112 setDTCCCANOCSDDataSD1(DTCCCANOCSDDataSD1V12 value) {
        this.dtcccanocsdDataSD1 = value;
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
    public static MxSupl00100112 parse(String xml) {
        return ((MxSupl00100112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00100112 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00100112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00100112 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00100112) parserImpl.read(MxSupl00100112 .class, xml, _classes));
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
     * Creates an MxSupl00100112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00100112 message
     * @return
     *     a new instance of MxSupl00100112
     */
    public final static MxSupl00100112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00100112 .class);
    }

}
