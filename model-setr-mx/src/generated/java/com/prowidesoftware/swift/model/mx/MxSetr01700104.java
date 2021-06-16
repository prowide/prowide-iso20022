
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.017.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrCxlStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.017.001.04")
public class MxSetr01700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrCxlStsRpt", required = true)
    protected OrderCancellationStatusReportV04 ordrCxlStsRpt;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, CancellationStatus22Choice.class, DateFormat42Choice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument57 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IdentificationSource1Choice.class, IndividualOrderStatusAndReason8 .class, InvestmentAccount58 .class, MessageIdentification1 .class, MxSetr01700104 .class, NameAndAddress5 .class, OrderCancellationStatus2Code.class, OrderCancellationStatusReportV04 .class, OrderOriginatorEligibility1Code.class, OrderStatusAndReason9 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, References61Choice.class, RejectedReason21Choice.class, RejectedStatus10 .class, RejectedStatusReason8Code.class, SecurityIdentification25Choice.class, Series1 .class, Status26Choice.class, SubAccount6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.017.001.04";

    public MxSetr01700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01700104(final String xml) {
        this();
        MxSetr01700104 tmp = parse(xml);
        ordrCxlStsRpt = tmp.getOrdrCxlStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrCxlStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCancellationStatusReportV04 }
     *     
     */
    public OrderCancellationStatusReportV04 getOrdrCxlStsRpt() {
        return ordrCxlStsRpt;
    }

    /**
     * Sets the value of the ordrCxlStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCancellationStatusReportV04 }
     *     
     */
    public MxSetr01700104 setOrdrCxlStsRpt(OrderCancellationStatusReportV04 value) {
        this.ordrCxlStsRpt = value;
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
    public static MxSetr01700104 parse(String xml) {
        return ((MxSetr01700104) MxReadImpl.parse(MxSetr01700104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01700104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01700104) parserImpl.read(MxSetr01700104 .class, xml, _classes));
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
     * Creates an MxSetr01700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01700104 message
     * @return
     *     a new instance of MxSetr01700104
     */
    public final static MxSetr01700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01700104 .class);
    }

}
