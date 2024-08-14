
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
 * Class for auth.084.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.084.001.01")
public class MxAuth08400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxStsAdvc", required = true)
    protected SecuritiesFinancingReportingTransactionStatusAdviceV01 sctiesFincgRptgTxStsAdvc;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 84;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AgreementType1Choice.class, DetailedReportStatistics5 .class, DetailedTransactionStatistics10 .class, GenericValidationRuleIdentification1 .class, MasterAgreement6 .class, MxAuth08400101 .class, NumberOfTransactionsPerValidationRule5 .class, OrganisationIdentification9Choice.class, RejectionReason45 .class, RejectionReason47 .class, ReportPeriodActivity1Code.class, ReportingMessageStatus1Code.class, SecuritiesFinancingReportingTransactionStatusAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData11Choice.class, TradeData20 .class, TradeTransactionIdentification4 .class, TradeTransactionIdentification8 .class, TradeTransactionIdentification9 .class, TransactionIdentification1Choice.class, ValidationRuleSchemeName1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.084.001.01";

    public MxAuth08400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08400101(final String xml) {
        this();
        MxAuth08400101 tmp = parse(xml);
        sctiesFincgRptgTxStsAdvc = tmp.getSctiesFincgRptgTxStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionStatusAdviceV01 }
     *     
     */
    public SecuritiesFinancingReportingTransactionStatusAdviceV01 getSctiesFincgRptgTxStsAdvc() {
        return sctiesFincgRptgTxStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionStatusAdviceV01 }
     *     
     */
    public MxAuth08400101 setSctiesFincgRptgTxStsAdvc(SecuritiesFinancingReportingTransactionStatusAdviceV01 value) {
        this.sctiesFincgRptgTxStsAdvc = value;
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
    public static MxAuth08400101 parse(String xml) {
        return ((MxAuth08400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08400101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08400101) parserImpl.read(MxAuth08400101 .class, xml, _classes));
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
     * Creates an MxAuth08400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08400101 message
     * @return
     *     a new instance of MxAuth08400101
     */
    public static final MxAuth08400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08400101 .class);
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
