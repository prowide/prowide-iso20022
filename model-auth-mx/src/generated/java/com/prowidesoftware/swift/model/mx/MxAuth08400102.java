
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
 * Class for auth.084.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.084.001.02")
public class MxAuth08400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxStsAdvc", required = true)
    protected SecuritiesFinancingReportingTransactionStatusAdviceV02 sctiesFincgRptgTxStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 84;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AgreementType2Choice.class, DetailedReportStatistics5 .class, DetailedTransactionStatistics13 .class, DetailedTransactionStatistics2Choice.class, GenericIdentification175 .class, GenericValidationRuleIdentification1 .class, MasterAgreement7 .class, MxAuth08400102 .class, NaturalPersonIdentification2 .class, NumberOfTransactionsPerValidationRule5 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PartyIdentification236Choice.class, RejectionReason45 .class, RejectionReason53 .class, ReportPeriodActivity1Code.class, ReportingMessageStatus1Code.class, SecuritiesFinancingReportingTransactionStatusAdviceV02 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData29 .class, TradeData35Choice.class, TradeTransactionIdentification16 .class, TradeTransactionIdentification17 .class, TradeTransactionIdentification20 .class, TransactionIdentification3Choice.class, ValidationRuleSchemeName1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.084.001.02";

    public MxAuth08400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08400102(final String xml) {
        this();
        MxAuth08400102 tmp = parse(xml);
        sctiesFincgRptgTxStsAdvc = tmp.getSctiesFincgRptgTxStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionStatusAdviceV02 }
     *     
     */
    public SecuritiesFinancingReportingTransactionStatusAdviceV02 getSctiesFincgRptgTxStsAdvc() {
        return sctiesFincgRptgTxStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionStatusAdviceV02 }
     *     
     */
    public MxAuth08400102 setSctiesFincgRptgTxStsAdvc(SecuritiesFinancingReportingTransactionStatusAdviceV02 value) {
        this.sctiesFincgRptgTxStsAdvc = value;
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
    public static MxAuth08400102 parse(String xml) {
        return ((MxAuth08400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08400102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08400102) parserImpl.read(MxAuth08400102 .class, xml, _classes));
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
     * Creates an MxAuth08400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08400102 message
     * @return
     *     a new instance of MxAuth08400102
     */
    public final static MxAuth08400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08400102 .class);
    }

}
