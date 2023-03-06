
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
 * Class for semt.022.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.03")
public class MxSemt02200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
    protected SecuritiesSettlementTransactionAuditTrailReportV03 sctiesSttlmTxAudtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgedAcceptedStatus23Choice.class, AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason11 .class, AcknowledgementReason12 .class, AcknowledgementReason12Choice.class, AcknowledgementReason14Choice.class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason5Code.class, AcknowledgementReason6Code.class, AcknowledgementReason9 .class, CancellationReason10 .class, CancellationReason19Choice.class, CancellationReason21Choice.class, CancellationReason9 .class, CancellationStatus14Choice.class, CancellationStatus15Choice.class, CancelledStatusReason13Code.class, CancelledStatusReason5Code.class, DeniedReason10 .class, DeniedReason11 .class, DeniedReason15Choice.class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedReason6Code.class, DeniedStatus15Choice.class, DeniedStatus16Choice.class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericOrganisationIdentification1 .class, Identification14 .class, MatchingStatus25Choice.class, ModificationProcessingStatus7Choice.class, ModificationReason4 .class, ModificationReason4Choice.class, ModificationStatus4Choice.class, ModifiedStatusReason1Code.class, MxSemt02200103 .class, NoReasonCode.class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, Pagination.class, PartyIdentification92Choice.class, PartyIdentification98 .class, PendingProcessingReason10 .class, PendingProcessingReason10Choice.class, PendingProcessingReason12Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason3Code.class, PendingProcessingReason8 .class, PendingProcessingStatus11Choice.class, PendingProcessingStatus13Choice.class, PendingReason15 .class, PendingReason16 .class, PendingReason17 .class, PendingReason27Choice.class, PendingReason28Choice.class, PendingReason2Code.class, PendingReason30Choice.class, PendingReason6Code.class, PendingReason9Code.class, PendingStatus37Choice.class, PendingStatus38Choice.class, PendingStatus39Choice.class, ProcessingStatus49Choice.class, ProcessingStatus53Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectionAndRepairReason24Choice.class, RejectionAndRepairReason25Choice.class, RejectionOrRepairReason24 .class, RejectionOrRepairReason25 .class, RejectionOrRepairStatus30Choice.class, RejectionOrRepairStatus31Choice.class, RejectionReason23Choice.class, RejectionReason24Choice.class, RejectionReason25 .class, RejectionReason26 .class, RejectionReason27Code.class, RejectionReason30Code.class, RejectionReason31Code.class, RejectionReason32Code.class, RejectionStatus17Choice.class, RejectionStatus18Choice.class, RepairReason10Choice.class, RepairReason4Code.class, RepairReason8 .class, RepairReason9 .class, RepairStatus12Choice.class, RepairStatus13Choice.class, SecuritiesAccount24 .class, SecuritiesSettlementTransactionAuditTrailReportV03 .class, SettlementStatus17Choice.class, StatusTrail6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications29 .class, UnmatchedReason12Code.class, UnmatchedReason16 .class, UnmatchedReason23Choice.class, UnmatchedStatus17Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.03";

    public MxSemt02200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02200103(final String xml) {
        this();
        MxSemt02200103 tmp = parse(xml);
        sctiesSttlmTxAudtTrlRpt = tmp.getSctiesSttlmTxAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReportV03 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV03 getSctiesSttlmTxAudtTrlRpt() {
        return sctiesSttlmTxAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReportV03 }
     *     
     */
    public MxSemt02200103 setSctiesSttlmTxAudtTrlRpt(SecuritiesSettlementTransactionAuditTrailReportV03 value) {
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
    public static MxSemt02200103 parse(String xml) {
        return ((MxSemt02200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02200103 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02200103) parserImpl.read(MxSemt02200103 .class, xml, _classes));
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
     * Creates an MxSemt02200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02200103 message
     * @return
     *     a new instance of MxSemt02200103
     */
    public final static MxSemt02200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02200103 .class);
    }

}
