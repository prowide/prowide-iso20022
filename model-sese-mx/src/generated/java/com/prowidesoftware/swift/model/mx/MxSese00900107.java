
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
 * Class for sese.009.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.07")
public class MxSese00900107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRpt", required = true)
    protected RequestForTransferStatusReportV07 reqForTrfStsRpt;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account27 .class, AdditionalReference10 .class, AddressType2Code.class, BeneficiaryCertificationCompletion1Code.class, ContactIdentification2 .class, Extension1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, IncomePreference2Code.class, Intermediary43 .class, InvestmentAccount72 .class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageAndBusinessReference12 .class, MessageIdentification1 .class, MxSese00900107 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification125Choice.class, PartyIdentification139 .class, PostalAddress1 .class, References68Choice.class, RequestForTransferStatusReportV07 .class, Role4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SubAccount5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.07";

    public MxSese00900107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900107(final String xml) {
        this();
        MxSese00900107 tmp = parse(xml);
        reqForTrfStsRpt = tmp.getReqForTrfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV07 }
     *     
     */
    public RequestForTransferStatusReportV07 getReqForTrfStsRpt() {
        return reqForTrfStsRpt;
    }

    /**
     * Sets the value of the reqForTrfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV07 }
     *     
     */
    public MxSese00900107 setReqForTrfStsRpt(RequestForTransferStatusReportV07 value) {
        this.reqForTrfStsRpt = value;
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
    public static MxSese00900107 parse(String xml) {
        return ((MxSese00900107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00900107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00900107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00900107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00900107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900107 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900107) parserImpl.read(MxSese00900107 .class, xml, _classes));
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
     * Creates an MxSese00900107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900107 message
     * @return
     *     a new instance of MxSese00900107
     */
    public static final MxSese00900107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00900107 .class);
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
