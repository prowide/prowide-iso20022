
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
 * Class for semt.013.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.013.001.01")
public class MxSemt01300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntInstr", required = true)
    protected IntraPositionMovementInstructionV01 intraPosMvmntInstr;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 13;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateIdentification1 .class, ClassificationType2Choice.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentNumber1Choice.class, EventFrequency3Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes4 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, Identification1 .class, IdentificationSource1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, IntraPositionDetails1 .class, IntraPositionMovementInstructionV01 .class, Linkages2 .class, MarketIdentification1Choice.class, MarketIdentification5 .class, MarketType2Choice.class, MarketType5Code.class, MxSemt01300101 .class, NameAndAddress5 .class, Number2Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PaymentDirection2Choice.class, PostalAddress1 .class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, QuantityBreakdown5 .class, References1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesBalanceType13Code.class, SecuritiesBalanceType2Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, TransactionAndDocumentIdentification1 .class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.013.001.01";

    public MxSemt01300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01300101(final String xml) {
        this();
        MxSemt01300101 tmp = parse(xml);
        intraPosMvmntInstr = tmp.getIntraPosMvmntInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntInstr property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementInstructionV01 }
     *     
     */
    public IntraPositionMovementInstructionV01 getIntraPosMvmntInstr() {
        return intraPosMvmntInstr;
    }

    /**
     * Sets the value of the intraPosMvmntInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementInstructionV01 }
     *     
     */
    public MxSemt01300101 setIntraPosMvmntInstr(IntraPositionMovementInstructionV01 value) {
        this.intraPosMvmntInstr = value;
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
    public static MxSemt01300101 parse(String xml) {
        return ((MxSemt01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01300101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01300101) parserImpl.read(MxSemt01300101 .class, xml, _classes));
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
     * Creates an MxSemt01300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01300101 message
     * @return
     *     a new instance of MxSemt01300101
     */
    public static final MxSemt01300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01300101 .class);
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
