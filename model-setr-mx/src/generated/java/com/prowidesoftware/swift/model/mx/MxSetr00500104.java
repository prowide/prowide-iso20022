
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
 * Class for setr.005.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redOrdrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.005.001.04")
public class MxSetr00500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RedOrdrCxlReq", required = true)
    protected RedemptionOrderCancellationRequestV04 redOrdrCxlReq;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, CancellationReason32Choice.class, CopyInformation4 .class, GenericIdentification1 .class, GenericIdentification30 .class, InvestmentFundOrder9 .class, MessageIdentification1 .class, MxSetr00500104 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, RedemptionOrderCancellationRequestV04 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.005.001.04";

    public MxSetr00500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00500104(final String xml) {
        this();
        MxSetr00500104 tmp = parse(xml);
        redOrdrCxlReq = tmp.getRedOrdrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redOrdrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrderCancellationRequestV04 }
     *     
     */
    public RedemptionOrderCancellationRequestV04 getRedOrdrCxlReq() {
        return redOrdrCxlReq;
    }

    /**
     * Sets the value of the redOrdrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrderCancellationRequestV04 }
     *     
     */
    public MxSetr00500104 setRedOrdrCxlReq(RedemptionOrderCancellationRequestV04 value) {
        this.redOrdrCxlReq = value;
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
    public static MxSetr00500104 parse(String xml) {
        return ((MxSetr00500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr00500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr00500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00500104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00500104) parserImpl.read(MxSetr00500104 .class, xml, _classes));
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
     * Creates an MxSetr00500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00500104 message
     * @return
     *     a new instance of MxSetr00500104
     */
    public static final MxSetr00500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr00500104 .class);
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
