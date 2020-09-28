
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
 * Class for tsmt.052.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "roleAndBaselnRjctnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.052.001.01")
public class MxTsmt05200101
    extends AbstractMX
{

    @XmlElement(name = "RoleAndBaselnRjctnNtfctn", required = true)
    protected RoleAndBaselineRejectionNotificationV01 roleAndBaselnRjctnNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 52;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt05200101 .class, PendingActivity2 .class, Reason2 .class, RoleAndBaselineRejectionNotificationV01 .class, SimpleIdentificationInformation.class, TransactionStatus4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.052.001.01";

    public MxTsmt05200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt05200101(final String xml) {
        this();
        MxTsmt05200101 tmp = parse(xml);
        roleAndBaselnRjctnNtfctn = tmp.getRoleAndBaselnRjctnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt05200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the roleAndBaselnRjctnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAndBaselineRejectionNotificationV01 }
     *     
     */
    public RoleAndBaselineRejectionNotificationV01 getRoleAndBaselnRjctnNtfctn() {
        return roleAndBaselnRjctnNtfctn;
    }

    /**
     * Sets the value of the roleAndBaselnRjctnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAndBaselineRejectionNotificationV01 }
     *     
     */
    public MxTsmt05200101 setRoleAndBaselnRjctnNtfctn(RoleAndBaselineRejectionNotificationV01 value) {
        this.roleAndBaselnRjctnNtfctn = value;
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
    public static MxTsmt05200101 parse(String xml) {
        return ((MxTsmt05200101) MxReadImpl.parse(MxTsmt05200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt05200101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt05200101) parserImpl.read(MxTsmt05200101 .class, xml, _classes));
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
     * Creates an MxTsmt05200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt05200101 message
     * @return
     *     a new instance of MxTsmt05200101
     */
    public final static MxTsmt05200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt05200101 .class);
    }

}
