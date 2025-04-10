
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
 * Class for supl.001.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccncsdDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.001.001.06")
public class MxSupl00100106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCNCSDDataSD1", required = true)
    protected DTCCCANOCSDDataSD1V06 dtcccncsdDataSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccrualPeriodType1Code.class, AddressType2Code.class, AgentType1Code.class, AmountAndQuantityRatio3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, AssetClass1Code.class, CashOptionSD8 .class, ContactIdentification1 .class, CorporateActionDateSD5 .class, CorporateActionFrequencyType4Code.class, CorporateActionGeneralInformationSD12 .class, CorporateActionNotificationSD3 .class, CorporateActionOptionSD10 .class, CorporateActionPeriodSD2 .class, CorporateActionPriceSD1 .class, CorporateActionPriceSD3 .class, CorporateActionQuantitySD1 .class, CorporateActionRateSD2 .class, CorporateActionRateSD5 .class, CorporateActionRateSD6Choice.class, CorporateActionRateSD8 .class, CorporateActionSD13 .class, CorporateActionSD5 .class, CutOff1Code.class, DTCAssetType1Code.class, DTCAutoOfferProgram1Code.class, DTCBaseDisbursed1Code.class, DTCCCANOCSDDataSD1V06 .class, DTCCPayoutType3Code.class, DTCCPayoutType4Code.class, DTCCSubEventType3Code.class, DTCEntitlementCalculationMethod1Code.class, DateAndDateTimeChoice.class, DateFormat12Choice.class, DateType6Code.class, EventGroup1Code.class, ExtendedEventType2Code.class, ExtendedOptionFeature1Code.class, FinancialInstrumentAttributesSD1 .class, FinancialInstrumentAttributesSD11 .class, FinancialInstrumentAttributesSD2 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionTypeSD2 .class, IdentificationSource4Choice.class, MxSupl00100106 .class, NRATax2Code.class, NameAndAddress5 .class, NamePrefix1Code.class, NewSecuritiesIssuanceType4Code.class, NoticeType1Code.class, OtherIdentification2 .class, OversubscriptionType1Code.class, PartyIdentificationSD1 .class, PartyIdentificationSD2 .class, PartyIdentificationSD3 .class, PartyIdentificationSD4 .class, Period3 .class, PostalAddress1 .class, PriceFormatSD2Choice.class, PriceValueType10Code.class, QuantityToQuantityRatio2 .class, RateValueType7Code.class, RatioFormat13Choice.class, RatioFormat14Choice.class, ReinvestmentIncomeClassification2Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesExitReason1Code.class, SecuritiesOptionSD7 .class, SecurityIdentification15 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.001.001.06";

    public MxSupl00100106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00100106(final String xml) {
        this();
        MxSupl00100106 tmp = parse(xml);
        dtcccncsdDataSD1 = tmp.getDTCCCNCSDDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00100106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccncsdDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOCSDDataSD1V06 }
     *     
     */
    public DTCCCANOCSDDataSD1V06 getDTCCCNCSDDataSD1() {
        return dtcccncsdDataSD1;
    }

    /**
     * Sets the value of the dtcccncsdDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOCSDDataSD1V06 }
     *     
     */
    public MxSupl00100106 setDTCCCNCSDDataSD1(DTCCCANOCSDDataSD1V06 value) {
        this.dtcccncsdDataSD1 = value;
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
    public static MxSupl00100106 parse(String xml) {
        return ((MxSupl00100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00100106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00100106 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00100106) parserImpl.read(MxSupl00100106 .class, xml, _classes));
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
     * Creates an MxSupl00100106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00100106 message
     * @return
     *     a new instance of MxSupl00100106
     */
    public final static MxSupl00100106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00100106 .class);
    }

}
