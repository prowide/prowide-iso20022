
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
 * Class for seev.026.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAStgInstrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.026.001.01")
public class MxSeev02600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAStgInstrCxlReq", required = true)
    protected AgentCAStandingInstructionCancellationRequestV01 agtCAStgInstrCxlReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 26;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCAStandingInstructionCancellationRequestV01 .class, AlternateSecurityIdentification3 .class, CashAccount17 .class, CashAccountIdentification1Choice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionStandingInstruction1 .class, CorporateActionStandingInstructionGeneralInformation1 .class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, IncludedAccount1 .class, MxSeev02600101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, SecuritiesAccount6 .class, SecurityIdentification7 .class, SimpleIdentificationInformation.class, StandingInstructionGrossNet1Code.class, StandingInstructionType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.026.001.01";

    public MxSeev02600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev02600101(final String xml) {
        this();
        MxSeev02600101 tmp = parse(xml);
        agtCAStgInstrCxlReq = tmp.getAgtCAStgInstrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev02600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAStgInstrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAStandingInstructionCancellationRequestV01 }
     *     
     */
    public AgentCAStandingInstructionCancellationRequestV01 getAgtCAStgInstrCxlReq() {
        return agtCAStgInstrCxlReq;
    }

    /**
     * Sets the value of the agtCAStgInstrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAStandingInstructionCancellationRequestV01 }
     *     
     */
    public MxSeev02600101 setAgtCAStgInstrCxlReq(AgentCAStandingInstructionCancellationRequestV01 value) {
        this.agtCAStgInstrCxlReq = value;
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
    public static MxSeev02600101 parse(String xml) {
        return ((MxSeev02600101) MxReadImpl.parse(MxSeev02600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev02600101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev02600101) parserImpl.read(MxSeev02600101 .class, xml, _classes));
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
     * Creates an MxSeev02600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev02600101 message
     * @return
     *     a new instance of MxSeev02600101
     */
    public final static MxSeev02600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev02600101 .class);
    }

}
