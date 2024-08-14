
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
 * Class for sese.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInstrStsRptV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.011.001.02")
public class MxSese01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInstrStsRptV02", required = true)
    protected TransferInstructionStatusReportV02 trfInstrStsRptV02;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference3 .class, AddressType2Code.class, CancellationPendingStatus1 .class, CancelledStatus3 .class, CancelledStatusReason3Code.class, Extension1 .class, FailedSettlementStatus1 .class, GenericIdentification1 .class, InRepairStatus3 .class, MessageIdentification1 .class, MxSese01100102 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification2Choice.class, PendingSettlementStatus2 .class, PendingSettlementStatusReason2Code.class, PostalAddress1 .class, RejectedStatus8Choice.class, ReversedStatus1 .class, TransferInstructionStatus2 .class, TransferInstructionStatusReportV02 .class, TransferRejectedStatusReason2Code.class, TransferStatus2Code.class, TransferStatusAndReason2 .class, TransferUnmatchedReason2Code.class, TransferUnmatchedStatus2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.011.001.02";

    public MxSese01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01100102(final String xml) {
        this();
        MxSese01100102 tmp = parse(xml);
        trfInstrStsRptV02 = tmp.getTrfInstrStsRptV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInstrStsRptV02 property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInstructionStatusReportV02 }
     *     
     */
    public TransferInstructionStatusReportV02 getTrfInstrStsRptV02() {
        return trfInstrStsRptV02;
    }

    /**
     * Sets the value of the trfInstrStsRptV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInstructionStatusReportV02 }
     *     
     */
    public MxSese01100102 setTrfInstrStsRptV02(TransferInstructionStatusReportV02 value) {
        this.trfInstrStsRptV02 = value;
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
    public static MxSese01100102 parse(String xml) {
        return ((MxSese01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01100102 parse(String xml, MxRead parserImpl) {
        return ((MxSese01100102) parserImpl.read(MxSese01100102 .class, xml, _classes));
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
     * Creates an MxSese01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01100102 message
     * @return
     *     a new instance of MxSese01100102
     */
    public static final MxSese01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01100102 .class);
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
