
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
 * Class for sese.009.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.06")
public class MxSese00900106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRpt", required = true)
    protected RequestForTransferStatusReportV06 reqForTrfStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account25 .class, AdditionalReference8 .class, AddressType2Code.class, BeneficiaryCertificationCompletion1Code.class, Extension1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, IncomePreference2Code.class, Intermediary42 .class, InvestmentAccount68 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageAndBusinessReference11 .class, MessageIdentification1 .class, MxSese00900106 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, References63Choice.class, RequestForTransferStatusReportV06 .class, Role4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SubAccount5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.06";

    public MxSese00900106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900106(final String xml) {
        this();
        MxSese00900106 tmp = parse(xml);
        reqForTrfStsRpt = tmp.getReqForTrfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV06 }
     *     
     */
    public RequestForTransferStatusReportV06 getReqForTrfStsRpt() {
        return reqForTrfStsRpt;
    }

    /**
     * Sets the value of the reqForTrfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV06 }
     *     
     */
    public MxSese00900106 setReqForTrfStsRpt(RequestForTransferStatusReportV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese00900106 parse(String xml) {
        return ((MxSese00900106) MxReadImpl.parse(MxSese00900106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900106 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900106) parserImpl.read(MxSese00900106 .class, xml, _classes));
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
     * Creates an MxSese00900106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900106 message
     * @return
     *     a new instance of MxSese00900106
     */
    public final static MxSese00900106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00900106 .class);
    }

}
