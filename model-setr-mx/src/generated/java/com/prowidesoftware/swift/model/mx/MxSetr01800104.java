
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
 * Class for setr.018.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForOrdrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.018.001.04")
public class MxSetr01800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForOrdrStsRpt", required = true)
    protected RequestForOrderStatusReportV04 reqForOrdrStsRpt;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, DateFormat42Choice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument57 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IdentificationSource1Choice.class, InvestmentAccount58 .class, InvestmentFundOrder8 .class, MessageAndBusinessReference10 .class, MessageIdentification1 .class, MxSetr01800104 .class, NameAndAddress5 .class, OrderOriginatorEligibility1Code.class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, References62Choice.class, RequestForOrderStatusReportV04 .class, SecurityIdentification25Choice.class, Series1 .class, SubAccount6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.018.001.04";

    public MxSetr01800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01800104(final String xml) {
        this();
        MxSetr01800104 tmp = parse(xml);
        reqForOrdrStsRpt = tmp.getReqForOrdrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForOrdrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForOrderStatusReportV04 }
     *     
     */
    public RequestForOrderStatusReportV04 getReqForOrdrStsRpt() {
        return reqForOrdrStsRpt;
    }

    /**
     * Sets the value of the reqForOrdrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForOrderStatusReportV04 }
     *     
     */
    public MxSetr01800104 setReqForOrdrStsRpt(RequestForOrderStatusReportV04 value) {
        this.reqForOrdrStsRpt = value;
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
    public static MxSetr01800104 parse(String xml) {
        return ((MxSetr01800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01800104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01800104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01800104) parserImpl.read(MxSetr01800104 .class, xml, _classes));
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
     * Creates an MxSetr01800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01800104 message
     * @return
     *     a new instance of MxSetr01800104
     */
    public final static MxSetr01800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01800104 .class);
    }

}
