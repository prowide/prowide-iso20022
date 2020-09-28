
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
 * Class for sese.011.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.011.001.04")
public class MxSese01100104
    extends AbstractMX
{

    @XmlElement(name = "TrfInstrStsRpt", required = true)
    protected TransferInstructionStatusReportV04 trfInstrStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference2 .class, AdditionalReference3 .class, AddressType2Code.class, CancellationPendingStatus1 .class, CancelledStatus3 .class, CancelledStatusReason3Code.class, Extension1 .class, FailedSettlementStatus1 .class, GenericIdentification1 .class, InRepairStatus3 .class, LongPostalAddress1Choice.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01100104 .class, NameAndAddress2 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification1Choice.class, PartyIdentification2Choice.class, PendingSettlementStatus2 .class, PendingSettlementStatusReason2Code.class, PostalAddress1 .class, References40Choice.class, RejectedStatus8Choice.class, ReversedStatus1 .class, StructuredLongPostalAddress1 .class, TransferInstructionStatus3 .class, TransferInstructionStatusReportV04 .class, TransferRejectedStatusReason2Code.class, TransferStatus1Choice.class, TransferStatus3Code.class, TransferStatusAndReason3 .class, TransferUnmatchedReason2Code.class, TransferUnmatchedStatus2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.011.001.04";

    public MxSese01100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100104(final String xml) {
        this();
        MxSese01100104 tmp = parse(xml);
        trfInstrStsRpt = tmp.getTrfInstrStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV04 }
     *     
     */
    public TransferInstructionStatusReportV04 getTrfInstrStsRpt() {
        return trfInstrStsRpt;
    }

    /**
     * Sets the value of the trfInstrStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV04 }
     *     
     */
    public MxSese01100104 setTrfInstrStsRpt(TransferInstructionStatusReportV04 value) {
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
    public static MxSese01100104 parse(String xml) {
        return ((MxSese01100104) MxReadImpl.parse(MxSese01100104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100104 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100104) parserImpl.read(MxSese01100104 .class, xml, _classes));
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
     * Creates an MxSese01100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100104 message
     * @return
     *     a new instance of MxSese01100104
     */
    public final static MxSese01100104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01100104 .class);
    }

}
