
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
 * Class for auth.071.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxReusdCollDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.071.001.02")
public class MxAuth07100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxReusdCollDataRpt", required = true)
    protected SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 sctiesFincgRptgTxReusdCollDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 71;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection53 .class, CashReuseData1 .class, CollateralType19 .class, CounterpartyData87 .class, FundingSource3 .class, FundingSourceType1Code.class, GenericIdentification175 .class, MxAuth07100102 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, ReinvestedCashTypeAndAmount1 .class, ReinvestmentType1Code.class, ReportPeriodActivity1Code.class, ReuseDataReport6Choice.class, ReuseDataReportCorrection14 .class, ReuseDataReportError5 .class, ReuseDataReportNew6 .class, ReuseValue1Choice.class, SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 .class, SecurityReuseData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData36Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.071.001.02";

    public MxAuth07100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07100102(final String xml) {
        this();
        MxAuth07100102 tmp = parse(xml);
        sctiesFincgRptgTxReusdCollDataRpt = tmp.getSctiesFincgRptgTxReusdCollDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxReusdCollDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 }
     *     
     */
    public SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 getSctiesFincgRptgTxReusdCollDataRpt() {
        return sctiesFincgRptgTxReusdCollDataRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxReusdCollDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 }
     *     
     */
    public MxAuth07100102 setSctiesFincgRptgTxReusdCollDataRpt(SecuritiesFinancingReportingTransactionReusedCollateralDataReportV02 value) {
        this.sctiesFincgRptgTxReusdCollDataRpt = value;
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
    public static MxAuth07100102 parse(String xml) {
        return ((MxAuth07100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth07100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth07100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07100102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07100102) parserImpl.read(MxAuth07100102 .class, xml, _classes));
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
     * Creates an MxAuth07100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07100102 message
     * @return
     *     a new instance of MxAuth07100102
     */
    public final static MxAuth07100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07100102 .class);
    }

}
