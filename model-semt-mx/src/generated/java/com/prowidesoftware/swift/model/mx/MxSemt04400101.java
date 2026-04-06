
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
 * Class for semt.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPnltiesRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT4semt.044.001.01")
public class MxSemt04400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPnltiesRpt", required = true)
    protected SecuritiesTransactionPenaltiesReportV01 sctiesTxPnltiesRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AmountAndDirection51Draft.class, AmountAndDirection52Draft.class, AmountAndDirection53Draft.class, CashAccountIdentification5Choice1 .class, ClassificationType1Choice1 .class, CreditDebitCode.class, DateAndDateTime2Choice1Semt044Draft.class, DatePeriod1Choice.class, DeliveryReceiptType2Code.class, EventFrequency7Code1 .class, Exact4AlphaNumericTextFixed.class, Exact4AlphaNumericTextFixed1 .class, FailingReason2Code1 .class, FailingReason81 .class, FailingReason8Choice1 .class, FailingStatus10Choice1 .class, FinancialInstrumentQuantity1Choice1 .class, ForeignExchangeRate31 .class, Frequency22Choice1Semt044Draft.class, GenericIdentification11Draft.class, GenericIdentification12Draft.class, MarketIdentification1Choice1Draft.class, MxSemt04400101 .class, OrganisationIdentification291 .class, Pagination1 .class, Party38Choice1 .class, PartyIdentification120Choice1 .class, PartyIdentification127Choice1 .class, PartyIdentification1351 .class, PartyIdentification1361 .class, PartyIdentification1441 .class, Penalty21 .class, PenaltyAmountBreakdown11 .class, PenaltyAmountType1Code.class, PenaltyCalculationMethod1Code.class, PenaltyCalculationRecord11 .class, PenaltyFinancialInstrumentIdentification11 .class, PenaltyIdentification11 .class, PenaltyIdentification21 .class, PenaltyListType1Choice1 .class, PenaltyListType1Code1 .class, PenaltyPartyIdentification11 .class, PenaltyPartyType2Choice1 .class, PenaltyPartyTypeCodeT2S.class, PenaltyPerCounterparty21 .class, PenaltyRate11 .class, PenaltyRecord21 .class, PenaltyReport11 .class, PenaltyStatus11 .class, PenaltyStatus1Choice1 .class, PenaltyStatus1Code1 .class, PenaltyStatusReason11 .class, PenaltyStatusReason1Choice1 .class, PenaltyStatusReason1Code1 .class, PenaltyTransaction21 .class, PenaltyTransactionRecord11 .class, PenaltyType1Code.class, Period2 .class, PriceRateOrAmount4Choice1 .class, ReceiveDelivery1Code.class, RestrictedFINActiveCurrencyAndAmount.class, SecuritiesAccount191 .class, SecuritiesTransactionPenaltiesReportV01 .class, SecuritiesTransactionType26Code.class, SecuritiesTransactionType44Choice1 .class, SecurityIdentification191 .class, SettlementDate17Choice1Draft.class, SettlementOrCorporateActionEvent27Choice1 .class, SystemEvent31 .class, SystemEventType4Choice1 .class, TransactionIdentifications401 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT4semt.044.001.01";

    public MxSemt04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt04400101(final String xml) {
        this();
        MxSemt04400101 tmp = parse(xml);
        sctiesTxPnltiesRpt = tmp.getSctiesTxPnltiesRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPnltiesRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPenaltiesReportV01 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 getSctiesTxPnltiesRpt() {
        return sctiesTxPnltiesRpt;
    }

    /**
     * Sets the value of the sctiesTxPnltiesRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPenaltiesReportV01 }
     *     
     */
    public MxSemt04400101 setSctiesTxPnltiesRpt(SecuritiesTransactionPenaltiesReportV01 value) {
        this.sctiesTxPnltiesRpt = value;
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
    public static MxSemt04400101 parse(String xml) {
        return ((MxSemt04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt04400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt04400101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt04400101) parserImpl.read(MxSemt04400101 .class, xml, _classes));
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
     * Creates an MxSemt04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt04400101 message
     * @return
     *     a new instance of MxSemt04400101
     */
    public static final MxSemt04400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt04400101 .class);
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
