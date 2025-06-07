
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
 * Class for supl.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanocsdDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.001.001.04")
public class MxSupl00100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOCSDDataSD1", required = true)
    protected DTCCCANOCSDDataSD1V04 dtcccanocsdDataSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccrualPeriodType1Code.class, AddressType2Code.class, AgentType1Code.class, AmountAndQuantityRatio3 .class, AmountPrice5 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, AssetClass1Code.class, CashOptionSD1 .class, ContactIdentification1 .class, CorporateActionDateSD5 .class, CorporateActionGeneralInformationSD10 .class, CorporateActionNotificationSD3 .class, CorporateActionOptionSD6 .class, CorporateActionPeriodSD2 .class, CorporateActionPriceSD1 .class, CorporateActionPriceSD3 .class, CorporateActionQuantitySD1 .class, CorporateActionRateSD2 .class, CorporateActionRateSD5 .class, CorporateActionRateSD6 .class, CorporateActionRateSD6Choice.class, CorporateActionSD5 .class, CorporateActionSD7 .class, CutOff1Code.class, DTCAssetType1Code.class, DTCAutoOfferProgram1Code.class, DTCBaseDisbursed1Code.class, DTCCCANOCSDDataSD1V04 .class, DTCCSubEventType2Code.class, DTCEntitlementCalculationMethod1Code.class, DateAndDateTimeChoice.class, DateFormat12Choice.class, DateType6Code.class, EventGroup1Code.class, ExtendedEventType1Code.class, ExtendedOptionFeature1Code.class, FinancialInstrumentAttributesSD1 .class, FinancialInstrumentAttributesSD2 .class, FinancialInstrumentAttributesSD6 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionTypeSD2 .class, IdentificationSource4Choice.class, MxSupl00100104 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoticeType1Code.class, OtherIdentification2 .class, OversubscriptionType1Code.class, PartyIdentificationSD1 .class, PartyIdentificationSD2 .class, PartyIdentificationSD3 .class, PartyIdentificationSD4 .class, Period3 .class, PostalAddress1 .class, PriceFormatSD1Choice.class, PriceValueType10Code.class, QuantityToQuantityRatio2 .class, RateValueType7Code.class, RatioFormat13Choice.class, RatioFormat14Choice.class, ReinvestmentIncomeClassification1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesExitReason1Code.class, SecuritiesOptionSD5 .class, SecurityIdentification15 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.001.001.04";

    public MxSupl00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00100104(final String xml) {
        this();
        MxSupl00100104 tmp = parse(xml);
        dtcccanocsdDataSD1 = tmp.getDTCCCANOCSDDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanocsdDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOCSDDataSD1V04 }
     *     
     */
    public DTCCCANOCSDDataSD1V04 getDTCCCANOCSDDataSD1() {
        return dtcccanocsdDataSD1;
    }

    /**
     * Sets the value of the dtcccanocsdDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOCSDDataSD1V04 }
     *     
     */
    public MxSupl00100104 setDTCCCANOCSDDataSD1(DTCCCANOCSDDataSD1V04 value) {
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
    public static MxSupl00100104 parse(String xml) {
        return ((MxSupl00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00100104 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00100104) parserImpl.read(MxSupl00100104 .class, xml, _classes));
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
     * Creates an MxSupl00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00100104 message
     * @return
     *     a new instance of MxSupl00100104
     */
    public final static MxSupl00100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00100104 .class);
    }

}
