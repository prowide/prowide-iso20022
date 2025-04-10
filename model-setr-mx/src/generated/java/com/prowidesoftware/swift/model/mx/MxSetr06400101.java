
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
 * Class for setr.064.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "altrntvFndsOrdrInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.064.001.01")
public class MxSetr06400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AltrntvFndsOrdrInstrStsRpt", required = true)
    protected AlternativeFundsOrderInstructionStatusReportV01 altrntvFndsOrdrInstrStsRpt;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 64;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference4 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, AlternativeFundsOrderInstructionStatusReportV01 .class, BICIdentification1 .class, CancelledStatusReason1Choice.class, CancelledStatusReason2Code.class, ConditionallyAcceptedStatusReason1Choice.class, ConditionallyAcceptedStatusReason3Code.class, CopyInformation2 .class, DateAndDateTimeChoice.class, ExpectedExecutionDetails3 .class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantity1 .class, FinancialInstrumentQuantity11Choice.class, FundOrderData3 .class, GenericIdentification1 .class, GenericIdentification13 .class, HoldBackInformation1 .class, IndividualOrderStatusAndReason3 .class, InvestmentAccount30 .class, MessageIdentification1 .class, MxSetr06400101 .class, NameAndAddress5 .class, NoReasonCode.class, OrderStatus1Choice.class, OrderStatus5Code.class, PartiallySettledStatus2 .class, PartiallySettledStatusReason1Code.class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatusReason10Code.class, RejectedStatusReason1Choice.class, SecuritiesAccount5 .class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, SidePocketQuantityAndAmount1 .class, SubAccount3 .class, SuspendedStatusReason3Code.class, SuspendedStatusReasonChoice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.064.001.01";

    public MxSetr06400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr06400101(final String xml) {
        this();
        MxSetr06400101 tmp = parse(xml);
        altrntvFndsOrdrInstrStsRpt = tmp.getAltrntvFndsOrdrInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr06400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the altrntvFndsOrdrInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeFundsOrderInstructionStatusReportV01 }
     *     
     */
    public AlternativeFundsOrderInstructionStatusReportV01 getAltrntvFndsOrdrInstrStsRpt() {
        return altrntvFndsOrdrInstrStsRpt;
    }

    /**
     * Sets the value of the altrntvFndsOrdrInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeFundsOrderInstructionStatusReportV01 }
     *     
     */
    public MxSetr06400101 setAltrntvFndsOrdrInstrStsRpt(AlternativeFundsOrderInstructionStatusReportV01 value) {
        this.altrntvFndsOrdrInstrStsRpt = value;
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
    public static MxSetr06400101 parse(String xml) {
        return ((MxSetr06400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr06400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr06400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr06400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr06400101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr06400101) parserImpl.read(MxSetr06400101 .class, xml, _classes));
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
     * Creates an MxSetr06400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr06400101 message
     * @return
     *     a new instance of MxSetr06400101
     */
    public static final MxSetr06400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr06400101 .class);
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
