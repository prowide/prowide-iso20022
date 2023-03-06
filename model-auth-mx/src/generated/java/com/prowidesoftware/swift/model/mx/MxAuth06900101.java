
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
 * Class for auth.069.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpClrdPdctRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.069.001.01")
public class MxAuth06900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPClrdPdctRpt", required = true)
    protected CCPClearedProductReportV01 ccpClrdPdctRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 69;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd24Amount.class, ActiveCurrencyAndAmount.class, CCPClearedProductReportV01 .class, ClearedProduct1 .class, ContractSize1 .class, DefinedAttributes1Choice.class, Derivative3 .class, DerivativeClassification1 .class, DerivativeUnderlyingLeg1 .class, ExoticOptionStyle1Code.class, FinancialInstrument59 .class, FinancialInstrumentAttributes88 .class, FinancialInstrumentAttributes89 .class, FinancialInstrumentAttributes90 .class, Frequency11Code.class, GeneralCollateral2 .class, GenericIdentification165 .class, GenericIdentification168 .class, GenericIdentification36 .class, InterestComputationMethod2Code.class, InterestRateContractTerm1 .class, MxAuth06900101 .class, OpenInterest1 .class, Option14 .class, OptionEvent2 .class, OptionEventType1Choice.class, OptionEventType1Code.class, OptionStyle5Code.class, OptionType1Code.class, PhysicalTransferType4Code.class, Product1Choice.class, ProductClassification1 .class, RateBasis1Code.class, RepurchaseAgreement3 .class, RepurchaseAgreementType1Choice.class, SchemeIdentificationType1Code.class, SpecificCollateral2 .class, Standardisation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnitOfMeasure5Choice.class, UnitOfMeasure8Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.069.001.01";

    public MxAuth06900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth06900101(final String xml) {
        this();
        MxAuth06900101 tmp = parse(xml);
        ccpClrdPdctRpt = tmp.getCCPClrdPdctRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth06900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpClrdPdctRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPClearedProductReportV01 }
     *     
     */
    public CCPClearedProductReportV01 getCCPClrdPdctRpt() {
        return ccpClrdPdctRpt;
    }

    /**
     * Sets the value of the ccpClrdPdctRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPClearedProductReportV01 }
     *     
     */
    public MxAuth06900101 setCCPClrdPdctRpt(CCPClearedProductReportV01 value) {
        this.ccpClrdPdctRpt = value;
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
    public static MxAuth06900101 parse(String xml) {
        return ((MxAuth06900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth06900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth06900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth06900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth06900101) parserImpl.read(MxAuth06900101 .class, xml, _classes));
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
     * Creates an MxAuth06900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth06900101 message
     * @return
     *     a new instance of MxAuth06900101
     */
    public final static MxAuth06900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth06900101 .class);
    }

}
