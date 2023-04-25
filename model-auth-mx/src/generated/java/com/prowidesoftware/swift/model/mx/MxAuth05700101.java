
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
 * Class for auth.057.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpPrtflStrssTstgDefRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.057.001.01")
public class MxAuth05700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CCPPrtflStrssTstgDefRpt", required = true)
    protected CCPPortfolioStressTestingDefinitionReportV01 ccpPrtflStrssTstgDefRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 57;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Absolute1 .class, CCPPortfolioStressTestingDefinitionReportV01 .class, GenericIdentification165 .class, GenericIdentification168 .class, MxAuth05700101 .class, RiskFactor1 .class, ScenarioDefinition1 .class, ScenarioType1Code.class, SchemeIdentificationType1Code.class, Strategy1 .class, StrategyStressType1Code.class, StressItem1 .class, StressItem1Choice.class, StressSize1Choice.class, StressedProduct1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.057.001.01";

    public MxAuth05700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth05700101(final String xml) {
        this();
        MxAuth05700101 tmp = parse(xml);
        ccpPrtflStrssTstgDefRpt = tmp.getCCPPrtflStrssTstgDefRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth05700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccpPrtflStrssTstgDefRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPPortfolioStressTestingDefinitionReportV01 }
     *     
     */
    public CCPPortfolioStressTestingDefinitionReportV01 getCCPPrtflStrssTstgDefRpt() {
        return ccpPrtflStrssTstgDefRpt;
    }

    /**
     * Sets the value of the ccpPrtflStrssTstgDefRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPPortfolioStressTestingDefinitionReportV01 }
     *     
     */
    public MxAuth05700101 setCCPPrtflStrssTstgDefRpt(CCPPortfolioStressTestingDefinitionReportV01 value) {
        this.ccpPrtflStrssTstgDefRpt = value;
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
    public static MxAuth05700101 parse(String xml) {
        return ((MxAuth05700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth05700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth05700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth05700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth05700101) parserImpl.read(MxAuth05700101 .class, xml, _classes));
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
     * Creates an MxAuth05700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth05700101 message
     * @return
     *     a new instance of MxAuth05700101
     */
    public static final MxAuth05700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth05700101 .class);
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
