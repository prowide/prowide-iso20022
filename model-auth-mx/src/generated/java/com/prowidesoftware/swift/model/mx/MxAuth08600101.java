
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
 * Class for auth.086.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgReusdCollDataTxStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.086.001.01")
public class MxAuth08600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgReusdCollDataTxStatRpt", required = true)
    protected SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV01 sctiesFincgRptgReusdCollDataTxStatRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 86;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, CashReuseData1 .class, CollateralType6Choice.class, ContractModification1 .class, CounterpartyData46 .class, FundingSource1 .class, FundingSourceType1Code.class, ModificationLevel1Code.class, MxAuth08600101 .class, OrganisationIdentification9Choice.class, ReconciliationFlag1 .class, ReinvestedCashTypeAndAmount1 .class, ReinvestmentType1Code.class, ReuseDataReportCorrection3 .class, ReuseValue1Choice.class, SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV01 .class, SecurityReuseData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeRepositoryReportingType1Code.class, TransactionOperationType3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.086.001.01";

    public MxAuth08600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08600101(final String xml) {
        this();
        MxAuth08600101 tmp = parse(xml);
        sctiesFincgRptgReusdCollDataTxStatRpt = tmp.getSctiesFincgRptgReusdCollDataTxStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgReusdCollDataTxStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV01 }
     *     
     */
    public SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV01 getSctiesFincgRptgReusdCollDataTxStatRpt() {
        return sctiesFincgRptgReusdCollDataTxStatRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgReusdCollDataTxStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV01 }
     *     
     */
    public MxAuth08600101 setSctiesFincgRptgReusdCollDataTxStatRpt(SecuritiesFinancingReportingReusedCollateralDataTransactionStateReportV01 value) {
        this.sctiesFincgRptgReusdCollDataTxStatRpt = value;
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
    public static MxAuth08600101 parse(String xml) {
        return ((MxAuth08600101) MxReadImpl.parse(MxAuth08600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08600101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08600101) parserImpl.read(MxAuth08600101 .class, xml, _classes));
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
     * Creates an MxAuth08600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08600101 message
     * @return
     *     a new instance of MxAuth08600101
     */
    public final static MxAuth08600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08600101 .class);
    }

}
