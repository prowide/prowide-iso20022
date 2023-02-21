
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
 * Class for setr.016.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.04")
public class MxSetr01600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrInstrStsRpt", required = true)
    protected OrderInstructionStatusReportV04 ordrInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalAmount1Choice.class, AdditionalReference8 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, CancelledReason12Choice.class, CancelledStatusReason16 .class, CancelledStatusReason2Code.class, ChargeType5Choice.class, ConditionallyAcceptedStatus3Choice.class, ConditionallyAcceptedStatusReason2Code.class, ConditionallyAcceptedStatusReason3 .class, ConditionallyAcceptedStatusReason3Choice.class, DateAndDateTimeChoice.class, DateFormat42Choice.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, ExpectedExecutionDetails2 .class, ExpectedExecutionDetails4 .class, Extension1 .class, Fee3 .class, FinancialInstrument57 .class, FormOfSecurity1Code.class, FundOrderData5 .class, FundOrderData6 .class, GateHoldBack1Code.class, GenericIdentification1 .class, GenericIdentification47 .class, HoldBackInformation3 .class, IdentificationSource1Choice.class, InRepairStatusReason1Code.class, InRepairStatusReason4 .class, InRepairStatusReason4Choice.class, InRepairStatusReason5Choice.class, IndividualOrderStatusAndReason7 .class, InvestmentAccount58 .class, InvestmentFundFee1Code.class, LegIdentification1Choice.class, MessageIdentification1 .class, MxSetr01600104 .class, NameAndAddress5 .class, NoReasonCode.class, OrderInstructionStatusReportV04 .class, OrderOriginatorEligibility1Code.class, OrderStatus3Choice.class, OrderStatus4Choice.class, OrderStatus4Code.class, OrderStatus5Choice.class, OrderStatusAndReason10 .class, PartiallySettled21Choice.class, PartiallySettledStatus10 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, RedemptionCompletion1Code.class, References61Choice.class, RejectedReason20Choice.class, RejectedStatus9 .class, RejectedStatusReason11Code.class, SecurityIdentification25Choice.class, Series1 .class, SettledStatusReason2Code.class, Status24Choice.class, SubAccount6 .class, SuspendedStatusReason3Code.class, SuspendedStatusReason4 .class, SuspendedStatusReason4Choice.class, SuspendedStatusReason5Choice.class, SwitchLegReferences2 .class, SwitchOrderStatusAndReason2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.04";

    public MxSetr01600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01600104(final String xml) {
        this();
        MxSetr01600104 tmp = parse(xml);
        ordrInstrStsRpt = tmp.getOrdrInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionStatusReportV04 }
     *     
     */
    public OrderInstructionStatusReportV04 getOrdrInstrStsRpt() {
        return ordrInstrStsRpt;
    }

    /**
     * Sets the value of the ordrInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionStatusReportV04 }
     *     
     */
    public MxSetr01600104 setOrdrInstrStsRpt(OrderInstructionStatusReportV04 value) {
        this.ordrInstrStsRpt = value;
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
    public static MxSetr01600104 parse(String xml) {
        return ((MxSetr01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01600104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01600104) parserImpl.read(MxSetr01600104 .class, xml, _classes));
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
     * Creates an MxSetr01600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01600104 message
     * @return
     *     a new instance of MxSetr01600104
     */
    public final static MxSetr01600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01600104 .class);
    }

}
