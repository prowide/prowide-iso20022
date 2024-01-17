
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
 * Class for semt.021.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStmtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.021.002.01")
public class MxSemt02100201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStmtQry", required = true)
    protected SecuritiesStatementQuery002V01 sctiesStmtQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 21;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgementReason5Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason7Choice.class, AdditionalQueryParameters2 .class, AffirmationStatus1Code.class, AffirmationStatus2Choice.class, AllocationSatus2Choice.class, AllocationStatus1Code.class, AlternateIdentification2 .class, CancellationProcessingStatus1Code.class, CancellationProcessingStatus2Choice.class, CancellationReason6Choice.class, CancelledStatusReason10Code.class, CopyDuplicate1Code.class, CorporateActionEventProcessingStatus1Code.class, CorporateActionEventProcessingStatus2Choice.class, CorporateActionEventStage2Choice.class, CorporateActionEventStage2Code.class, DateAndDateTimeChoice.class, DateAndPeriod1Choice.class, DateTimePeriodDetails.class, DeniedReason4Choice.class, DeniedReason5Code.class, DocumentIdentification16 .class, DocumentNumber2Choice.class, DocumentNumber3 .class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FailingReason1Code.class, FailingReason2Choice.class, Frequency6Choice.class, GeneratedReason2Code.class, GeneratedReasons2Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, IdentificationSource2Choice.class, InstructionProcessingStatus1Code.class, InstructionProcessingStatus5Choice.class, MatchingStatus1Code.class, MatchingStatus5Choice.class, MxSemt02100201 .class, NameAndAddress12 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, PendingCancellationReasons3Choice.class, PendingProcessingReason1Code.class, PendingProcessingReason2Choice.class, PendingReason3Code.class, PendingReason6Code.class, PendingReason7Code.class, PendingReason8Choice.class, PendingReason9Choice.class, Period2 .class, Period2Choice.class, Reason2Choice.class, RegistrationProcessingStatus1Code.class, RegistrationProcessingStatus2Choice.class, RejectionReason16Code.class, RejectionReason7Choice.class, RepairReason4Choice.class, RepairReason5Code.class, ReplacementProcessingStatus1Code.class, ReplacementProcessingStatus2Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus1Code.class, RepoCallRequestStatus3Choice.class, ResponseStatus1Code.class, ResponseStatus2Choice.class, SecuritiesAccount17 .class, SecuritiesSettlementStatus1Code.class, SecuritiesStatementQuery002V01 .class, SecuritiesStatementType1Code.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementConditionModificationStatus1Code.class, SettlementConditionModificationStatus2Choice.class, SettlementStatus3Choice.class, Statement29 .class, StatementBasis1Code.class, StatementBasis4Choice.class, StatementType3Choice.class, StatementUpdateType1Code.class, Status3Choice.class, UnmatchedReason3Code.class, UnmatchedReason4Choice.class, UpdateType3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.021.002.01";

    public MxSemt02100201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02100201(final String xml) {
        this();
        MxSemt02100201 tmp = parse(xml);
        sctiesStmtQry = tmp.getSctiesStmtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02100201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStmtQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatementQuery002V01 }
     *     
     */
    public SecuritiesStatementQuery002V01 getSctiesStmtQry() {
        return sctiesStmtQry;
    }

    /**
     * Sets the value of the sctiesStmtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatementQuery002V01 }
     *     
     */
    public MxSemt02100201 setSctiesStmtQry(SecuritiesStatementQuery002V01 value) {
        this.sctiesStmtQry = value;
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
    public static MxSemt02100201 parse(String xml) {
        return ((MxSemt02100201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02100201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02100201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02100201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02100201) parserImpl.read(MxSemt02100201 .class, xml, _classes));
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
     * Creates an MxSemt02100201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02100201 message
     * @return
     *     a new instance of MxSemt02100201
     */
    public static final MxSemt02100201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02100201 .class);
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
