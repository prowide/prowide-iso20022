
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
 * Class for catm.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mgmtPlanRplcmnt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.01")
public class MxCatm00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MgmtPlanRplcmnt", required = true)
    protected ManagementPlanReplacementV01 mgmtPlanRplcmnt;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Algorithm1Code.class, AlgorithmIdentification1 .class, AttributeType1Code.class, AuthenticatedData1 .class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ContentInformationType1 .class, ContentType1Code.class, DataSetCategory2Code.class, DataSetIdentification2 .class, DigestedData1 .class, EncapsulatedContent1 .class, EncryptedContent1 .class, EnvelopedData1 .class, ErrorAction1 .class, GenericIdentification35 .class, Header4 .class, IssuerAndSerialNumber1 .class, KEK1 .class, KEKIdentifier1 .class, KeyTransport1 .class, ManagementPlan1 .class, ManagementPlanContent1 .class, ManagementPlanReplacementV01 .class, MxCatm00200101 .class, NamedKeyEncryptedData1 .class, NetworkParameters1 .class, Parameter1 .class, PartyType5Code.class, PartyType6Code.class, ProcessRetry1 .class, ProcessTiming1 .class, Recipient1Choice.class, RelativeDistinguishedName1 .class, SignedData1 .class, Signer1 .class, TMSAction1 .class, TerminalManagementAction1Code.class, TerminalManagementActionResult1Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementDataSet2 .class, TerminalManagementErrorAction1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.01";

    public MxCatm00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00200101(final String xml) {
        this();
        MxCatm00200101 tmp = parse(xml);
        mgmtPlanRplcmnt = tmp.getMgmtPlanRplcmnt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mgmtPlanRplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanReplacementV01 }
     *     
     */
    public ManagementPlanReplacementV01 getMgmtPlanRplcmnt() {
        return mgmtPlanRplcmnt;
    }

    /**
     * Sets the value of the mgmtPlanRplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanReplacementV01 }
     *     
     */
    public MxCatm00200101 setMgmtPlanRplcmnt(ManagementPlanReplacementV01 value) {
        this.mgmtPlanRplcmnt = value;
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
    public static MxCatm00200101 parse(String xml) {
        return ((MxCatm00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00200101) parserImpl.read(MxCatm00200101 .class, xml, _classes));
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
     * Creates an MxCatm00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00200101 message
     * @return
     *     a new instance of MxCatm00200101
     */
    public static final MxCatm00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00200101 .class);
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
