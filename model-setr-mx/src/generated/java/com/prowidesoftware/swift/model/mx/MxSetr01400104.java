
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
 * Class for setr.014.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "swtchOrdrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.014.001.04")
public class MxSetr01400104
    extends AbstractMX
{

    @XmlElement(name = "SwtchOrdrCxlReq", required = true)
    protected SwitchOrderCancellationRequestV04 swtchOrdrCxlReq;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, CancellationReason32Choice.class, CopyInformation4 .class, GenericIdentification1 .class, GenericIdentification30 .class, InvestmentFundOrder9 .class, MessageIdentification1 .class, MxSetr01400104 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PostalAddress1 .class, SwitchOrderCancellationRequestV04 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.014.001.04";

    public MxSetr01400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01400104(final String xml) {
        this();
        MxSetr01400104 tmp = parse(xml);
        swtchOrdrCxlReq = tmp.getSwtchOrdrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the swtchOrdrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrderCancellationRequestV04 }
     *     
     */
    public SwitchOrderCancellationRequestV04 getSwtchOrdrCxlReq() {
        return swtchOrdrCxlReq;
    }

    /**
     * Sets the value of the swtchOrdrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrderCancellationRequestV04 }
     *     
     */
    public MxSetr01400104 setSwtchOrdrCxlReq(SwitchOrderCancellationRequestV04 value) {
        this.swtchOrdrCxlReq = value;
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
    public static MxSetr01400104 parse(String xml) {
        return ((MxSetr01400104) MxReadImpl.parse(MxSetr01400104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01400104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01400104) parserImpl.read(MxSetr01400104 .class, xml, _classes));
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
     * Creates an MxSetr01400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01400104 message
     * @return
     *     a new instance of MxSetr01400104
     */
    public final static MxSetr01400104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr01400104 .class);
    }

}
