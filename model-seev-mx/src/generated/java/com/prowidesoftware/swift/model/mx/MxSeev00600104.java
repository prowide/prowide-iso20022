
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
 * Class for seev.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstrSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.04")
public class MxSeev00600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstrSts", required = true)
    protected MeetingInstructionStatusV04 mtgInstrSts;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalStatus1 .class, AdditionalStatus2 .class, AddressType2Code.class, AlternateIdentification1 .class, CancellationProcessingStatus1 .class, CancellationRejectionStatus1Choice.class, CancellationStatus2Choice.class, CancellationStatus3Code.class, DetailedInstructionStatus8 .class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification1 .class, GenericIdentification13 .class, IdentificationSource1Choice.class, InstructionProcessingStatus1 .class, InstructionRejectionStatus1Choice.class, InstructionStatus3Choice.class, InstructionStatus4Choice.class, InstructionType1Choice.class, InstructionTypeStatus1Choice.class, MeetingInstructionStatusV04 .class, MeetingReference4 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00600104 .class, NameAndAddress5 .class, PartyIdentification9Choice.class, PostalAddress1 .class, RejectionReason1Code.class, RejectionReason2Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, Status3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.04";

    public MxSeev00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00600104(final String xml) {
        this();
        MxSeev00600104 tmp = parse(xml);
        mtgInstrSts = tmp.getMtgInstrSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionStatusV04 }
     *     
     */
    public MeetingInstructionStatusV04 getMtgInstrSts() {
        return mtgInstrSts;
    }

    /**
     * Sets the value of the mtgInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionStatusV04 }
     *     
     */
    public MxSeev00600104 setMtgInstrSts(MeetingInstructionStatusV04 value) {
        this.mtgInstrSts = value;
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
    public static MxSeev00600104 parse(String xml) {
        return ((MxSeev00600104) MxReadImpl.parse(MxSeev00600104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00600104 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00600104) parserImpl.read(MxSeev00600104 .class, xml, _classes));
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
     * Creates an MxSeev00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00600104 message
     * @return
     *     a new instance of MxSeev00600104
     */
    public final static MxSeev00600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00600104 .class);
    }

}
