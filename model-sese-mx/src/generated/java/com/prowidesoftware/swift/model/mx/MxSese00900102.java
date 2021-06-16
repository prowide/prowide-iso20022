
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
 * Class for sese.009.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRptV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.009.001.02")
public class MxSese00900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRptV02", required = true)
    protected RequestForTransferStatusReportV02 reqForTrfStsRptV02;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, BeneficiaryCertificationCompletion1Code.class, Extension1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary11 .class, InvestmentAccount22 .class, InvestmentFundRole2Code.class, MessageAndBusinessReference6 .class, MessageIdentification1 .class, MxSese00900102 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RequestForTransferStatusReportV02 .class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.009.001.02";

    public MxSese00900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900102(final String xml) {
        this();
        MxSese00900102 tmp = parse(xml);
        reqForTrfStsRptV02 = tmp.getReqForTrfStsRptV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRptV02 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV02 }
     *     
     */
    public RequestForTransferStatusReportV02 getReqForTrfStsRptV02() {
        return reqForTrfStsRptV02;
    }

    /**
     * Sets the value of the reqForTrfStsRptV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV02 }
     *     
     */
    public MxSese00900102 setReqForTrfStsRptV02(RequestForTransferStatusReportV02 value) {
        this.reqForTrfStsRptV02 = value;
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
    public static MxSese00900102 parse(String xml) {
        return ((MxSese00900102) MxReadImpl.parse(MxSese00900102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900102 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900102) parserImpl.read(MxSese00900102 .class, xml, _classes));
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
     * Creates an MxSese00900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900102 message
     * @return
     *     a new instance of MxSese00900102
     */
    public final static MxSese00900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00900102 .class);
    }

}
