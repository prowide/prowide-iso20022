
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
 * Class for setr.016.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.05")
public class MxSetr01600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrInstrStsRpt", required = true)
    protected OrderInstructionStatusReportV05 ordrInstrStsRpt;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalAmount1Choice.class, AdditionalReference10 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BlockChainAddressWallet3 .class, CancelledReason12Choice.class, CancelledStatusReason16 .class, CancelledStatusReason2Code.class, ChargeType10Choice.class, ConditionallyAcceptedStatus3Choice.class, ConditionallyAcceptedStatusReason2Code.class, ConditionallyAcceptedStatusReason3 .class, ConditionallyAcceptedStatusReason3Choice.class, DateAndDateTime2Choice.class, DateFormat42Choice.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, ExpectedExecution6 .class, ExpectedExecutionDetails5 .class, Extension1 .class, Fee12 .class, FinancialInstrument107 .class, FormOfSecurity1Code.class, FundOrderData6 .class, FundOrderData7 .class, GateHoldBack1Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification47 .class, HoldBackInformation4 .class, IdentificationSource1Choice.class, InRepairStatusReason1Code.class, InRepairStatusReason4 .class, InRepairStatusReason4Choice.class, InRepairStatusReason5Choice.class, IndividualOrderStatusAndReason9 .class, InvestmentAccount81 .class, InvestmentFundFee3Code.class, LegIdentification1Choice.class, MessageIdentification1 .class, MxSetr01600105 .class, NameAndAddress5 .class, NoReasonCode.class, OrderInstructionStatusReportV05 .class, OrderOriginatorEligibility1Code.class, OrderStatus4Code.class, OrderStatus6Choice.class, OrderStatus7Choice.class, OrderStatus8Choice.class, OrderStatusAndReason11 .class, PartiallySettled21Choice.class, PartiallySettledStatus10 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PostalAddress1 .class, RedemptionCompletion1Code.class, References64Choice.class, RejectedReason67Choice.class, RejectedStatus14 .class, RejectedStatusReason15Code.class, SecurityIdentification46Choice.class, Series1 .class, SettledStatusReason2Code.class, Status40Choice.class, SubAccount6 .class, SuspendedStatusReason3Code.class, SuspendedStatusReason4 .class, SuspendedStatusReason4Choice.class, SuspendedStatusReason5Choice.class, SwitchLegReferences3 .class, SwitchOrderStatusAndReason3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.05";

    public MxSetr01600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01600105(final String xml) {
        this();
        MxSetr01600105 tmp = parse(xml);
        ordrInstrStsRpt = tmp.getOrdrInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionStatusReportV05 }
     *     
     */
    public OrderInstructionStatusReportV05 getOrdrInstrStsRpt() {
        return ordrInstrStsRpt;
    }

    /**
     * Sets the value of the ordrInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionStatusReportV05 }
     *     
     */
    public MxSetr01600105 setOrdrInstrStsRpt(OrderInstructionStatusReportV05 value) {
        this.ordrInstrStsRpt = value;
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
    public static MxSetr01600105 parse(String xml) {
        return ((MxSetr01600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01600105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01600105 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01600105) parserImpl.read(MxSetr01600105 .class, xml, _classes));
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
     * Creates an MxSetr01600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01600105 message
     * @return
     *     a new instance of MxSetr01600105
     */
    public static final MxSetr01600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01600105 .class);
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
