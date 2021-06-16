
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
 * Class for sese.009.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.009.001.05")
public class MxSese00900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRpt", required = true)
    protected RequestForTransferStatusReportV05 reqForTrfStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account20 .class, AdditionalReference6 .class, AdditionalReference7 .class, AddressType2Code.class, BeneficiaryCertificationCompletion1Code.class, Extension1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, IncomePreference2Code.class, Intermediary35 .class, InvestmentAccount57 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageAndBusinessReference8 .class, MessageIdentification1 .class, MxSese00900105 .class, NameAndAddress5 .class, PartyIdentification70Choice.class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PostalAddress1 .class, References48Choice.class, RequestForTransferStatusReportV05 .class, Role4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SubAccount5 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.009.001.05";

    public MxSese00900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900105(final String xml) {
        this();
        MxSese00900105 tmp = parse(xml);
        reqForTrfStsRpt = tmp.getReqForTrfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV05 }
     *     
     */
    public RequestForTransferStatusReportV05 getReqForTrfStsRpt() {
        return reqForTrfStsRpt;
    }

    /**
     * Sets the value of the reqForTrfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV05 }
     *     
     */
    public MxSese00900105 setReqForTrfStsRpt(RequestForTransferStatusReportV05 value) {
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
    public static MxSese00900105 parse(String xml) {
        return ((MxSese00900105) MxReadImpl.parse(MxSese00900105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900105 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900105) parserImpl.read(MxSese00900105 .class, xml, _classes));
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
     * Creates an MxSese00900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900105 message
     * @return
     *     a new instance of MxSese00900105
     */
    public final static MxSese00900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00900105 .class);
    }

}
