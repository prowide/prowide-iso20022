
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgTxRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.016.001.01")
public class MxAuth01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgTxRpt", required = true)
    protected FinancialInstrumentReportingTransactionReportV01 finInstrmRptgTxRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection53 .class, AmountAndDirection61 .class, AssetClassAttributes1 .class, AssetClassAttributes1Choice.class, AuthorityExchangeReason1Code.class, BasketDescription3 .class, BenchmarkCurveName2Code.class, BenchmarkCurveName5Choice.class, CancelledStatusReason15Code.class, DebtInstrument4 .class, DerivativeForeignExchange2 .class, DerivativeInstrument6 .class, DerivativeInterest2 .class, ExecutingParty1Choice.class, FinancialInstrument58 .class, FinancialInstrumentAttributes3Choice.class, FinancialInstrumentIdentification6Choice.class, FinancialInstrumentIdentification7Choice.class, FinancialInstrumentQuantity25Choice.class, FinancialInstrumentReportingTransactionReportV01 .class, FloatingInterestRate8 .class, GenericPersonIdentification1 .class, InterestRateContractTerm2 .class, InternalPartyRole1Code.class, InvestmentParty1Choice.class, MxAuth01600101 .class, NoReasonCode.class, OptionStyle7Code.class, OptionType2Code.class, PartyIdentification76 .class, PartyIdentification79 .class, PersonIdentification10 .class, PersonIdentification12 .class, PersonIdentificationSchemeName1Choice.class, PersonOrOrganisation1Choice.class, PersonOrOrganisation2Choice.class, PhysicalTransferType4Code.class, PriceStatus1Code.class, RateBasis1Code.class, RecordTechnicalData1 .class, RecordTechnicalData2 .class, RegulatoryTradingCapacity1Code.class, ReportingTransactionType1Choice.class, ReportingWaiverType1Code.class, ReportingWaiverType3Code.class, SecuritiesTransaction1 .class, SecuritiesTransactionIndicator2 .class, SecuritiesTransactionPrice1 .class, SecuritiesTransactionPrice2Choice.class, SecuritiesTransactionPrice4Choice.class, SecuritiesTransactionReport2 .class, SecuritiesTransactionReport4 .class, SecuritiesTransactionTransmission2 .class, SecurityInstrumentDescription11 .class, SecurityInstrumentDescription13 .class, Side5Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwapLegIdentification2 .class, UnderlyingIdentification2Choice.class, VariationType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.016.001.01";

    public MxAuth01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01600101(final String xml) {
        this();
        MxAuth01600101 tmp = parse(xml);
        finInstrmRptgTxRpt = tmp.getFinInstrmRptgTxRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgTxRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingTransactionReportV01 }
     *     
     */
    public FinancialInstrumentReportingTransactionReportV01 getFinInstrmRptgTxRpt() {
        return finInstrmRptgTxRpt;
    }

    /**
     * Sets the value of the finInstrmRptgTxRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingTransactionReportV01 }
     *     
     */
    public MxAuth01600101 setFinInstrmRptgTxRpt(FinancialInstrumentReportingTransactionReportV01 value) {
        this.finInstrmRptgTxRpt = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAuth01600101 parse(String xml) {
        return ((MxAuth01600101) MxReadImpl.parse(MxAuth01600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01600101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01600101) parserImpl.read(MxAuth01600101 .class, xml, _classes));
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
     * Creates an MxAuth01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01600101 message
     * @return
     *     a new instance of MxAuth01600101
     */
    public final static MxAuth01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth01600101 .class);
    }

}
