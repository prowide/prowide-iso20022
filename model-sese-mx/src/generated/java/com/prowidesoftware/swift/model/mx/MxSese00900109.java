
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for sese.009.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForTrfStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.09")
public class MxSese00900109
    extends AbstractMX
{

    @XmlElement(name = "ReqForTrfStsRpt", required = true)
    protected RequestForTransferStatusReportV09 reqForTrfStsRpt;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account34 .class, Account36 .class, AdditionalInformation15 .class, AdditionalInformation25 .class, AdditionalReference10 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BlockChainAddressWallet3 .class, CashAsset3 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ClassificationType32Choice.class, ClearingSystemMemberIdentification2Choice.class, ContactIdentification2 .class, Extension1 .class, FinancialInstrument101Choice.class, FinancialInstrumentIdentification6 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource1Choice.class, Intermediary48 .class, InvestmentFundRole8Code.class, MarketPracticeVersion1 .class, MessageAndBusinessReference14 .class, MessageIdentification1 .class, MxSese00900109 .class, NameAndAddress5 .class, NamePrefix1Code.class, OtherAsset2 .class, OtherAsset2Choice.class, OtherAsset2Code.class, PartyIdentification125Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PostalAddress1 .class, References68Choice.class, RejectedReason33Choice.class, RejectedStatusReason12Code.class, RequestForTransferStatusReportV09 .class, Role8Choice.class, SecurityIdentification46Choice.class, SubAccount5 .class, TypeOfRequest1Choice.class, TypeOfRequest1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.009.001.09";

    public MxSese00900109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00900109(final String xml) {
        this();
        MxSese00900109 tmp = parse(xml);
        reqForTrfStsRpt = tmp.getReqForTrfStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00900109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForTrfStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForTransferStatusReportV09 }
     *     
     */
    public RequestForTransferStatusReportV09 getReqForTrfStsRpt() {
        return reqForTrfStsRpt;
    }

    /**
     * Sets the value of the reqForTrfStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForTransferStatusReportV09 }
     *     
     */
    public MxSese00900109 setReqForTrfStsRpt(RequestForTransferStatusReportV09 value) {
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
    public static MxSese00900109 parse(String xml) {
        return ((MxSese00900109) MxReadImpl.parse(MxSese00900109 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00900109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00900109) MxReadImpl.parse(MxSese00900109 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00900109 parse(String xml, MxRead parserImpl) {
        return ((MxSese00900109) parserImpl.read(MxSese00900109 .class, xml, _classes));
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
     * Creates an MxSese00900109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00900109 message
     * @return
     *     a new instance of MxSese00900109
     */
    public static final MxSese00900109 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese00900109 .class);
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
