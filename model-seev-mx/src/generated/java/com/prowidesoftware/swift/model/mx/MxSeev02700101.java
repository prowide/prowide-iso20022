
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
 * Class for seev.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAStgInstrStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.027.001.01")
public class MxSeev02700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAStgInstrStsAdvc", required = true)
    protected AgentCAStandingInstructionStatusAdviceV01 agtCAStgInstrStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCAStandingInstructionStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionStandingInstructionCancellationProcessingStatus1 .class, CorporateActionStandingInstructionCancellationRejectionStatus1 .class, CorporateActionStandingInstructionGeneralInformation1 .class, CorporateActionStandingInstructionProcessingStatus1 .class, CorporateActionStandingInstructionRejectionStatus1 .class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, IncludedAccount1 .class, MxSeev02700101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ProcessedStatus3Code.class, ProcessedStatus3FormatChoice.class, ProcessedStatus4Code.class, ProcessedStatus4FormatChoice.class, RejectionReason10Code.class, RejectionReason10FormatChoice.class, RejectionReason20Code.class, RejectionReason20FormatChoice.class, SecurityIdentification7 .class, StandingInstructionCancellationStatus1Choice.class, StandingInstructionStatus1Choice.class, StandingInstructionType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.027.001.01";

    public MxSeev02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev02700101(final String xml) {
        this();
        MxSeev02700101 tmp = parse(xml);
        agtCAStgInstrStsAdvc = tmp.getAgtCAStgInstrStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAStgInstrStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAStandingInstructionStatusAdviceV01 }
     *     
     */
    public AgentCAStandingInstructionStatusAdviceV01 getAgtCAStgInstrStsAdvc() {
        return agtCAStgInstrStsAdvc;
    }

    /**
     * Sets the value of the agtCAStgInstrStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAStandingInstructionStatusAdviceV01 }
     *     
     */
    public MxSeev02700101 setAgtCAStgInstrStsAdvc(AgentCAStandingInstructionStatusAdviceV01 value) {
        this.agtCAStgInstrStsAdvc = value;
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
    public static MxSeev02700101 parse(String xml) {
        return ((MxSeev02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev02700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev02700101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev02700101) parserImpl.read(MxSeev02700101 .class, xml, _classes));
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
     * Creates an MxSeev02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev02700101 message
     * @return
     *     a new instance of MxSeev02700101
     */
    public static final MxSeev02700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev02700101 .class);
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
