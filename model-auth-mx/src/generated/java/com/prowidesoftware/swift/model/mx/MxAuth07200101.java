
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
 * Class for auth.072.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmIntlrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.072.001.01")
public class MxAuth07200101
    extends AbstractMX
{

    @XmlElement(name = "SttlmIntlrRpt", required = true)
    protected SettlementInternaliserReportV01 sttlmIntlrRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 72;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ContactDetails4 .class, InternalisationData1 .class, InternalisationData2 .class, InternalisationDataRate1 .class, InternalisationDataVolume1 .class, IssuerCSDIdentification1 .class, IssuerCSDReport1 .class, MxAuth07200101 .class, SettlementInternaliser1 .class, SettlementInternaliserClientType1 .class, SettlementInternaliserFinancialInstrument1 .class, SettlementInternaliserIdentification1 .class, SettlementInternaliserReportHeader1 .class, SettlementInternaliserReportV01 .class, SettlementInternaliserTransactionType1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.072.001.01";

    public MxAuth07200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07200101(final String xml) {
        this();
        MxAuth07200101 tmp = parse(xml);
        sttlmIntlrRpt = tmp.getSttlmIntlrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmIntlrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserReportV01 }
     *     
     */
    public SettlementInternaliserReportV01 getSttlmIntlrRpt() {
        return sttlmIntlrRpt;
    }

    /**
     * Sets the value of the sttlmIntlrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserReportV01 }
     *     
     */
    public MxAuth07200101 setSttlmIntlrRpt(SettlementInternaliserReportV01 value) {
        this.sttlmIntlrRpt = value;
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
    public static MxAuth07200101 parse(String xml) {
        return ((MxAuth07200101) MxReadImpl.parse(MxAuth07200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07200101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07200101) parserImpl.read(MxAuth07200101 .class, xml, _classes));
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
     * Creates an MxAuth07200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07200101 message
     * @return
     *     a new instance of MxAuth07200101
     */
    public final static MxAuth07200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth07200101 .class);
    }

}
