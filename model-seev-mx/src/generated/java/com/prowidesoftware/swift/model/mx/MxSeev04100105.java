
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
 * Class for seev.041.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.05")
public class MxSeev04100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReqStsAdvc", required = true)
    protected CorporateActionInstructionCancellationRequestStatusAdviceV05 corpActnInstrCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CancelledReason5Choice.class, CancelledStatus7Choice.class, CancelledStatusReason5Code.class, CancelledStatusReason8 .class, CashAccountIdentification5Choice.class, CorporateActionEventType10Code.class, CorporateActionEventType11Choice.class, CorporateActionGeneralInformation52 .class, CorporateActionInstructionCancellationRequestStatusAdviceV05 .class, CorporateActionNarrative10 .class, CorporateActionOption10Code.class, CorporateActionOption13Choice.class, CorporateActionOption41 .class, DocumentIdentification14 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, InstructionCancellationRequestStatus7Choice.class, MxSeev04100105 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PendingCancellationReason1Choice.class, PendingCancellationReason4Code.class, PendingCancellationStatus3Choice.class, PendingCancellationStatusReason3 .class, ProprietaryQuantity2 .class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity2Choice.class, Quantity6Choice.class, RejectedReason10Choice.class, RejectedStatus14Choice.class, RejectedStatusReason14 .class, RejectionReason45Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, StatusOrQuantityToReceive1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.05";

    public MxSeev04100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04100105(final String xml) {
        this();
        MxSeev04100105 tmp = parse(xml);
        corpActnInstrCxlReqStsAdvc = tmp.getCorpActnInstrCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdviceV05 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdviceV05 getCorpActnInstrCxlReqStsAdvc() {
        return corpActnInstrCxlReqStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdviceV05 }
     *     
     */
    public MxSeev04100105 setCorpActnInstrCxlReqStsAdvc(CorporateActionInstructionCancellationRequestStatusAdviceV05 value) {
        this.corpActnInstrCxlReqStsAdvc = value;
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
    public static MxSeev04100105 parse(String xml) {
        return ((MxSeev04100105) MxReadImpl.parse(MxSeev04100105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04100105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04100105) parserImpl.read(MxSeev04100105 .class, xml, _classes));
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
     * Creates an MxSeev04100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04100105 message
     * @return
     *     a new instance of MxSeev04100105
     */
    public final static MxSeev04100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04100105 .class);
    }

}
