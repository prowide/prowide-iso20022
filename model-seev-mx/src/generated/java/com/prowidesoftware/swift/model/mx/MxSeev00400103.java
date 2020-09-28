
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
 * Class for seev.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.03")
public class MxSeev00400103
    extends AbstractMX
{

    @XmlElement(name = "MtgInstr", required = true)
    protected MeetingInstructionV03 mtgInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AttendanceCard2 .class, DeliveryPlace1Code.class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification4 .class, GenericIdentification5 .class, HoldingBalance5 .class, IdentificationSource1Choice.class, IndividualPerson17 .class, Instruction2 .class, LongPostalAddress2Choice.class, MeetingInstructionV03 .class, MeetingReference4 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MessageIdentification1 .class, MxSeev00400103 .class, NameAndAddress5 .class, NameAndAddress9 .class, PartyIdentification3 .class, PartyIdentification9Choice.class, PersonIdentification6 .class, PersonIdentificationType1Choice.class, PostalAddress1 .class, Proxy4 .class, ProxyType2Code.class, Quantity1Code.class, SafekeepingAccount4 .class, SafekeepingPlace1Code.class, SafekeepingPlaceAsCodeAndPartyIdentification.class, SafekeepingPlaceFormatChoice.class, SecuritiesEntryType2Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SpecificInstructionRequest1 .class, SubAccount2 .class, UnitOrFaceAmountOrCode1Choice.class, Vote2Choice.class, Vote3 .class, Vote4 .class, VoteDetails2 .class, VoteInstruction2Code.class, VoteInstructionAtMeeting1Code.class, VoteInstructionForMeetingResolution1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.03";

    public MxSeev00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00400103(final String xml) {
        this();
        MxSeev00400103 tmp = parse(xml);
        mtgInstr = tmp.getMtgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionV03 }
     *     
     */
    public MeetingInstructionV03 getMtgInstr() {
        return mtgInstr;
    }

    /**
     * Sets the value of the mtgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionV03 }
     *     
     */
    public MxSeev00400103 setMtgInstr(MeetingInstructionV03 value) {
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
    public static MxSeev00400103 parse(String xml) {
        return ((MxSeev00400103) MxReadImpl.parse(MxSeev00400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00400103 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00400103) parserImpl.read(MxSeev00400103 .class, xml, _classes));
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
     * Creates an MxSeev00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00400103 message
     * @return
     *     a new instance of MxSeev00400103
     */
    public final static MxSeev00400103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00400103 .class);
    }

}
