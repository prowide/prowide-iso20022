
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
 * Class for seev.007.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgVoteExctnConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.09")
public class MxSeev00700109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgVoteExctnConf", required = true)
    protected MeetingVoteExecutionConfirmationV09 mtgVoteExctnConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTime1Choice.class, DateAndPlaceOfBirth2 .class, DetailedInstructionStatus18 .class, FinancialInstrumentQuantity18Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, ItemDescription1 .class, MeetingReference10 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MeetingVoteExecutionConfirmationV09 .class, ModalityOfCounting1Choice.class, ModalityOfCounting1Code.class, MxSeev00700109 .class, NameAndAddress5 .class, NamePrefix2Code.class, NaturalPersonIdentification1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification231Choice.class, PartyIdentification232Choice.class, PartyIdentification238 .class, PartyIdentification246Choice.class, PartyIdentification250 .class, PartyIdentification269 .class, PersonName2 .class, PersonName3 .class, PostalAddress1 .class, PostalAddress26 .class, ProprietaryVote2 .class, ResolutionSubStatus1Code.class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class, Vote17 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.09";

    public MxSeev00700109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00700109(final String xml) {
        this();
        MxSeev00700109 tmp = parse(xml);
        mtgVoteExctnConf = tmp.getMtgVoteExctnConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00700109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgVoteExctnConf property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingVoteExecutionConfirmationV09 }
     *     
     */
    public MeetingVoteExecutionConfirmationV09 getMtgVoteExctnConf() {
        return mtgVoteExctnConf;
    }

    /**
     * Sets the value of the mtgVoteExctnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingVoteExecutionConfirmationV09 }
     *     
     */
    public MxSeev00700109 setMtgVoteExctnConf(MeetingVoteExecutionConfirmationV09 value) {
        this.mtgVoteExctnConf = value;
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
    public static MxSeev00700109 parse(String xml) {
        return ((MxSeev00700109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00700109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00700109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00700109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00700109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00700109 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00700109) parserImpl.read(MxSeev00700109 .class, xml, _classes));
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
     * Creates an MxSeev00700109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00700109 message
     * @return
     *     a new instance of MxSeev00700109
     */
    public final static MxSeev00700109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00700109 .class);
    }

}
