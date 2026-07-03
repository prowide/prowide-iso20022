
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT4semt.031.001.01")
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
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice1 .class, AmountAndDirection511 .class, CreditDebitCode.class, DateAndDateTime2Choice1 .class, DateAndDateTime2Choice2 .class, DateTimePeriod11 .class, DeniedReason111 .class, DeniedReason16Choice1 .class, DeniedReason6CodeDraft.class, DeniedStatus16Choice1 .class, DocumentNumber5Choice1 .class, EventFrequency7Code1Draft.class, FinancialInstrumentQuantity1Choice1 .class, Frequency22Choice1 .class, GenericIdentification301 .class, GenericIdentification361 .class, GenericIdentification371 .class, HoldIndicator61 .class, IntraPosition61 .class, LinkageType1Code1 .class, LinkageType3Choice1 .class, Linkages571Semt031Draft.class, Max4AlphaNumericTextFixed.class, Max4AlphaNumericTextFixed1 .class, MovementResponseType1Code.class, MxSemt03100101 .class, NameAndAddress51 .class, NoReasonCode.class, Pagination1 .class, PartyIdentification120Choice1 .class, PartyIdentification120Choice2Draft.class, PartyIdentification122Choice1 .class, PartyIdentification127Choice1 .class, PartyIdentification1361 .class, PartyIdentification1481 .class, PartyIdentificationAndAccount1701 .class, PartyIdentificationAndAccount1702Draft.class, Period7Choice1 .class, PriorityNumeric4Choice1 .class, ProcessingPosition3Code1 .class, ProcessingPosition7Choice1Draft.class, ProcessingStatus71Choice1 .class, ProcessingStatus71Choice2 .class, ProprietaryReason41 .class, ProprietaryReason42 .class, Quantity6Choice1 .class, References231 .class, References34Choice1 .class, Registration10Choice1 .class, Registration2Code.class, RegistrationReason51 .class, RequestDetails231 .class, RestrictedFINActiveCurrencyAndAmount.class, SecuritiesAccount191 .class, SecuritiesBalanceType11Code1 .class, SecuritiesBalanceType6Choice1 .class, SecuritiesModification11 .class, SecuritiesModificationTransaction11 .class, SecuritiesSettlementConditionsModificationRequestReportV01 .class, SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt031Draft.class, SecuritiesTransactionReport51 .class, SecurityIdentification191 .class, SettlementDate17Choice1 .class, SettlementOrIntraPosition3Choice1 .class, SettlementParties781Draft.class, SettlementTransactionCondition5Code.class, StatementUpdateType1Code.class, SystemPartyIdentification81Draft.class, TradeDate8Choice1 .class, TransactionDetails1261 .class, UpdateType15Choice1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT4semt.031.001.01";

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
