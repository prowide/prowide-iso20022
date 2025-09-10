
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
 * Class for auth.069.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpClrdPdctRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.069.001.02")
public class MxAuth06900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPClrdPdctRpt", required = true)
    protected CCPClearedProductReportV02 ccpClrdPdctRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 69;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd24Amount.class, ActiveCurrencyAndAmount.class, CCPClearedProductReportV02 .class, ClearedProduct2 .class, ContractSize1 .class, DefinedAttributes1Choice.class, Derivative3 .class, DerivativeClassification1 .class, DerivativeUnderlyingLeg1 .class, ExoticOptionStyle1Code.class, FinancialInstrument59 .class, FinancialInstrumentAttributes88 .class, FinancialInstrumentAttributes89 .class, FinancialInstrumentAttributes90 .class, Frequency11Code.class, GeneralCollateral2 .class, GenericIdentification165 .class, GenericIdentification168 .class, GenericIdentification36 .class, InterestComputationMethod2Code.class, InterestRateContractTerm1 .class, MxAuth06900102 .class, OpenInterest1 .class, Option14 .class, OptionEvent2 .class, OptionEventType1Choice.class, OptionEventType1Code.class, OptionStyle5Code.class, OptionType1Code.class, PhysicalTransferType4Code.class, Product1Choice.class, ProductClassification1 .class, RateBasis1Code.class, RepurchaseAgreement3 .class, RepurchaseAgreementType1Choice.class, SchemeIdentificationType1Code.class, SpecificCollateral2 .class, Standardisation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnitOfMeasure5Choice.class, UnitOfMeasure8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.069.001.02";

    public MxAuth06900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth06900102(final String xml) {
        this();
        MxAuth06900102 tmp = parse(xml);
        ccpClrdPdctRpt = tmp.getCCPClrdPdctRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth06900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpClrdPdctRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPClearedProductReportV02 }
     *     
     */
    public CCPClearedProductReportV02 getCCPClrdPdctRpt() {
        return ccpClrdPdctRpt;
    }

    /**
     * Sets the value of the ccpClrdPdctRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPClearedProductReportV02 }
     *     
     */
    public MxAuth06900102 setCCPClrdPdctRpt(CCPClearedProductReportV02 value) {
        this.ccpClrdPdctRpt = value;
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
    public static MxAuth06900102 parse(String xml) {
        return ((MxAuth06900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth06900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth06900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth06900102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth06900102) parserImpl.read(MxAuth06900102 .class, xml, _classes));
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
     * Creates an MxAuth06900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth06900102 message
     * @return
     *     a new instance of MxAuth06900102
     */
    public static final MxAuth06900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth06900102 .class);
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
