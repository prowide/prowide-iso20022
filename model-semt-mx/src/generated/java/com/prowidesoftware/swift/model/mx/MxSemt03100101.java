
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
 * Class for semt.031.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondsModReqRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.031.001.01")
public class MxSemt03100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondsModReqRpt", required = true)
    protected SecuritiesSettlementConditionsModificationRequestReportV01 sctiesSttlmCondsModReqRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, AutoBorrowing2Code.class, AutomaticBorrowing7Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DateType3Code.class, DeniedReason11 .class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedStatus16Choice.class, DocumentNumber5Choice.class, EventFrequency7Code.class, FinancialInstrumentQuantity1Choice.class, Frequency22Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, HoldIndicator6 .class, IdentificationSource3Choice.class, IntraPosition6 .class, LinkageType1Code.class, LinkageType3Choice.class, Linkages57 .class, MatchingDenied3Choice.class, MatchingProcess1Code.class, MovementResponseType1Code.class, MxSemt03100101 .class, NameAndAddress5 .class, NoReasonCode.class, Number3Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PartyIdentification148 .class, PartyIdentificationAndAccount170 .class, PendingReason16 .class, PendingReason28Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, Period2 .class, Period7Choice.class, PostalAddress1 .class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProcessingStatus71Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, QuantityBreakdown32 .class, References32 .class, References34Choice.class, Registration10Choice.class, Registration2Code.class, RegistrationReason5 .class, RejectionAndRepairReason33Choice.class, RejectionAndRepairReason34Choice.class, RejectionOrRepairReason33 .class, RejectionOrRepairReason34 .class, RejectionOrRepairStatus39Choice.class, RejectionOrRepairStatus40Choice.class, RejectionReason34Code.class, RejectionReason35Code.class, RequestDetails33 .class, RestrictionIdentification1 .class, RestrictionReference1Code.class, SecuritiesAccount19 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType6Choice.class, SecuritiesModification2 .class, SecuritiesModificationTransaction2 .class, SecuritiesRTGS4Choice.class, SecuritiesSettlementConditionsModificationRequestReportV01 .class, SecuritiesSubBalanceTypeAndQuantityBreakdown3 .class, SecuritiesTransactionReport5 .class, SecuritiesTransactionType5Code.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementOrIntraPosition3Choice.class, SettlementParties78 .class, SettlementTransactionCondition5Code.class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionDetails126 .class, UnilateralSplit3Choice.class, UpdateType15Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.031.001.01";

    public MxSemt03100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt03100101(final String xml) {
        this();
        MxSemt03100101 tmp = parse(xml);
        sctiesSttlmCondsModReqRpt = tmp.getSctiesSttlmCondsModReqRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt03100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondsModReqRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionsModificationRequestReportV01 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequestReportV01 getSctiesSttlmCondsModReqRpt() {
        return sctiesSttlmCondsModReqRpt;
    }

    /**
     * Sets the value of the sctiesSttlmCondsModReqRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionsModificationRequestReportV01 }
     *     
     */
    public MxSemt03100101 setSctiesSttlmCondsModReqRpt(SecuritiesSettlementConditionsModificationRequestReportV01 value) {
        this.sctiesSttlmCondsModReqRpt = value;
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
    public static MxSemt03100101 parse(String xml) {
        return ((MxSemt03100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt03100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt03100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt03100101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt03100101) parserImpl.read(MxSemt03100101 .class, xml, _classes));
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
     * Creates an MxSemt03100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt03100101 message
     * @return
     *     a new instance of MxSemt03100101
     */
    public static final MxSemt03100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt03100101 .class);
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
