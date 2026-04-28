
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.009.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.08")
public class MxSese00900108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRpt", required = true)
    protected RequestForTransferStatusReportV08 reqForTrfStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account33 .class, Account34 .class, AdditionalInformation15 .class, AdditionalInformation25 .class, AdditionalReference10 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, CashAsset3 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ClassificationType32Choice.class, ClearingSystemMemberIdentification2Choice.class, ContactIdentification2 .class, Extension1 .class, FinancialInstrument63Choice.class, FinancialInstrumentIdentification2 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource1Choice.class, Intermediary48 .class, InvestmentFundRole8Code.class, MarketPracticeVersion1 .class, MessageAndBusinessReference13 .class, MessageIdentification1 .class, MxSese00900108 .class, NameAndAddress5 .class, NamePrefix1Code.class, OtherAsset2 .class, OtherAsset2Choice.class, OtherAsset2Code.class, PartyIdentification125Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PostalAddress1 .class, References68Choice.class, RejectedReason33Choice.class, RejectedStatusReason12Code.class, RequestForTransferStatusReportV08 .class, Role8Choice.class, SecurityIdentification25Choice.class, SubAccount5 .class, TypeOfRequest1Choice.class, TypeOfRequest1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.08";

    public MxSese00900108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900108(final String xml) {
        this();
        MxSese00900108 tmp = parse(xml);
        reqForTrfStsRpt = tmp.getReqForTrfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV08 }
     *     
     */
    public RequestForTransferStatusReportV08 getReqForTrfStsRpt() {
        return reqForTrfStsRpt;
    }

    /**
     * Sets the value of the reqForTrfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV08 }
     *     
     */
    public MxSese00900108 setReqForTrfStsRpt(RequestForTransferStatusReportV08 value) {
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
    public static MxSese00900108 parse(String xml) {
        return ((MxSese00900108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00900108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00900108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00900108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00900108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900108 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900108) parserImpl.read(MxSese00900108 .class, xml, _classes));
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
     * Creates an MxSese00900108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900108 message
     * @return
     *     a new instance of MxSese00900108
     */
    public final static MxSese00900108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00900108 .class);
    }

}
