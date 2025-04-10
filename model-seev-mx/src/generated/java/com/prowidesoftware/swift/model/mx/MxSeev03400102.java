
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
 * Class for seev.034.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.034.001.02")
public class MxSeev03400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStsAdvc", required = true)
    protected CorporateActionInstructionStatusAdviceV02 corpActnInstrStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptedReason1Choice.class, AcceptedStatus1Choice.class, AcceptedStatusReason1 .class, AcknowledgementReason4Code.class, CancelledReason3Choice.class, CancelledStatus3Choice.class, CancelledStatusReason11Code.class, CancelledStatusReason6 .class, CashAccountIdentification5Choice.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation9 .class, CorporateActionInstructionStatusAdviceV02 .class, CorporateActionNarrative10 .class, CorporateActionOption26 .class, CorporateActionOption5Choice.class, CorporateActionOption6Code.class, DocumentIdentification14 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, InstructionProcessingStatus7Choice.class, MxSeev03400102 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PendingReason5Code.class, PendingReason6Choice.class, PendingStatus1Choice.class, PendingStatusReason1 .class, ProprietaryQuantity2 .class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity2Choice.class, Quantity6Choice.class, RejectedReason1Choice.class, RejectedStatus1Choice.class, RejectedStatusReason8 .class, RejectionReason17Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, StatusOrQuantityToReceive1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.034.001.02";

    public MxSeev03400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03400102(final String xml) {
        this();
        MxSeev03400102 tmp = parse(xml);
        corpActnInstrStsAdvc = tmp.getCorpActnInstrStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatusAdviceV02 }
     *     
     */
    public CorporateActionInstructionStatusAdviceV02 getCorpActnInstrStsAdvc() {
        return corpActnInstrStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatusAdviceV02 }
     *     
     */
    public MxSeev03400102 setCorpActnInstrStsAdvc(CorporateActionInstructionStatusAdviceV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev03400102 parse(String xml) {
        return ((MxSeev03400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03400102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03400102) parserImpl.read(MxSeev03400102 .class, xml, _classes));
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
     * Creates an MxSeev03400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03400102 message
     * @return
     *     a new instance of MxSeev03400102
     */
    public final static MxSeev03400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03400102 .class);
    }

}
