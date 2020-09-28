
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
 * Class for seev.007.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgVoteExctnConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.05")
public class MxSeev00700105
    extends AbstractMX
{

    @XmlElement(name = "MtgVoteExctnConf", required = true)
    protected MeetingVoteExecutionConfirmationV05 mtgVoteExctnConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DetailedInstructionStatus10 .class, GenericIdentification13 .class, GenericIdentification19 .class, IdentificationSource3Choice.class, MeetingReference7 .class, MeetingType3Code.class, MeetingTypeClassification1Choice.class, MeetingTypeClassification1Code.class, MeetingVoteExecutionConfirmationV05 .class, MessageIdentification.class, MxSeev00700105 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification40Choice.class, PostalAddress1 .class, SecurityIdentification14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Vote6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.05";

    public MxSeev00700105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00700105(final String xml) {
        this();
        MxSeev00700105 tmp = parse(xml);
        mtgVoteExctnConf = tmp.getMtgVoteExctnConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00700105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgVoteExctnConf property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingVoteExecutionConfirmationV05 }
     *     
     */
    public MeetingVoteExecutionConfirmationV05 getMtgVoteExctnConf() {
        return mtgVoteExctnConf;
    }

    /**
     * Sets the value of the mtgVoteExctnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingVoteExecutionConfirmationV05 }
     *     
     */
    public MxSeev00700105 setMtgVoteExctnConf(MeetingVoteExecutionConfirmationV05 value) {
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
    public static MxSeev00700105 parse(String xml) {
        return ((MxSeev00700105) MxReadImpl.parse(MxSeev00700105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00700105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00700105) parserImpl.read(MxSeev00700105 .class, xml, _classes));
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
     * Creates an MxSeev00700105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00700105 message
     * @return
     *     a new instance of MxSeev00700105
     */
    public final static MxSeev00700105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev00700105 .class);
    }

}
