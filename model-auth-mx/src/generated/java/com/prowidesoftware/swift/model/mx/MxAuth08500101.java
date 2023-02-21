
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.085.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgMrgnDataTxStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.085.001.01")
public class MxAuth08500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgMrgnDataTxStatRpt", required = true)
    protected SecuritiesFinancingReportingMarginDataTransactionStateReportV01 sctiesFincgRptgMrgnDataTxStatRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 85;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, CollateralMarginNew7 .class, ContractModification3 .class, Counterparty30 .class, ModificationLevel1Code.class, MxAuth08500101 .class, OrganisationIdentification9Choice.class, PostedMarginOrCollateral3 .class, ReceivedMarginOrCollateral3 .class, ReconciliationFlag1 .class, ReportPeriodActivity1Code.class, SecuritiesFinancingReportingMarginDataTransactionStateReportV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData13Choice.class, TradeRepositoryReportingType1Code.class, TransactionOperationType6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.085.001.01";

    public MxAuth08500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08500101(final String xml) {
        this();
        MxAuth08500101 tmp = parse(xml);
        sctiesFincgRptgMrgnDataTxStatRpt = tmp.getSctiesFincgRptgMrgnDataTxStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgMrgnDataTxStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingMarginDataTransactionStateReportV01 }
     *     
     */
    public SecuritiesFinancingReportingMarginDataTransactionStateReportV01 getSctiesFincgRptgMrgnDataTxStatRpt() {
        return sctiesFincgRptgMrgnDataTxStatRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgMrgnDataTxStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingMarginDataTransactionStateReportV01 }
     *     
     */
    public MxAuth08500101 setSctiesFincgRptgMrgnDataTxStatRpt(SecuritiesFinancingReportingMarginDataTransactionStateReportV01 value) {
        this.sctiesFincgRptgMrgnDataTxStatRpt = value;
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
    public static MxAuth08500101 parse(String xml) {
        return ((MxAuth08500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08500101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08500101) parserImpl.read(MxAuth08500101 .class, xml, _classes));
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
     * Creates an MxAuth08500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08500101 message
     * @return
     *     a new instance of MxAuth08500101
     */
    public final static MxAuth08500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08500101 .class);
    }

}
