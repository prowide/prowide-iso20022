
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.030.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctyDeltnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.030.001.01")
public class MxReda03000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctyDeltnStsAdvc", required = true)
    protected SecurityDeletionStatusAdviceV01 sctyDeltnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 30;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {GenericIdentification30 .class, IdentificationSource3Choice.class, MessageHeader12 .class, MxReda03000101 .class, NoReasonCode.class, OriginalBusinessInstruction1 .class, OtherIdentification1 .class, ProcessingStatus72Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Reason18Choice.class, Reason4 .class, SecurityDeletionStatusAdviceV01 .class, SecurityIdentification39 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.030.001.01";

    public MxReda03000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda03000101(final String xml) {
        this();
        MxReda03000101 tmp = parse(xml);
        sctyDeltnStsAdvc = tmp.getSctyDeltnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda03000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctyDeltnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDeletionStatusAdviceV01 }
     *     
     */
    public SecurityDeletionStatusAdviceV01 getSctyDeltnStsAdvc() {
        return sctyDeltnStsAdvc;
    }

    /**
     * Sets the value of the sctyDeltnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDeletionStatusAdviceV01 }
     *     
     */
    public MxReda03000101 setSctyDeltnStsAdvc(SecurityDeletionStatusAdviceV01 value) {
        this.sctyDeltnStsAdvc = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxReda03000101 parse(String xml) {
        return ((MxReda03000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda03000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda03000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda03000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda03000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda03000101 parse(String xml, MxRead parserImpl) {
        return ((MxReda03000101) parserImpl.read(MxReda03000101 .class, xml, _classes));
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
     * Creates an MxReda03000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda03000101 message
     * @return
     *     a new instance of MxReda03000101
     */
    public final static MxReda03000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda03000101 .class);
    }

}
