
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
 * Class for semt.022.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.022.002.05")
public class MxSemt02200205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAudtTrlRpt", required = true)
    protected SecuritiesSettlementTransactionAuditTrailReport002V05 sctiesSttlmTxAudtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgedAcceptedStatus30Choice.class, AcknowledgedAcceptedStatus31Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason18 .class, AcknowledgementReason19 .class, AcknowledgementReason21Choice.class, AcknowledgementReason22Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason5Code.class, AcknowledgementReason6Code.class, BlockChainAddressWallet7 .class, CancellationReason18 .class, CancellationReason24 .class, CancellationReason28Choice.class, CancellationReason37Choice.class, CancellationStatus20Choice.class, CancellationStatus25Choice.class, CancelledStatusReason16Code.class, CancelledStatusReason5Code.class, DeniedReason16 .class, DeniedReason17 .class, DeniedReason21Choice.class, DeniedReason24Choice.class, DeniedReason4Code.class, DeniedReason6Code.class, DeniedStatus19Choice.class, DeniedStatus21Choice.class, FailingReason10 .class, FailingReason11Choice.class, FailingReason2Code.class, FailingStatus12Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericOrganisationIdentification2 .class, MatchingStatus30Choice.class, ModificationProcessingStatus11Choice.class, ModificationReason5 .class, ModificationReason5Choice.class, ModificationStatus5Choice.class, ModifiedStatusReason1Code.class, MxSemt02200205 .class, NoReasonCode.class, OrganisationIdentification32 .class, OrganisationIdentificationSchemeName2Choice.class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification156 .class, PendingProcessingReason12 .class, PendingProcessingReason13 .class, PendingProcessingReason14Choice.class, PendingProcessingReason15Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason3Code.class, PendingProcessingStatus15Choice.class, PendingProcessingStatus16Choice.class, PendingReason20 .class, PendingReason24 .class, PendingReason25 .class, PendingReason2Code.class, PendingReason37Choice.class, PendingReason41Choice.class, PendingReason42Choice.class, PendingReason6Code.class, PendingReason9Code.class, PendingStatus46Choice.class, PendingStatus50Choice.class, PendingStatus51Choice.class, ProcessingStatus92Choice.class, ProcessingStatus93Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, RejectionAndRepairReason41Choice.class, RejectionAndRepairReason42Choice.class, RejectionOrRepairReason41 .class, RejectionOrRepairReason42 .class, RejectionOrRepairStatus46Choice.class, RejectionOrRepairStatus47Choice.class, RejectionReason47Choice.class, RejectionReason48Choice.class, RejectionReason62 .class, RejectionReason63 .class, RejectionReason71Code.class, RejectionReason72Code.class, RejectionReason73Code.class, RejectionReason74Code.class, RejectionStatus41Choice.class, RejectionStatus42Choice.class, RepairReason12 .class, RepairReason13 .class, RepairReason14Choice.class, RepairReason4Code.class, RepairStatus16Choice.class, RepairStatus17Choice.class, SecuritiesAccount37 .class, SecuritiesSettlementTransactionAuditTrailReport002V05 .class, SettlementStatus22Choice.class, StatusTrail11 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionIdentifications34 .class, UnmatchedReason12Code.class, UnmatchedReason19 .class, UnmatchedReason26Choice.class, UnmatchedStatus20Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.022.002.05";

    public MxSemt02200205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02200205(final String xml) {
        this();
        MxSemt02200205 tmp = parse(xml);
        sctiesSttlmTxAudtTrlRpt = tmp.getSctiesSttlmTxAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02200205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReport002V05 }
     *     
     */
    public SecuritiesSettlementTransactionAuditTrailReport002V05 getSctiesSttlmTxAudtTrlRpt() {
        return sctiesSttlmTxAudtTrlRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAuditTrailReport002V05 }
     *     
     */
    public MxSemt02200205 setSctiesSttlmTxAudtTrlRpt(SecuritiesSettlementTransactionAuditTrailReport002V05 value) {
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
    public static MxSemt02200205 parse(String xml) {
        return ((MxSemt02200205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02200205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02200205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02200205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02200205 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02200205) parserImpl.read(MxSemt02200205 .class, xml, _classes));
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
     * Creates an MxSemt02200205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02200205 message
     * @return
     *     a new instance of MxSemt02200205
     */
    public final static MxSemt02200205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02200205 .class);
    }

}
