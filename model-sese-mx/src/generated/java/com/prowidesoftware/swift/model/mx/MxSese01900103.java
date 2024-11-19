
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
 * Class for sese.019.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.019.001.03")
public class MxSese01900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctHldgInfReq", required = true)
    protected AccountHoldingInformationRequestV03 acctHldgInfReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 19;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account15 .class, Account16 .class, AccountHoldingInformationRequestV03 .class, AccountIdentification1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BusinessFlowDirectionType1Code.class, CurrentYearType2Choice.class, Extension1 .class, FinancialInstrument36 .class, GenderCode.class, GenericIdentification1 .class, ISAPortfolio3Choice.class, ISATransfer15 .class, ISAType2Code.class, ISAYearsOfIssue6 .class, IndividualPerson8 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01900103 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation4 .class, PartyIdentification2Choice.class, PartyIdentification4Choice.class, Portfolio1 .class, PostalAddress1 .class, PreviousYearChoice.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.019.001.03";

    public MxSese01900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01900103(final String xml) {
        this();
        MxSese01900103 tmp = parse(xml);
        acctHldgInfReq = tmp.getAcctHldgInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationRequestV03 }
     *     
     */
    public AccountHoldingInformationRequestV03 getAcctHldgInfReq() {
        return acctHldgInfReq;
    }

    /**
     * Sets the value of the acctHldgInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationRequestV03 }
     *     
     */
    public MxSese01900103 setAcctHldgInfReq(AccountHoldingInformationRequestV03 value) {
        this.acctHldgInfReq = value;
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
    public static MxSese01900103 parse(String xml) {
        return ((MxSese01900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01900103 parse(String xml, MxRead parserImpl) {
        return ((MxSese01900103) parserImpl.read(MxSese01900103 .class, xml, _classes));
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
     * Creates an MxSese01900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01900103 message
     * @return
     *     a new instance of MxSese01900103
     */
    public static final MxSese01900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01900103 .class);
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
