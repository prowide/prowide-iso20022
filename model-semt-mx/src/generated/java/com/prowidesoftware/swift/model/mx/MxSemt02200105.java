
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
 * Class for semt.022.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.05")
public class MxSemt02200105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
    protected SecuritiesSettlementTransactionAuditTrailReportV05 sctiesSttlmTxAudtTrlRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 22;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgedAcceptedStatus23Choice.class, AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason11 .class, AcknowledgementReason12 .class, AcknowledgementReason12Choice.class, AcknowledgementReason14Choice.class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason5Code.class, AcknowledgementReason6Code.class, AcknowledgementReason9 .class, BlockChainAddressWallet3 .class, CancellationReason10 .class, CancellationReason21Choice.class, CancellationReason22 .class, CancellationReason36Choice.class, CancellationStatus15Choice.class, CancellationStatus24Choice.class, CancelledStatusReason16Code.class, CancelledStatusReason5Code.class, DeniedReason10 .class, DeniedReason11 .class, DeniedReason15Choice.class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedReason6Code.class, DeniedStatus15Choice.class, DeniedStatus16Choice.class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericOrganisationIdentification1 .class, MatchingStatus25Choice.class, ModificationProcessingStatus10Choice.class, ModificationReason4 .class, ModificationReason4Choice.class, ModificationStatus4Choice.class, ModifiedStatusReason1Code.class, MxSemt02200105 .class, NoReasonCode.class, OrganisationIdentification31 .class, OrganisationIdentificationSchemeName1Choice.class, Pagination1 .class, PartyIdentification127Choice.class, PartyIdentification144 .class, PendingProcessingReason10 .class, PendingProcessingReason10Choice.class, PendingProcessingReason12Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason3Code.class, PendingProcessingReason8 .class, PendingProcessingStatus11Choice.class, PendingProcessingStatus13Choice.class, PendingReason15 .class, PendingReason16 .class, PendingReason17 .class, PendingReason27Choice.class, PendingReason28Choice.class, PendingReason2Code.class, PendingReason30Choice.class, PendingReason6Code.class, PendingReason9Code.class, PendingStatus37Choice.class, PendingStatus38Choice.class, PendingStatus39Choice.class, ProcessingStatus86Choice.class, ProcessingStatus87Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectionAndRepairReason37Choice.class, RejectionAndRepairReason38Choice.class, RejectionOrRepairReason37 .class, RejectionOrRepairReason38 .class, RejectionOrRepairStatus42Choice.class, RejectionOrRepairStatus43Choice.class, RejectionReason42Choice.class, RejectionReason43Choice.class, RejectionReason57 .class, RejectionReason58 .class, RejectionReason71Code.class, RejectionReason72Code.class, RejectionReason73Code.class, RejectionReason74Code.class, RejectionStatus37Choice.class, RejectionStatus38Choice.class, RepairReason10Choice.class, RepairReason4Code.class, RepairReason8 .class, RepairReason9 .class, RepairStatus12Choice.class, RepairStatus13Choice.class, SecuritiesAccount22 .class, SecuritiesSettlementTransactionAuditTrailReportV05 .class, SettlementStatus17Choice.class, StatusTrail10 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications29 .class, UnmatchedReason12Code.class, UnmatchedReason16 .class, UnmatchedReason23Choice.class, UnmatchedStatus17Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.022.001.05";

    public MxSemt02200105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02200105(final String xml) {
        this();
        MxSemt02200105 tmp = parse(xml);
        sctiesSttlmTxAudtTrlRpt = tmp.getSctiesSttlmTxAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02200105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReportV05 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReportV05 getSctiesSttlmTxAudtTrlRpt() {
        return sctiesSttlmTxAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReportV05 }
     *     
     */
    public MxSemt02200105 setSctiesSttlmTxAudtTrlRpt(SecuritiesSettlementTransactionAuditTrailReportV05 value) {
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
    public static MxSemt02200105 parse(String xml) {
        return ((MxSemt02200105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02200105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02200105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02200105 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02200105) parserImpl.read(MxSemt02200105 .class, xml, _classes));
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
     * Creates an MxSemt02200105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02200105 message
     * @return
     *     a new instance of MxSemt02200105
     */
    public static final MxSemt02200105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02200105 .class);
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
