
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
 * Class for semt.022.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.022.002.01")
public class MxSemt02200201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
    protected SecuritiesSettlementTransactionAuditTrailReport002V01 sctiesSttlmTxAudtTrlRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 22;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus15Choice.class, AcknowledgedAcceptedStatus18Choice.class, AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason10Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason4 .class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason6Choice.class, AcknowledgementReason6Code.class, AcknowledgementReason8 .class, AcknowledgementReason8Choice.class, CancellationReason13Choice.class, CancellationReason3 .class, CancellationReason6 .class, CancellationReason7Choice.class, CancellationStatus11Choice.class, CancellationStatus13Choice.class, CancelledStatusReason13Code.class, CancelledStatusReason5Code.class, DeniedReason4 .class, DeniedReason4Code.class, DeniedReason6Choice.class, DeniedStatus9Choice.class, FailingReason2Code.class, FailingReason5 .class, FailingReason5Choice.class, FailingStatus8Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericOrganisationIdentification2 .class, Identification4 .class, MatchingStatus18Choice.class, ModificationProcessingStatus3Choice.class, ModificationReason3 .class, ModificationReason3Choice.class, ModificationStatus3Choice.class, ModifiedStatusReason1Code.class, MxSemt02200201 .class, NoReasonCode.class, OrganisationIdentification9 .class, OrganisationIdentificationSchemeName2Choice.class, Pagination.class, PartyIdentification51Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason3Code.class, PendingProcessingReason6 .class, PendingProcessingReason6Choice.class, PendingProcessingReason7 .class, PendingProcessingReason7Choice.class, PendingProcessingStatus8Choice.class, PendingProcessingStatus9Choice.class, PendingReason10 .class, PendingReason12 .class, PendingReason18Choice.class, PendingReason20Choice.class, PendingReason2Code.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingReason9Code.class, PendingStatus22Choice.class, PendingStatus24Choice.class, PendingStatus31Choice.class, ProcessingStatus25Choice.class, ProcessingStatus26Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, RejectionAndRepairReason16Choice.class, RejectionAndRepairReason19Choice.class, RejectionOrRepairReason16 .class, RejectionOrRepairReason19 .class, RejectionOrRepairStatus20Choice.class, RejectionOrRepairStatus24Choice.class, RejectionReason12Choice.class, RejectionReason13Choice.class, RejectionReason14 .class, RejectionReason15 .class, RejectionReason27Code.class, RejectionReason30Code.class, RejectionReason31Code.class, RejectionReason32Code.class, RejectionStatus10Choice.class, RejectionStatus11Choice.class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairReason7 .class, RepairStatus10Choice.class, RepairStatus9Choice.class, SecuritiesAccount17 .class, SecuritiesSettlementTransactionAuditTrailReport002V01 .class, SettlementStatus13Choice.class, StatusTrail3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications19 .class, UnmatchedReason13Choice.class, UnmatchedReason5Code.class, UnmatchedReason9 .class, UnmatchedStatus10Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.022.002.01";

    public MxSemt02200201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02200201(final String xml) {
        this();
        MxSemt02200201 tmp = parse(xml);
        sctiesSttlmTxAudtTrlRpt = tmp.getSctiesSttlmTxAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02200201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReport002V01 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V01 getSctiesSttlmTxAudtTrlRpt() {
        return sctiesSttlmTxAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReport002V01 }
     *     
     */
    public MxSemt02200201 setSctiesSttlmTxAudtTrlRpt(SecuritiesSettlementTransactionAuditTrailReport002V01 value) {
        this.sctiesSttlmTxAudtTrlRpt = value;
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
    public static MxSemt02200201 parse(String xml) {
        return ((MxSemt02200201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02200201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02200201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02200201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02200201) parserImpl.read(MxSemt02200201 .class, xml, _classes));
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
     * Creates an MxSemt02200201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02200201 message
     * @return
     *     a new instance of MxSemt02200201
     */
    public static final MxSemt02200201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02200201 .class);
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
