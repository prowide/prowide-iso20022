
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
 * Class for seev.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "seev00400101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.004.001.01")
public class MxSeev00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "seev.004.001.01", required = true)
    protected Seev00400101 seev00400101;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AlternateFinancialInstrumentIdentification1 .class, CurrencyAndAmount.class, EligiblePosition.class, GenericIdentification4 .class, GenericIdentification5 .class, HoldingBalance2 .class, IndividualPerson7 .class, InstructionIdentification.class, MeetingReference1 .class, MeetingType1Code.class, MxSeev00400101 .class, NameAndAddress5 .class, PartyIdentification3 .class, PartyIdentification7Choice.class, PersonIdentification2 .class, PostalAddress1 .class, RequestInformation.class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType1Code.class, SecurityIdentification3 .class, SecurityPosition1 .class, SecurityPosition2 .class, Seev00400101 .class, UnitOrFaceAmountChoice.class, Vote1 .class, Vote3 .class, VoteChoice.class, VoteInstruction.class, VoteInstruction2Code.class, VoteInstructionAtMeeting1Code.class, VoteInstructionForMeetingResolution.class, VotingPartyAndInstruction.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.004.001.01";

    public MxSeev00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00400101(final String xml) {
        this();
        MxSeev00400101 tmp = parse(xml);
        seev00400101 = tmp.getSeev00400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the seev00400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Seev00400101 }
     *     
     */
    public Seev00400101 getSeev00400101() {
        return seev00400101;
    }

    /**
     * Sets the value of the seev00400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seev00400101 }
     *     
     */
    public MxSeev00400101 setSeev00400101(Seev00400101 value) {
        this.seev00400101 = value;
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
    public static MxSeev00400101 parse(String xml) {
        return ((MxSeev00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00400101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00400101) parserImpl.read(MxSeev00400101 .class, xml, _classes));
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
     * Creates an MxSeev00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00400101 message
     * @return
     *     a new instance of MxSeev00400101
     */
    public final static MxSeev00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00400101 .class);
    }

}
