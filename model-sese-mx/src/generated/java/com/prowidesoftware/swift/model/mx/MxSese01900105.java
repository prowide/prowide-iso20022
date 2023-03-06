
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
 * Class for sese.019.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.05")
public class MxSese01900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctHldgInfReq", required = true)
    protected AccountHoldingInformationRequestV05 acctHldgInfReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account24 .class, AccountHoldingInformationRequestV05 .class, AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternateSecurityIdentification7 .class, BusinessFlowDirectionType1Code.class, CurrentYearType2Choice.class, Extension1 .class, FinancialInstrument64 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio4Choice.class, ISATransfer31 .class, ISAType2Code.class, ISAYearsOfIssue7 .class, IdentificationSource1Choice.class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01900105 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation31 .class, PartyIdentification113 .class, PartyIdentification119Choice.class, PartyIdentification124 .class, PartyIdentification90Choice.class, Portfolio1 .class, PostalAddress1 .class, PreviousYear2Choice.class, SecurityIdentification25Choice.class, SubAccount5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.05";

    public MxSese01900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01900105(final String xml) {
        this();
        MxSese01900105 tmp = parse(xml);
        acctHldgInfReq = tmp.getAcctHldgInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationRequestV05 }
     *     
     */
    public AccountHoldingInformationRequestV05 getAcctHldgInfReq() {
        return acctHldgInfReq;
    }

    /**
     * Sets the value of the acctHldgInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationRequestV05 }
     *     
     */
    public MxSese01900105 setAcctHldgInfReq(AccountHoldingInformationRequestV05 value) {
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
    public static MxSese01900105 parse(String xml) {
        return ((MxSese01900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01900105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01900105 parse(String xml, MxRead parserImpl) {
        return ((MxSese01900105) parserImpl.read(MxSese01900105 .class, xml, _classes));
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
     * Creates an MxSese01900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01900105 message
     * @return
     *     a new instance of MxSese01900105
     */
    public final static MxSese01900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01900105 .class);
    }

}
