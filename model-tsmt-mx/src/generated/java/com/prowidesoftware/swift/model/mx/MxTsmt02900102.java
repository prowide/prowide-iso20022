
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.029.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stsChngReqRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02")
public class MxTsmt02900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StsChngReqRjctn", required = true)
    protected StatusChangeRequestRejectionV02 stsChngReqRjctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BaselineStatus2Code.class, MessageIdentification1 .class, MxTsmt02900102 .class, Reason2 .class, SimpleIdentificationInformation.class, StatusChangeRequestRejectionV02 .class, TransactionStatus3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02";

    public MxTsmt02900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt02900102(final String xml) {
        this();
        MxTsmt02900102 tmp = parse(xml);
        stsChngReqRjctn = tmp.getStsChngReqRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt02900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stsChngReqRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusChangeRequestRejectionV02 }
     *     
     */
    public StatusChangeRequestRejectionV02 getStsChngReqRjctn() {
        return stsChngReqRjctn;
    }

    /**
     * Sets the value of the stsChngReqRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusChangeRequestRejectionV02 }
     *     
     */
    public MxTsmt02900102 setStsChngReqRjctn(StatusChangeRequestRejectionV02 value) {
        this.stsChngReqRjctn = value;
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
    public static MxTsmt02900102 parse(String xml) {
        return ((MxTsmt02900102) MxReadImpl.parse(MxTsmt02900102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt02900102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt02900102) parserImpl.read(MxTsmt02900102 .class, xml, _classes));
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
     * Creates an MxTsmt02900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt02900102 message
     * @return
     *     a new instance of MxTsmt02900102
     */
    public final static MxTsmt02900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt02900102 .class);
    }

}
