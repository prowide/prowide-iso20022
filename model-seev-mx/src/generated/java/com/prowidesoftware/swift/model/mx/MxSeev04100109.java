
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
 * Class for seev.041.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.09")
public class MxSeev04100109
    extends AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReqStsAdvc", required = true)
    protected CorporateActionInstructionCancellationRequestStatusAdviceV09 corpActnInstrCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, CancelledReason9Choice.class, CancelledStatus11Choice.class, CancelledStatusReason12 .class, CancelledStatusReason5Code.class, CashAccountIdentification5Choice.class, CorporateActionEventType20Code.class, CorporateActionEventType52Choice.class, CorporateActionGeneralInformation109 .class, CorporateActionInstructionCancellationRequestStatusAdviceV09 .class, CorporateActionNarrative10 .class, CorporateActionOption10Code.class, CorporateActionOption151 .class, CorporateActionOption21Choice.class, DocumentIdentification33 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InstructionCancellationRequestStatus11Choice.class, MxSeev04100109 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionFeatures12Code.class, OptionFeaturesFormat25Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification127Choice.class, PendingCancellationReason5Choice.class, PendingCancellationReason5Code.class, PendingCancellationStatus7Choice.class, PendingCancellationStatusReason7 .class, ProprietaryQuantity8 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, ProtectInstruction4 .class, ProtectInstructionStatus4Code.class, ProtectTransactionType3Code.class, Quantity19Choice.class, Quantity6Choice.class, RejectedReason14Choice.class, RejectedStatus18Choice.class, RejectedStatusReason18 .class, RejectionReason45Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.09";

    public MxSeev04100109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04100109(final String xml) {
        this();
        MxSeev04100109 tmp = parse(xml);
        corpActnInstrCxlReqStsAdvc = tmp.getCorpActnInstrCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04100109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdviceV09 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdviceV09 getCorpActnInstrCxlReqStsAdvc() {
        return corpActnInstrCxlReqStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdviceV09 }
     *     
     */
    public MxSeev04100109 setCorpActnInstrCxlReqStsAdvc(CorporateActionInstructionCancellationRequestStatusAdviceV09 value) {
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
    public static MxSeev04100109 parse(String xml) {
        return ((MxSeev04100109) MxReadImpl.parse(MxSeev04100109 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04100109 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04100109) parserImpl.read(MxSeev04100109 .class, xml, _classes));
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
     * Creates an MxSeev04100109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04100109 message
     * @return
     *     a new instance of MxSeev04100109
     */
    public final static MxSeev04100109 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev04100109 .class);
    }

}
