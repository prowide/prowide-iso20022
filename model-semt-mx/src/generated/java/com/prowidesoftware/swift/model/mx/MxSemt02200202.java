
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
 * Class for semt.022.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.022.002.02")
public class MxSemt02200202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
    protected SecuritiesSettlementTransactionAuditTrailReport002V02 sctiesSttlmTxAudtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus15Choice.class, AcknowledgedAcceptedStatus18Choice.class, AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason10Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason4 .class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason6Choice.class, AcknowledgementReason6Code.class, AcknowledgementReason8 .class, AcknowledgementReason8Choice.class, CancellationReason13Choice.class, CancellationReason3 .class, CancellationReason6 .class, CancellationReason7Choice.class, CancellationStatus11Choice.class, CancellationStatus13Choice.class, CancelledStatusReason13Code.class, CancelledStatusReason5Code.class, DeniedReason10Choice.class, DeniedReason4 .class, DeniedReason4Code.class, DeniedReason6Choice.class, DeniedReason6Code.class, DeniedReason7 .class, DeniedStatus12Choice.class, DeniedStatus9Choice.class, FailingReason2Code.class, FailingReason5 .class, FailingReason5Choice.class, FailingStatus8Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification64 .class, GenericOrganisationIdentification2 .class, Identification4 .class, MatchingStatus18Choice.class, ModificationProcessingStatus5Choice.class, ModificationReason3 .class, ModificationReason3Choice.class, ModificationStatus3Choice.class, ModifiedStatusReason1Code.class, MxSemt02200202 .class, NoReasonCode.class, OrganisationIdentification9 .class, OrganisationIdentificationSchemeName2Choice.class, Pagination.class, PartyIdentification51Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason3Code.class, PendingProcessingReason6 .class, PendingProcessingReason6Choice.class, PendingProcessingReason7 .class, PendingProcessingReason7Choice.class, PendingProcessingStatus8Choice.class, PendingProcessingStatus9Choice.class, PendingReason10 .class, PendingReason12 .class, PendingReason18Choice.class, PendingReason20Choice.class, PendingReason2Code.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingReason9Code.class, PendingStatus22Choice.class, PendingStatus24Choice.class, PendingStatus31Choice.class, ProcessingStatus25Choice.class, ProcessingStatus26Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, RejectionAndRepairReason16Choice.class, RejectionAndRepairReason19Choice.class, RejectionOrRepairReason16 .class, RejectionOrRepairReason19 .class, RejectionOrRepairStatus20Choice.class, RejectionOrRepairStatus24Choice.class, RejectionReason12Choice.class, RejectionReason13Choice.class, RejectionReason14 .class, RejectionReason15 .class, RejectionReason27Code.class, RejectionReason30Code.class, RejectionReason31Code.class, RejectionReason32Code.class, RejectionStatus10Choice.class, RejectionStatus11Choice.class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairReason7 .class, RepairStatus10Choice.class, RepairStatus9Choice.class, SecuritiesAccount17 .class, SecuritiesSettlementTransactionAuditTrailReport002V02 .class, SettlementStatus13Choice.class, StatusTrail5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications19 .class, UnmatchedReason13Choice.class, UnmatchedReason5Code.class, UnmatchedReason9 .class, UnmatchedStatus10Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.022.002.02";

    public MxSemt02200202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02200202(final String xml) {
        this();
        MxSemt02200202 tmp = parse(xml);
        sctiesSttlmTxAudtTrlRpt = tmp.getSctiesSttlmTxAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02200202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReport002V02 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V02 getSctiesSttlmTxAudtTrlRpt() {
        return sctiesSttlmTxAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReport002V02 }
     *     
     */
    public MxSemt02200202 setSctiesSttlmTxAudtTrlRpt(SecuritiesSettlementTransactionAuditTrailReport002V02 value) {
        this.sctiesSttlmTxAudtTrlRpt = value;
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
    public static MxSemt02200202 parse(String xml) {
        return ((MxSemt02200202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02200202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02200202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02200202 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02200202) parserImpl.read(MxSemt02200202 .class, xml, _classes));
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
     * Creates an MxSemt02200202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02200202 message
     * @return
     *     a new instance of MxSemt02200202
     */
    public final static MxSemt02200202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02200202 .class);
    }

}
