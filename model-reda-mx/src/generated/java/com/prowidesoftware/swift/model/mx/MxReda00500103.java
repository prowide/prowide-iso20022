
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
 * Class for reda.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstmtFndRptReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.005.001.03")
public class MxReda00500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvstmtFndRptReq", required = true)
    protected InvestmentFundReportRequestV03 invstmtFndRptReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference10 .class, AddressType2Code.class, DistributionPolicy1Code.class, FinancialInstrument71 .class, FormOfSecurity1Code.class, FundParameters4Choice.class, FundParameters5 .class, GenericIdentification1 .class, IdentificationSource3Choice.class, InvestmentFundReportRequestV03 .class, MessageIdentification1 .class, MxReda00500103 .class, NameAndAddress5 .class, NoCriteria1Code.class, OtherIdentification1 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PostalAddress1 .class, SecurityIdentification19 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.005.001.03";

    public MxReda00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00500103(final String xml) {
        this();
        MxReda00500103 tmp = parse(xml);
        invstmtFndRptReq = tmp.getInvstmtFndRptReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstmtFndRptReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundReportRequestV03 }
     *     
     */
    public InvestmentFundReportRequestV03 getInvstmtFndRptReq() {
        return invstmtFndRptReq;
    }

    /**
     * Sets the value of the invstmtFndRptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundReportRequestV03 }
     *     
     */
    public MxReda00500103 setInvstmtFndRptReq(InvestmentFundReportRequestV03 value) {
        this.invstmtFndRptReq = value;
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
    public static MxReda00500103 parse(String xml) {
        return ((MxReda00500103) MxReadImpl.parse(MxReda00500103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00500103 parse(String xml, MxRead parserImpl) {
        return ((MxReda00500103) parserImpl.read(MxReda00500103 .class, xml, _classes));
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
     * Creates an MxReda00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00500103 message
     * @return
     *     a new instance of MxReda00500103
     */
    public final static MxReda00500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00500103 .class);
    }

}
