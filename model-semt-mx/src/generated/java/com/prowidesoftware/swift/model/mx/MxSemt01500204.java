
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
 * Class for semt.015.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.015.002.04")
public class MxSemt01500204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntConf", required = true)
    protected IntraPositionMovementConfirmation002V04 intraPosMvmntConf;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AdditionalParameters11 .class, AmountAndDirection24 .class, ClassificationType3Choice.class, CorporateActionEventType14Code.class, CorporateActionEventType17Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, EventFrequency3Code.class, FinancialInstrumentAttributes42 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification39 .class, IdentificationSource3Choice.class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, IntraPositionDetails29 .class, IntraPositionMovementConfirmation002V04 .class, MarketIdentification4Choice.class, MxSemt01500204 .class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherIdentification2 .class, OtherIdentification3 .class, PartialSettlement2Code.class, PartyIdentification51Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, QuantityBreakdown17 .class, QuantityBreakdown20 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType5Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesSubBalanceTypeAndQuantityBreakdown2 .class, SecurityIdentification15 .class, SecurityIdentification16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.015.002.04";

    public MxSemt01500204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01500204(final String xml) {
        this();
        MxSemt01500204 tmp = parse(xml);
        intraPosMvmntConf = tmp.getIntraPosMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01500204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementConfirmation002V04 }
     *     
     */
    public IntraPositionMovementConfirmation002V04 getIntraPosMvmntConf() {
        return intraPosMvmntConf;
    }

    /**
     * Sets the value of the intraPosMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementConfirmation002V04 }
     *     
     */
    public MxSemt01500204 setIntraPosMvmntConf(IntraPositionMovementConfirmation002V04 value) {
        this.intraPosMvmntConf = value;
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
    public static MxSemt01500204 parse(String xml) {
        return ((MxSemt01500204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01500204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01500204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01500204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01500204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01500204 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01500204) parserImpl.read(MxSemt01500204 .class, xml, _classes));
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
     * Creates an MxSemt01500204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01500204 message
     * @return
     *     a new instance of MxSemt01500204
     */
    public static final MxSemt01500204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01500204 .class);
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
