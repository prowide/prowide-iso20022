
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
 * Class for catm.002.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mgmtPlanRplcmnt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.04")
public class MxCatm00200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MgmtPlanRplcmnt", required = true)
    protected ManagementPlanReplacementV04 mgmtPlanRplcmnt;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType12 .class, ContentType2Code.class, DataSetCategory4Code.class, DataSetIdentification4 .class, DigestedData4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, ErrorAction2 .class, GenericIdentification71 .class, Header14 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, ManagementPlan4 .class, ManagementPlanContent4 .class, ManagementPlanReplacementV04 .class, MxCatm00200104 .class, NetworkParameters3 .class, NetworkParameters4 .class, NetworkType1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType5Code.class, PartyType6Code.class, ProcessRetry2 .class, ProcessTiming3 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SignedData4 .class, Signer3 .class, TMSAction4 .class, TerminalManagementAction1Code.class, TerminalManagementActionResult1Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementDataSet15 .class, TerminalManagementErrorAction2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.04";

    public MxCatm00200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00200104(final String xml) {
        this();
        MxCatm00200104 tmp = parse(xml);
        mgmtPlanRplcmnt = tmp.getMgmtPlanRplcmnt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mgmtPlanRplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanReplacementV04 }
     *     
     */
    public ManagementPlanReplacementV04 getMgmtPlanRplcmnt() {
        return mgmtPlanRplcmnt;
    }

    /**
     * Sets the value of the mgmtPlanRplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanReplacementV04 }
     *     
     */
    public MxCatm00200104 setMgmtPlanRplcmnt(ManagementPlanReplacementV04 value) {
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
    public static MxCatm00200104 parse(String xml) {
        return ((MxCatm00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00200104 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00200104) parserImpl.read(MxCatm00200104 .class, xml, _classes));
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
     * Creates an MxCatm00200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00200104 message
     * @return
     *     a new instance of MxCatm00200104
     */
    public static final MxCatm00200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00200104 .class);
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
