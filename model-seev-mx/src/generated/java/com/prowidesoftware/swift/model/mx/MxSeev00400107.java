
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
 * Class for seev.004.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.07")
public class MxSeev00400107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstr", required = true)
    protected MeetingInstructionV07 mtgInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AttendanceCard3 .class, DateAndPlaceOfBirth2 .class, DeliveryPlace3Code.class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentNumber5Choice.class, FinancialInstrumentQuantity18Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldingBalance10 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, IndividualPerson41 .class, IndividualPerson42 .class, Instruction5 .class, LongPostalAddress2Choice.class, MeetingInstructionV07 .class, MeetingReference10 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00400107 .class, NameAndAddress5 .class, NameAndAddress9 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, OtherIdentification1 .class, ParticipationMethod1Choice.class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification224 .class, PartyIdentification231Choice.class, PartyIdentification232Choice.class, PartyIdentification233Choice.class, PartyIdentification238 .class, PartyIdentification240 .class, PartyRole3Code.class, PersonName2 .class, PersonName3 .class, PledgeInformation1 .class, PostalAddress1 .class, PostalAddress26 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryVote1 .class, Proxy10 .class, ProxyType2Code.class, Quantity1Code.class, QuantityOrCode1Choice.class, SafekeepingAccount12 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesEntryType2Code.class, SecurityIdentification19 .class, SpecificInstructionRequest3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThirdPartyIdentification1 .class, TypeOfIdentification4Code.class, UnitOrFaceAmountOrCode2Choice.class, Vote14 .class, Vote15 .class, Vote15Choice.class, Vote16Choice.class, VoteDetails5 .class, VoteInstruction6Code.class, VoteInstruction7Code.class, VoteInstructionForMeetingResolution3Choice.class, VoteInstructionType1Choice.class, VoteInstructionType2Choice.class, VotingParticipationMethod1Code.class, VotingParticipationMethod2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.07";

    public MxSeev00400107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00400107(final String xml) {
        this();
        MxSeev00400107 tmp = parse(xml);
        mtgInstr = tmp.getMtgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00400107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionV07 }
     *     
     */
    public MeetingInstructionV07 getMtgInstr() {
        return mtgInstr;
    }

    /**
     * Sets the value of the mtgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionV07 }
     *     
     */
    public MxSeev00400107 setMtgInstr(MeetingInstructionV07 value) {
        this.mtgInstr = value;
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
    public static MxSeev00400107 parse(String xml) {
        return ((MxSeev00400107) MxReadImpl.parse(MxSeev00400107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00400107 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00400107) parserImpl.read(MxSeev00400107 .class, xml, _classes));
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
     * Creates an MxSeev00400107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00400107 message
     * @return
     *     a new instance of MxSeev00400107
     */
    public final static MxSeev00400107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00400107 .class);
    }

}
