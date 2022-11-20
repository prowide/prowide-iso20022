
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
 * Class for auth.061.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpInvstmtsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.061.001.01")
public class MxAuth06100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPInvstmtsRpt", required = true)
    protected CCPInvestmentsReportV01 ccpInvstmtsRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 61;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd24Amount.class, ActiveCurrencyAndAmount.class, CCPInvestmentsReportV01 .class, Deposit1 .class, FinancialInstrument59 .class, GeneralCollateral3 .class, Investment1Choice.class, MxAuth06100101 .class, OtherInvestment1 .class, ProductType7Code.class, RepurchaseAgreement2 .class, RepurchaseAgreementType3Choice.class, SecurityIdentificationAndAmount1 .class, SpecificCollateral2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.061.001.01";

    public MxAuth06100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth06100101(final String xml) {
        this();
        MxAuth06100101 tmp = parse(xml);
        ccpInvstmtsRpt = tmp.getCCPInvstmtsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth06100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpInvstmtsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPInvestmentsReportV01 }
     *     
     */
    public CCPInvestmentsReportV01 getCCPInvstmtsRpt() {
        return ccpInvstmtsRpt;
    }

    /**
     * Sets the value of the ccpInvstmtsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPInvestmentsReportV01 }
     *     
     */
    public MxAuth06100101 setCCPInvstmtsRpt(CCPInvestmentsReportV01 value) {
        this.ccpInvstmtsRpt = value;
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
    public static MxAuth06100101 parse(String xml) {
        return ((MxAuth06100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth06100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth06100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth06100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth06100101) parserImpl.read(MxAuth06100101 .class, xml, _classes));
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
     * Creates an MxAuth06100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth06100101 message
     * @return
     *     a new instance of MxAuth06100101
     */
    public final static MxAuth06100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth06100101 .class);
    }

}
