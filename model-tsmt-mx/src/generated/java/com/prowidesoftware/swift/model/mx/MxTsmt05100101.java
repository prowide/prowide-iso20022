
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
 * Class for tsmt.051.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "roleAndBaselnAccptncNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.051.001.01")
public class MxTsmt05100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RoleAndBaselnAccptncNtfctn", required = true)
    protected RoleAndBaselineAcceptanceNotificationV01 roleAndBaselnAccptncNtfctn;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 51;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt05100101 .class, PendingActivity2 .class, RoleAndBaselineAcceptanceNotificationV01 .class, SimpleIdentificationInformation.class, TransactionStatus4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.051.001.01";

    public MxTsmt05100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt05100101(final String xml) {
        this();
        MxTsmt05100101 tmp = parse(xml);
        roleAndBaselnAccptncNtfctn = tmp.getRoleAndBaselnAccptncNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt05100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the roleAndBaselnAccptncNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAndBaselineAcceptanceNotificationV01 }
     *     
     */
    public RoleAndBaselineAcceptanceNotificationV01 getRoleAndBaselnAccptncNtfctn() {
        return roleAndBaselnAccptncNtfctn;
    }

    /**
     * Sets the value of the roleAndBaselnAccptncNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAndBaselineAcceptanceNotificationV01 }
     *     
     */
    public MxTsmt05100101 setRoleAndBaselnAccptncNtfctn(RoleAndBaselineAcceptanceNotificationV01 value) {
        this.roleAndBaselnAccptncNtfctn = value;
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
    public static MxTsmt05100101 parse(String xml) {
        return ((MxTsmt05100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt05100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt05100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt05100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt05100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt05100101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt05100101) parserImpl.read(MxTsmt05100101 .class, xml, _classes));
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
     * Creates an MxTsmt05100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt05100101 message
     * @return
     *     a new instance of MxTsmt05100101
     */
    public static final MxTsmt05100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt05100101 .class);
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
