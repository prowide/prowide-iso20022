
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
 * Class for sese.019.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.019.001.04")
public class MxSese01900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctHldgInfReq", required = true)
    protected AccountHoldingInformationRequestV04 acctHldgInfReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account19 .class, AccountHoldingInformationRequestV04 .class, AdditionalReference6 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternateSecurityIdentification7 .class, BusinessFlowDirectionType1Code.class, CurrentYearType2Choice.class, Extension1 .class, FinancialInstrument50 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio3Choice.class, ISATransfer27 .class, ISAType2Code.class, ISAYearsOfIssue6 .class, IdentificationSource1Choice.class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01900104 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation21 .class, PartyIdentification70Choice.class, PartyIdentification72Choice.class, PartyIdentification90Choice.class, Portfolio1 .class, PostalAddress1 .class, PreviousYearChoice.class, SecurityIdentification23Choice.class, SubAccount5 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.019.001.04";

    public MxSese01900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01900104(final String xml) {
        this();
        MxSese01900104 tmp = parse(xml);
        acctHldgInfReq = tmp.getAcctHldgInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationRequestV04 }
     *     
     */
    public AccountHoldingInformationRequestV04 getAcctHldgInfReq() {
        return acctHldgInfReq;
    }

    /**
     * Sets the value of the acctHldgInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationRequestV04 }
     *     
     */
    public MxSese01900104 setAcctHldgInfReq(AccountHoldingInformationRequestV04 value) {
        this.acctHldgInfReq = value;
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
    public static MxSese01900104 parse(String xml) {
        return ((MxSese01900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01900104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01900104 parse(String xml, MxRead parserImpl) {
        return ((MxSese01900104) parserImpl.read(MxSese01900104 .class, xml, _classes));
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
     * Creates an MxSese01900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01900104 message
     * @return
     *     a new instance of MxSese01900104
     */
    public final static MxSese01900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01900104 .class);
    }

}
