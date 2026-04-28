
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
 * Class for auth.070.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxMrgnDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.070.001.02")
public class MxAuth07000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxMrgnDataRpt", required = true)
    protected SecuritiesFinancingReportingTransactionMarginDataReportV02 sctiesFincgRptgTxMrgnDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 70;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, CollateralMarginCorrection6 .class, CollateralMarginError4 .class, CollateralMarginMarginUpdate5 .class, Counterparty39 .class, GenericIdentification175 .class, MxAuth07000102 .class, NaturalPersonIdentification2 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PartyIdentification236Choice.class, PostedMarginOrCollateral4 .class, ReceivedMarginOrCollateral4 .class, ReportPeriodActivity1Code.class, SecuritiesFinancingReportingTransactionMarginDataReportV02 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData39Choice.class, TradeReport21Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.070.001.02";

    public MxAuth07000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07000102(final String xml) {
        this();
        MxAuth07000102 tmp = parse(xml);
        sctiesFincgRptgTxMrgnDataRpt = tmp.getSctiesFincgRptgTxMrgnDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxMrgnDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionMarginDataReportV02 }
     *     
     */
    public SecuritiesFinancingReportingTransactionMarginDataReportV02 getSctiesFincgRptgTxMrgnDataRpt() {
        return sctiesFincgRptgTxMrgnDataRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxMrgnDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionMarginDataReportV02 }
     *     
     */
    public MxAuth07000102 setSctiesFincgRptgTxMrgnDataRpt(SecuritiesFinancingReportingTransactionMarginDataReportV02 value) {
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
    public static MxAuth07000102 parse(String xml) {
        return ((MxAuth07000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth07000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth07000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07000102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07000102) parserImpl.read(MxAuth07000102 .class, xml, _classes));
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
     * Creates an MxAuth07000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07000102 message
     * @return
     *     a new instance of MxAuth07000102
     */
    public final static MxAuth07000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07000102 .class);
    }

}
