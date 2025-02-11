
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
 * Class for reda.005.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstmtFndRptReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.005.001.02")
public class MxReda00500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvstmtFndRptReq", required = true)
    protected InvestmentFundReportRequestV02 invstmtFndRptReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, DistributionPolicy1Code.class, FinancialInstrument17 .class, FormOfSecurity1Code.class, FundParameters3Choice.class, FundParameters4 .class, GenericIdentification1 .class, InvestmentFundReportRequestV02 .class, MessageIdentification1 .class, MxReda00500102 .class, NameAndAddress5 .class, NoCriteria1Code.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification7 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.005.001.02";

    public MxReda00500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00500102(final String xml) {
        this();
        MxReda00500102 tmp = parse(xml);
        invstmtFndRptReq = tmp.getInvstmtFndRptReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstmtFndRptReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundReportRequestV02 }
     *     
     */
    public InvestmentFundReportRequestV02 getInvstmtFndRptReq() {
        return invstmtFndRptReq;
    }

    /**
     * Sets the value of the invstmtFndRptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundReportRequestV02 }
     *     
     */
    public MxReda00500102 setInvstmtFndRptReq(InvestmentFundReportRequestV02 value) {
        this.invstmtFndRptReq = value;
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
    public static MxReda00500102 parse(String xml) {
        return ((MxReda00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00500102 parse(String xml, MxRead parserImpl) {
        return ((MxReda00500102) parserImpl.read(MxReda00500102 .class, xml, _classes));
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
     * Creates an MxReda00500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00500102 message
     * @return
     *     a new instance of MxReda00500102
     */
    public static final MxReda00500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00500102 .class);
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
