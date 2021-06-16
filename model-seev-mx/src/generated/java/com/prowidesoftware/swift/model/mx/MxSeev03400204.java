
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
 * Class for seev.034.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.034.002.04")
public class MxSeev03400204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStsAdvc", required = true)
    protected CorporateActionInstructionStatusAdvice002V04 corpActnInstrStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptedReason2Choice.class, AcceptedStatus2Choice.class, AcceptedStatusReason2 .class, AcknowledgementReason4Code.class, CancelledReason4Choice.class, CancelledStatus4Choice.class, CancelledStatusReason11Code.class, CancelledStatusReason7 .class, CashAccountIdentification6Choice.class, CorporateActionEventType10Code.class, CorporateActionEventType22Choice.class, CorporateActionGeneralInformation58 .class, CorporateActionInstructionStatusAdvice002V04 .class, CorporateActionNarrative19 .class, CorporateActionOption10Code.class, CorporateActionOption16Choice.class, CorporateActionOption50 .class, DocumentIdentification17 .class, DocumentIdentification21 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, InstructionProcessingStatus13Choice.class, MxSeev03400204 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, PendingReason5Code.class, PendingReason7Choice.class, PendingStatus6Choice.class, PendingStatusReason4 .class, ProprietaryQuantity4 .class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, Quantity7Choice.class, RejectedReason2Choice.class, RejectedStatus2Choice.class, RejectedStatusReason9 .class, RejectionReason17Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecurityIdentification15 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, StatusOrQuantityToReceive2Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.034.002.04";

    public MxSeev03400204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03400204(final String xml) {
        this();
        MxSeev03400204 tmp = parse(xml);
        corpActnInstrStsAdvc = tmp.getCorpActnInstrStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03400204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatusAdvice002V04 }
     *     
     */
    public CorporateActionInstructionStatusAdvice002V04 getCorpActnInstrStsAdvc() {
        return corpActnInstrStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatusAdvice002V04 }
     *     
     */
    public MxSeev03400204 setCorpActnInstrStsAdvc(CorporateActionInstructionStatusAdvice002V04 value) {
        this.corpActnInstrStsAdvc = value;
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
    public static MxSeev03400204 parse(String xml) {
        return ((MxSeev03400204) MxReadImpl.parse(MxSeev03400204 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03400204 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03400204) parserImpl.read(MxSeev03400204 .class, xml, _classes));
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
     * Creates an MxSeev03400204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03400204 message
     * @return
     *     a new instance of MxSeev03400204
     */
    public final static MxSeev03400204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03400204 .class);
    }

}
