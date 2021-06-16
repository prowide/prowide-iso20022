
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
 * Class for seev.006.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstrSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.05")
public class MxSeev00600105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstrSts", required = true)
    protected MeetingInstructionStatusV05 mtgInstrSts;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalStatus1 .class, AdditionalStatus2 .class, AddressType2Code.class, CancellationProcessingStatus1 .class, CancellationRejectionStatus1Choice.class, CancellationStatus2Choice.class, CancellationStatus3Code.class, DetailedInstructionStatus11 .class, GenericIdentification13 .class, IdentificationSource3Choice.class, InstructionProcessingStatus3 .class, InstructionRejectionStatus1Choice.class, InstructionStatus5Choice.class, InstructionStatus6Choice.class, InstructionType1Choice.class, InstructionTypeStatus2Choice.class, MeetingInstructionStatusV05 .class, MeetingReference7 .class, MeetingType3Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MxSeev00600105 .class, OtherIdentification1 .class, PostalAddress1 .class, RejectionReason1Code.class, RejectionReason2Code.class, SecurityIdentification14 .class, Status7Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.05";

    public MxSeev00600105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00600105(final String xml) {
        this();
        MxSeev00600105 tmp = parse(xml);
        mtgInstrSts = tmp.getMtgInstrSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00600105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionStatusV05 }
     *     
     */
    public MeetingInstructionStatusV05 getMtgInstrSts() {
        return mtgInstrSts;
    }

    /**
     * Sets the value of the mtgInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionStatusV05 }
     *     
     */
    public MxSeev00600105 setMtgInstrSts(MeetingInstructionStatusV05 value) {
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
    public static MxSeev00600105 parse(String xml) {
        return ((MxSeev00600105) MxReadImpl.parse(MxSeev00600105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00600105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00600105) parserImpl.read(MxSeev00600105 .class, xml, _classes));
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
     * Creates an MxSeev00600105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00600105 message
     * @return
     *     a new instance of MxSeev00600105
     */
    public final static MxSeev00600105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00600105 .class);
    }

}
