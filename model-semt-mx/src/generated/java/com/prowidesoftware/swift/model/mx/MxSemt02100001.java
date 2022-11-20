
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
 * Class for semt.021.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStmtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.021.000.01")
public class MxSemt02100001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStmtQry", required = true)
    protected SecuritiesStatementQueryV1 sctiesStmtQry;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 0;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgementReason2Choice.class, AcknowledgementReason3Choice.class, AcknowledgementReason5Code.class, AdditionalQueryParameters1 .class, AddressType2Code.class, AffirmationStatus1Choice.class, AffirmationStatus1Code.class, AllocationSatus1Choice.class, AllocationStatus1Code.class, AlternateIdentification1 .class, CancellationProcessingStatus1Choice.class, CancellationProcessingStatus1Code.class, CancellationReason4Choice.class, CancelledStatusReason10Code.class, CopyDuplicate1Code.class, CorporateActionEventProcessingStatus1Choice.class, CorporateActionEventProcessingStatus1Code.class, CorporateActionEventStage1Choice.class, CorporateActionEventStage2Code.class, DateAndDateTimeChoice.class, DateAndPeriod1Choice.class, DateTimePeriodDetails.class, DeniedReason1Choice.class, DeniedReason5Code.class, DocumentIdentification11 .class, DocumentNumber1 .class, DocumentNumber1Choice.class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FailingReason1Choice.class, FailingReason1Code.class, Frequency4Choice.class, GeneratedReason2Code.class, GeneratedReasons1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, IdentificationSource1Choice.class, InstructionProcessingStatus1Code.class, InstructionProcessingStatus2Choice.class, MatchingStatus1Choice.class, MatchingStatus1Code.class, MxSemt02100001 .class, NameAndAddress5 .class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PendingCancellationReasons2Choice.class, PendingProcessingReason1Choice.class, PendingProcessingReason1Code.class, PendingReason2Choice.class, PendingReason3Choice.class, PendingReason3Code.class, PendingReason6Code.class, PendingReason7Code.class, Period2 .class, Period2Choice.class, PostalAddress1 .class, Reason1Choice.class, RegistrationProcessingStatus1Choice.class, RegistrationProcessingStatus1Code.class, RejectionReason16Code.class, RejectionReason5Choice.class, RepairReason3Choice.class, RepairReason5Code.class, ReplacementProcessingStatus1Choice.class, ReplacementProcessingStatus1Code.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus1Choice.class, RepoCallRequestStatus1Code.class, ResponseStatus1Choice.class, ResponseStatus1Code.class, SecuritiesAccount13 .class, SecuritiesSettlementStatus1Code.class, SecuritiesStatementQueryV1 .class, SecuritiesStatementType1Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementConditionModificationStatus1Choice.class, SettlementConditionModificationStatus1Code.class, SettlementStatus1Choice.class, Statement16 .class, StatementBasis1Code.class, StatementBasis3Choice.class, StatementType2Choice.class, StatementUpdateType1Code.class, Status1Choice.class, UnmatchedReason2Choice.class, UnmatchedReason3Code.class, UpdateType2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.021.000.01";

    public MxSemt02100001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02100001(final String xml) {
        this();
        MxSemt02100001 tmp = parse(xml);
        sctiesStmtQry = tmp.getSctiesStmtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02100001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStmtQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatementQueryV1 }
     *     
     */
    public SecuritiesStatementQueryV1 getSctiesStmtQry() {
        return sctiesStmtQry;
    }

    /**
     * Sets the value of the sctiesStmtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatementQueryV1 }
     *     
     */
    public MxSemt02100001 setSctiesStmtQry(SecuritiesStatementQueryV1 value) {
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
    public static MxSemt02100001 parse(String xml) {
        return ((MxSemt02100001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02100001 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02100001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02100001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02100001 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02100001) parserImpl.read(MxSemt02100001 .class, xml, _classes));
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
     * Creates an MxSemt02100001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02100001 message
     * @return
     *     a new instance of MxSemt02100001
     */
    public final static MxSemt02100001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02100001 .class);
    }

}
