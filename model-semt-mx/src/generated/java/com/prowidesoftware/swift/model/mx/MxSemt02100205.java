
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
 * Class for semt.021.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStmtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.021.002.05")
public class MxSemt02100205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStmtQry", required = true)
    protected SecuritiesStatementQuery002V05 sctiesStmtQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 21;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgementReason11Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason7Choice.class, AdditionalQueryParameters10 .class, AffirmationStatus1Code.class, AffirmationStatus2Choice.class, AllocationSatus2Choice.class, AllocationStatus1Code.class, CancellationProcessingStatus1Code.class, CancellationProcessingStatus2Choice.class, CancellationReason10Choice.class, CancelledStatusReason12Code.class, CorporateActionEventProcessingStatus1Code.class, CorporateActionEventProcessingStatus2Choice.class, CorporateActionEventStage2Choice.class, CorporateActionEventStage2Code.class, DateAndDateTimeChoice.class, DateAndPeriod1Choice.class, DateTimePeriodDetails.class, DeniedReason12Choice.class, DeniedReason7Code.class, DocumentNumber2Choice.class, DocumentNumber3 .class, EventFrequency4Code.class, FailingReason1Code.class, FailingReason2Choice.class, Frequency6Choice.class, GeneratedReason3Code.class, GeneratedReasons4Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification66 .class, IdentificationSource4Choice.class, InstructionProcessingStatus1Code.class, InstructionProcessingStatus5Choice.class, MatchingStatus1Code.class, MatchingStatus5Choice.class, MxSemt02100205 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, PendingCancellationReasons3Choice.class, PendingProcessingReason1Code.class, PendingProcessingReason2Choice.class, PendingReason12Choice.class, PendingReason6Code.class, PendingReason7Code.class, PendingReason8Code.class, PendingReason9Choice.class, Period2 .class, Period2Choice.class, Reason15Choice.class, RegistrationProcessingStatus1Code.class, RegistrationProcessingStatus2Choice.class, RejectionReason21Choice.class, RejectionReason39Code.class, RepairReason6Code.class, RepairReason8Choice.class, ReplacementProcessingStatus1Code.class, ReplacementProcessingStatus2Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus1Code.class, RepoCallRequestStatus3Choice.class, ResponseStatus1Code.class, ResponseStatus2Choice.class, SecuritiesAccount17 .class, SecuritiesSettlementStatus2Code.class, SecuritiesStatementQuery002V05 .class, SecuritiesStatementType1Code.class, SecurityIdentification15 .class, SettlementConditionModificationStatus1Code.class, SettlementConditionModificationStatus2Choice.class, SettlementStatus6Choice.class, Statement29 .class, StatementBasis1Code.class, StatementBasis4Choice.class, StatementType3Choice.class, StatementUpdateType1Code.class, Status10Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnmatchedReason20Choice.class, UnmatchedReason9Code.class, UpdateType3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.021.002.05";

    public MxSemt02100205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02100205(final String xml) {
        this();
        MxSemt02100205 tmp = parse(xml);
        sctiesStmtQry = tmp.getSctiesStmtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02100205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStmtQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatementQuery002V05 }
     *     
     */
    public SecuritiesStatementQuery002V05 getSctiesStmtQry() {
        return sctiesStmtQry;
    }

    /**
     * Sets the value of the sctiesStmtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatementQuery002V05 }
     *     
     */
    public MxSemt02100205 setSctiesStmtQry(SecuritiesStatementQuery002V05 value) {
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
    public static MxSemt02100205 parse(String xml) {
        return ((MxSemt02100205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02100205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02100205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02100205 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02100205) parserImpl.read(MxSemt02100205 .class, xml, _classes));
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
     * Creates an MxSemt02100205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02100205 message
     * @return
     *     a new instance of MxSemt02100205
     */
    public static final MxSemt02100205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02100205 .class);
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
