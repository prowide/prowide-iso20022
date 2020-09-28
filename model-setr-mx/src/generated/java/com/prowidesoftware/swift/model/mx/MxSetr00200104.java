
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
 * Class for setr.002.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redBlkOrdrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.002.001.04")
public class MxSetr00200104
    extends AbstractMX
{

    @XmlElement(name = "RedBlkOrdrCxlReq", required = true)
    protected RedemptionBulkOrderCancellationRequestV04 redBlkOrdrCxlReq;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, CancellationReason32Choice.class, CopyInformation4 .class, GenericIdentification1 .class, GenericIdentification30 .class, InvestmentFundOrder9 .class, MessageIdentification1 .class, MxSetr00200104 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, RedemptionBulkOrderCancellationRequestV04 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.002.001.04";

    public MxSetr00200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00200104(final String xml) {
        this();
        MxSetr00200104 tmp = parse(xml);
        redBlkOrdrCxlReq = tmp.getRedBlkOrdrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redBlkOrdrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionBulkOrderCancellationRequestV04 }
     *     
     */
    public RedemptionBulkOrderCancellationRequestV04 getRedBlkOrdrCxlReq() {
        return redBlkOrdrCxlReq;
    }

    /**
     * Sets the value of the redBlkOrdrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionBulkOrderCancellationRequestV04 }
     *     
     */
    public MxSetr00200104 setRedBlkOrdrCxlReq(RedemptionBulkOrderCancellationRequestV04 value) {
        this.redBlkOrdrCxlReq = value;
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
    public static MxSetr00200104 parse(String xml) {
        return ((MxSetr00200104) MxReadImpl.parse(MxSetr00200104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00200104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00200104) parserImpl.read(MxSetr00200104 .class, xml, _classes));
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
     * Creates an MxSetr00200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00200104 message
     * @return
     *     a new instance of MxSetr00200104
     */
    public final static MxSetr00200104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr00200104 .class);
    }

}
