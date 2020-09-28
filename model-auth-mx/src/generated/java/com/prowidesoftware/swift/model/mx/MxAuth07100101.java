
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.071.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxReusdCollDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.071.001.01")
public class MxAuth07100101
    extends AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxReusdCollDataRpt", required = true)
    protected SecuritiesFinancingReportingTransactionReusedCollateralDataReportV01 sctiesFincgRptgTxReusdCollDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 71;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, CashReuseData1 .class, CollateralType6Choice.class, CounterpartyData46 .class, FundingSource1 .class, FundingSourceType1Code.class, MxAuth07100101 .class, OrganisationIdentification9Choice.class, ReinvestedCashTypeAndAmount1 .class, ReinvestmentType1Code.class, ReuseDataReport2Choice.class, ReuseDataReportCorrection4 .class, ReuseDataReportError2 .class, ReuseDataReportNew2 .class, ReuseValue1Choice.class, SecuritiesFinancingReportingTransactionReusedCollateralDataReportV01 .class, SecurityReuseData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.071.001.01";

    public MxAuth07100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07100101(final String xml) {
        this();
        MxAuth07100101 tmp = parse(xml);
        sctiesFincgRptgTxReusdCollDataRpt = tmp.getSctiesFincgRptgTxReusdCollDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxReusdCollDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionReusedCollateralDataReportV01 }
     *     
     */
    public SecuritiesFinancingReportingTransactionReusedCollateralDataReportV01 getSctiesFincgRptgTxReusdCollDataRpt() {
        return sctiesFincgRptgTxReusdCollDataRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxReusdCollDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionReusedCollateralDataReportV01 }
     *     
     */
    public MxAuth07100101 setSctiesFincgRptgTxReusdCollDataRpt(SecuritiesFinancingReportingTransactionReusedCollateralDataReportV01 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAuth07100101 parse(String xml) {
        return ((MxAuth07100101) MxReadImpl.parse(MxAuth07100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07100101) parserImpl.read(MxAuth07100101 .class, xml, _classes));
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
     * Creates an MxAuth07100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07100101 message
     * @return
     *     a new instance of MxAuth07100101
     */
    public final static MxAuth07100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth07100101 .class);
    }

}
