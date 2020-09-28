
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
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
    extends AbstractMX
{

    @XmlElement(name = "AltrntvFndsOrdrInstrStsRpt", required = true)
    protected AlternativeFundsOrderInstructionStatusReportV01 altrntvFndsOrdrInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 64;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference4 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, AlternativeFundsOrderInstructionStatusReportV01 .class, BICIdentification1 .class, CancelledStatusReason1Choice.class, CancelledStatusReason2Code.class, ConditionallyAcceptedStatusReason1Choice.class, ConditionallyAcceptedStatusReason3Code.class, CopyInformation2 .class, DateAndDateTimeChoice.class, ExpectedExecutionDetails3 .class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantity1 .class, FinancialInstrumentQuantity11Choice.class, FundOrderData3 .class, GenericIdentification1 .class, GenericIdentification13 .class, HoldBackInformation1 .class, IndividualOrderStatusAndReason3 .class, InvestmentAccount30 .class, MessageIdentification1 .class, MxSetr06400101 .class, NameAndAddress5 .class, NoReasonCode.class, OrderStatus1Choice.class, OrderStatus5Code.class, PartiallySettledStatus2 .class, PartiallySettledStatusReason1Code.class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatusReason10Code.class, RejectedStatusReason1Choice.class, SecuritiesAccount5 .class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, SidePocketQuantityAndAmount1 .class, SubAccount3 .class, SuspendedStatusReason3Code.class, SuspendedStatusReasonChoice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.064.001.01";

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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSetr06400101 parse(String xml) {
        return ((MxSetr06400101) MxReadImpl.parse(MxSetr06400101 .class, xml, _classes));
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
    public final static MxSetr06400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr06400101 .class);
    }

}
