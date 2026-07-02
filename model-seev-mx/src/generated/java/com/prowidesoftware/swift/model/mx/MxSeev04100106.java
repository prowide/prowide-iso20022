
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
 * Class for seev.041.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.06")
public class MxSeev04100106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReqStsAdvc", required = true)
    protected CorporateActionInstructionCancellationRequestStatusAdviceV06 corpActnInstrCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CancelledReason9Choice.class, CancelledStatus11Choice.class, CancelledStatusReason12 .class, CancelledStatusReason5Code.class, CashAccountIdentification5Choice.class, CorporateActionEventType15Code.class, CorporateActionEventType32Choice.class, CorporateActionGeneralInformation91 .class, CorporateActionInstructionCancellationRequestStatusAdviceV06 .class, CorporateActionNarrative10 .class, CorporateActionOption10Code.class, CorporateActionOption116 .class, CorporateActionOption21Choice.class, DocumentIdentification33 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InstructionCancellationRequestStatus9Choice.class, MxSeev04100106 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification92Choice.class, PendingCancellationReason3Choice.class, PendingCancellationReason4Code.class, PendingCancellationStatus5Choice.class, PendingCancellationStatusReason5 .class, ProprietaryQuantity8 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity19Choice.class, Quantity6Choice.class, RejectedReason14Choice.class, RejectedStatus18Choice.class, RejectedStatusReason18 .class, RejectionReason45Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.06";

    public MxSeev04100106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04100106(final String xml) {
        this();
        MxSeev04100106 tmp = parse(xml);
        corpActnInstrCxlReqStsAdvc = tmp.getCorpActnInstrCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04100106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdviceV06 }
     *     
     */
    public CorporateActionInstructionCancellationRequestStatusAdviceV06 getCorpActnInstrCxlReqStsAdvc() {
        return corpActnInstrCxlReqStsAdvc;
    }

    /**
     * Sets the value of the corpActnInstrCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequestStatusAdviceV06 }
     *     
     */
    public MxSeev04100106 setCorpActnInstrCxlReqStsAdvc(CorporateActionInstructionCancellationRequestStatusAdviceV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev04100106 parse(String xml) {
        return ((MxSeev04100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04100106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04100106 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04100106) parserImpl.read(MxSeev04100106 .class, xml, _classes));
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
     * Creates an MxSeev04100106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04100106 message
     * @return
     *     a new instance of MxSeev04100106
     */
    public final static MxSeev04100106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04100106 .class);
    }

}
