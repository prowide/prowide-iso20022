
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
 * Class for auth.029.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRptQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.029.001.01")
public class MxAuth02900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRptQry", required = true)
    protected DerivativesTradeReportQueryV01 derivsTradRptQry;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AnyMIC1Code.class, CorporateSectorCriteria3 .class, DateOrBlankQuery2Choice.class, DatePeriod1 .class, DateTimePeriod1 .class, DerivativesTradeReportQueryV01 .class, FinancialPartySectorType1Code.class, GenericIdentification1 .class, MxAuth02900101 .class, NameAndAddress5 .class, NoReasonCode.class, NonFinancialPartySector1Code.class, NotAvailable1Code.class, NotReported1Code.class, Operation3Code.class, PartyIdentification121Choice.class, PartyNatureType1Code.class, PostalAddress1 .class, ProductClassificationCriteria1 .class, ProductType4Code.class, SecuritiesTradeVenueCriteria1Choice.class, SecurityIdentification20Choice.class, SecurityIdentificationQuery3Choice.class, SecurityIdentificationQueryCriteria1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeAdditionalQueryCriteria3 .class, TradeDateTimeQueryCriteria2 .class, TradePartyIdentificationQuery8 .class, TradePartyQueryCriteria3 .class, TradeQueryCriteria4 .class, TradeQueryExecutionFrequency1Choice.class, TradeRecurrentQuery3 .class, TradeReportQuery4Choice.class, TradeSecurityIdentificationQueryCriteria2 .class, TransactionOperationType3Code.class, WeekDay2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.029.001.01";

    public MxAuth02900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02900101(final String xml) {
        this();
        MxAuth02900101 tmp = parse(xml);
        derivsTradRptQry = tmp.getDerivsTradRptQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRptQry property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeReportQueryV01 }
     *     
     */
    public DerivativesTradeReportQueryV01 getDerivsTradRptQry() {
        return derivsTradRptQry;
    }

    /**
     * Sets the value of the derivsTradRptQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeReportQueryV01 }
     *     
     */
    public MxAuth02900101 setDerivsTradRptQry(DerivativesTradeReportQueryV01 value) {
        this.derivsTradRptQry = value;
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
    public static MxAuth02900101 parse(String xml) {
        return ((MxAuth02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02900101) parserImpl.read(MxAuth02900101 .class, xml, _classes));
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
     * Creates an MxAuth02900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02900101 message
     * @return
     *     a new instance of MxAuth02900101
     */
    public final static MxAuth02900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02900101 .class);
    }

}
