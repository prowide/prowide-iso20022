
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
 * Class for setr.008.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sbcptBlkOrdrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.008.001.04")
public class MxSetr00800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SbcptBlkOrdrCxlReq", required = true)
    protected SubscriptionBulkOrderCancellationRequestV04 sbcptBlkOrdrCxlReq;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, CancellationReason32Choice.class, CopyInformation4 .class, GenericIdentification1 .class, GenericIdentification30 .class, InvestmentFundOrder9 .class, MessageIdentification1 .class, MxSetr00800104 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, SubscriptionBulkOrderCancellationRequestV04 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.008.001.04";

    public MxSetr00800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00800104(final String xml) {
        this();
        MxSetr00800104 tmp = parse(xml);
        sbcptBlkOrdrCxlReq = tmp.getSbcptBlkOrdrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sbcptBlkOrdrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionBulkOrderCancellationRequestV04 }
     *     
     */
    public SubscriptionBulkOrderCancellationRequestV04 getSbcptBlkOrdrCxlReq() {
        return sbcptBlkOrdrCxlReq;
    }

    /**
     * Sets the value of the sbcptBlkOrdrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionBulkOrderCancellationRequestV04 }
     *     
     */
    public MxSetr00800104 setSbcptBlkOrdrCxlReq(SubscriptionBulkOrderCancellationRequestV04 value) {
        this.sbcptBlkOrdrCxlReq = value;
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
    public static MxSetr00800104 parse(String xml) {
        return ((MxSetr00800104) MxReadImpl.parse(MxSetr00800104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00800104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00800104) parserImpl.read(MxSetr00800104 .class, xml, _classes));
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
     * Creates an MxSetr00800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00800104 message
     * @return
     *     a new instance of MxSetr00800104
     */
    public final static MxSetr00800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr00800104 .class);
    }

}
