
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.025.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAStgInstrReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.025.001.01")
public class MxSeev02500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAStgInstrReq", required = true)
    protected AgentCAStandingInstructionRequestV01 agtCAStgInstrReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCAStandingInstructionRequestV01 .class, AlternateSecurityIdentification3 .class, CashAccount17 .class, CashAccountIdentification1Choice.class, ContactIdentification4 .class, ContactPerson1 .class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionStandingInstruction1 .class, CorporateActionStandingInstructionGeneralInformation1 .class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, IncludedAccount1 .class, MxSeev02500101 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecuritiesAccount6 .class, SecurityIdentification7 .class, SimpleIdentificationInformation.class, StandingInstructionGrossNet1Code.class, StandingInstructionType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.025.001.01";

    public MxSeev02500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev02500101(final String xml) {
        this();
        MxSeev02500101 tmp = parse(xml);
        agtCAStgInstrReq = tmp.getAgtCAStgInstrReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev02500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAStgInstrReq property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAStandingInstructionRequestV01 }
     *     
     */
    public AgentCAStandingInstructionRequestV01 getAgtCAStgInstrReq() {
        return agtCAStgInstrReq;
    }

    /**
     * Sets the value of the agtCAStgInstrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAStandingInstructionRequestV01 }
     *     
     */
    public MxSeev02500101 setAgtCAStgInstrReq(AgentCAStandingInstructionRequestV01 value) {
        this.agtCAStgInstrReq = value;
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
    public static MxSeev02500101 parse(String xml) {
        return ((MxSeev02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev02500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev02500101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev02500101) parserImpl.read(MxSeev02500101 .class, xml, _classes));
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
     * Creates an MxSeev02500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev02500101 message
     * @return
     *     a new instance of MxSeev02500101
     */
    public final static MxSeev02500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev02500101 .class);
    }

}
