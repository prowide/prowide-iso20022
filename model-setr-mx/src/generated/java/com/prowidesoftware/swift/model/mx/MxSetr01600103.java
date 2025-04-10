
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
 * Class for setr.016.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrInstrStsRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.016.001.03")
public class MxSetr01600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrInstrStsRptV03", required = true)
    protected OrderInstructionStatusReportV03 ordrInstrStsRptV03;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CancelledStatus2 .class, CancelledStatusReason2Code.class, Charge19 .class, ChargeType11Code.class, Commission11 .class, CommissionType6Code.class, ConditionallyAcceptedStatus2 .class, ConditionallyAcceptedStatusReason2 .class, ConditionallyAcceptedStatusReason2Code.class, DateAndDateTimeChoice.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, ExpectedExecutionDetails2 .class, Extension1 .class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, FundOrderData1 .class, FundOrderData2 .class, GenericIdentification1 .class, InRepairStatus2 .class, InRepairStatusReason1Code.class, InRepairStatusReason3 .class, IndividualOrderStatusAndReason2 .class, InvestmentAccount13 .class, MessageIdentification1 .class, MxSetr01600103 .class, NameAndAddress5 .class, NoReasonCode.class, OrderInstructionStatusReportV03 .class, OrderStatus4Code.class, OrderStatusAndReason7 .class, PartiallySettledStatus1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus6 .class, RejectedStatusReason7Code.class, RepairedConditions3 .class, SecurityIdentification3Choice.class, SettledStatusReason1Code.class, SimpleIdentificationInformation.class, SuspendedStatus2 .class, SuspendedStatusReason2 .class, SuspendedStatusReason3Code.class, SwitchLegReferences1 .class, SwitchOrderStatusAndReason1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.016.001.03";

    public MxSetr01600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01600103(final String xml) {
        this();
        MxSetr01600103 tmp = parse(xml);
        ordrInstrStsRptV03 = tmp.getOrdrInstrStsRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrInstrStsRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionStatusReportV03 }
     *     
     */
    public OrderInstructionStatusReportV03 getOrdrInstrStsRptV03() {
        return ordrInstrStsRptV03;
    }

    /**
     * Sets the value of the ordrInstrStsRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionStatusReportV03 }
     *     
     */
    public MxSetr01600103 setOrdrInstrStsRptV03(OrderInstructionStatusReportV03 value) {
        this.ordrInstrStsRptV03 = value;
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
    public static MxSetr01600103 parse(String xml) {
        return ((MxSetr01600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01600103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01600103) parserImpl.read(MxSetr01600103 .class, xml, _classes));
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
     * Creates an MxSetr01600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01600103 message
     * @return
     *     a new instance of MxSetr01600103
     */
    public static final MxSetr01600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01600103 .class);
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
