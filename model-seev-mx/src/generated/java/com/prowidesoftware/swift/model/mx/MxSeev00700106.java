
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
 * Class for seev.007.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgVoteExctnConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.06")
public class MxSeev00700106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgVoteExctnConf", required = true)
    protected MeetingVoteExecutionConfirmationV06 mtgVoteExctnConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTime1Choice.class, DetailedInstructionStatus13 .class, FinancialInstrumentQuantity18Choice.class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, IdentificationType45Choice.class, MeetingReference8 .class, MeetingType4Code.class, MeetingTypeClassification2Choice.class, MeetingTypeClassification2Code.class, MeetingVoteExecutionConfirmationV06 .class, ModalityOfCounting1Choice.class, ModalityOfCounting1Code.class, MxSeev00700106 .class, NameAndAddress5 .class, NaturalPersonIdentification1 .class, OtherIdentification1 .class, PartyIdentification129Choice.class, PartyIdentification198Choice.class, PartyIdentification221 .class, PartyIdentification222 .class, PartyIdentification223Choice.class, PartyIdentification224 .class, PartyIdentification225 .class, PartyIdentification227Choice.class, PartyIdentification228Choice.class, PersonName1 .class, PersonName2 .class, PostalAddress1 .class, PostalAddress26 .class, ProprietaryVote2 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification4Code.class, Vote13 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.06";

    public MxSeev00700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00700106(final String xml) {
        this();
        MxSeev00700106 tmp = parse(xml);
        mtgVoteExctnConf = tmp.getMtgVoteExctnConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgVoteExctnConf property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingVoteExecutionConfirmationV06 }
     *     
     */
    public MeetingVoteExecutionConfirmationV06 getMtgVoteExctnConf() {
        return mtgVoteExctnConf;
    }

    /**
     * Sets the value of the mtgVoteExctnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingVoteExecutionConfirmationV06 }
     *     
     */
    public MxSeev00700106 setMtgVoteExctnConf(MeetingVoteExecutionConfirmationV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev00700106 parse(String xml) {
        return ((MxSeev00700106) MxReadImpl.parse(MxSeev00700106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00700106 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00700106) parserImpl.read(MxSeev00700106 .class, xml, _classes));
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
     * Creates an MxSeev00700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00700106 message
     * @return
     *     a new instance of MxSeev00700106
     */
    public final static MxSeev00700106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00700106 .class);
    }

}
