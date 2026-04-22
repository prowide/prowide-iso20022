
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
 * Class for semt.034.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.034.001.01")
public class MxSemt03400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntPdgRpt", required = true)
    protected IntraPositionMovementPendingReportV01 intraPosMvmntPdgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 34;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus34Choice.class, AcknowledgementReason11Code.class, AcknowledgementReason22 .class, AcknowledgementReason25Choice.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, CancellationReason19Choice.class, CancellationReason9 .class, CancellationStatus14Choice.class, CancelledStatusReason13Code.class, ClassificationType32Choice.class, CorporateActionEventType24Code.class, CorporateActionEventType56Choice.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DocumentNumber5Choice.class, EventFrequency3Code.class, EventFrequency7Code.class, FailingReason15 .class, FailingReason20Choice.class, FailingReason6Code.class, FailingStatus17Choice.class, FinancialInstrumentAttributes92 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency22Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, IntraPositionMovementPendingReportV01 .class, IntraPositionPending11 .class, IntraPositionPending12 .class, IntraPositionReport7 .class, Linkages57 .class, MarketIdentification3Choice.class, MxSemt03400101 .class, NameAndAddress5 .class, NoReasonCode.class, Number22Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PendingReason31Code.class, PendingReason34 .class, PendingReason75Choice.class, PendingStatus79Choice.class, PendingStatusAndReason4 .class, Period2 .class, Period7Choice.class, PostalAddress1 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceType4Choice.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProcessingStatus100Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, QuantityBreakdown31 .class, QuantityBreakdown32 .class, References34Choice.class, RejectionAndRepairReason32Choice.class, RejectionOrRepairReason32 .class, RejectionOrRepairStatus38Choice.class, RejectionReason33Code.class, SecuritiesAccount19 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType6Choice.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesSubBalanceTypeAndQuantityBreakdown3 .class, SecurityIdentification19 .class, SettlementStatus34Choice.class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.034.001.01";

    public MxSemt03400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt03400101(final String xml) {
        this();
        MxSemt03400101 tmp = parse(xml);
        intraPosMvmntPdgRpt = tmp.getIntraPosMvmntPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt03400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementPendingReportV01 }
     *     
     */
    public IntraPositionMovementPendingReportV01 getIntraPosMvmntPdgRpt() {
        return intraPosMvmntPdgRpt;
    }

    /**
     * Sets the value of the intraPosMvmntPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementPendingReportV01 }
     *     
     */
    public MxSemt03400101 setIntraPosMvmntPdgRpt(IntraPositionMovementPendingReportV01 value) {
        this.intraPosMvmntPdgRpt = value;
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
    public static MxSemt03400101 parse(String xml) {
        return ((MxSemt03400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt03400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt03400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt03400101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt03400101) parserImpl.read(MxSemt03400101 .class, xml, _classes));
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
     * Creates an MxSemt03400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt03400101 message
     * @return
     *     a new instance of MxSemt03400101
     */
    public static final MxSemt03400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt03400101 .class);
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
