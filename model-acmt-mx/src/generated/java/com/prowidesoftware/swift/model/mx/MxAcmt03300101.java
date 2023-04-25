
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
 * Class for acmt.033.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctSwtchNtfyAcctSwtchCmplt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.033.001.01")
public class MxAcmt03300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctSwtchNtfyAcctSwtchCmplt", required = true)
    protected AccountSwitchNotifyAccountSwitchCompleteV01 acctSwtchNtfyAcctSwtchCmplt;
    public static final transient String BUSINESS_PROCESS = "acmt";
    public static final transient int FUNCTIONALITY = 33;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountSwitchDetails1 .class, AccountSwitchNotifyAccountSwitchCompleteV01 .class, BalanceTransferWindow1Code.class, MessageIdentification1 .class, MxAcmt03300101 .class, ResponseDetails1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwitchStatus1Code.class, SwitchType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.033.001.01";

    public MxAcmt03300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt03300101(final String xml) {
        this();
        MxAcmt03300101 tmp = parse(xml);
        acctSwtchNtfyAcctSwtchCmplt = tmp.getAcctSwtchNtfyAcctSwtchCmplt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt03300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctSwtchNtfyAcctSwtchCmplt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchNotifyAccountSwitchCompleteV01 }
     *     
     */
    public AccountSwitchNotifyAccountSwitchCompleteV01 getAcctSwtchNtfyAcctSwtchCmplt() {
        return acctSwtchNtfyAcctSwtchCmplt;
    }

    /**
     * Sets the value of the acctSwtchNtfyAcctSwtchCmplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchNotifyAccountSwitchCompleteV01 }
     *     
     */
    public MxAcmt03300101 setAcctSwtchNtfyAcctSwtchCmplt(AccountSwitchNotifyAccountSwitchCompleteV01 value) {
        this.acctSwtchNtfyAcctSwtchCmplt = value;
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
    public static MxAcmt03300101 parse(String xml) {
        return ((MxAcmt03300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt03300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt03300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt03300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt03300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt03300101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt03300101) parserImpl.read(MxAcmt03300101 .class, xml, _classes));
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
     * Creates an MxAcmt03300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt03300101 message
     * @return
     *     a new instance of MxAcmt03300101
     */
    public static final MxAcmt03300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt03300101 .class);
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
