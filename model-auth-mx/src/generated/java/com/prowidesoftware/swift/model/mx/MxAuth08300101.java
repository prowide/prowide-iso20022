
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
 * Class for auth.083.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgMssngCollReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.083.001.01")
public class MxAuth08300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgMssngCollReq", required = true)
    protected SecuritiesFinancingReportingMissingCollateralRequestV01 sctiesFincgRptgMssngCollReq;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 83;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AgreementType1Choice.class, MasterAgreement1 .class, MxAuth08300101 .class, OrganisationIdentification9Choice.class, SecuritiesFinancingReportingMissingCollateralRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeTransactionIdentification6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.083.001.01";

    public MxAuth08300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08300101(final String xml) {
        this();
        MxAuth08300101 tmp = parse(xml);
        sctiesFincgRptgMssngCollReq = tmp.getSctiesFincgRptgMssngCollReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgMssngCollReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingMissingCollateralRequestV01 }
     *     
     */
    public SecuritiesFinancingReportingMissingCollateralRequestV01 getSctiesFincgRptgMssngCollReq() {
        return sctiesFincgRptgMssngCollReq;
    }

    /**
     * Sets the value of the sctiesFincgRptgMssngCollReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingMissingCollateralRequestV01 }
     *     
     */
    public MxAuth08300101 setSctiesFincgRptgMssngCollReq(SecuritiesFinancingReportingMissingCollateralRequestV01 value) {
        this.sctiesFincgRptgMssngCollReq = value;
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
    public static MxAuth08300101 parse(String xml) {
        return ((MxAuth08300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08300101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08300101) parserImpl.read(MxAuth08300101 .class, xml, _classes));
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
     * Creates an MxAuth08300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08300101 message
     * @return
     *     a new instance of MxAuth08300101
     */
    public final static MxAuth08300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08300101 .class);
    }

}
