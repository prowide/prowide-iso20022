
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
 * Class for seev.001.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.11")
public class MxSeev00100111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgNtfctn", required = true)
    protected MeetingNotificationV11 mtgNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AdditionalRight1Code.class, AdditionalRightCode1Choice.class, AdditionalRightThreshold1Choice.class, AdditionalRights3 .class, AddressType2Code.class, AgentRole1Code.class, Attendance2 .class, AttendanceAdmissionConditions2 .class, AttendanceAdmissionConditions2Code.class, CommunicationAddress11 .class, CommunicationAddress12 .class, ContactIdentification1 .class, CorporateEventNarrative4 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth2 .class, DateCode34Choice.class, DateFormat1 .class, DateFormat3Choice.class, DateFormat58Choice.class, DateFormat60Choice.class, DateMode1Code.class, DateType10Code.class, DateType1Code.class, EligiblePosition13 .class, Entitlement1Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, EventStatus1 .class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity45Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldingBalance11 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, IncentivePremium5 .class, IncentivePremiumType2Choice.class, IndividualPerson43 .class, IssuerAgent3 .class, IssuerInformation3 .class, ItemDescription2 .class, LanguageSpecifiedNarrative1 .class, LocationFormat1Choice.class, MailAddress1 .class, Meeting6 .class, MeetingContactPerson3 .class, MeetingDateStatus2Code.class, MeetingEventReference1 .class, MeetingEventReference1Choice.class, MeetingNotice8 .class, MeetingNotificationV11 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MxSeev00100111 .class, NameAndAddress5 .class, NamePrefix1Code.class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, NotificationGeneralInformation4 .class, NotificationType3Code.class, NotificationUpdate2 .class, NumberOrPercentage1Choice.class, OtherIdentification1 .class, Pagination1 .class, ParticipationMethod2 .class, ParticipationMethod3Choice.class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification231Choice.class, PartyIdentification232Choice.class, PartyIdentification238 .class, PartyIdentification246Choice.class, PartyIdentification250 .class, PartyIdentification269 .class, PersonName2 .class, PersonName3 .class, PlaceType1Code.class, PostalAddress1 .class, PostalAddress26 .class, PowerOfAttorneyLegalisation1Code.class, PowerOfAttorneyRequirements4 .class, PriceRateOrAmount3Choice.class, ProcessingPosition3Code.class, Proxy11 .class, Proxy5Choice.class, ProxyAppointmentInformation6 .class, ProxyNotAllowed1Code.class, ProxyType3Code.class, QuorumQuantity1Choice.class, Resolution7 .class, ResolutionStatus1Code.class, ResolutionType2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesEntryType2Code.class, SecurityIdentification19 .class, SecurityPosition16 .class, ShortLong1Code.class, SignedQuantityFormat14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ThresholdBasis1Choice.class, ThresholdBasis1Code.class, TypeOfIdentification4Code.class, VoteChannel1Code.class, VoteInstruction5Code.class, VoteInstruction6Code.class, VoteInstructionType1 .class, VoteInstructionType1Choice.class, VoteMethods5 .class, VoteParameters8 .class, VoteThroughNetwork1Choice.class, VoteType1Code.class, VoteTypeAndQuantity1 .class, VotingParticipationMethod3Code.class, VotingRightsThreshold1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.11";

    public MxSeev00100111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00100111(final String xml) {
        this();
        MxSeev00100111 tmp = parse(xml);
        mtgNtfctn = tmp.getMtgNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00100111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotificationV11 }
     *     
     */
    public MeetingNotificationV11 getMtgNtfctn() {
        return mtgNtfctn;
    }

    /**
     * Sets the value of the mtgNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotificationV11 }
     *     
     */
    public MxSeev00100111 setMtgNtfctn(MeetingNotificationV11 value) {
        this.mtgNtfctn = value;
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
    public static MxSeev00100111 parse(String xml) {
        return ((MxSeev00100111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00100111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00100111 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00100111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00100111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00100111 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00100111) parserImpl.read(MxSeev00100111 .class, xml, _classes));
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
     * Creates an MxSeev00100111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00100111 message
     * @return
     *     a new instance of MxSeev00100111
     */
    public final static MxSeev00100111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00100111 .class);
    }

}
