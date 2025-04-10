
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
 * Class for tsmt.050.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "roleAndBaselnRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.050.001.01")
public class MxTsmt05000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RoleAndBaselnRjctn", required = true)
    protected RoleAndBaselineRejectionV01 roleAndBaselnRjctn;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 50;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {MessageIdentification1 .class, MxTsmt05000101 .class, Reason2 .class, RoleAndBaselineRejectionV01 .class, SimpleIdentificationInformation.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.050.001.01";

    public MxTsmt05000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt05000101(final String xml) {
        this();
        MxTsmt05000101 tmp = parse(xml);
        roleAndBaselnRjctn = tmp.getRoleAndBaselnRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt05000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the roleAndBaselnRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAndBaselineRejectionV01 }
     *     
     */
    public RoleAndBaselineRejectionV01 getRoleAndBaselnRjctn() {
        return roleAndBaselnRjctn;
    }

    /**
     * Sets the value of the roleAndBaselnRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAndBaselineRejectionV01 }
     *     
     */
    public MxTsmt05000101 setRoleAndBaselnRjctn(RoleAndBaselineRejectionV01 value) {
        this.roleAndBaselnRjctn = value;
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
    public static MxTsmt05000101 parse(String xml) {
        return ((MxTsmt05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt05000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt05000101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt05000101) parserImpl.read(MxTsmt05000101 .class, xml, _classes));
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
     * Creates an MxTsmt05000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt05000101 message
     * @return
     *     a new instance of MxTsmt05000101
     */
    public static final MxTsmt05000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt05000101 .class);
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
