
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
 * Class for reda.050.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctLkMntncReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.050.001.01")
public class MxReda05000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctLkMntncReq", required = true)
    protected AccountLinkMaintenanceRequestV01 acctLkMntncReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 50;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountLink8 .class, AccountLinkMaintenanceRequestV01 .class, AccountLinkUpdate2 .class, AccountSchemeName1Choice.class, BlockChainAddressWallet3 .class, CashAccount38 .class, CashAccountType2Choice.class, DateAndDateTime2Choice.class, GenericAccountIdentification1 .class, GenericIdentification30 .class, MessageHeader1 .class, MxReda05000101 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SecuritiesAccount19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.050.001.01";

    public MxReda05000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda05000101(final String xml) {
        this();
        MxReda05000101 tmp = parse(xml);
        acctLkMntncReq = tmp.getAcctLkMntncReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda05000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctLkMntncReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLinkMaintenanceRequestV01 }
     *     
     */
    public AccountLinkMaintenanceRequestV01 getAcctLkMntncReq() {
        return acctLkMntncReq;
    }

    /**
     * Sets the value of the acctLkMntncReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLinkMaintenanceRequestV01 }
     *     
     */
    public MxReda05000101 setAcctLkMntncReq(AccountLinkMaintenanceRequestV01 value) {
        this.acctLkMntncReq = value;
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
    public static MxReda05000101 parse(String xml) {
        return ((MxReda05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda05000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda05000101 parse(String xml, MxRead parserImpl) {
        return ((MxReda05000101) parserImpl.read(MxReda05000101 .class, xml, _classes));
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
     * Creates an MxReda05000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda05000101 message
     * @return
     *     a new instance of MxReda05000101
     */
    public static final MxReda05000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda05000101 .class);
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
