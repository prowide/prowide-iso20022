
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
 * Class for acmt.006.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMgmtStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.006.001.05")
public class MxAcmt00600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctMgmtStsRpt", required = true)
    protected AccountManagementStatusReportV05 acctMgmtStsRpt;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountManagementStatus1Code.class, AccountManagementStatusAndReason4 .class, AccountManagementStatusReportV05 .class, AdditionalReference6 .class, AddressType2Code.class, Extension1 .class, GenericIdentification1 .class, GenericIdentification36 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxAcmt00600105 .class, NameAndAddress5 .class, PartyIdentification90Choice.class, PostalAddress1 .class, RejectedReason16Choice.class, RejectedStatusReason6Code.class, RejectionReason31 .class, Status20Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:acmt.006.001.05";

    public MxAcmt00600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00600105(final String xml) {
        this();
        MxAcmt00600105 tmp = parse(xml);
        acctMgmtStsRpt = tmp.getAcctMgmtStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMgmtStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusReportV05 }
     *     
     */
    public AccountManagementStatusReportV05 getAcctMgmtStsRpt() {
        return acctMgmtStsRpt;
    }

    /**
     * Sets the value of the acctMgmtStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusReportV05 }
     *     
     */
    public MxAcmt00600105 setAcctMgmtStsRpt(AccountManagementStatusReportV05 value) {
        this.acctMgmtStsRpt = value;
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
    public static MxAcmt00600105 parse(String xml) {
        return ((MxAcmt00600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00600105 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00600105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00600105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00600105 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00600105) parserImpl.read(MxAcmt00600105 .class, xml, _classes));
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
     * Creates an MxAcmt00600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00600105 message
     * @return
     *     a new instance of MxAcmt00600105
     */
    public static final MxAcmt00600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00600105 .class);
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
