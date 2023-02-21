
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
 * Class for auth.028.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktSttstclRptStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.028.001.01")
public class MxAuth02800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MnyMktSttstclRptStsAdvc", required = true)
    protected MoneyMarketStatisticalReportStatusAdviceV01 mnyMktSttstclRptStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DateTimePeriod1 .class, GenericValidationRuleIdentification1 .class, MoneyMarketStatisticalReportStatusAdviceV01 .class, MoneyMarketStatusReportHeader1 .class, MoneyMarketTransactionStatus2 .class, MxAuth02800101 .class, StatisticalReportingStatus1Code.class, StatisticalReportingStatus2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, ValidationRuleSchemeName1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.028.001.01";

    public MxAuth02800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02800101(final String xml) {
        this();
        MxAuth02800101 tmp = parse(xml);
        mnyMktSttstclRptStsAdvc = tmp.getMnyMktSttstclRptStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktSttstclRptStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketStatisticalReportStatusAdviceV01 }
     *     
     */
    public MoneyMarketStatisticalReportStatusAdviceV01 getMnyMktSttstclRptStsAdvc() {
        return mnyMktSttstclRptStsAdvc;
    }

    /**
     * Sets the value of the mnyMktSttstclRptStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketStatisticalReportStatusAdviceV01 }
     *     
     */
    public MxAuth02800101 setMnyMktSttstclRptStsAdvc(MoneyMarketStatisticalReportStatusAdviceV01 value) {
        this.mnyMktSttstclRptStsAdvc = value;
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
    public static MxAuth02800101 parse(String xml) {
        return ((MxAuth02800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02800101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02800101) parserImpl.read(MxAuth02800101 .class, xml, _classes));
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
     * Creates an MxAuth02800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02800101 message
     * @return
     *     a new instance of MxAuth02800101
     */
    public final static MxAuth02800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02800101 .class);
    }

}
