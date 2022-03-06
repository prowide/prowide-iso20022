
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
 * Class for auth.070.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxMrgnDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.070.001.01")
public class MxAuth07000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxMrgnDataRpt", required = true)
    protected SecuritiesFinancingReportingTransactionMarginDataReportV01 sctiesFincgRptgTxMrgnDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 70;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, CollateralMarginCorrection2 .class, CollateralMarginError1 .class, CollateralMarginMarginUpdate1 .class, CollateralMarginNew3 .class, ContractModification1 .class, Counterparty30 .class, MarginDataReport3Choice.class, ModificationLevel1Code.class, MxAuth07000101 .class, OrganisationIdentification9Choice.class, PostedMarginOrCollateral1 .class, ReceivedMarginOrCollateral1 .class, ReconciliationFlag1 .class, SecuritiesFinancingReportingTransactionMarginDataReportV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeRepositoryReportingType1Code.class, TransactionOperationType3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.070.001.01";

    public MxAuth07000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07000101(final String xml) {
        this();
        MxAuth07000101 tmp = parse(xml);
        sctiesFincgRptgTxMrgnDataRpt = tmp.getSctiesFincgRptgTxMrgnDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxMrgnDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionMarginDataReportV01 }
     *     
     */
    public SecuritiesFinancingReportingTransactionMarginDataReportV01 getSctiesFincgRptgTxMrgnDataRpt() {
        return sctiesFincgRptgTxMrgnDataRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxMrgnDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionMarginDataReportV01 }
     *     
     */
    public MxAuth07000101 setSctiesFincgRptgTxMrgnDataRpt(SecuritiesFinancingReportingTransactionMarginDataReportV01 value) {
        this.sctiesFincgRptgTxMrgnDataRpt = value;
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
    public static MxAuth07000101 parse(String xml) {
        return ((MxAuth07000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth07000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth07000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07000101) parserImpl.read(MxAuth07000101 .class, xml, _classes));
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
     * Creates an MxAuth07000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07000101 message
     * @return
     *     a new instance of MxAuth07000101
     */
    public final static MxAuth07000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07000101 .class);
    }

}
