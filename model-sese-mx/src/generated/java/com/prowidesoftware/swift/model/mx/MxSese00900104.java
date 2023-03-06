
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
 * Class for sese.009.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.009.001.04")
public class MxSese00900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRpt", required = true)
    protected RequestForTransferStatusReportV04 reqForTrfStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account14 .class, AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, BeneficiaryCertificationCompletion1Code.class, Extension1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification47 .class, IncomePreference1Code.class, Intermediary25 .class, InvestmentAccount40 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageAndBusinessReference7 .class, MessageIdentification1 .class, MxSese00900104 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, References39Choice.class, RequestForTransferStatusReportV04 .class, Role4Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.009.001.04";

    public MxSese00900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900104(final String xml) {
        this();
        MxSese00900104 tmp = parse(xml);
        reqForTrfStsRpt = tmp.getReqForTrfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV04 }
     *     
     */
    public RequestForTransferStatusReportV04 getReqForTrfStsRpt() {
        return reqForTrfStsRpt;
    }

    /**
     * Sets the value of the reqForTrfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV04 }
     *     
     */
    public MxSese00900104 setReqForTrfStsRpt(RequestForTransferStatusReportV04 value) {
        this.reqForTrfStsRpt = value;
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
    public static MxSese00900104 parse(String xml) {
        return ((MxSese00900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00900104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900104 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900104) parserImpl.read(MxSese00900104 .class, xml, _classes));
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
     * Creates an MxSese00900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900104 message
     * @return
     *     a new instance of MxSese00900104
     */
    public final static MxSese00900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00900104 .class);
    }

}
