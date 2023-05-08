
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
 * Class for semt.016.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.016.000.01")
public class MxSemt01600001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntPstngRpt", required = true)
    protected IntraPositionMovementPostingReportV1 intraPosMvmntPstngRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 0;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateIdentification1 .class, ClassificationType2Choice.class, CopyDuplicate1Code.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DocumentIdentification11 .class, EventFrequency3Code.class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes4 .class, FinancialInstrumentDetails1 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, Frequency4Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, IntraPositionDetails3 .class, IntraPositionMovementDetails1 .class, IntraPositionMovementPostingReportV1 .class, MarketIdentification1Choice.class, MarketIdentification5 .class, MarketType2Choice.class, MarketType5Code.class, MxSemt01600001 .class, NameAndAddress5 .class, Number2Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, Pagination.class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PaymentDirection2Choice.class, Period2 .class, Period2Choice.class, PostalAddress1 .class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, QuantityBreakdown5 .class, References5Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType3Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, Statement15 .class, StatementUpdateType1Code.class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.016.000.01";

    public MxSemt01600001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01600001(final String xml) {
        this();
        MxSemt01600001 tmp = parse(xml);
        intraPosMvmntPstngRpt = tmp.getIntraPosMvmntPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01600001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementPostingReportV1 }
     *     
     */
    public IntraPositionMovementPostingReportV1 getIntraPosMvmntPstngRpt() {
        return intraPosMvmntPstngRpt;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementPostingReportV1 }
     *     
     */
    public MxSemt01600001 setIntraPosMvmntPstngRpt(IntraPositionMovementPostingReportV1 value) {
        this.intraPosMvmntPstngRpt = value;
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
    public static MxSemt01600001 parse(String xml) {
        return ((MxSemt01600001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01600001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01600001 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01600001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01600001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01600001 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01600001) parserImpl.read(MxSemt01600001 .class, xml, _classes));
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
     * Creates an MxSemt01600001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01600001 message
     * @return
     *     a new instance of MxSemt01600001
     */
    public static final MxSemt01600001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01600001 .class);
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
