
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
 * Class for seev.004.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.05")
public class MxSeev00400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstr", required = true)
    protected MeetingInstructionV05 mtgInstr;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AttendanceCard2 .class, DeliveryPlace1Code.class, GenericIdentification13 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification4 .class, HoldingBalance8 .class, IdentificationSource3Choice.class, IndividualPerson26 .class, Instruction3 .class, LongPostalAddress2Choice.class, MeetingInstructionV05 .class, MeetingReference7 .class, MeetingType3Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MxSeev00400105 .class, NameAndAddress5 .class, NameAndAddress9 .class, OtherIdentification1 .class, PartyIdentification40Choice.class, PersonIdentification6 .class, PersonIdentificationType1Choice.class, PostalAddress1 .class, Proxy6 .class, ProxyType2Code.class, Quantity1Code.class, SafekeepingAccount6 .class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesEntryType2Code.class, SecurityIdentification14 .class, SpecificInstructionRequest1 .class, SubAccount2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnitOrFaceAmountOrCode1Choice.class, Vote3Choice.class, Vote8 .class, Vote9 .class, VoteDetails3 .class, VoteInstruction3Code.class, VoteInstruction4Code.class, VoteInstructionForMeetingResolution2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.004.001.05";

    public MxSeev00400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00400105(final String xml) {
        this();
        MxSeev00400105 tmp = parse(xml);
        mtgInstr = tmp.getMtgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionV05 }
     *     
     */
    public MeetingInstructionV05 getMtgInstr() {
        return mtgInstr;
    }

    /**
     * Sets the value of the mtgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionV05 }
     *     
     */
    public MxSeev00400105 setMtgInstr(MeetingInstructionV05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev00400105 parse(String xml) {
        return ((MxSeev00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00400105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00400105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00400105) parserImpl.read(MxSeev00400105 .class, xml, _classes));
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
     * Creates an MxSeev00400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00400105 message
     * @return
     *     a new instance of MxSeev00400105
     */
    public final static MxSeev00400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00400105 .class);
    }

}
