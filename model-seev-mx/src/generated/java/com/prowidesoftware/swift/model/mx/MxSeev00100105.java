
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
 * Class for seev.001.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.05")
public class MxSeev00100105
    extends AbstractMX
{

    @XmlElement(name = "MtgNtfctn", required = true)
    protected MeetingNotificationV05 mtgNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AdditionalRight1Code.class, AdditionalRightCode1Choice.class, AdditionalRightThreshold1Choice.class, AdditionalRights2 .class, AddressType2Code.class, AgentRole1Code.class, AmendInformation1 .class, CommunicationAddress4 .class, ContactIdentification1 .class, CorporateEventNarrative2 .class, DateAndDateTimeChoice.class, DateFormat1 .class, DateFormat29Choice.class, DateFormat3Choice.class, DateMode1Code.class, DateType1Code.class, EligiblePosition5 .class, Entitlement1Choice.class, EntitlementAssessment3 .class, GenericIdentification13 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification4 .class, HoldingBalance7 .class, IdentificationSource3Choice.class, IncentivePremium3 .class, IncentivePremiumType1Choice.class, IndividualPerson25 .class, IssuerAgent2 .class, IssuerInformation2 .class, LocationFormat1Choice.class, LongPostalAddress2Choice.class, Meeting4 .class, MeetingContactPerson2 .class, MeetingDateStatus1Code.class, MeetingNotice4 .class, MeetingNotificationV05 .class, MeetingType3Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MxSeev00100105 .class, NameAndAddress5 .class, NamePrefix1Code.class, NotificationStatus2 .class, NotificationStatus2Code.class, OtherIdentification1 .class, PartyIdentification40Choice.class, PersonIdentification6 .class, PersonIdentificationType1Choice.class, PlaceType1Code.class, PostalAddress1 .class, PowerOfAttorneyLegalisation1Code.class, PowerOfAttorneyRequirements3 .class, PriceRateOrAmountChoice.class, Proxy2Choice.class, Proxy5 .class, ProxyAppointmentInformation3 .class, ProxyNotAllowedCode.class, ProxyType2Code.class, QuorumQuantity1Choice.class, Resolution3 .class, ResolutionStatus1Code.class, ResolutionType2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesEntryType2Code.class, SecurityIdentification14 .class, SecurityPosition8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnitOrFaceAmount1Choice.class, VoteInstruction1Code.class, VoteInstruction2Code.class, VoteMethods2 .class, VoteParameters4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.05";

    public MxSeev00100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00100105(final String xml) {
        this();
        MxSeev00100105 tmp = parse(xml);
        mtgNtfctn = tmp.getMtgNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotificationV05 }
     *     
     */
    public MeetingNotificationV05 getMtgNtfctn() {
        return mtgNtfctn;
    }

    /**
     * Sets the value of the mtgNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotificationV05 }
     *     
     */
    public MxSeev00100105 setMtgNtfctn(MeetingNotificationV05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev00100105 parse(String xml) {
        return ((MxSeev00100105) MxReadImpl.parse(MxSeev00100105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00100105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00100105) parserImpl.read(MxSeev00100105 .class, xml, _classes));
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
     * Creates an MxSeev00100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00100105 message
     * @return
     *     a new instance of MxSeev00100105
     */
    public final static MxSeev00100105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00100105 .class);
    }

}
