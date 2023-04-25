
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
 * Class for auth.086.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgReusdCollDataTxStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.086.001.02")
public class MxAuth08600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgReusdCollDataTxStatRpt", required = true)
    protected SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 sctiesFincgRptgReusdCollDataTxStatRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 86;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection53 .class, CashReuseData1 .class, CollateralType19 .class, ContractModification3 .class, CounterpartyData87 .class, FundingSource3 .class, FundingSourceType1Code.class, GenericIdentification175 .class, ModificationLevel1Code.class, MxAuth08600102 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, ReconciliationFlag2 .class, ReinvestedCashTypeAndAmount1 .class, ReinvestmentType1Code.class, ReportPeriodActivity1Code.class, ReuseDataReportCorrection15 .class, ReuseValue1Choice.class, SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 .class, SecurityReuseData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData37Choice.class, TradeRepositoryReportingType1Code.class, TransactionOperationType6Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.086.001.02";

    public MxAuth08600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08600102(final String xml) {
        this();
        MxAuth08600102 tmp = parse(xml);
        sctiesFincgRptgReusdCollDataTxStatRpt = tmp.getSctiesFincgRptgReusdCollDataTxStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgReusdCollDataTxStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 }
     *     
     */
    public SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 getSctiesFincgRptgReusdCollDataTxStatRpt() {
        return sctiesFincgRptgReusdCollDataTxStatRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgReusdCollDataTxStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 }
     *     
     */
    public MxAuth08600102 setSctiesFincgRptgReusdCollDataTxStatRpt(SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV02 value) {
        this.sctiesFincgRptgReusdCollDataTxStatRpt = value;
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
    public static MxAuth08600102 parse(String xml) {
        return ((MxAuth08600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08600102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08600102) parserImpl.read(MxAuth08600102 .class, xml, _classes));
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
     * Creates an MxAuth08600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08600102 message
     * @return
     *     a new instance of MxAuth08600102
     */
    public static final MxAuth08600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08600102 .class);
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
