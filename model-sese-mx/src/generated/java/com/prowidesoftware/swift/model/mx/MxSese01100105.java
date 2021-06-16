
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
 * Class for sese.011.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.011.001.05")
public class MxSese01100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInstrStsRpt", required = true)
    protected TransferInstructionStatusReportV05 trfInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference6 .class, AdditionalReference7 .class, AddressType2Code.class, CancellationPendingStatus7Choice.class, CancelledStatus13Choice.class, CancelledStatusReason3Code.class, Extension1 .class, FailedSettlementStatus2Choice.class, GenericIdentification1 .class, GenericIdentification36 .class, InRepairStatus4Choice.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01100105 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification70Choice.class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PendingSettlementStatus3Choice.class, PendingSettlementStatusReason2Code.class, PostalAddress1 .class, References49Choice.class, RejectedReason15Choice.class, RejectionReason32 .class, ReversedStatus2Choice.class, TransferInstructionStatus4 .class, TransferInstructionStatusReportV05 .class, TransferRejectedStatusReason2Code.class, TransferStatus2Choice.class, TransferStatus4Code.class, TransferStatusAndReason4 .class, TransferUnmatchedReason2Code.class, TransferUnmatchedStatus3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.011.001.05";

    public MxSese01100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100105(final String xml) {
        this();
        MxSese01100105 tmp = parse(xml);
        trfInstrStsRpt = tmp.getTrfInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV05 }
     *     
     */
    public TransferInstructionStatusReportV05 getTrfInstrStsRpt() {
        return trfInstrStsRpt;
    }

    /**
     * Sets the value of the trfInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV05 }
     *     
     */
    public MxSese01100105 setTrfInstrStsRpt(TransferInstructionStatusReportV05 value) {
        this.trfInstrStsRpt = value;
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
    public static MxSese01100105 parse(String xml) {
        return ((MxSese01100105) MxReadImpl.parse(MxSese01100105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100105 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100105) parserImpl.read(MxSese01100105 .class, xml, _classes));
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
     * Creates an MxSese01100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100105 message
     * @return
     *     a new instance of MxSese01100105
     */
    public final static MxSese01100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01100105 .class);
    }

}
