
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
 * Class for seev.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "seev00100101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.001.001.01")
public class MxSeev00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "seev.001.001.01", required = true)
    protected Seev00100101 seev00100101;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AlternateFinancialInstrumentIdentification1 .class, AmendInformation.class, CommunicationAddress4 .class, ContactIdentification1 .class, CurrencyAndAmount.class, EligiblePosition.class, EntitlementAssessment.class, GenericIdentification4 .class, GenericIdentification5 .class, HoldingBalance2 .class, IncentivePremium1 .class, IndividualPerson7 .class, InstructionIdentification.class, Meeting1 .class, MeetingContactPerson.class, MeetingDateStatus1Code.class, MeetingNotice1 .class, MeetingType1Code.class, MxSeev00100101 .class, NameAndAddress5 .class, NamePrefix1Code.class, NotificationStatus.class, NotificationStatus1Code.class, PartyIdentification3 .class, PartyIdentification7Choice.class, PersonIdentification2 .class, PostalAddress1 .class, PowerOfAttorneyLegalisation1Code.class, PowerOfAttorneyRequirements1 .class, Proxy.class, ProxyNotAllowedCode.class, ProxyParameters.class, ProxyType2Code.class, Resolution1 .class, ResolutionStatus1Code.class, ResolutionType1Code.class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType1Code.class, SecurityIdentification3 .class, SecurityPosition.class, Seev00100101 .class, UnitOrFaceAmountChoice.class, VoteInstruction1Code.class, VoteInstruction2Code.class, VoteMethods.class, VoteParameters.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.001.001.01";

    public MxSeev00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00100101(final String xml) {
        this();
        MxSeev00100101 tmp = parse(xml);
        seev00100101 = tmp.getSeev00100101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the seev00100101 property.
     * 
     * @return
     *     possible object is
     *     {@link Seev00100101 }
     *     
     */
    public Seev00100101 getSeev00100101() {
        return seev00100101;
    }

    /**
     * Sets the value of the seev00100101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seev00100101 }
     *     
     */
    public MxSeev00100101 setSeev00100101(Seev00100101 value) {
        this.seev00100101 = value;
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
    public static MxSeev00100101 parse(String xml) {
        return ((MxSeev00100101) MxReadImpl.parse(MxSeev00100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00100101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00100101) parserImpl.read(MxSeev00100101 .class, xml, _classes));
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
     * Creates an MxSeev00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00100101 message
     * @return
     *     a new instance of MxSeev00100101
     */
    public final static MxSeev00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00100101 .class);
    }

}
