
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
 * Class for semt.021.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStmtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.021.001.06")
public class MxSemt02100106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStmtQry", required = true)
    protected SecuritiesStatementQueryV06 sctiesStmtQry;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgementReason12Choice.class, AcknowledgementReason13Choice.class, AcknowledgementReason5Code.class, AdditionalQueryParameters11 .class, AffirmationStatus1Code.class, AffirmationStatus8Choice.class, AllocationSatus3Choice.class, AllocationStatus1Code.class, CancellationProcessingStatus1Code.class, CancellationProcessingStatus7Choice.class, CancellationReason20Choice.class, CancelledStatusReason12Code.class, CorporateActionEventProcessingStatus1Code.class, CorporateActionEventProcessingStatus3Choice.class, CorporateActionEventStage2Code.class, CorporateActionEventStage3Choice.class, DateAndDateTimeChoice.class, DateAndPeriod1Choice.class, DateTimePeriodDetails.class, DeniedReason14Choice.class, DeniedReason7Code.class, DocumentNumber13 .class, DocumentNumber5Choice.class, EventFrequency4Code.class, FailingReason1Code.class, FailingReason9Choice.class, Frequency25Choice.class, GeneratedReason3Code.class, GeneratedReasons5Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, InstructionProcessingStatus1Code.class, InstructionProcessingStatus23Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, MxSemt02100106 .class, OtherIdentification1 .class, PartyIdentification92Choice.class, PartyIdentification98 .class, PendingCancellationReasons4Choice.class, PendingProcessingReason11Choice.class, PendingProcessingReason1Code.class, PendingReason28Choice.class, PendingReason29Choice.class, PendingReason6Code.class, PendingReason7Code.class, PendingReason8Code.class, Period2 .class, Period2Choice.class, Reason16Choice.class, RegistrationProcessingStatus1Code.class, RegistrationProcessingStatus3Choice.class, RejectionReason22Choice.class, RejectionReason39Code.class, RepairReason11Choice.class, RepairReason6Code.class, ReplacementProcessingStatus1Code.class, ReplacementProcessingStatus8Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus1Code.class, RepoCallRequestStatus8Choice.class, ResponseStatus1Code.class, ResponseStatus5Choice.class, SecuritiesAccount24 .class, SecuritiesSettlementStatus2Code.class, SecuritiesStatementQueryV06 .class, SecuritiesStatementType1Code.class, SecurityIdentification19 .class, SettlementConditionModificationStatus1Code.class, SettlementConditionModificationStatus3Choice.class, SettlementStatus19Choice.class, Statement42 .class, StatementBasis1Code.class, StatementBasis7Choice.class, StatementType5Choice.class, StatementUpdateType1Code.class, Status19Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnmatchedReason14Code.class, UnmatchedReason22Choice.class, UpdateType15Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.021.001.06";

    public MxSemt02100106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02100106(final String xml) {
        this();
        MxSemt02100106 tmp = parse(xml);
        sctiesStmtQry = tmp.getSctiesStmtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02100106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStmtQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatementQueryV06 }
     *     
     */
    public SecuritiesStatementQueryV06 getSctiesStmtQry() {
        return sctiesStmtQry;
    }

    /**
     * Sets the value of the sctiesStmtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatementQueryV06 }
     *     
     */
    public MxSemt02100106 setSctiesStmtQry(SecuritiesStatementQueryV06 value) {
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
    public static MxSemt02100106 parse(String xml) {
        return ((MxSemt02100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02100106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02100106 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02100106) parserImpl.read(MxSemt02100106 .class, xml, _classes));
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
     * Creates an MxSemt02100106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02100106 message
     * @return
     *     a new instance of MxSemt02100106
     */
    public final static MxSemt02100106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02100106 .class);
    }

}
