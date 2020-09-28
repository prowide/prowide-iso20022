
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
 * Class for seev.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.02")
public class MxSeev00100102
    extends AbstractMX
{

    @XmlElement(name = "MtgNtfctn", required = true)
    protected MeetingNotificationV02 mtgNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AgentRole1Code.class, AlternateFinancialInstrumentIdentification1 .class, AmendInformation1 .class, CommunicationAddress4 .class, ContactIdentification1 .class, CurrencyAndAmount.class, DateFormat2Choice.class, DateFormat3Choice.class, DateType1Code.class, EligiblePosition2 .class, EntitlementAssessment1 .class, GenericIdentification1 .class, GenericIdentification4 .class, GenericIdentification5 .class, HoldingBalance3 .class, IncentivePremium2 .class, IndividualPerson14 .class, IssuerAgent1 .class, LocationFormat1Choice.class, Meeting2 .class, MeetingContactPerson1 .class, MeetingDateStatus1Code.class, MeetingNotice2 .class, MeetingNotificationV02 .class, MeetingType2Code.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00100102 .class, NameAndAddress5 .class, NamePrefix1Code.class, NotificationStatus1 .class, NotificationStatus2Code.class, PartyIdentification3 .class, PartyIdentification9Choice.class, PersonIdentification2 .class, PlaceType1Code.class, PostalAddress1 .class, PowerOfAttorneyLegalisation1Code.class, PowerOfAttorneyRequirements2 .class, PriceRateOrAmountChoice.class, Proxy1 .class, ProxyAppointmentInformation1 .class, ProxyNotAllowedCode.class, ProxyType2Code.class, Resolution2 .class, ResolutionStatus1Code.class, ResolutionType1Code.class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification3 .class, SecurityPosition5 .class, UnitOrFaceAmountChoice.class, VoteInstruction1Code.class, VoteInstruction2Code.class, VoteMethods.class, VoteParameters1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.02";

    public MxSeev00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00100102(final String xml) {
        this();
        MxSeev00100102 tmp = parse(xml);
        mtgNtfctn = tmp.getMtgNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotificationV02 }
     *     
     */
    public MeetingNotificationV02 getMtgNtfctn() {
        return mtgNtfctn;
    }

    /**
     * Sets the value of the mtgNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotificationV02 }
     *     
     */
    public MxSeev00100102 setMtgNtfctn(MeetingNotificationV02 value) {
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
    public static MxSeev00100102 parse(String xml) {
        return ((MxSeev00100102) MxReadImpl.parse(MxSeev00100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00100102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00100102) parserImpl.read(MxSeev00100102 .class, xml, _classes));
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
     * Creates an MxSeev00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00100102 message
     * @return
     *     a new instance of MxSeev00100102
     */
    public final static MxSeev00100102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00100102 .class);
    }

}
