
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
 * Class for seev.030.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCADeactvtnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.030.001.01")
public class MxSeev03000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCADeactvtnStsAdvc", required = true)
    protected AgentCADeactivationStatusAdviceV01 agtCADeactvtnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 30;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCADeactivationStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, CorporateActionDeactivationCancellationProcessingStatus1 .class, CorporateActionDeactivationCancellationRejectionStatus1 .class, CorporateActionDeactivationCancellationStatus1Choice.class, CorporateActionDeactivationInstructionProcessingStatus1 .class, CorporateActionDeactivationInstructionRejectionStatus1 .class, CorporateActionDeactivationInstructionStatus1 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeev03000101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ProcessedStatus2Code.class, ProcessedStatus2FormatChoice.class, ProcessedStatus6Code.class, ProcessedStatus6FormatChoice.class, RejectionReason12Code.class, RejectionReason12FormatChoice.class, RejectionReason7Code.class, RejectionReason7FormatChoice.class, SecurityIdentification7 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.030.001.01";

    public MxSeev03000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03000101(final String xml) {
        this();
        MxSeev03000101 tmp = parse(xml);
        agtCADeactvtnStsAdvc = tmp.getAgtCADeactvtnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCADeactvtnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCADeactivationStatusAdviceV01 }
     *     
     */
    public AgentCADeactivationStatusAdviceV01 getAgtCADeactvtnStsAdvc() {
        return agtCADeactvtnStsAdvc;
    }

    /**
     * Sets the value of the agtCADeactvtnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCADeactivationStatusAdviceV01 }
     *     
     */
    public MxSeev03000101 setAgtCADeactvtnStsAdvc(AgentCADeactivationStatusAdviceV01 value) {
        this.agtCADeactvtnStsAdvc = value;
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
    public static MxSeev03000101 parse(String xml) {
        return ((MxSeev03000101) MxReadImpl.parse(MxSeev03000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03000101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03000101) parserImpl.read(MxSeev03000101 .class, xml, _classes));
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
     * Creates an MxSeev03000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03000101 message
     * @return
     *     a new instance of MxSeev03000101
     */
    public final static MxSeev03000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03000101 .class);
    }

}
