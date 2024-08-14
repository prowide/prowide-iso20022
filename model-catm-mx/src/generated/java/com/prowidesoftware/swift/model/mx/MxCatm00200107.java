
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
 * Class for catm.002.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mgmtPlanRplcmnt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.07")
public class MxCatm00200107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MgmtPlanRplcmnt", required = true)
    protected ManagementPlanReplacementV07 mgmtPlanRplcmnt;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AttributeType1Code.class, AuthenticatedData5 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, CryptographicKeyType3Code.class, DataSetCategory12Code.class, DataSetIdentification7 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, ErrorAction4 .class, GenericIdentification71 .class, GenericIdentification92 .class, GenericInformation1 .class, Header27 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KEKIdentifier5 .class, KeyTransport5 .class, KeyUsage1Code.class, ManagementPlan7 .class, ManagementPlanContent7 .class, ManagementPlanReplacementV07 .class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00200107 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OriginatorInformation1 .class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType5Code.class, PartyType6Code.class, ProcessRetry2 .class, ProcessTiming3 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, SignedData5 .class, Signer4 .class, TMSAction7 .class, TerminalManagementAction4Code.class, TerminalManagementActionResult4Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementDataSet24 .class, TerminalManagementErrorAction2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.07";

    public MxCatm00200107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00200107(final String xml) {
        this();
        MxCatm00200107 tmp = parse(xml);
        mgmtPlanRplcmnt = tmp.getMgmtPlanRplcmnt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00200107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mgmtPlanRplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanReplacementV07 }
     *     
     */
    public ManagementPlanReplacementV07 getMgmtPlanRplcmnt() {
        return mgmtPlanRplcmnt;
    }

    /**
     * Sets the value of the mgmtPlanRplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanReplacementV07 }
     *     
     */
    public MxCatm00200107 setMgmtPlanRplcmnt(ManagementPlanReplacementV07 value) {
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
    public static MxCatm00200107 parse(String xml) {
        return ((MxCatm00200107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00200107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00200107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00200107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00200107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00200107 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00200107) parserImpl.read(MxCatm00200107 .class, xml, _classes));
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
     * Creates an MxCatm00200107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00200107 message
     * @return
     *     a new instance of MxCatm00200107
     */
    public static final MxCatm00200107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00200107 .class);
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
