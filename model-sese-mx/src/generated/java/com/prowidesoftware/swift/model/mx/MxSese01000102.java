
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
 * Class for sese.010.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfCxlStsRptV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.010.001.02")
public class MxSese01000102
    extends AbstractMX
{

    @XmlElement(name = "TrfCxlStsRptV02", required = true)
    protected TransferCancellationStatusReportV02 trfCxlStsRptV02;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference3 .class, AddressType2Code.class, CancellationRejectedReason1Code.class, CancellationStatus2Code.class, CancellationStatusAndReason2 .class, CancelledStatusReason1Code.class, Extension1 .class, GenericIdentification1 .class, MessageIdentification1 .class, MxSese01000102 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, TransferCancellationCompleteStatusAndReason1 .class, TransferCancellationPendingStatus1 .class, TransferCancellationRejectedStatus1 .class, TransferCancellationStatus2 .class, TransferCancellationStatusReportV02 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.010.001.02";

    public MxSese01000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01000102(final String xml) {
        this();
        MxSese01000102 tmp = parse(xml);
        trfCxlStsRptV02 = tmp.getTrfCxlStsRptV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfCxlStsRptV02 property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatusReportV02 }
     *     
     */
    public TransferCancellationStatusReportV02 getTrfCxlStsRptV02() {
        return trfCxlStsRptV02;
    }

    /**
     * Sets the value of the trfCxlStsRptV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatusReportV02 }
     *     
     */
    public MxSese01000102 setTrfCxlStsRptV02(TransferCancellationStatusReportV02 value) {
        this.trfCxlStsRptV02 = value;
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
    public static MxSese01000102 parse(String xml) {
        return ((MxSese01000102) MxReadImpl.parse(MxSese01000102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01000102 parse(String xml, MxRead parserImpl) {
        return ((MxSese01000102) parserImpl.read(MxSese01000102 .class, xml, _classes));
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
     * Creates an MxSese01000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01000102 message
     * @return
     *     a new instance of MxSese01000102
     */
    public final static MxSese01000102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01000102 .class);
    }

}
