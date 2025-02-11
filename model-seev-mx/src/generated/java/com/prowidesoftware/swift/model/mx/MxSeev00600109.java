
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
 * Class for seev.006.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstrSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.09")
public class MxSeev00600109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstrSts", required = true)
    protected MeetingInstructionStatusV09 mtgInstrSts;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, CancellationProcessingStatus2 .class, CancellationStatus26Choice.class, CancellationStatus27Choice.class, CancellationStatus6Code.class, DateAndPlaceOfBirth2 .class, DetailedInstructionCancellationStatus14 .class, DetailedInstructionStatus16 .class, EligiblePosition17 .class, FinancialInstrumentQuantity45Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, HoldingBalance13 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, InstructionProcessingStatus5 .class, InstructionStatus11Choice.class, InstructionType2Choice.class, InstructionTypeStatus5Choice.class, MeetingInstructionStatusV09 .class, MeetingReference10 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00600109 .class, NameAndAddress5 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NoReasonCode.class, OtherIdentification1 .class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification222 .class, PartyIdentification224 .class, PartyIdentification226Choice.class, PartyIdentification231Choice.class, PartyIdentification238 .class, PartyIdentification246Choice.class, PartyIdentification250 .class, PartyIdentification269 .class, PendingCancellationReason6Code.class, PendingCancellationReason7Choice.class, PendingCancellationStatus10Choice.class, PendingCancellationStatusReason10 .class, PendingReason16Code.class, PendingReason51Choice.class, PendingStatus55Choice.class, PendingStatusReason16 .class, PersonName1 .class, PersonName2 .class, PersonName3 .class, PostalAddress1 .class, PostalAddress26 .class, RejectedReason29Choice.class, RejectedReason44Choice.class, RejectedStatus31Choice.class, RejectedStatus44Choice.class, RejectedStatusReason28 .class, RejectedStatusReason42 .class, RejectionReason51Code.class, RejectionReason65Code.class, SecuritiesEntryType3Code.class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat14 .class, Status9Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.09";

    public MxSeev00600109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00600109(final String xml) {
        this();
        MxSeev00600109 tmp = parse(xml);
        mtgInstrSts = tmp.getMtgInstrSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00600109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionStatusV09 }
     *     
     */
    public MeetingInstructionStatusV09 getMtgInstrSts() {
        return mtgInstrSts;
    }

    /**
     * Sets the value of the mtgInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionStatusV09 }
     *     
     */
    public MxSeev00600109 setMtgInstrSts(MeetingInstructionStatusV09 value) {
        this.mtgInstrSts = value;
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
    public static MxSeev00600109 parse(String xml) {
        return ((MxSeev00600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00600109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00600109 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00600109) parserImpl.read(MxSeev00600109 .class, xml, _classes));
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
     * Creates an MxSeev00600109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00600109 message
     * @return
     *     a new instance of MxSeev00600109
     */
    public static final MxSeev00600109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00600109 .class);
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
