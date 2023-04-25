
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
 * Class for supl.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoMktDataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.002.001.02")
public class MxSupl00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOMktDataSD1", required = true)
    protected DTCCCANOMarketDataSD1V02 dtcccanoMktDataSD1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccrualPeriodType1Code.class, AddressType2Code.class, AgentType1Code.class, AmountToAmountRatio3 .class, AssetClass1Code.class, CashOptionSD3 .class, ContactIdentification1 .class, CorporateActionDateSD3 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionNotificationSD3 .class, CorporateActionNotificationSD8 .class, CorporateActionOptionSD3 .class, CorporateActionPeriodSD1 .class, CorporateActionPriceSD2 .class, CorporateActionPriceSD3 .class, CorporateActionQuantitySD1 .class, CorporateActionRateSD1 .class, CorporateActionRateSD2 .class, CorporateActionRateSD4 .class, CorporateActionSD3 .class, CorporateActionSD5 .class, CutOff1Code.class, DTCAssetType1Code.class, DTCAutoOfferProgram1Code.class, DTCBaseDisbursed1Code.class, DTCCCANOMarketDataSD1V02 .class, DTCCSubEventType1Code.class, DTCEntitlementCalculationMethod1Code.class, DateAndDateTimeChoice.class, DateFormat12Choice.class, DateType6Code.class, EventGroup1Code.class, ExtendedEventType1Code.class, ExtendedOptionFeature1Code.class, FinancialInstrumentAttributesSD3 .class, FinancialInstrumentAttributesSD4 .class, FinancialInstrumentAttributesSD6 .class, FractionDispositionTypeSD1 .class, FractionalSecurityRule1Code.class, IdentificationSource4Choice.class, InstructionLockout1Code.class, InterimFinalPayment1Code.class, MxSupl00200102 .class, NameAndAddress5 .class, NamePrefix1Code.class, NoticeType1Code.class, OtherIdentification2 .class, OversubscriptionType1Code.class, Pagination.class, PartyIdentificationSD1 .class, PartyIdentificationSD2 .class, PartyIdentificationSD3 .class, PartyIdentificationSD4 .class, Period3 .class, PostalAddress1 .class, QuantityToQuantityRatio2 .class, RateAndAmountFormat17Choice.class, RateValueType7Code.class, RatioFormat13Choice.class, ReinvestmentIncomeClassification1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, SecuritiesExitReason1Code.class, SecuritiesOptionSD1 .class, SecuritiesOptionSD3 .class, SecurityIdentification15 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.002.001.02";

    public MxSupl00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00200102(final String xml) {
        this();
        MxSupl00200102 tmp = parse(xml);
        dtcccanoMktDataSD1 = tmp.getDTCCCANOMktDataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoMktDataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOMarketDataSD1V02 }
     *     
     */
    public DTCCCANOMarketDataSD1V02 getDTCCCANOMktDataSD1() {
        return dtcccanoMktDataSD1;
    }

    /**
     * Sets the value of the dtcccanoMktDataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOMarketDataSD1V02 }
     *     
     */
    public MxSupl00200102 setDTCCCANOMktDataSD1(DTCCCANOMarketDataSD1V02 value) {
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
    public static MxSupl00200102 parse(String xml) {
        return ((MxSupl00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00200102 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00200102) parserImpl.read(MxSupl00200102 .class, xml, _classes));
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
     * Creates an MxSupl00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00200102 message
     * @return
     *     a new instance of MxSupl00200102
     */
    public static final MxSupl00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00200102 .class);
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
