
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
 * Class for seev.004.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.04")
public class MxSeev00400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstr", required = true)
    protected MeetingInstructionV04 mtgInstr;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AttendanceCard2 .class, DeliveryPlace1Code.class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, GenericIdentification5 .class, HoldingBalance5 .class, IdentificationSource1Choice.class, IndividualPerson17 .class, Instruction2 .class, LongPostalAddress2Choice.class, MeetingInstructionV04 .class, MeetingReference4 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification1 .class, MxSeev00400104 .class, NameAndAddress5 .class, NameAndAddress9 .class, PartyIdentification3 .class, PartyIdentification9Choice.class, PersonIdentification6 .class, PersonIdentificationType1Choice.class, PostalAddress1 .class, Proxy4 .class, ProxyType2Code.class, Quantity1Code.class, SafekeepingAccount4 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SpecificInstructionRequest1 .class, SubAccount2 .class, UnitOrFaceAmountOrCode1Choice.class, Vote2Choice.class, Vote3 .class, Vote4 .class, VoteDetails2 .class, VoteInstruction2Code.class, VoteInstructionAtMeeting1Code.class, VoteInstructionForMeetingResolution1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.04";

    public MxSeev00400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00400104(final String xml) {
        this();
        MxSeev00400104 tmp = parse(xml);
        mtgInstr = tmp.getMtgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionV04 }
     *     
     */
    public MeetingInstructionV04 getMtgInstr() {
        return mtgInstr;
    }

    /**
     * Sets the value of the mtgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionV04 }
     *     
     */
    public MxSeev00400104 setMtgInstr(MeetingInstructionV04 value) {
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
    public static MxSeev00400104 parse(String xml) {
        return ((MxSeev00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00400104 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00400104) parserImpl.read(MxSeev00400104 .class, xml, _classes));
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
     * Creates an MxSeev00400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00400104 message
     * @return
     *     a new instance of MxSeev00400104
     */
    public static final MxSeev00400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00400104 .class);
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
