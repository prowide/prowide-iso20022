
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
 * Class for seev.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.04")
public class MxSeev00100104
    extends AbstractMX
{

    @XmlElement(name = "MtgNtfctn", required = true)
    protected MeetingNotificationV04 mtgNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AdditionalRight1Code.class, AdditionalRightCode1Choice.class, AdditionalRightThreshold1Choice.class, AdditionalRights1 .class, AddressType2Code.class, AgentRole1Code.class, AlternateIdentification1 .class, AmendInformation1 .class, CommunicationAddress4 .class, ContactIdentification1 .class, CorporateEventNarrative2 .class, DateFormat2Choice.class, DateFormat3Choice.class, DateType1Code.class, EligiblePosition3 .class, Entitlement1Choice.class, EntitlementAssessment2 .class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, GenericIdentification5 .class, HoldingBalance6 .class, IdentificationSource1Choice.class, IncentivePremium3 .class, IncentivePremiumType1Choice.class, IndividualPerson16 .class, IssuerAgent1 .class, IssuerInformation1 .class, LocationFormat1Choice.class, LongPostalAddress2Choice.class, Meeting3 .class, MeetingContactPerson1 .class, MeetingDateStatus1Code.class, MeetingNotice3 .class, MeetingNotificationV04 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00100104 .class, NameAndAddress5 .class, NamePrefix1Code.class, NotificationStatus1 .class, NotificationStatus2Code.class, PartyIdentification3 .class, PartyIdentification9Choice.class, PersonIdentification6 .class, PersonIdentificationType1Choice.class, PlaceType1Code.class, PostalAddress1 .class, PowerOfAttorneyLegalisation1Code.class, PowerOfAttorneyRequirements2 .class, PriceRateOrAmountChoice.class, Proxy1Choice.class, Proxy3 .class, ProxyAppointmentInformation2 .class, ProxyNotAllowedCode.class, ProxyType2Code.class, QuorumQuantity1Choice.class, Resolution2 .class, ResolutionStatus1Code.class, ResolutionType1Code.class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SecurityPosition6 .class, UnitOrFaceAmount1Choice.class, VoteInstruction1Code.class, VoteInstruction2Code.class, VoteMethods2 .class, VoteParameters3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.04";

    public MxSeev00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00100104(final String xml) {
        this();
        MxSeev00100104 tmp = parse(xml);
        mtgNtfctn = tmp.getMtgNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotificationV04 }
     *     
     */
    public MeetingNotificationV04 getMtgNtfctn() {
        return mtgNtfctn;
    }

    /**
     * Sets the value of the mtgNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotificationV04 }
     *     
     */
    public MxSeev00100104 setMtgNtfctn(MeetingNotificationV04 value) {
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
    public static MxSeev00100104 parse(String xml) {
        return ((MxSeev00100104) MxReadImpl.parse(MxSeev00100104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00100104 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00100104) parserImpl.read(MxSeev00100104 .class, xml, _classes));
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
     * Creates an MxSeev00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00100104 message
     * @return
     *     a new instance of MxSeev00100104
     */
    public final static MxSeev00100104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00100104 .class);
    }

}
