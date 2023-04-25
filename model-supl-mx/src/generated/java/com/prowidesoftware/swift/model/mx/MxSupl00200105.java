
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
 * Class for supl.002.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoMktDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.002.001.05")
public class MxSupl00200105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOMktDataSD1", required = true)
    protected DTCCCANOMarketDataSD1V05 dtcccanoMktDataSD1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccrualPeriodType1Code.class, AddressType2Code.class, AgentType1Code.class, AmountAndQuantityRatio3 .class, AmountPrice5 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, AssetClass1Code.class, CashOptionSD2 .class, ContactIdentification1 .class, CorporateActionDateSD5 .class, CorporateActionGeneralInformationSD11 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionNotificationSD3 .class, CorporateActionOptionSD7 .class, CorporateActionPeriodSD2 .class, CorporateActionPriceSD2 .class, CorporateActionPriceSD3 .class, CorporateActionQuantitySD1 .class, CorporateActionRateSD2 .class, CorporateActionRateSD5 .class, CorporateActionRateSD6Choice.class, CorporateActionRateSD7 .class, CorporateActionSD5 .class, CorporateActionSD7 .class, CutOff1Code.class, DTCAssetType1Code.class, DTCAutoOfferProgram1Code.class, DTCBaseDisbursed1Code.class, DTCCCANOMarketDataSD1V05 .class, DTCCSubEventType2Code.class, DTCEntitlementCalculationMethod1Code.class, DateAndDateTimeChoice.class, DateFormat12Choice.class, DateType6Code.class, EventGroup1Code.class, ExtendedEventType1Code.class, ExtendedOptionFeature1Code.class, FinancialInstrumentAttributesSD3 .class, FinancialInstrumentAttributesSD4 .class, FinancialInstrumentAttributesSD6 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionTypeSD2 .class, IdentificationSource4Choice.class, MxSupl00200105 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoticeType1Code.class, OtherIdentification2 .class, OversubscriptionType1Code.class, PartyIdentificationSD1 .class, PartyIdentificationSD2 .class, PartyIdentificationSD3 .class, PartyIdentificationSD4 .class, Period3 .class, PostalAddress1 .class, PriceFormatSD1Choice.class, PriceValueType10Code.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat17Choice.class, RateValueType7Code.class, RatioFormat13Choice.class, RatioFormat14Choice.class, ReinvestmentIncomeClassification1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesExitReason1Code.class, SecuritiesOptionSD5 .class, SecurityIdentification15 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.002.001.05";

    public MxSupl00200105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00200105(final String xml) {
        this();
        MxSupl00200105 tmp = parse(xml);
        dtcccanoMktDataSD1 = tmp.getDTCCCANOMktDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00200105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoMktDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOMarketDataSD1V05 }
     *     
     */
    public DTCCCANOMarketDataSD1V05 getDTCCCANOMktDataSD1() {
        return dtcccanoMktDataSD1;
    }

    /**
     * Sets the value of the dtcccanoMktDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOMarketDataSD1V05 }
     *     
     */
    public MxSupl00200105 setDTCCCANOMktDataSD1(DTCCCANOMarketDataSD1V05 value) {
        this.dtcccanoMktDataSD1 = value;
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
    public static MxSupl00200105 parse(String xml) {
        return ((MxSupl00200105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00200105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00200105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00200105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00200105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00200105 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00200105) parserImpl.read(MxSupl00200105 .class, xml, _classes));
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
     * Creates an MxSupl00200105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00200105 message
     * @return
     *     a new instance of MxSupl00200105
     */
    public static final MxSupl00200105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00200105 .class);
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
