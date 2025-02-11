
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
 * Class for auth.067.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpCollRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.067.001.01")
public class MxAuth06700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPCollRpt", required = true)
    protected CCPCollateralReportV01 ccpCollRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 67;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd24Amount.class, ActiveCurrencyAndAmount.class, AssetClassDetailedSubProductType16Code.class, AssetClassDetailedSubProductType1Choice.class, AssetHolding1 .class, AssetHolding1Choice.class, CCPCollateralReportV01 .class, CollateralAccount4 .class, CollateralAccountType3Code.class, Commodity2 .class, GenericIdentification165 .class, GenericIdentification168 .class, GenericIdentification36 .class, Guarantee1 .class, MxAuth06700101 .class, PartyIdentification118Choice.class, ProductType7Code.class, SchemeIdentificationType1Code.class, SecurityIdentificationAndAmount1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.067.001.01";

    public MxAuth06700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth06700101(final String xml) {
        this();
        MxAuth06700101 tmp = parse(xml);
        ccpCollRpt = tmp.getCCPCollRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth06700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpCollRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPCollateralReportV01 }
     *     
     */
    public CCPCollateralReportV01 getCCPCollRpt() {
        return ccpCollRpt;
    }

    /**
     * Sets the value of the ccpCollRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPCollateralReportV01 }
     *     
     */
    public MxAuth06700101 setCCPCollRpt(CCPCollateralReportV01 value) {
        this.ccpCollRpt = value;
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
    public static MxAuth06700101 parse(String xml) {
        return ((MxAuth06700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth06700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth06700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth06700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth06700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth06700101) parserImpl.read(MxAuth06700101 .class, xml, _classes));
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
     * Creates an MxAuth06700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth06700101 message
     * @return
     *     a new instance of MxAuth06700101
     */
    public static final MxAuth06700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth06700101 .class);
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
