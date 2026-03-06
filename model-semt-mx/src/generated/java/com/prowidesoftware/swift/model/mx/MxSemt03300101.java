
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
 * Class for semt.033.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxCxlReqRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT3semt.033.001.01")
public class MxSemt03300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxCxlReqRpt", required = true)
    protected SecuritiesTransactionCancellationRequestReportV01 sctiesTxCxlReqRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 33;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus24Choice1 .class, AmountAndDirection511 .class, CancellationReason101 .class, CancellationReason21Choice1 .class, CancellationStatus15Choice1 .class, CancelledStatusReason5Code.class, CreditDebitCode.class, DateAndDateTimeChoice1 .class, DateAndDateTimeChoice2 .class, DateTimePeriodDetails1Draft.class, DeniedReason111 .class, DeniedReason16Choice1 .class, DeniedReason6CodeDraft.class, DeniedStatus16Choice1 .class, EventFrequency7Code1Draft.class, FinancialInstitutionIdentification121 .class, FinancialInstrumentQuantity1Choice1 .class, Frequency22Choice1 .class, GenericIdentification301Draft.class, GenericIdentification361 .class, GenericIdentification371 .class, IntraPosition51 .class, IntraPositionCancellation31 .class, IntraPositionCancellation41 .class, IntraPositionReport61 .class, MovementResponseType1Code.class, MxSemt03300101 .class, NameAndAddress51 .class, NoReasonCode.class, Pagination.class, PartyIdentification44Choice1 .class, PartyIdentification71Choice1 .class, PartyIdentification71Choice2 .class, PartyIdentification911 .class, PartyIdentificationAndAccount1171 .class, PartyIdentificationAndAccount1172 .class, PendingReason171 .class, PendingReason30Choice1 .class, PendingReason9Code1 .class, PendingStatus39Choice1 .class, Period2Choice1Draft.class, PriorityNumeric4Choice1 .class, ProcessingStatus69Choice1 .class, Quantity6Choice1 .class, References141 .class, RestrictedFINActiveCurrencyAndAmount.class, SecuritiesAccount191 .class, SecuritiesBalanceType11Code1 .class, SecuritiesBalanceType6Choice1Draft.class, SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft.class, SecuritiesTransactionCancellationRequestReportV01 .class, SecurityIdentification191 .class, SettlementDate9Choice1 .class, SettlementOrIntraPosition2Choice1 .class, SettlementParties401 .class, StatementUpdateType1Code.class, SystemPartyIdentification61 .class, TradeDate5Choice1 .class, TransactionDetails941 .class, UpdateType15Choice1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT3semt.033.001.01";

    public MxSemt03300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt03300101(final String xml) {
        this();
        MxSemt03300101 tmp = parse(xml);
        sctiesTxCxlReqRpt = tmp.getSctiesTxCxlReqRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt03300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxCxlReqRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionCancellationRequestReportV01 }
     *     
     */
    public SecuritiesTransactionCancellationRequestReportV01 getSctiesTxCxlReqRpt() {
        return sctiesTxCxlReqRpt;
    }

    /**
     * Sets the value of the sctiesTxCxlReqRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionCancellationRequestReportV01 }
     *     
     */
    public MxSemt03300101 setSctiesTxCxlReqRpt(SecuritiesTransactionCancellationRequestReportV01 value) {
        this.sctiesTxCxlReqRpt = value;
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
    public static MxSemt03300101 parse(String xml) {
        return ((MxSemt03300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt03300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt03300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt03300101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt03300101) parserImpl.read(MxSemt03300101 .class, xml, _classes));
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
     * Creates an MxSemt03300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt03300101 message
     * @return
     *     a new instance of MxSemt03300101
     */
    public static final MxSemt03300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt03300101 .class);
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
