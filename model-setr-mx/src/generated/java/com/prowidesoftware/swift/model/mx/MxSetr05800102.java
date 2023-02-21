
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
 * Class for setr.058.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForOrdrConfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.058.001.02")
public class MxSetr05800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForOrdrConfStsRpt", required = true)
    protected RequestForOrderConfirmationStatusReportV02 reqForOrdrConfStsRpt;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 58;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, DateFormat42Choice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument57 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IdentificationSource1Choice.class, InvestmentAccount58 .class, InvestmentFundOrder8 .class, MessageAndBusinessReference10 .class, MessageIdentification1 .class, MxSetr05800102 .class, NameAndAddress5 .class, OrderOriginatorEligibility1Code.class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, References62Choice.class, RequestForOrderConfirmationStatusReportV02 .class, SecurityIdentification25Choice.class, Series1 .class, SubAccount6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.058.001.02";

    public MxSetr05800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05800102(final String xml) {
        this();
        MxSetr05800102 tmp = parse(xml);
        reqForOrdrConfStsRpt = tmp.getReqForOrdrConfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForOrdrConfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForOrderConfirmationStatusReportV02 }
     *     
     */
    public RequestForOrderConfirmationStatusReportV02 getReqForOrdrConfStsRpt() {
        return reqForOrdrConfStsRpt;
    }

    /**
     * Sets the value of the reqForOrdrConfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForOrderConfirmationStatusReportV02 }
     *     
     */
    public MxSetr05800102 setReqForOrdrConfStsRpt(RequestForOrderConfirmationStatusReportV02 value) {
        this.reqForOrdrConfStsRpt = value;
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
    public static MxSetr05800102 parse(String xml) {
        return ((MxSetr05800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr05800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr05800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05800102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05800102) parserImpl.read(MxSetr05800102 .class, xml, _classes));
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
     * Creates an MxSetr05800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05800102 message
     * @return
     *     a new instance of MxSetr05800102
     */
    public final static MxSetr05800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr05800102 .class);
    }

}
