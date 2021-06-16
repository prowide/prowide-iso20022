
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
 * Class for auth.094.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.094.001.01")
public class MxAuth09400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxQry", required = true)
    protected SecuritiesFinancingReportingTransactionQueryV01 sctiesFincgRptgTxQry;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 94;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AnyMIC1Code.class, CollateralType6Code.class, CorporateSectorCriteria4 .class, DateOrBlankQuery2Choice.class, DatePeriod1 .class, DateTimePeriod1 .class, ExposureType3Code.class, FinancialPartySectorType2Code.class, GenericIdentification1 .class, MxAuth09400101 .class, NameAndAddress5 .class, NoReasonCode.class, NotReported1Code.class, Operation3Code.class, PartyIdentification121Choice.class, PartyNatureType1Code.class, PostalAddress1 .class, SecuritiesFinancingReportingTransactionQueryV01 .class, SecuritiesTradeVenueCriteria1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAdditionalQueryCriteria4 .class, TradeDateTimeQueryCriteria2 .class, TradePartyIdentificationQuery8 .class, TradePartyQueryCriteria4 .class, TradeQueryCriteria5 .class, TradeQueryExecutionFrequency1Choice.class, TradeRecurrentQuery3 .class, TradeReportQuery5Choice.class, TransactionOperationType3Code.class, WeekDay2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.094.001.01";

    public MxAuth09400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09400101(final String xml) {
        this();
        MxAuth09400101 tmp = parse(xml);
        sctiesFincgRptgTxQry = tmp.getSctiesFincgRptgTxQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionQueryV01 }
     *     
     */
    public SecuritiesFinancingReportingTransactionQueryV01 getSctiesFincgRptgTxQry() {
        return sctiesFincgRptgTxQry;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionQueryV01 }
     *     
     */
    public MxAuth09400101 setSctiesFincgRptgTxQry(SecuritiesFinancingReportingTransactionQueryV01 value) {
        this.sctiesFincgRptgTxQry = value;
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
    public static MxAuth09400101 parse(String xml) {
        return ((MxAuth09400101) MxReadImpl.parse(MxAuth09400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09400101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09400101) parserImpl.read(MxAuth09400101 .class, xml, _classes));
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
     * Creates an MxAuth09400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09400101 message
     * @return
     *     a new instance of MxAuth09400101
     */
    public final static MxAuth09400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09400101 .class);
    }

}
