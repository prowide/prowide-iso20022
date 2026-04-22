
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
 * Class for auth.114.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryMetadataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.114.001.01")
public class MxAuth11400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryMetadataRpt", required = true)
    protected RegulatoryMetadataReportV01 rgltryMetadataRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 114;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ClassificationType4 .class, Document26 .class, Document28 .class, GenericIdentification175 .class, GenericIdentification185 .class, GenericIdentification190 .class, GenericOrganisationIdentification3 .class, IndustrySector3Choice.class, LanguageVersion1Code.class, MetadataReport5 .class, MxAuth11400101 .class, NaturalPersonIdentification5 .class, OrganisationIdentification49 .class, OrganisationIdentificationSchemeName1Choice.class, PartyIdentification260Choice.class, PartyName5 .class, Period2 .class, Period4Choice.class, RegulatoryMetadataReportV01 .class, SecurityIdentification49 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType13Code.class, UniqueProductIdentifier2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.114.001.01";

    public MxAuth11400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth11400101(final String xml) {
        this();
        MxAuth11400101 tmp = parse(xml);
        rgltryMetadataRpt = tmp.getRgltryMetadataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth11400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryMetadataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryMetadataReportV01 }
     *     
     */
    public RegulatoryMetadataReportV01 getRgltryMetadataRpt() {
        return rgltryMetadataRpt;
    }

    /**
     * Sets the value of the rgltryMetadataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryMetadataReportV01 }
     *     
     */
    public MxAuth11400101 setRgltryMetadataRpt(RegulatoryMetadataReportV01 value) {
        this.rgltryMetadataRpt = value;
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
    public static MxAuth11400101 parse(String xml) {
        return ((MxAuth11400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth11400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth11400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth11400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth11400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth11400101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth11400101) parserImpl.read(MxAuth11400101 .class, xml, _classes));
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
     * Creates an MxAuth11400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth11400101 message
     * @return
     *     a new instance of MxAuth11400101
     */
    public static final MxAuth11400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth11400101 .class);
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
