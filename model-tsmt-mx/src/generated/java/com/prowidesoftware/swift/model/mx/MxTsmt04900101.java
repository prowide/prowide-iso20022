
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.049.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "roleAndBaselnAccptnc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.049.001.01")
public class MxTsmt04900101
    extends AbstractMX
{

    @XmlElement(name = "RoleAndBaselnAccptnc", required = true)
    protected RoleAndBaselineAcceptanceV01 roleAndBaselnAccptnc;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 49;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {MessageIdentification1 .class, MxTsmt04900101 .class, RoleAndBaselineAcceptanceV01 .class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.049.001.01";

    public MxTsmt04900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt04900101(final String xml) {
        this();
        MxTsmt04900101 tmp = parse(xml);
        roleAndBaselnAccptnc = tmp.getRoleAndBaselnAccptnc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt04900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the roleAndBaselnAccptnc property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAndBaselineAcceptanceV01 }
     *     
     */
    public RoleAndBaselineAcceptanceV01 getRoleAndBaselnAccptnc() {
        return roleAndBaselnAccptnc;
    }

    /**
     * Sets the value of the roleAndBaselnAccptnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAndBaselineAcceptanceV01 }
     *     
     */
    public MxTsmt04900101 setRoleAndBaselnAccptnc(RoleAndBaselineAcceptanceV01 value) {
        this.roleAndBaselnAccptnc = value;
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
    public static MxTsmt04900101 parse(String xml) {
        return ((MxTsmt04900101) MxReadImpl.parse(MxTsmt04900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt04900101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt04900101) parserImpl.read(MxTsmt04900101 .class, xml, _classes));
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
     * Creates an MxTsmt04900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt04900101 message
     * @return
     *     a new instance of MxTsmt04900101
     */
    public final static MxTsmt04900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt04900101 .class);
    }

}
