
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
 * Class for setr.018.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForOrdrStsRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.018.001.03")
public class MxSetr01800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForOrdrStsRptV03", required = true)
    protected RequestForOrderStatusReportV03 reqForOrdrStsRptV03;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 18;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument10 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, InvestmentAccount13 .class, InvestmentFundOrder2 .class, MessageAndBusinessReference4 .class, MessageIdentification1 .class, MxSetr01800103 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RequestForOrderStatusReportV03 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.018.001.03";

    public MxSetr01800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01800103(final String xml) {
        this();
        MxSetr01800103 tmp = parse(xml);
        reqForOrdrStsRptV03 = tmp.getReqForOrdrStsRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForOrdrStsRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForOrderStatusReportV03 }
     *     
     */
    public RequestForOrderStatusReportV03 getReqForOrdrStsRptV03() {
        return reqForOrdrStsRptV03;
    }

    /**
     * Sets the value of the reqForOrdrStsRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForOrderStatusReportV03 }
     *     
     */
    public MxSetr01800103 setReqForOrdrStsRptV03(RequestForOrderStatusReportV03 value) {
        this.reqForOrdrStsRptV03 = value;
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
    public static MxSetr01800103 parse(String xml) {
        return ((MxSetr01800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01800103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01800103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01800103) parserImpl.read(MxSetr01800103 .class, xml, _classes));
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
     * Creates an MxSetr01800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01800103 message
     * @return
     *     a new instance of MxSetr01800103
     */
    public static final MxSetr01800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01800103 .class);
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
