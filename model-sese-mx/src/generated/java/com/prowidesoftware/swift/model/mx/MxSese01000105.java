
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
 * Class for sese.010.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfCxlStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.010.001.05")
public class MxSese01000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfCxlStsRpt", required = true)
    protected TransferCancellationStatusReportV05 trfCxlStsRpt;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference6 .class, AdditionalReference7 .class, AddressType2Code.class, CancellationCompleteReason1Choice.class, CancellationRejectedReason1Code.class, CancellationStatus2Code.class, CancellationStatusAndReason3 .class, CancelledCompleteReason1 .class, CancelledStatusReason1Code.class, Extension1 .class, GenericIdentification1 .class, GenericIdentification36 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01000105 .class, NameAndAddress5 .class, PartyIdentification70Choice.class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PostalAddress1 .class, References49Choice.class, RejectedReason17Choice.class, RejectionReason33 .class, Status21Choice.class, TransferCancellationPendingStatus1 .class, TransferCancellationStatus2 .class, TransferCancellationStatusReportV05 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.010.001.05";

    public MxSese01000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01000105(final String xml) {
        this();
        MxSese01000105 tmp = parse(xml);
        trfCxlStsRpt = tmp.getTrfCxlStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfCxlStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatusReportV05 }
     *     
     */
    public TransferCancellationStatusReportV05 getTrfCxlStsRpt() {
        return trfCxlStsRpt;
    }

    /**
     * Sets the value of the trfCxlStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatusReportV05 }
     *     
     */
    public MxSese01000105 setTrfCxlStsRpt(TransferCancellationStatusReportV05 value) {
        this.trfCxlStsRpt = value;
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
    public static MxSese01000105 parse(String xml) {
        return ((MxSese01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01000105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01000105 parse(String xml, MxRead parserImpl) {
        return ((MxSese01000105) parserImpl.read(MxSese01000105 .class, xml, _classes));
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
     * Creates an MxSese01000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01000105 message
     * @return
     *     a new instance of MxSese01000105
     */
    public static final MxSese01000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01000105 .class);
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
