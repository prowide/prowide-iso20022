
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
 * Class for seev.007.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgVoteExctnConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.03")
public class MxSeev00700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgVoteExctnConf", required = true)
    protected MeetingVoteExecutionConfirmationV03 mtgVoteExctnConf;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AlternateIdentification1 .class, DetailedInstructionStatus9 .class, GenericIdentification1 .class, GenericIdentification13 .class, IdentificationSource1Choice.class, MeetingReference4 .class, MeetingType2Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MeetingVoteExecutionConfirmationV03 .class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00700103 .class, NameAndAddress5 .class, PartyIdentification9Choice.class, PostalAddress1 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, Vote4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.03";

    public MxSeev00700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00700103(final String xml) {
        this();
        MxSeev00700103 tmp = parse(xml);
        mtgVoteExctnConf = tmp.getMtgVoteExctnConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgVoteExctnConf property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingVoteExecutionConfirmationV03 }
     *     
     */
    public MeetingVoteExecutionConfirmationV03 getMtgVoteExctnConf() {
        return mtgVoteExctnConf;
    }

    /**
     * Sets the value of the mtgVoteExctnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingVoteExecutionConfirmationV03 }
     *     
     */
    public MxSeev00700103 setMtgVoteExctnConf(MeetingVoteExecutionConfirmationV03 value) {
        this.mtgVoteExctnConf = value;
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
    public static MxSeev00700103 parse(String xml) {
        return ((MxSeev00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00700103 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00700103) parserImpl.read(MxSeev00700103 .class, xml, _classes));
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
     * Creates an MxSeev00700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00700103 message
     * @return
     *     a new instance of MxSeev00700103
     */
    public static final MxSeev00700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00700103 .class);
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
