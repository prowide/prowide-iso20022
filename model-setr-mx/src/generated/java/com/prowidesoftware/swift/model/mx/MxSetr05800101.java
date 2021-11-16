
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
 * Class for setr.058.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForOrdrConfStsRptV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.058.001.01")
public class MxSetr05800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForOrdrConfStsRptV01", required = true)
    protected RequestForOrderConfirmationStatusReportV01 reqForOrdrConfStsRptV01;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 58;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument10 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, InvestmentAccount13 .class, InvestmentFundOrder3 .class, MessageAndBusinessReference5 .class, MessageIdentification1 .class, MxSetr05800101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RequestForOrderConfirmationStatusReportV01 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.058.001.01";

    public MxSetr05800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05800101(final String xml) {
        this();
        MxSetr05800101 tmp = parse(xml);
        reqForOrdrConfStsRptV01 = tmp.getReqForOrdrConfStsRptV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForOrdrConfStsRptV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForOrderConfirmationStatusReportV01 }
     *     
     */
    public RequestForOrderConfirmationStatusReportV01 getReqForOrdrConfStsRptV01() {
        return reqForOrdrConfStsRptV01;
    }

    /**
     * Sets the value of the reqForOrdrConfStsRptV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForOrderConfirmationStatusReportV01 }
     *     
     */
    public MxSetr05800101 setReqForOrdrConfStsRptV01(RequestForOrderConfirmationStatusReportV01 value) {
        this.reqForOrdrConfStsRptV01 = value;
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
    public static MxSetr05800101 parse(String xml) {
        return ((MxSetr05800101) MxReadImpl.parse(MxSetr05800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05800101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05800101) parserImpl.read(MxSetr05800101 .class, xml, _classes));
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
     * Creates an MxSetr05800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05800101 message
     * @return
     *     a new instance of MxSetr05800101
     */
    public final static MxSetr05800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr05800101 .class);
    }

}
