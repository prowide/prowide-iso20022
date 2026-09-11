
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for seev.004.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.11")
public class MxSeev00400111
    extends AbstractMX
{

    @XmlElement(name = "MtgInstr", required = true)
    protected MeetingInstructionV11 mtgInstr;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification84Choice.class, AddressType2Code.class, AttendanceCard3 .class, DateAndPlaceOfBirth2 .class, DateFormat1 .class, DateFormat3Choice.class, DateMode1Code.class, DateType1Code.class, DeliveryPlace3Code.class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentNumber5Choice.class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity46Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldingBalance15 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, IndividualPerson41 .class, IndividualPerson42 .class, Instruction9 .class, InvestorClassificationType1Code.class, InvestorTypeIdentification1 .class, LongPostalAddress2Choice.class, MeetingInstructionCancellation1 .class, MeetingInstructionIdentification1 .class, MeetingInstructionV11 .class, MeetingReference11 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00400111 .class, NameAndAddress5 .class, NameAndAddress9 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, OtherIdentification1 .class, Pagination1 .class, ParticipationMethod3Choice.class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification231Choice.class, PartyIdentification232Choice.class, PartyIdentification238 .class, PartyIdentification264Choice.class, PartyIdentification335Choice.class, PartyIdentification336Choice.class, PartyIdentification338 .class, PartyIdentification341 .class, PartyIdentification342 .class, PartyRole3Code.class, PersonName2 .class, PersonName3 .class, PledgeInformation1 .class, PostalAddress1 .class, PostalAddress26 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryVote1 .class, Proxy12 .class, ProxyType3Code.class, Quantity1Code.class, QuantityOrCode1Choice.class, SafekeepingAccount20 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesEntryType2Code.class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat15 .class, SpecificInstructionRequest4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThirdPartyIdentification1 .class, TypeOfIdentification4Code.class, Vote15 .class, Vote17Choice.class, Vote18Choice.class, Vote21 .class, VoteDetails7 .class, VoteInstruction6Code.class, VoteInstruction7Code.class, VoteInstructionForMeetingResolution3Choice.class, VoteInstructionType1Choice.class, VoteInstructionType2Choice.class, VoteInstructionType3Choice.class, VotingParticipationMethod2Code.class, VotingParticipationMethod3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.11";

    public MxSeev00400111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00400111(final String xml) {
        this();
        MxSeev00400111 tmp = parse(xml);
        mtgInstr = tmp.getMtgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00400111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionV11 }
     *     
     */
    public MeetingInstructionV11 getMtgInstr() {
        return mtgInstr;
    }

    /**
     * Sets the value of the mtgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionV11 }
     *     
     */
    public MxSeev00400111 setMtgInstr(MeetingInstructionV11 value) {
        this.mtgInstr = value;
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
    public static MxSeev00400111 parse(String xml) {
        return ((MxSeev00400111) MxReadImpl.parse(MxSeev00400111 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00400111 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00400111) MxReadImpl.parse(MxSeev00400111 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00400111 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00400111) parserImpl.read(MxSeev00400111 .class, xml, _classes));
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
     * Creates an MxSeev00400111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00400111 message
     * @return
     *     a new instance of MxSeev00400111
     */
    public static final MxSeev00400111 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00400111 .class);
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
