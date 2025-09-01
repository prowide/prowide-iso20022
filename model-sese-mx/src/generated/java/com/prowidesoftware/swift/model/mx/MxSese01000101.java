
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
 * Class for sese.010.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sese01000101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.010.001.01")
public class MxSese01000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "sese.010.001.01", required = true)
    protected Sese01000101 sese01000101;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference2 .class, CancellationCompleteStatusReason1Code.class, CancellationRejectedReason1Code.class, CancellationStatus1Code.class, CancellationStatusAndReason.class, GenericIdentification1 .class, LongPostalAddress1Choice.class, MxSese01000101 .class, NameAndAddress2 .class, PartyIdentification1Choice.class, Sese01000101 .class, StructuredLongPostalAddress1 .class, TransferCancellationCompleteReason1 .class, TransferCancellationCompleteStatusChoice.class, TransferCancellationRejectedStatus1Choice.class, TransferCancellationRejectionReason1 .class, TransferCancellationStatus.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.010.001.01";

    public MxSese01000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01000101(final String xml) {
        this();
        MxSese01000101 tmp = parse(xml);
        sese01000101 = tmp.getSese01000101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sese01000101 property.
     * 
     * @return
     *     possible object is
     *     {@link Sese01000101 }
     *     
     */
    public Sese01000101 getSese01000101() {
        return sese01000101;
    }

    /**
     * Sets the value of the sese01000101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sese01000101 }
     *     
     */
    public MxSese01000101 setSese01000101(Sese01000101 value) {
        this.sese01000101 = value;
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
    public static MxSese01000101 parse(String xml) {
        return ((MxSese01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01000101 parse(String xml, MxRead parserImpl) {
        return ((MxSese01000101) parserImpl.read(MxSese01000101 .class, xml, _classes));
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
     * Creates an MxSese01000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01000101 message
     * @return
     *     a new instance of MxSese01000101
     */
    public final static MxSese01000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01000101 .class);
    }

}
