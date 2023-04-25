
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
 * Class for seev.041.002.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.041.002.11")
public class MxSeev04100211
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReqStsAdvc", required = true)
    protected CorporateActionInstructionCancellationRequestStatusAdvice002V11 corpActnInstrCxlReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 41;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CancelledReason10Choice.class, CancelledStatus14Choice.class, CancelledStatusReason13 .class, CancelledStatusReason5Code.class, CashAccountIdentification6Choice.class, CorporateActionEventType103Choice.class, CorporateActionEventType34Code.class, CorporateActionGeneralInformation158 .class, CorporateActionInstructionCancellationRequestStatusAdvice002V11 .class, CorporateActionNarrative19 .class, CorporateActionOption17Code.class, CorporateActionOption186 .class, CorporateActionOption42Choice.class, DocumentIdentification17 .class, DocumentIdentification34 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity31Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InstructionCancellationRequestStatus12Choice.class, MxSeev04100211 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionFeatures12Code.class, OptionFeaturesFormat27Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification136Choice.class, PendingCancellationReason5Code.class, PendingCancellationReason6Choice.class, PendingCancellationStatus8Choice.class, PendingCancellationStatusReason8 .class, ProprietaryQuantity9 .class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, ProtectInstruction8 .class, ProtectInstructionStatus4Code.class, ProtectTransactionType3Code.class, Quantity10Choice.class, Quantity21Choice.class, RejectedReason18Choice.class, RejectedStatus20Choice.class, RejectedStatusReason19 .class, RejectionReason45Code.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat32Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.041.002.11";

    public MxSeev04100211() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04100211(final String xml) {
        this();
        MxSeev04100211 tmp = parse(xml);
        corpActnInstrCxlReqStsAdvc = tmp.getCorpActnInstrCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04100211(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdvice002V11 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdvice002V11 getCorpActnInstrCxlReqStsAdvc() {
        return corpActnInstrCxlReqStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdvice002V11 }
     *     
     */
    public MxSeev04100211 setCorpActnInstrCxlReqStsAdvc(CorporateActionInstructionCancellationRequestStatusAdvice002V11 value) {
        this.corpActnInstrCxlReqStsAdvc = value;
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
    public static MxSeev04100211 parse(String xml) {
        return ((MxSeev04100211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04100211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04100211 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04100211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04100211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04100211 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04100211) parserImpl.read(MxSeev04100211 .class, xml, _classes));
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
     * Creates an MxSeev04100211 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04100211 message
     * @return
     *     a new instance of MxSeev04100211
     */
    public static final MxSeev04100211 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04100211 .class);
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
