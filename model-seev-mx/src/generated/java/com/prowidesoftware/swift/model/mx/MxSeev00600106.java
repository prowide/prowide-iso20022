
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
 * Class for seev.006.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstrSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.06")
public class MxSeev00600106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstrSts", required = true)
    protected MeetingInstructionStatusV06 mtgInstrSts;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, CancellationProcessingStatus2 .class, CancellationStatus26Choice.class, CancellationStatus27Choice.class, CancellationStatus6Code.class, DetailedInstructionCancellationStatus14 .class, DetailedInstructionStatus12 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, InstructionProcessingStatus4 .class, InstructionStatus7Choice.class, InstructionStatus8Choice.class, InstructionType2Choice.class, InstructionTypeStatus3Choice.class, MeetingInstructionStatusV06 .class, MeetingReference8 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00600106 .class, NameAndAddress5 .class, NaturalPersonIdentification1 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification222 .class, PartyIdentification224 .class, PartyIdentification225 .class, PartyIdentification226Choice.class, PartyIdentification227Choice.class, PendingCancellationReason6Code.class, PendingCancellationReason7Choice.class, PendingCancellationStatus10Choice.class, PendingCancellationStatusReason10 .class, PendingReason16Code.class, PendingReason51Choice.class, PendingStatus55Choice.class, PendingStatusReason16 .class, PersonName1 .class, PersonName2 .class, PostalAddress1 .class, PostalAddress26 .class, RejectedReason28Choice.class, RejectedReason29Choice.class, RejectedStatus30Choice.class, RejectedStatus31Choice.class, RejectedStatusReason27 .class, RejectedStatusReason28 .class, RejectionReason50Code.class, RejectionReason51Code.class, SecurityIdentification19 .class, Status8Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.06";

    public MxSeev00600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00600106(final String xml) {
        this();
        MxSeev00600106 tmp = parse(xml);
        mtgInstrSts = tmp.getMtgInstrSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionStatusV06 }
     *     
     */
    public MeetingInstructionStatusV06 getMtgInstrSts() {
        return mtgInstrSts;
    }

    /**
     * Sets the value of the mtgInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionStatusV06 }
     *     
     */
    public MxSeev00600106 setMtgInstrSts(MeetingInstructionStatusV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev00600106 parse(String xml) {
        return ((MxSeev00600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00600106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00600106 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00600106) parserImpl.read(MxSeev00600106 .class, xml, _classes));
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
     * Creates an MxSeev00600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00600106 message
     * @return
     *     a new instance of MxSeev00600106
     */
    public final static MxSeev00600106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00600106 .class);
    }

}
