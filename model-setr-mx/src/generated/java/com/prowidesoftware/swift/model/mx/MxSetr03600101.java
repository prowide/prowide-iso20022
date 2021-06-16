
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
 * Class for setr.036.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "listOrdrStsReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.036.001.01")
public class MxSetr03600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ListOrdrStsReq", required = true)
    protected ListOrderStatusRequest listOrdrStsReq;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, ListIdentification1 .class, ListOrderStatusRequest.class, MxSetr03600101 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.036.001.01";

    public MxSetr03600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr03600101(final String xml) {
        this();
        MxSetr03600101 tmp = parse(xml);
        listOrdrStsReq = tmp.getListOrdrStsReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr03600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the listOrdrStsReq property.
     * 
     * @return
     *     possible object is
     *     {@link ListOrderStatusRequest }
     *     
     */
    public ListOrderStatusRequest getListOrdrStsReq() {
        return listOrdrStsReq;
    }

    /**
     * Sets the value of the listOrdrStsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrderStatusRequest }
     *     
     */
    public MxSetr03600101 setListOrdrStsReq(ListOrderStatusRequest value) {
        this.listOrdrStsReq = value;
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
    public static MxSetr03600101 parse(String xml) {
        return ((MxSetr03600101) MxReadImpl.parse(MxSetr03600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr03600101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr03600101) parserImpl.read(MxSetr03600101 .class, xml, _classes));
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
     * Creates an MxSetr03600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr03600101 message
     * @return
     *     a new instance of MxSetr03600101
     */
    public final static MxSetr03600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr03600101 .class);
    }

}
