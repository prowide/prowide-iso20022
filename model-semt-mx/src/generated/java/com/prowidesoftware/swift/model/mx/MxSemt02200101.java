
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
 * Class for semt.022.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.01")
public class MxSemt02200101
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
    protected SecuritiesSettlementTransactionAuditTrailReportV01 sctiesSttlmTxAudtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus12Choice.class, AcknowledgedAcceptedStatus14Choice.class, AcknowledgedAcceptedStatus7Choice.class, AcknowledgementReason1 .class, AcknowledgementReason1Choice.class, AcknowledgementReason3 .class, AcknowledgementReason3Code.class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6Code.class, AcknowledgementReason7 .class, AcknowledgementReason9Choice.class, CancellationReason12Choice.class, CancellationReason2 .class, CancellationReason3Choice.class, CancellationReason5 .class, CancellationStatus7Choice.class, CancellationStatus9Choice.class, CancelledStatusReason13Code.class, CancelledStatusReason5Code.class, DeniedReason2 .class, DeniedReason2Choice.class, DeniedReason4Code.class, DeniedStatus6Choice.class, FailingReason2Code.class, FailingReason3 .class, FailingReason3Choice.class, FailingStatus3Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericOrganisationIdentification1 .class, Identification1 .class, MatchingStatus7Choice.class, ModificationProcessingStatus2Choice.class, ModificationReason2 .class, ModificationReason2Choice.class, ModificationStatus2Choice.class, ModifiedStatusReason1Code.class, MxSemt02200101 .class, NoReasonCode.class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, Pagination.class, PartyIdentification36Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason3 .class, PendingProcessingReason3Choice.class, PendingProcessingReason3Code.class, PendingProcessingReason5 .class, PendingProcessingReason5Choice.class, PendingProcessingStatus3Choice.class, PendingProcessingStatus7Choice.class, PendingReason13Choice.class, PendingReason15Choice.class, PendingReason2 .class, PendingReason2Choice.class, PendingReason2Code.class, PendingReason5 .class, PendingReason6Code.class, PendingReason7 .class, PendingReason9Code.class, PendingStatus11Choice.class, PendingStatus13Choice.class, PendingStatus9Choice.class, ProcessingStatus19Choice.class, ProcessingStatus20Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, RejectionAndRepairReason13Choice.class, RejectionAndRepairReason18Choice.class, RejectionOrRepairReason13 .class, RejectionOrRepairReason18 .class, RejectionOrRepairStatus14Choice.class, RejectionOrRepairStatus25Choice.class, RejectionReason10 .class, RejectionReason10Choice.class, RejectionReason11 .class, RejectionReason11Choice.class, RejectionReason27Code.class, RejectionReason30Code.class, RejectionReason31Code.class, RejectionReason32Code.class, RejectionStatus5Choice.class, RejectionStatus8Choice.class, RepairReason1 .class, RepairReason1Choice.class, RepairReason4Code.class, RepairReason6 .class, RepairStatus5Choice.class, RepairStatus8Choice.class, SecuritiesAccount13 .class, SecuritiesSettlementTransactionAuditTrailReportV01 .class, SettlementStatus7Choice.class, StatusTrail2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications15 .class, UnmatchedReason5Code.class, UnmatchedReason6 .class, UnmatchedReason9Choice.class, UnmatchedStatus5Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.01";

    public MxSemt02200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02200101(final String xml) {
        this();
        MxSemt02200101 tmp = parse(xml);
        sctiesSttlmTxAudtTrlRpt = tmp.getSctiesSttlmTxAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReportV01 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV01 getSctiesSttlmTxAudtTrlRpt() {
        return sctiesSttlmTxAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReportV01 }
     *     
     */
    public MxSemt02200101 setSctiesSttlmTxAudtTrlRpt(SecuritiesSettlementTransactionAuditTrailReportV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSemt02200101 parse(String xml) {
        return ((MxSemt02200101) MxReadImpl.parse(MxSemt02200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02200101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02200101) parserImpl.read(MxSemt02200101 .class, xml, _classes));
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
     * Creates an MxSemt02200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02200101 message
     * @return
     *     a new instance of MxSemt02200101
     */
    public final static MxSemt02200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt02200101 .class);
    }

}
