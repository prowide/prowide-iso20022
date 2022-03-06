
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
 * Class for semt.021.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStmtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.021.002.06")
public class MxSemt02100206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStmtQry", required = true)
    protected SecuritiesStatementQuery002V06 sctiesStmtQry;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgementReason16Choice.class, AcknowledgementReason18Choice.class, AcknowledgementReason5Code.class, AdditionalQueryParameters12 .class, AffirmationStatus1Code.class, AffirmationStatus9Choice.class, AllocationSatus4Choice.class, AllocationStatus1Code.class, CancellationProcessingStatus1Code.class, CancellationProcessingStatus8Choice.class, CancellationReason30Choice.class, CancelledStatusReason12Code.class, CorporateActionEventProcessingStatus1Code.class, CorporateActionEventProcessingStatus4Choice.class, CorporateActionEventStage2Code.class, CorporateActionEventStage4Choice.class, DateAndDateTimeChoice.class, DateAndPeriod1Choice.class, DateTimePeriodDetails.class, DeniedReason23Choice.class, DeniedReason7Code.class, DocumentNumber14 .class, DocumentNumber6Choice.class, EventFrequency4Code.class, FailingReason15Choice.class, FailingReason1Code.class, Frequency26Choice.class, GeneratedReason3Code.class, GeneratedReasons6Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, InstructionProcessingStatus1Code.class, InstructionProcessingStatus26Choice.class, MatchingStatus1Code.class, MatchingStatus28Choice.class, MxSemt02100206 .class, OtherIdentification2 .class, PartyIdentification109 .class, PartyIdentification114Choice.class, PendingCancellationReasons5Choice.class, PendingProcessingReason13Choice.class, PendingProcessingReason1Code.class, PendingReason37Choice.class, PendingReason47Choice.class, PendingReason6Code.class, PendingReason7Code.class, PendingReason8Code.class, Period2 .class, Period2Choice.class, Reason17Choice.class, RegistrationProcessingStatus1Code.class, RegistrationProcessingStatus4Choice.class, RejectionReason34Choice.class, RejectionReason39Code.class, RepairReason18Choice.class, RepairReason6Code.class, ReplacementProcessingStatus1Code.class, ReplacementProcessingStatus9Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus10Choice.class, RepoCallRequestStatus1Code.class, ResponseStatus1Code.class, ResponseStatus7Choice.class, SecuritiesAccount27 .class, SecuritiesSettlementStatus2Code.class, SecuritiesStatementQuery002V06 .class, SecuritiesStatementType1Code.class, SecurityIdentification20 .class, SettlementConditionModificationStatus1Code.class, SettlementConditionModificationStatus4Choice.class, SettlementStatus25Choice.class, Statement54 .class, StatementBasis1Code.class, StatementBasis9Choice.class, StatementType6Choice.class, StatementUpdateType1Code.class, Status22Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnmatchedReason14Code.class, UnmatchedReason29Choice.class, UpdateType16Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.021.002.06";

    public MxSemt02100206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02100206(final String xml) {
        this();
        MxSemt02100206 tmp = parse(xml);
        sctiesStmtQry = tmp.getSctiesStmtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02100206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStmtQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatementQuery002V06 }
     *     
     */
    public SecuritiesStatementQuery002V06 getSctiesStmtQry() {
        return sctiesStmtQry;
    }

    /**
     * Sets the value of the sctiesStmtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatementQuery002V06 }
     *     
     */
    public MxSemt02100206 setSctiesStmtQry(SecuritiesStatementQuery002V06 value) {
        this.sctiesStmtQry = value;
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
    public static MxSemt02100206 parse(String xml) {
        return ((MxSemt02100206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02100206 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02100206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02100206 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02100206) parserImpl.read(MxSemt02100206 .class, xml, _classes));
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
     * Creates an MxSemt02100206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02100206 message
     * @return
     *     a new instance of MxSemt02100206
     */
    public final static MxSemt02100206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02100206 .class);
    }

}
